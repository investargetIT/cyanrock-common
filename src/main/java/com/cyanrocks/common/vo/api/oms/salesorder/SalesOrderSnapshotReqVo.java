package com.cyanrocks.common.vo.api.oms.salesorder;

import javax.validation.constraints.NotBlank;

import com.cyanrocks.common.vo.api.PageReqVO;

/**
 * 销售订单附属信息请求VO
 */
public class SalesOrderSnapshotReqVo extends PageReqVO {


    /**
     * 订单号
     */
    @NotBlank(message = "订单号不能为空")
    private String orderNo;
    /**
     * 订单类型
     */
    private Integer orderType;
    /**
     * 导出类型
     */
    private String model;

    public SalesOrderSnapshotReqVo() {
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public SalesOrderSnapshotReqVo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
