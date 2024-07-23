package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

/**
 *@author annySong
 *@date 2022/6/29 13:28
 *@version 1.0
 */

public class SoRemarkVO implements Serializable {
    /**
     * 订单号
     */
    @NotBlank(message = "订单号不能为空")
    private String orderNo;
    /**
     * 用户备注
     */
    private String userRemark;
    /**
     * csr备注
     */
    private String csrRemark;

    public String getUserRemark() {
        return userRemark;
    }
    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getCsrRemark() {
        return csrRemark;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setCsrRemark(String csrRemark) {
        this.csrRemark = csrRemark;
    }
}