package com.cyanrocks.common.vo.api.oms.salesorder;

import java.math.BigDecimal;

/**
 * oms 订单行状态变更消息通知
 **/
public class EsOrderLineSynVO {
    /**
     * 订单行金额
     */
    private BigDecimal itemAmount;
    /**
     * 订单行报价单号
     */
    private String quoteNo;

    /**
     * 是否还有可转商品
     */
    private Boolean hasAvailableItem;

    /**
     * 报价单上的总运费
     */
    private BigDecimal totalFreight;

    public Boolean getHasAvailableItem() {
        return hasAvailableItem;
    }

    public void setHasAvailableItem(Boolean hasAvailableItem) {
        this.hasAvailableItem = hasAvailableItem;
    }

    public BigDecimal getTotalFreight() {
        return totalFreight;
    }

    public void setTotalFreight(BigDecimal totalFreight) {
        this.totalFreight = totalFreight;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getQuoteNo() {
        return quoteNo;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }
}
