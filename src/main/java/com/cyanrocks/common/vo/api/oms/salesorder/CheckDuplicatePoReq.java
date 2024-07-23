package com.cyanrocks.common.vo.api.oms.salesorder;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 报价转订单页面重复PO校验请求VO
 *
 * @author stevenqin
 */
public class CheckDuplicatePoReq {
    /**
     * 当前报价单客户号
     */
    @NotNull(message = "当前报价单客户号不能为空")
    private String customerCode;
    /**
     * 客户采购单号
     */
    private String customerPurchaseNo;
    /**
     * 当前报价单总金额
     */
    @NotNull(message = "当前报价单总金额不能为空")
    private BigDecimal amount;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerPurchaseNo() {
        return customerPurchaseNo;
    }

    public void setCustomerPurchaseNo(String customerPurchaseNo) {
        this.customerPurchaseNo = customerPurchaseNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
