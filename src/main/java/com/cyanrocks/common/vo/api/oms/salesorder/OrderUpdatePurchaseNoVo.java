package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/6/6 3:24 PM
 * @description:修改订单客户采购单号
 **/
public class OrderUpdatePurchaseNoVo {
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 客户采购单号
     */
    private String customerPurchaseNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCustomerPurchaseNo() {
        return customerPurchaseNo;
    }

    public void setCustomerPurchaseNo(String customerPurchaseNo) {
        this.customerPurchaseNo = customerPurchaseNo;
    }
}
