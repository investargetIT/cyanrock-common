package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/4/15 1:36 PM
 * @description:折扣信息
 **/
public class SODiscountCreateReqVo {

    /**
     * 折扣编号
     */
    private String  discountCode;
    /**
     * 折扣百分比
     */
    private Double  discountPerc;
    /**
     * 折扣金额
     */
    private Double  discountUnit;

    /**
     * 网站优惠券
     */
    private String couponCode;

    /**
     * 加小计折扣金额，负值
     */
    private Double  additionalDiscount;

    public Double getAdditionalDiscount() {
        return additionalDiscount;
    }

    public void setAdditionalDiscount(Double additionalDiscount) {
        this.additionalDiscount = additionalDiscount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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

}
