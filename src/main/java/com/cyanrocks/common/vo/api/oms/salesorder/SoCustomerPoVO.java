package cn.mymro.oms.common.vo.api.oms.salesorder;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author JimboZhu
 * @version 1.0
 * @date 2022/8/16
 */

public class SoCustomerPoVO implements Serializable {
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
     * 客户物料号
     */
    private String customerSku;

    /**
     * 客户需求行号(客户采购单行号)
     */
    private String poItemNo;

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

    public String getCustomerSku() {
        return customerSku;
    }

    public void setCustomerSku(String customerSku) {
        this.customerSku = customerSku;
    }

    public String getPoItemNo() {
        return poItemNo;
    }

    public void setPoItemNo(String poItemNo) {
        this.poItemNo = poItemNo;
    }

    @Override
    public String toString() {
        return "SoCustomerPoVO{" +
                "orderNo='" + orderNo + '\'' +
                ", orderLineId=" + orderLineId +
                ", customerSku='" + customerSku + '\'' +
                ", poItemNo='" + poItemNo + '\'' +
                '}';
    }
}