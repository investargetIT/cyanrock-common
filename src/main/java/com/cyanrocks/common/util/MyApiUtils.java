package com.cyanrocks.common.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.web.util.HtmlUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import com.cyanrocks.common.em.ResCodeEnum;
import com.cyanrocks.common.vo.api.ApiData;
import com.cyanrocks.common.vo.api.BizException;
import com.cyanrocks.common.vo.api.DataVo;

/**
 * 通用方法
 *
 * @author 符冬
 */
public final class MyApiUtils {
    private final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    /**
     * 用户token有效期
     */
    public final static int MAX_EXPIRE_HOURS_TOKEN = 240;
    public final static int MIN_EXPIRE_MINUTES_TOKEN = 15;

    /**
     * 手动输出响应
     *
     * @param response
     * @param res
     * @return
     * @throws IOException
     */
    public static final boolean outResponseMsg(HttpServletResponse response, Object res) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.println(MyJsonUtils.getJsonString(res));
            return false;
        }
    }

    /**
     * 拼接完整的接口地址
     *
     * @param domain
     * @param path
     * @return
     */
    public final static String contactUrl(String domain, String path) {
        if (domain != null && path != null) {
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String url = String.format("%s%s%s", domain.trim(), domain.trim().endsWith("/") ? "" : "/", path.trim());
            return url;
        }
        return "";

    }
    public  static String contactUrlParam(String url, String param) {
        if (url != null && param != null) {
            if (url.endsWith("/")) {
                return url + param;
            } else {
                return url + "/" + param;
            }
        }
        return "";
    }
    /**
     * HTML标签内容转义
     *
     * @param html
     * @return
     */
    public final static String getHtmlEscape(String html) {
        if (html != null) {
            return HtmlUtils.htmlEscape(html);
        } else {
            return html;
        }
    }

    public static final boolean outResponseMsg(HttpServletResponse response, ResCodeEnum code) throws IOException {
        response.sendError(code.getErrCode(), code.getErrMsg());
        response.setContentType("application/json;charset=utf-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.println(MyJsonUtils.getJsonString(new ApiData(code)));
            return false;
        }
    }

    public static final boolean outAbnormalMsg(HttpServletResponse response, ResCodeEnum code) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.println(MyJsonUtils.getJsonString(new ApiData(code)));
            return false;
        }
    }

    public final static int USERAGENT_LEN = 310;

    /**
     * 控制内容最大长度
     *
     * @param content 内容
     * @param maxlen  最大长度
     * @return
     */
    public final static String substring(String content, int maxlen) {
        if (content != null && content.length() > maxlen) {
            return content.substring(0, maxlen);
        } else {
            return content;
        }
    }

    /**
     * 隐藏字符串中部分敏感信息
     *
     * @param tg    目标字符串
     * @param start 开始索引
     * @param end   结束索引
     * @return
     */
    public static String hidepartChar(String tg, int start, int end) {
        return new StringBuilder(tg).replace(start, end, "**").toString();
    }

    /**
     * 隐藏字符串中部分敏感信息
     *
     * @param tg    目标字符串
     * @param start 开始索引
     * @param end   结束索引
     * @return
     */
    public static String hidepartChar(String tg, int start, int end, String ts) {
        return new StringBuilder(tg).replace(start, end, ts).toString();
    }

    /**
     * 短信验证码发送的key
     *
     * @return
     */
    public static String getSmsCaptchaKey(String mobile) {
        return String.format("sms.captcha.%s", mobile);
    }

    public static String getWeixinAccesstokenKey() {
        return String.format("weixin:token:%s", "mall");
    }

    public static String getWeixinMiniAppIdKey() {
        return String.format("weixin:appId:%s", "mall");
    }

    public static String getSystemEnvValue(String key) {
        String v = System.getProperty(key);
        if (v != null) {
            return v;
        } else {
            return System.getenv(key);
        }
    }

    public static boolean isNumber(String str) {
        return str != null && str.matches("\\d+");
    }

    public static String urlEncode(String text) {
        if (text != null) {
            try {
                return URLEncoder.encode(text, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                throw new IllegalStateException(e);
            }
        } else {
            return text;
        }
    }

    public static String getVariableValue(String c) {
        if (c != null && c.trim().startsWith("${") && c.trim().endsWith("}")) {
            String[] split = c.split(":", 2);
            if (split.length == 2) {
                String key = split[0].substring(2);
                String kv = getSystemEnvValue(key.trim());
                if (kv == null) {
                    String dv = split[1].trim();
                    return dv.substring(0, dv.length() - 1);
                } else {
                    return kv;
                }
            } else {
                String key = c.trim().substring(2, c.length() - 1);
                return getSystemEnvValue(key);
            }
        } else {
            return c;
        }
    }

    /**
     * 随机count位数字字符串<br/>
     * 可以用来生成代金券号码和密码
     *
     * @param count 随机多少位
     */
    public final static String getRandomString(int count) {
        if (count > 0) {
            return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10)).limit(count).boxed()
                    .map(String::valueOf).collect(Collectors.joining());
        } else {
            return "";
        }

    }

    /**
     * 用户IP
     *
     * @param req
     * @return
     */
    public static String getUserIp(HttpServletRequest req) {
        String clientIp = req.getHeader("X-Real-IP");
        if (clientIp == null) {
            clientIp = req.getHeader("X-Forwarded-For");
            if (clientIp != null) {
                return clientIp;
            } else {
                return req.getRemoteAddr();
            }
        } else {
            return clientIp;
        }

    }

    /**
     * 根据初始值生成指定长度的字符串长度不够前面补0
     *
     * @param v   初始值
     * @param len 指定的长度
     * @return 指定长度的字符串
     */
    public static String getAssignLenStr(String v, int len) {
        StringBuilder zeroFill = new StringBuilder(v);
        while (zeroFill.length() < len) {
            zeroFill.insert(0, '0');
        }
        while (zeroFill.length() > len) {
            zeroFill.deleteCharAt(0);
        }
        return zeroFill.toString();
    }

    /**
     * 丢弃字符串前面所有的0
     *
     * @param ss 目标字符串
     * @return 非0开头的字符串
     */
    public static String discardZero(String ss) {
        StringBuilder zsb = new StringBuilder(ss);
        while (zsb.charAt(0) == '0') {
            zsb.deleteCharAt(0);
        }
        return zsb.toString();
    }

    /**
     * 订单号兼容
     *
     * @param orderNo
     * @return 兼容列表
     */
    public static List<String> getOrderNos(String orderNo) {
        int len = 10;
        if (orderNo.length() == len) {
            return Arrays.asList(orderNo, discardZero(orderNo));
        } else {
            return Arrays.asList(orderNo, getAssignLenStr(orderNo, len));
        }
    }

    /**
     * 根据下单用户ID生成订单号
     *
     * @param uid
     * @return 包含用户标识的订单号
     */
    public static String genOrderNo(String uid) {
        if (uid == null) {
            uid = "0";
        }
        return String.format("%s%s%s", System.currentTimeMillis(), ThreadLocalRandom.current().nextInt(10),
                getAssignLenStr(uid, 4));

    }

    /**
     * 生成售后单号
     *
     * @param uid
     * @return
     */
    public static String genReturnNo(String uid) {
        return String.format("R%s", MyApiUtils.genOrderNo(uid));
    }

    /**
     * 小程序用户登录令牌
     *
     * @param req
     * @param userId
     * @return
     */
    public static String genUtoken(HttpServletRequest req, Long userId) {
        return String.format("U%sU%s%s", userId, req.getSession().getId(), System.nanoTime());
    }

    /**
     * 开放平台授权访问令牌
     *
     * @return
     */
    public static String genOtoken(HttpServletRequest req, Long appSid) {
        return String.format("O%sO%s%s", appSid, req.getSession().getId(), System.nanoTime());
    }

    /**
     * 后台用户登录令牌
     *
     * @param req
     * @return
     */
    public static String genMtoken(HttpServletRequest req, Long userId) {
        return String.format("M%sM%s%s", userId, req.getSession().getId(), System.nanoTime());
    }

    /***
     * 获取HTTP请求令牌值
     *
     * @param req
     * @param tokenName 令牌名称
     * @return
     */
    public static String getAccessTokenValue(HttpServletRequest req, String tokenName) {
        String token = req.getParameter(tokenName);
        if (token != null && token.trim().length() > 0) {
            return token;
        } else {
            token = req.getHeader(tokenName);
            if (token != null && token.trim().length() > 0) {
                return token;
            } else {
                return getCookieValue(req, token);
            }
        }
    }

    public static String getCookieValue(HttpServletRequest req, String cookieName) {
        Cookie[] cks = req.getCookies();
        if (cks != null) {
            for (Cookie ck : cks) {
                if (ck.getName().equals(cookieName) && ck.getValue() != null) {
                    return ck.getValue();
                }
            }
        }
        return null;
    }

    /**
     * 获取HTTP接口TOKEN
     *
     * @param req
     * @return
     */
    public static String getToken(HttpServletRequest req) {
        return getAccessTokenValue(req, "token");
    }

    /**
     * 获取HTTP接口accessToken
     *
     * @return accessToken
     */
    public static String getAccessToken(HttpServletRequest req) {
        return getAccessTokenValue(req, "accessToken");
    }

    /**
     * 获取文件扩展名
     *
     * @param f 文件名
     * @return 扩展名
     */
    public static String getFileExtenion(String f) {
        if (f.lastIndexOf(".") != -1 && !f.endsWith(".")) {
            return f.substring(f.lastIndexOf(".") + 1);
        } else {
            return null;
        }
    }

    /**
     * 获取rds key
     *
     * @param accessToken
     * @return
     */
    public static String getAccessTokenRdsKey(String accessToken) {
        return String.format("%s:%s", "token:openapi", accessToken);
    }

    /**
     * 添加token到url
     *
     * @param url
     * @param token
     * @return
     */
    public static String setUrlToken(String url, String token) {
        if (url.contains("?")) {
            return String.format("%s&token=%s", url, token);
        } else {
            return String.format("%s?token=%s", url, token);
        }
    }

    /**
     * 获取当前页码
     *
     * @param curPage
     * @return
     */
    public static int getCurPage(Integer curPage) {
        if (curPage != null && curPage > 0) {
            return curPage;
        } else {
            return 1;
        }
    }

    /**
     * 设置cookie
     *
     * @param key
     * @param value
     * @param response
     * @param maxage   有效期（秒）
     */
    public static void addCookie(String key, String value, HttpServletResponse response, int maxage) {
        response.addHeader("Set-Cookie",
                String.format("%s; %s",
                        String.format("%s=%s; Max-Age=%s; Path=/;%s HttpOnly", key, value, maxage, " Secure;"),
                        "SameSite=None"));

        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(maxage);
        cookie.setSecure(true);
        response.addCookie(cookie);

    }

    public final static Set<String> getLanAddress() {
        Set<String> las = new HashSet<String>(3);
        try {
            Enumeration<NetworkInterface> ccs = NetworkInterface.getNetworkInterfaces();
            while (ccs.hasMoreElements()) {
                NetworkInterface cc = ccs.nextElement();
                if (!cc.isLoopback() && !cc.isVirtual() && cc.isUp()) {
                    Enumeration<InetAddress> sss = cc.getInetAddresses();
                    while (sss.hasMoreElements()) {
                        InetAddress ia = sss.nextElement();
                        if (ia instanceof Inet4Address) {
                            las.add(ia.getHostAddress());
                        }
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return las;
    }

    public static String getDsrephone(String receiverPhone) {
        if (receiverPhone != null && receiverPhone.length() > 7) {
            return MyApiUtils.hidepartChar(receiverPhone, 3, 7, "****");
        } else {
            return receiverPhone;
        }
    }

    /**
     * 切分集合
     *
     * @param list 要切分的集合
     * @param maxsize 最大切分大小
     */
    public final static <T> List<List<T>> dividedList(List<T> list, int maxsize) {
        List<List<T>> all = new ArrayList<List<T>>();
        if (list.size() > 0 && maxsize > 0) {
            List<T> sublist = new ArrayList<T>();
            all.add(sublist);
            if (list.size() > maxsize) {
                for (T t : list) {
                    if (sublist.size() >= maxsize) {
                        sublist = new ArrayList<T>();
                        all.add(sublist);
                    }
                    sublist.add(t);

                }
            } else {
                for (T t : list) {
                    sublist.add(t);
                }
            }
        }
        return all;
    }

    /**
     * 切分集合(按总集合数平均分)
     *
     * @param list     要切分的集合
     * @param listsize 拆分出多少个list
     */
    public final static <T> List<List<T>> dividedListByAvg(List<T> list, int listsize) {
        List<List<T>> all = new ArrayList<List<T>>();
        if (CollectionUtils.isEmpty(list)) {
            return all;
        }

        if (listsize == 0 || listsize == 1) {
            all.add(list);
            return all;
        }

        int remainder = list.size() % listsize; // 先计算出余数
        int number = list.size() / listsize; // 然后是商
        int offset = 0;// 偏移量（用以标识加的余数）
        for (int i = 0; i < listsize; i++) {
            List<T> value;
            if (remainder > 0) {
                value = list.subList(i * number + offset, (i + 1) * number + offset + 1);
                remainder--;
                offset++;
            } else {
                value = list.subList(i * number + offset, (i + 1) * number + offset);
            }
            if (CollectionUtils.isEmpty(value)) {
                break;
            }
            all.add(value);
        }
        return all;
    }

    public static <T> List<T> getSubList(int curPage, int pageSize, List<T> list) {
        if (curPage > 0 && pageSize > 0 && list != null && list.size() > 0) {
            int fromIndex = (curPage - 1) * pageSize;
            if (fromIndex >= list.size()) {
                return new ArrayList<>(0);
            }
            int toIndex = curPage * pageSize;
            if (toIndex > list.size()) {
                toIndex = list.size();
            }
            return list.subList(fromIndex, toIndex);

        } else {
            return new ArrayList<>(0);
        }
    }

    public static List<DataVo> getDataList(ApiData ad) {
        return getDataList(ad, DataVo.class);
    }

    public static <T> List<T> getDataList(ApiData ad, Class<T> clazz) {
        if (ad.getData() != null) {
            Map<String, List<?>> dt = MyJsonUtils.OM.convertValue(ad.getData(),
                    new TypeReference<Map<String, List<?>>>() {
                    });
            final List<?> mpdt = dt.getOrDefault("dataList", new ArrayList<T>(0));
            return mpdt.stream().map(m -> MyJsonUtils.OM.convertValue(m, clazz)).collect(Collectors.toList());
        } else {
            if (ad.getErrCode() != 200) {
                log.error("----------------------getDataList is error :{}", ad.getErrMsg());
            }
            return new ArrayList<T>(0);
        }
    }

    /**
     * 获取响应数据体
     *
     * @param ad    响应数据
     * @param clazz 数据体类型
     * @return 接口实际数据体
     */
    public static <T> T getResData(ApiData ad, Class<T> clazz) {
        if (ad.getData() != null) {
            return MyJsonUtils.OM.convertValue(ad.getData(), clazz);
        } else {
            return null;
        }
    }

    /**
     * 获取响应数据体
     *
     * @param ad    响应数据
     * @param clazz 数据体类型
     * @return 接口实际数据体
     */
    public static <T> T apiDataSuccessResData(ApiData ad, Class<T> clazz) {

        if (null == ad) {
            throw new BizException(ResCodeEnum.INTERFACE_ERR_CODE);
        }
        if (!ResCodeEnum.SUCCESS.getErrCode().equals(ad.getErrCode())) {
            throw new BizException(ad.getErrCode(), ad.getErrMsg());
        }
        if (null == ad.getData()) {
            return null;
        }
        return MyJsonUtils.OM.convertValue(ad.getData(), clazz);
    }

    public static void apiDataSuccessCheck(ApiData ad) {
        if (null == ad) {
            throw new BizException(ResCodeEnum.INTERFACE_ERR_CODE);
        }
        if (!ResCodeEnum.SUCCESS.getErrCode().equals(ad.getErrCode())) {
            throw new BizException(ad.getErrCode(), ad.getErrMsg());
        }
    }

    /**
     * 获取响应数据体
     *
     * @param ad  响应数据
     * @param trf 数据体类型
     * @return 接口实际数据体
     */
    public static <T> T apiDataSuccessResData(ApiData ad, TypeReference<T> trf) {

        if (null == ad) {
            throw new BizException(ResCodeEnum.INTERFACE_ERR_CODE);
        }
        if (!ResCodeEnum.SUCCESS.getErrCode().equals(ad.getErrCode())) {
            throw new BizException(ad.getErrCode(), ad.getErrMsg());
        }
        if (null == ad.getData()) {
            return null;
        }
        return MyJsonUtils.OM.convertValue(ad.getData(), trf);
    }

    public static void apiDataSuccessResData(ApiData ad) {

        if (null == ad) {
            throw new BizException(ResCodeEnum.INTERFACE_ERR_CODE);
        }
        if (!ResCodeEnum.SUCCESS.getErrCode().equals(ad.getErrCode())) {
            throw new BizException(ad.getErrCode(), ad.getErrMsg());
        }
    }

    /**
     * 获取响应数据体
     *
     * @param ad  响应数据
     * @param trf 数据体类型
     * @return 接口实际数据体
     */
    public static <T> T getResData(ApiData ad, TypeReference<T> trf) {
        if (ad.getData() != null) {
            return MyJsonUtils.OM.convertValue(ad.getData(), trf);
        } else {
            return null;
        }
    }

    private static final Pattern PHONE_PATTERN = Pattern.compile("^(?:(?:\\+|00)86)?1\\d{10}$");

    public static Boolean isPhone(String numStr) {
        if (!MyObjectValueUtils.checkValuesNotNullAndEmpty(numStr)) {
            return false;
        }
        return PHONE_PATTERN.matcher(numStr).matches();
    }

    /**
     * 获取每页显示的数量
     *
     * @param pageSize
     * @return
     */
    public static int getPageSize(Integer pageSize) {
        if (pageSize != null && pageSize > 0) {
            return pageSize;
        } else {
            return 15;
        }
    }

}
