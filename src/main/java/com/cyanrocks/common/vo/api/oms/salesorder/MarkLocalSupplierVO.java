package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author JimboZhu
 * @version 1.0
 * @date 2022/9/16
 */

public class MarkLocalSupplierVO implements Serializable {
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
     * 标记切换供应商
     */
    private Integer markChangeSupplier;


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

    public Integer getMarkChangeSupplier() {
        return markChangeSupplier;
    }

    public void setMarkChangeSupplier(Integer markChangeSupplier) {
        this.markChangeSupplier = markChangeSupplier;
    }

    @Override
    public String toString() {
        return "MarkLocalSupplierVO{" + "orderNo='" + orderNo + '\'' + ", orderLineId=" + orderLineId + ", markChangeSupplier=" + markChangeSupplier + '}';
    }
}