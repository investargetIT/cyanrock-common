package com.cyanrocks.common.vo.api.oms.salesorder;

import java.util.Date;

public class OrderPayReq {

    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 超时截止时间
     */
    private Date endTime;

    public OrderPayReq() {
    }

    public OrderPayReq(String orderNo, Date endTime) {
        this.orderNo = orderNo;
        this.endTime = endTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
