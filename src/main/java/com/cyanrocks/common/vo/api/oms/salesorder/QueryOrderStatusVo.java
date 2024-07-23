package com.cyanrocks.common.vo.api.oms.salesorder;

import javax.validation.constraints.NotNull;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/6/1 3:56 PM
 * @description:订单取消申请
 **/
public class QueryOrderStatusVo {
    /**
     * 订单编号，多个以,隔开
     */
    @NotNull(message = "订单编号，不能为空")
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
