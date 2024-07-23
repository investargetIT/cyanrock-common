package com.cyanrocks.common.vo.api.oms.salesorder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @version V2.0
 * @author: Glen.Wan
 * @create: 2022/11/3 14:15
 * @description: 销售单行信息详情
 **/
public class SalesOrderDetailVo {
    /**
     * 行信息主键
     */
    private Long sid;
    /**
     * 面价
     */
    private BigDecimal facePrice;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 客户物料号
     */
    private String customerSku;
    /**
     * 客户需求行号
     */
    private String poItemNo;
    /**
     * sku类型
     */
    private Integer skuType;
    /**
     * sku
     */
    private String sku;
    /**
     * 产品名称(中文)
     */
    private String productNameZh;
/*    *//**
     * 不可退换货/是否可退换货： 1: 不可退换货; 0: 可退换货;
     *//*
    private Boolean noReturn;*/
    /**
     * 是否直送产品
     */
    private Boolean dropShipFlag;
    /**
     * 产品业务状态
     */
    private Integer bizStatus;

    /**
     * 预计发货日期
     */
    private Date deliveryDate;
    /**
     * 发货仓库Code
     */
    private String wareCode;

    /**
     * 发货仓库名称
     */
    private String wareName;
    /**
     * 货物起运点
     */
    private String storageLocation;

    /**
     * 货物起运点名称
     */
    private String storageLocationName;
    /**
     * 交货周期
     */
    private Integer leadTime;
    /**
     * 是否JV
     */
    private Boolean jv;

    /**
     * JV公司code
     */
    private String jvCompanyCode;
    /**
     * JV公司名称
     */
    private String jvCompanyName;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 制造商型号
     */
    private String mfgSku;
    /**
     * 供应商型号
     */
    private String supplierSku;
    /**
     * 物理单位
     */
    private String phyUomCode;
    /**
     * 销售单位
     */
    private String salesUomCode;
    /**
     * 备货类型
     */
    private String stockType;
    /**
     * 是否危险品
     */
    private Boolean dangerFlag;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getFacePrice() {
        return facePrice;
    }

    public void setFacePrice(BigDecimal facePrice) {
        this.facePrice = facePrice;
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

    public Integer getSkuType() {
        return skuType;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductNameZh() {
        return productNameZh;
    }

    public void setProductNameZh(String productNameZh) {
        this.productNameZh = productNameZh;
    }


    public Boolean getDropShipFlag() {
        return dropShipFlag;
    }

    public void setDropShipFlag(Boolean dropShipFlag) {
        this.dropShipFlag = dropShipFlag;
    }

    public Integer getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(Integer bizStatus) {
        this.bizStatus = bizStatus;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getWareCode() {
        return wareCode;
    }

    public void setWareCode(String wareCode) {
        this.wareCode = wareCode;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getStorageLocationName() {
        return storageLocationName;
    }

    public void setStorageLocationName(String storageLocationName) {
        this.storageLocationName = storageLocationName;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public Boolean getJv() {
        return jv;
    }

    public void setJv(Boolean jv) {
        this.jv = jv;
    }

    public String getJvCompanyCode() {
        return jvCompanyCode;
    }

    public void setJvCompanyCode(String jvCompanyCode) {
        this.jvCompanyCode = jvCompanyCode;
    }

    public String getJvCompanyName() {
        return jvCompanyName;
    }

    public void setJvCompanyName(String jvCompanyName) {
        this.jvCompanyName = jvCompanyName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMfgSku() {
        return mfgSku;
    }

    public void setMfgSku(String mfgSku) {
        this.mfgSku = mfgSku;
    }

    public String getSupplierSku() {
        return supplierSku;
    }

    public void setSupplierSku(String supplierSku) {
        this.supplierSku = supplierSku;
    }

    public String getPhyUomCode() {
        return phyUomCode;
    }

    public void setPhyUomCode(String phyUomCode) {
        this.phyUomCode = phyUomCode;
    }

    public String getSalesUomCode() {
        return salesUomCode;
    }

    public void setSalesUomCode(String salesUomCode) {
        this.salesUomCode = salesUomCode;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public Boolean getDangerFlag() {
        return dangerFlag;
    }

    public void setDangerFlag(Boolean dangerFlag) {
        this.dangerFlag = dangerFlag;
    }
}
