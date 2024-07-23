package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author annysong
 * @version 1.0
 * @date 2023/10/23
 */

public class MarkAppointSupplierVO implements Serializable {
    /**
     * 订单号
     */
    @NotBlank(message = "订单号不能为空")
    private String orderNo;

    /**
     * 订单行ID
     */
    @NotNull(message = "订单行ID不能为空")
    private Long orderLineId;
  /**
     * 标记指定供应商
     */
    private Integer markAppointSupplier;;

    /**
     * 指定供应商代号
     */
    private String localSupplierCode;

    /**
     * 指定含税采购价
     */
    private BigDecimal localPurchPrice;
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Long orderLineId) {
        this.orderLineId = orderLineId;
    }

    public Integer getMarkAppointSupplier() {
        return markAppointSupplier;
    }

    public void setMarkAppointSupplier(Integer markAppointSupplier) {
        this.markAppointSupplier = markAppointSupplier;
    }

    public String getLocalSupplierCode() {
        return localSupplierCode;
    }

    public void setLocalSupplierCode(String localSupplierCode) {
        this.localSupplierCode = localSupplierCode;
    }

    public BigDecimal getLocalPurchPrice() {
        return localPurchPrice;
    }

    public void setLocalPurchPrice(BigDecimal localPurchPrice) {
        this.localPurchPrice = localPurchPrice;
    }

    @Override
    public String toString() {
        return "MarkAppointSupplierVO{" + "orderNo='" + orderNo + '\'' + ", orderLineId=" + orderLineId + ", markAppointSupplier=" + markAppointSupplier + ", localSupplierCode='" + localSupplierCode + '\'' + ", localPurchPrice=" + localPurchPrice + '}';
    }
}