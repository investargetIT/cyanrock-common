package com.cyanrocks.common.vo.api.oms.salesorder;

public class SalesOrderHeadRespVo {

    /**
     * 订单总数
     */
    private Long orderTotal;

    /**
     * 总计金额含税(CNY)
     */
    private String orderAmount;

    /**
     * 总计金额未税(CNY)
     */
    private String orderAmountNet;

    public Long getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Long orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderAmountNet() {
        return orderAmountNet;
    }

    public void setOrderAmountNet(String orderAmountNet) {
        this.orderAmountNet = orderAmountNet;
    }
}
