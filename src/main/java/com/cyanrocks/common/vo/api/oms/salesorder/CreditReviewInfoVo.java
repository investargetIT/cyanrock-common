package com.cyanrocks.common.vo.api.oms.salesorder;

import java.math.BigDecimal;

/**
 * CRM单笔订单信用审核支持接口VO
 *
 * @author JimboZhu
 */
public class CreditReviewInfoVo extends BaseVo {

    /**
     * 客户编号
     */
    private String customerCode;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 采购单位名称
     */
    private String purchaseName;

    /**
     * 采购单位编号
     */
    private String purchaseCode;

    /**
     * 订单总金额
     */
    private BigDecimal amount;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CreditReviewInfoVo{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", purchaseName='" + purchaseName + '\'' +
                ", purchaseCode='" + purchaseCode + '\'' +
                ", amount=" + amount +
                '}';
    }
}
