package com.cyanrocks.common.vo.api.oms.salesorder.csr;

import java.io.Serializable;

/**
 * @Author: annysong
 * @Date 2022/4/29
 */
public class TagsVO implements Serializable {
    /**
     * tags顺序值
     */
    private Integer key;
    /**
     * 审核需注意信息
     */
    private String  value;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
