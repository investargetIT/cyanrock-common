package com.cyanrocks.common.vo.api;

import com.cyanrocks.common.em.ResCodeEnum;

/**
 * 自定义业务异常
 *
 * @author 符冬
 *
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 5210272227966938807L;
    private Integer errCode;
    private String errMsg;
    private DataVo data;

    public Integer getErrCode() {
        return errCode;
    }

    public BizException(Integer errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public DataVo getData() {
        return data;
    }

    public void setData(DataVo data) {
        this.data = data;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public BizException(ResCodeEnum resCode) {
        super(resCode.getErrMsg());
        this.errCode = resCode.getErrCode();
        this.errMsg = resCode.getErrMsg();
    }

    public BizException() {
        super();
    }

    public BizException(ResCodeEnum resCode, String errMsg) {
        super(errMsg);
        this.errCode = resCode.getErrCode();
        this.errMsg = errMsg;
    }

}
