package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/6/6 3:20 PM
 * @description:修改订单特殊编码
 **/
public class OrderUpdateSpecialVo {
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 特殊编码
     */
    private String specialCode;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }
}
