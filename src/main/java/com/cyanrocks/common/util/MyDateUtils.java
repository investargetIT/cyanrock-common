package com.cyanrocks.common.util;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.util.ObjectUtils;

/**
 * 日期字符串相互转换
 *
 * @author 符冬
 */
public final class MyDateUtils {
    public final static DateTimeFormatter DTF_YMDHMS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public final static DateTimeFormatter DTF_YMDHM = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    public final static DateTimeFormatter DTF_YMDHM_NUMBER = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
    public final static DateTimeFormatter DTFYM = DateTimeFormatter.ofPattern("yyyyMM");
    public final static DateTimeFormatter DFT_YMD_NUMBER = DateTimeFormatter.ofPattern("yyyyMMdd");
    public final static DateTimeFormatter DTF_HM_Number = DateTimeFormatter.ofPattern("HHmm");
    public final static DateTimeFormatter DTF_YMD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public final static DateTimeFormatter DDTF = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    public final static DateTimeFormatter SDDTF = DateTimeFormatter.ofPattern("yyMMddHHmmss");
    public final static DateTimeFormatter DTF_HMS = DateTimeFormatter.ofPattern("HH:mm:ss");
    public final static DateTimeFormatter DTF_HM = DateTimeFormatter.ofPattern("HH:mm");
    public final static DateTimeFormatter DTF_YM = DateTimeFormatter.ofPattern("yyyy-MM");
    public final static DateTimeFormatter DTF_SYMD = DateTimeFormatter.ofPattern("yyMMdd");

    public final static DateTimeFormatter DTF_SYMDHMS = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public final static DateTimeFormatter YMD_2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public final static String DTF_YMD_STR = "yyyy-MM-dd";
    public final static String TIME_SUFFIX = " 00:00:00";
    public final static String DAY_END_SUFFIX = "23:59:59";

    /**
     * 解析日期字符串 yyyy/MM/dd HH:mm:ss
     *
     * @return
     */
    public static LocalDateTime parse(String dateStr, DateTimeFormatter formatter) {
        if (StringUtils.isNotBlank(dateStr) && !ObjectUtils.isEmpty(formatter)) {
            return LocalDateTime.parse(dateStr, formatter);
        }
        return null;
    }

    /**
     * 将 Date 转为 LocalDateTime
     *
     * @param date
     * @return java.time.LocalDateTime;
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * 解析带时区的日期和时间字符串
     *
     * @param str 2015-05-20T13:29:35+08:00
     * @return
     */
    public static LocalDateTime getLocalDateTime(String str) {
        if (str!=null) {
            return LocalDateTime.parse(str, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        } else {
            return null;
        }
    }

    /**
     * 2位年月日
     *
     * @param d
     * @return
     */
    public final static String getSymd(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_SYMD);
        } else {
            return "";
        }

    }

    /**
     * yyyyMMddHHmmss
     */
    public final static Date getWxDate(String str) {
        if (!ObjectUtils.isEmpty(str)) {
            return Date.from(LocalDateTime.from(DDTF.parse(str)).atZone(ZoneId.systemDefault()).toInstant());
        } else {
            return null;
        }
    }

    /**
     * 年月
     *
     * @param d
     * @return
     */
    public final static String getYM(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_YM);
        } else {
            return "";
        }

    }

    /**
     * 时分
     *
     * @param d
     * @return
     */
    public final static String getHM(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_HM);
        } else {
            return "";
        }

    }

    /**
     * 时分秒
     *
     * @param d
     * @return
     */
    public final static String getHMS(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_HMS);
        } else {
            return "";
        }

    }

    /**
     * 年月日时分
     *
     * @param d
     * @return
     */
    public final static String getYMDHM(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_YMDHM);
        } else {
            return "";
        }

    }

    /**
     * 年月日时分（数字）
     *
     * @param d
     * @return
     */
    public final static String getYMDHMNUMBER(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_YMDHM_NUMBER);
        } else {
            return "";
        }

    }

    /**
     * 时分（数字）
     *
     * @param d
     * @return
     */
    public final static String getHMNumber(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_HM_Number);
        } else {
            return "";
        }

    }

    /**
     * 时分（数字）
     *
     * @param d
     * @return
     */
    public final static String getYMDNumber(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DFT_YMD_NUMBER);
        } else {
            return "";
        }

    }

    /**
     * 年月日时分秒
     *
     * @param d
     * @return
     */
    public final static String getDate(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_YMDHMS);
        } else {
            return "";
        }
    }

    /**
     * 年月日
     *
     * @param d
     * @return
     */
    public final static String getDateWithoutTime(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DTF_YMD);
        } else {
            return "";
        }

    }

    /**
     * 年月日
     *
     * @param d
     * @return
     */
    public final static String getDateWithLocalDate(Date d) {
        if (d!=null) {
            return d.toInstant().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        } else {
            return "";
        }

    }

    /**
     * 从字符串得到Date:年月日或者年月日时分秒
     *
     * @param s
     * @return
     */
    public static final Date getDate(String s) {
        if (s!=null && s.trim().length() > 1) {
            if (s.trim().split("\\s+").length==2) {
                return Date.from(LocalDateTime.parse(s, DTF_YMDHMS).atZone(ZoneId.systemDefault()).toInstant());
            } else {
                return Date.from(LocalDate.parse(s, DTF_YMD).atStartOfDay(ZoneId.systemDefault()).toInstant());
            }
        } else {
            return null;
        }
    }

    public static int getWeek(Date date) {

        GregorianCalendar g = new GregorianCalendar();

        g.setTime(date);

        return g.get(Calendar.WEEK_OF_YEAR); // 获得周数

    }

    public static int getCurrWeek(LocalDate startTime) {
        return getWeek(Date.from(startTime.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

    /**
     * 获取当前时间 以前某天的时间
     *
     * @param startTime 结束时间
     * @param days      往前计算的天数
     * @return ydm
     */
    public static String getMinusDays(Date startTime, Integer days) {
        LocalDateTime newDate = dateToLocalDateTime(startTime);
        LocalDate localDate = newDate.toLocalDate();
        LocalDate localDate1 = localDate.minusDays(days);
        return localDate1.format(DFT_YMD_NUMBER);
    }

    public static final Integer getWeekOfyear(LocalDate lc) {
        return Integer.valueOf(String.format("%s%02d", lc.getYear(), getCurrWeek(lc)));
    }

    public static final Integer getMonthOfyear(LocalDate lc) {
        return Integer.valueOf(String.format("%s%02d", lc.getYear(), lc.getMonthValue()));
    }

    public static final Integer getQuarterOfyear(LocalDate lc) {
        return Integer.valueOf(String.format("%s%s", lc.getYear(), lc.getMonthValue() < 4 ? 1 : lc.getMonthValue() < 7 ? 2 : lc.getMonthValue() < 10 ? 3 : 4));
    }

    /**
     * 从字符串得到LocalDate
     *
     * @param s
     * @return
     */
    public static final LocalDate getLocalDate(String s) {
        Date date = getDate(s);
        if (date!=null) {
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } else {
            return null;
        }
    }

    public static String getCurrentTimeByFormat(DateTimeFormatter format) {
        return format.format(LocalDateTime.now());
    }

    // days 接受正负数
    public static Date modifyDateByDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, days);
        String str = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).format(DTF_YMDHMS);
        return Date.from(LocalDateTime.from(DTF_YMDHMS.parse(str)).atZone(ZoneId.systemDefault()).toInstant());
    }
    //
    public static Date dateByDays(String dateTimeStr,int  days) {
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, DTF_YMDHMS);
        LocalDateTime newDateTime = dateTime.plusDays(days); // 加上天数
        return Date.from(newDateTime.atZone(ZoneId.systemDefault()).toInstant());

    }

    /**
     * 获取指定日期的开始时间
     *
     * @param dateStr 日期
     * @return 指定日期的开始时间
     */
    public static Date getStartDate(String dateStr) {
        try {
            ZoneId zoneId = ZoneId.systemDefault();
            Instant instant = getDate(dateStr).toInstant();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
            LocalDate localDate = localDateTime.toLocalDate();
            ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
            return Date.from(zonedDateTime.toInstant());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取指定日期的结束时间
     *
     * @param dateStr 日期
     * @return 指定日期的结束时间
     */
    public static Date getEndDate(String dateStr) {
        try {
            int amplitude = 1;
            ZoneId zoneId = ZoneId.systemDefault();
            Instant instant = getDate(dateStr).toInstant();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
            LocalDate localDate = localDateTime.toLocalDate();
            long l = localDate.plusDays(amplitude).atStartOfDay(zoneId).toInstant().toEpochMilli() - amplitude;
            ZonedDateTime zonedDateTime = Instant.ofEpochMilli(l).atZone(ZoneId.systemDefault());
            return Date.from(zonedDateTime.toInstant());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取指定日期的开始时间
     *
     * @param dateStr 日期 不包含时分秒
     * @return 指定日期的开始时间
     */
    public static Date getStartDateWithOutTime(String dateStr) {
        try {
            ZoneId zoneId = ZoneId.systemDefault();
            Instant instant = getDate(dateStr).toInstant();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
            LocalDate localDate = localDateTime.toLocalDate();
            ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
            return Date.from(zonedDateTime.toInstant());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获得某天最大时间 xxxx-MM-dd 23:59:59
     *
     * @param date
     * @return
     */
    public static Date getEndOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime endOfDay = localDateTime.with(LocalTime.of(23, 59, 59));
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获得某天最小时间 xxxx-xx-xx 00:00:00
     *
     * @param date
     * @return
     */
    public static Date getStartOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取指定日期的结束时间
     *
     * @param dateStr 日期 包含时分秒
     * @return 指定日期的结束时间
     */
    public static Date getEndDateWithOutTime(String dateStr) {
        try {
            int amplitude = 1000;
            ZoneId zoneId = ZoneId.systemDefault();
            Instant instant = getDate(dateStr).toInstant();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
            LocalDate localDate = localDateTime.toLocalDate();
            long l = localDate.plusDays(1).atStartOfDay(zoneId).toInstant().toEpochMilli() - amplitude;
            ZonedDateTime zonedDateTime = Instant.ofEpochMilli(l).atZone(ZoneId.systemDefault());
            return Date.from(zonedDateTime.toInstant());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Long diffDays(String startDay, String endDay) {
        try {

            Date start = getDate(startDay);
            Date end = getDate(endDay);

            long millisecond = end.getTime() - start.getTime();
            return millisecond / 24 / 60 / 60 / 1000;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 计算指定日期相差天数
     *
     * @param start 开始日期
     * @param end   结束日期
     * @return 相差天数
     */
    public static Long getDays(Date start, Date end) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime startTime = LocalDateTime.ofInstant(start.toInstant(), zoneId);
        LocalDateTime endTime = LocalDateTime.ofInstant(end.toInstant(), zoneId);
        Duration duration = Duration.between(startTime, endTime);
        return duration.toDays();
    }

    /**
     * Object 转 String (yyyy-MM-dd HH:mm:ss)
     *
     * @param obj
     * @return
     */
    public static String toStr(Object obj) {
        Date date = toDate(obj);
        return getDate(date);
    }


    /**
     * Object 转 Date
     *
     * @param obj
     * @return
     */
    public static Date toDate(Object obj) {
        return (Date) obj;
    }

    /**
     * 获取两个日期之间的日期
     *
     * @param s 开始时间
     * @param e 结束时间
     * @return 指定时间段中的日期
     */
    public static List<String> getDateInRange(String s, String e) {
        LocalDate start = getLocalDate(s);
        LocalDate end = getLocalDate(e);
        assert start!=null;
        return Stream.iterate(start, localDate -> localDate.plusDays(1)).limit(ChronoUnit.DAYS.between(start, end) + 1).map(LocalDate::toString).collect(Collectors.toList());
    }

    /**
     * 获取前年几年或者后几年时间
     *
     * @param num  如果正数就是后几年，负数就前几年
     * @param bool true：获得某天最小时间 xxxx-xx-xx 00:00:00，false：获得某天最大时间 xxxx-MM-dd 23:59:59
     * @return
     */
    public static Date getOfYearDate(Integer num, Boolean bool) {
        //得到一个Calendar的实例
        Calendar ca = Calendar.getInstance();
        //设置时间为当前时间
        ca.setTime(new Date());
        ca.add(Calendar.YEAR, num);
        if (bool) {
            //获得某天最小时间 xxxx-xx-xx 00:00:00
            return getStartOfDay(ca.getTime());
        } else {
            //获得某天最大时间 xxxx-MM-dd 23:59:59
            return getEndOfDay(ca.getTime());
        }
    }

    /**
     * 获取两个时间差
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    public static Long getMilliSecond(Date startTime, Date endTime) {
        long end = endTime.getTime();
        long start = startTime.getTime();
        return end - start;
    }

    /**
     * 时间转换
     *
     * @param localDate 时间
     * @return Date日期类型
     */
    public static Date getDateByLocalDate(LocalDate localDate) {
        if (localDate!=null) {
            return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 将毫秒 换算成(天 时 分 秒 毫秒)
     *
     * @param ms
     * @return
     */
    public static String formatTime(Long ms) {
        Integer ss = 1000;
        Integer mi = ss * 60;
        Integer hh = mi * 60;
        Integer dd = hh * 24;

        Long day = ms / dd;
        Long hour = (ms - day * dd) / hh;
        Long minute = (ms - day * dd - hour * hh) / mi;
        Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
        //		Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

        StringBuffer sb = new StringBuffer();
        if (day > 0) {
            sb.append(day + "天");
        }
        if (hour > 0) {
            sb.append(hour + "时");
        }
        if (minute > 0) {
            sb.append(minute + "分");
        }
        if (second > 0) {
            sb.append(second + "秒");
        }
        //		if(milliSecond > 0) {
        //			sb.append(milliSecond+"毫秒");
        //		}
        return sb.toString();
    }

    /**
     * 日期与时间 组装：yyyy-MM-dd HH:mm:ss
     *
     * @param dateStr 格式：yyyy-MM-dd
     * @param timeStr 格式：HH:mm:ss
     * @return
     */
    public static Date getDate(String dateStr, String timeStr) {
        String combinedString = dateStr + "T" + timeStr;
        LocalDateTime localDateTime = LocalDateTime.parse(combinedString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * str 日期格式转换
     *
     * @param dateStr   格式：yyyy-MM-dd HH:mm:ss
     * @param formatter 格式：
     * @return 日期格式字符串
     */
    public static String getDateStr(String dateStr, DateTimeFormatter formatter) {
        LocalDateTime parse = parse(dateStr, DTF_YMDHMS);
        if (parse!=null) {
            return parse.atZone(ZoneId.systemDefault()).format(formatter);
        }
        return "";
    }

    public static Date getDayMin(String dateTime) {
        // 获取当前日期
        LocalDate currentDate = LocalDate.parse(dateTime);
        LocalDateTime startDateTime = LocalDateTime.of(currentDate, LocalTime.MIN);
        return Date.from(startDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date getDayMax(String dateTime) {
        // 获取当前日期
        LocalDate currentDate = LocalDate.parse(dateTime);
        // 设置结束时间为23:59:59
        LocalDateTime endDateTime = LocalDateTime.of(currentDate, LocalTime.MAX);
        return Date.from(endDateTime.atZone(ZoneId.systemDefault()).toInstant());

    }

    /**
     * 获取指定时间
     * @param date 修改时间类型（小时 分钟 秒 天 月）
     * @param time  修改的时间
     * @return
     */
    public static Date modifyDate(int date,int time) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(date, time);
        String str = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).format(DTF_YMDHMS);
        return Date.from(LocalDateTime.from(DTF_YMDHMS.parse(str)).atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取指定时间
     * @param calendar 时间单位
     * @param val 时间延长值
     * @return
     */
    public static Date getSpecifyTime(int calendar,Integer val){
        Calendar now = Calendar.getInstance();
        now.add(calendar, val);
        return now.getTime();
    }
}
