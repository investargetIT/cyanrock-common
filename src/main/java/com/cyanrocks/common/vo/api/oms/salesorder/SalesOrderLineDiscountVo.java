package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * @version V1.0
 * @author: John.Hu
 * @create: 2022-03-10 18:54
 * @description: 订单行记录对应折扣表视图类
 **/
public class SalesOrderLineDiscountVo {
    private Integer  orderLineId;
    private Integer  lineNum;
    private String  discountCode;
    private Double  discountPerc;
    private Double  discountUnit;
    private Double  additionalDiscount;

    public Integer getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Integer orderLineId) {
        this.orderLineId = orderLineId;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Double getDiscountPerc() {
        return discountPerc;
    }

    public void setDiscountPerc(Double discountPerc) {
        this.discountPerc = discountPerc;
    }

    public Double getDiscountUnit() {
        return discountUnit;
    }

    public void setDiscountUnit(Double discountUnit) {
        this.discountUnit = discountUnit;
    }

    public Double getAdditionalDiscount() {
        return additionalDiscount;
    }

    public void setAdditionalDiscount(Double additionalDiscount) {
        this.additionalDiscount = additionalDiscount;
    }
}
