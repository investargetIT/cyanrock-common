package com.cyanrocks.common.vo.api.oms.salesorder;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/6/6 3:20 PM
 * @description:历史成交价信息
 **/
public class RecentlyItemResp {

    /**
     * 历史成交价（含税）
     */
    private BigDecimal salesPrice;
    /**
     * 折扣类型
     */
    private String discountTypeDesc;
    /**
     * GP%
     */
    private Double gp;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getDiscountTypeDesc() {
        return discountTypeDesc;
    }

    public void setDiscountTypeDesc(String discountTypeDesc) {
        this.discountTypeDesc = discountTypeDesc;
    }

    public Double getGp() {
        return gp;
    }

    public void setGp(Double gp) {
        this.gp = gp;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
