package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * 销售订单-收货、开票、发票寄送响应VO
 */
public class SalesOrderSnapshotRespVo {

    /**
     * 销售订单基本信息&配送及支付方式
     */
    private SalesOrderRespVo salesOrderRespVo;

    /**
     * 销售订单收货信息
     */
    private SalesOrderReceiverRespVo salesOrderReceiverRespVo;

    /**
     * 销售订单开票、发票寄送信息
     */
    private SalesOrderInvoiceInfoRespVo salesOrderInvoiceInfoRespVo;

    /**
     * 下载直发送货单显示判断
     */
    private Boolean stationDisplay;

    /**
     * 是否可编辑客户物料号和客户需求行号
     */
    private Boolean customerPo;
    /***成品油警告: true此广盖订单行内存在是成品油的sku, 前端要展示相应banner***/
    public Boolean hasOilWarning;

    public Boolean getHasOilWarning(){
        return hasOilWarning;
    }

    public void setHasOilWarning(Boolean hasOilWarning){
        this.hasOilWarning = hasOilWarning;
    }

    public SalesOrderReceiverRespVo getSalesOrderReceiverRespVo() {
        return salesOrderReceiverRespVo;
    }

    public void setSalesOrderReceiverRespVo(SalesOrderReceiverRespVo salesOrderReceiverRespVo) {
        this.salesOrderReceiverRespVo = salesOrderReceiverRespVo;
    }

    public SalesOrderInvoiceInfoRespVo getSalesOrderInvoiceInfoRespVo() {
        return salesOrderInvoiceInfoRespVo;
    }

    public void setSalesOrderInvoiceInfoRespVo(SalesOrderInvoiceInfoRespVo salesOrderInvoiceInfoRespVo) {
        this.salesOrderInvoiceInfoRespVo = salesOrderInvoiceInfoRespVo;
    }

    public SalesOrderRespVo getSalesOrderRespVo() {
        return salesOrderRespVo;
    }

    public void setSalesOrderRespVo(SalesOrderRespVo salesOrderRespVo) {
        this.salesOrderRespVo = salesOrderRespVo;
    }

    public Boolean getStationDisplay() {
        return stationDisplay;
    }

    public void setStationDisplay(Boolean stationDisplay) {
        this.stationDisplay = stationDisplay;
    }

    public Boolean getCustomerPo() {
        return customerPo;
    }

    public void setCustomerPo(Boolean customerPo) {
        this.customerPo = customerPo;
    }

    @Override
    public String toString() {
        return "SalesOrderSnapshotRespVo{" +
                "salesOrderRespVo=" + salesOrderRespVo +
                ", salesOrderReceiverRespVo=" + salesOrderReceiverRespVo +
                ", salesOrderInvoiceInfoRespVo=" + salesOrderInvoiceInfoRespVo +
                ", stationDisplay=" + stationDisplay +
                ", customerPo=" + customerPo +
                '}';
    }
}
