package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

/**
 * @Author: annysong
 * @Date 2022/5/18
 */
public class OrderVO implements Serializable {
    /**
     * 订单号
     */
    @NotBlank(message = "订单号不能为空")
    private String  orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
