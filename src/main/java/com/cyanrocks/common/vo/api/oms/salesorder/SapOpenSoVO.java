package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @version V2.0
 * @author: Anny.Song
 * @create: 2023/3/2 10:00
 * @description: 订单交期
 **/
public class SapOpenSoVO implements Serializable {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单行项目号(订单行项目sid后六位)
     */
    private String lineNum;
    /**
     * 物料编码-库存码（如果有a换b 那么按照B值查询）
     */
    private String stockSkuCode;
    /**
     * 物料编码-销售码
     */
    private String sku;
    /**
     * 订单行数量
     */
    private Double qty;

    /**
     * 销售包装单位数量
     */
    private BigDecimal unitQuantity;

    /**
     * open数量（需要经过换算 openQtySmall/unitQuantity）
     */
    private Double openQty;
    /**
     * 销售单位
     */
    private String replaceUomCode;
    /**
     * open数量(基于库存码)
     */
    private Double openQtySmall;
    /**
     * 预计交货期
     */
    private String estDelDate;

    /**
     * 数据更新时间（数据更新日期（8） + 数据更新时间（6））
     */
    private String evTime;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Double getOpenQtySmall() {
        return openQtySmall;
    }

    public void setOpenQtySmall(Double openQtySmall) {
        this.openQtySmall = openQtySmall;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }



    public BigDecimal getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(BigDecimal unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public String getReplaceUomCode() {
        return replaceUomCode;
    }

    public void setReplaceUomCode(String replaceUomCode) {
        this.replaceUomCode = replaceUomCode;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getStockSkuCode() {
        return stockSkuCode;
    }

    public void setStockSkuCode(String stockSkuCode) {
        this.stockSkuCode = stockSkuCode;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Double getOpenQty() {
        return openQty;
    }

    public void setOpenQty(Double openQty) {
        this.openQty = openQty;
    }

    public String getEstDelDate() {
        return estDelDate;
    }

    public void setEstDelDate(String estDelDate) {
        this.estDelDate = estDelDate;
    }

    public String getEvTime() {
        return evTime;
    }

    public void setEvTime(String evTime) {
        this.evTime = evTime;
    }
}
