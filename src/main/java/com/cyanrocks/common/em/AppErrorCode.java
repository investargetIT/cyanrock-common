package com.cyanrocks.common.em;

public enum AppErrorCode {
    USER(100),
    WMS(105),
    OMS(106),
    SUPPLIER(107)
    ;

    private final Integer code;

    AppErrorCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
