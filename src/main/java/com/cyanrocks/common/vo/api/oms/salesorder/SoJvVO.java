package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author JimboZhu
 * @version 1.0
 * @date 2022/9/16
 */

public class SoJvVO implements Serializable {
    /**
     * 订单号
     */
    @NotBlank(message = "订单号不能为空")
    private String orderNo;

    /**
     * 订单行ID
     */
    @NotNull(message = "订单行ID不能为空")
    private Long orderLineId;

    /**
     * JV公司code
     */
//    @NotBlank(message = "JV公司code不能为空")
    private String jvCompanyCode;

    /**
     * JV公司名称
     */
//    @NotBlank(message = "JV公司名称不能为空")
    private String jvCompanyName;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Long orderLineId) {
        this.orderLineId = orderLineId;
    }

    public String getJvCompanyCode() {
        return jvCompanyCode;
    }

    public void setJvCompanyCode(String jvCompanyCode) {
        this.jvCompanyCode = jvCompanyCode;
    }

    public String getJvCompanyName() {
        return jvCompanyName;
    }

    public void setJvCompanyName(String jvCompanyName) {
        this.jvCompanyName = jvCompanyName;
    }

    @Override
    public String toString() {
        return "SoJvVO{" +
                "orderNo='" + orderNo + '\'' +
                ", orderLineId=" + orderLineId +
                ", jvCompanyCode='" + jvCompanyCode + '\'' +
                ", jvCompanyName='" + jvCompanyName + '\'' +
                '}';
    }
}