package com.cyanrocks.common.vo.api.oms.salesorder;

import javax.validation.constraints.NotNull;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/4/26 11:52 AM
 * @description:订单行物料快照信息创建请求视图类
 **/
public class SODetailProduceCreateReqVo {

    /**
     * 品牌编号
     */
    @NotNull(message = "品牌编号，不能为空")
    private Integer brandCode;

    /**
     * 品牌名称
     */
    @NotNull(message = "品牌名称，不能为空")
    private String brandName;

    /**
     * 供应商编号
     */
    @NotNull(message = "供应商编号，不能为空")
    private String supplierCode;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 制造厂产品型号
     */
    @NotNull(message = "制造厂产品型号，不能为空")
    private String mfgSku;

    /**
     * 供应商独立于制造厂产品型号外的订货号
     */
    private String supplierSku;

    /**
     * 技术参数/标准/规格
     */
    private String techSpec;

    /**
     * 物理单位Code
     */
    private String phyUomCode;
    /**
     * 采购包装单位code
     */
    private String purchUomCode;
    /**
     * 每个销售包装(计价)单位中含物理单位个数
     */
    private Integer salesPackQty;
    /**
     * 销售最小起订量
     */
    private Integer salesMoq;
    /**
     * 供应商交付周期(天)
     */
    private Integer leadTime;
    /**
     * 供应商交付方式code
     */
    private String deliveryTerm;

    /**
     * 供应商送货方式 1：送到我的万物集仓库，2：直送客户
     */
    private Integer deliveryType;

    /**
     * 销售计价货币
     */
    private String salesCurrency;

    /**
     * 采购计价货币
     */
    private String purchCurrency;

    /**
     * 供应商供货(采购价)有效日期截止（yyyy-MM-dd）
     */
    private String purchToDate;

    /**
     * 产品线号
     */
    private String productLineCode;
    /**
     * 产品线名称
     */
    private String productLineName;
    /**
     * Segment号
     */
    private String segmentCode;
    /**
     * Segment名称
     */
    private String segmentName;

    /**
     * Family号
     */
    private String familyCode;
    /**
     * Family名称
     */
    private String familyName;
    /**
     * Category号
     */
    private String categoryCode;
    /**
     * Category名称
     */
    private String categoryName;

    /**
     * 是否含安装
     */
    private Boolean containInstall;

    /**
     * 产品原产国code
     */
    private String madeinCountryCode;

    /**
     * 含税采购价
     */
    private Double purchPrice;

    /**
     * 成本价格
     */
    private Double cost;

    /**
     * 备货类型
     */
    private String stockType;

    /**
     * 是否定制替换
     */
    private Boolean isChange;

    /**
     * 是否成品油_成品油标志: 0否; 1是
     */
    private Boolean productOilFlag;

    /**
     * 成品油种类
     */
    private Integer productOilType;

    /**
     * 销售单位
     */
    private String salesUomCode;

    /**
     * 是否危险品
     */
    private Boolean dangerFlag;

    public Boolean getDangerFlag() {
        return dangerFlag;
    }

    public void setDangerFlag(Boolean dangerFlag) {
        this.dangerFlag = dangerFlag;
    }
    public String getSalesUomCode() {
        return salesUomCode;
    }

    public void setSalesUomCode(String salesUomCode) {
        this.salesUomCode = salesUomCode;
    }

    public Integer getBrandCode() {
        return brandCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
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

    public String getTechSpec() {
        return techSpec;
    }

    public void setTechSpec(String techSpec) {
        this.techSpec = techSpec;
    }

    public String getPhyUomCode() {
        return phyUomCode;
    }

    public void setPhyUomCode(String phyUomCode) {
        this.phyUomCode = phyUomCode;
    }

    public String getPurchUomCode() {
        return purchUomCode;
    }

    public void setPurchUomCode(String purchUomCode) {
        this.purchUomCode = purchUomCode;
    }

    public Integer getSalesPackQty() {
        return salesPackQty;
    }

    public void setSalesPackQty(Integer salesPackQty) {
        this.salesPackQty = salesPackQty;
    }

    public Integer getSalesMoq() {
        return salesMoq;
    }

    public void setSalesMoq(Integer salesMoq) {
        this.salesMoq = salesMoq;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public String getDeliveryTerm() {
        return deliveryTerm;
    }

    public void setDeliveryTerm(String deliveryTerm) {
        this.deliveryTerm = deliveryTerm;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getSalesCurrency() {
        return salesCurrency;
    }

    public void setSalesCurrency(String salesCurrency) {
        this.salesCurrency = salesCurrency;
    }

    public String getPurchCurrency() {
        return purchCurrency;
    }

    public void setPurchCurrency(String purchCurrency) {
        this.purchCurrency = purchCurrency;
    }

    public String getPurchToDate() {
        return purchToDate;
    }

    public void setPurchToDate(String purchToDate) {
        this.purchToDate = purchToDate;
    }

    public String getProductLineCode() {
        return productLineCode;
    }

    public void setProductLineCode(String productLineCode) {
        this.productLineCode = productLineCode;
    }

    public String getSegmentCode() {
        return segmentCode;
    }

    public void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
    }

    public String getFamilyCode() {
        return familyCode;
    }

    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Boolean getContainInstall() {
        return containInstall;
    }

    public void setContainInstall(Boolean containInstall) {
        this.containInstall = containInstall;
    }

    public String getMadeinCountryCode() {
        return madeinCountryCode;
    }

    public void setMadeinCountryCode(String madeinCountryCode) {
        this.madeinCountryCode = madeinCountryCode;
    }

    public Double getPurchPrice() {
        return purchPrice;
    }

    public void setPurchPrice(Double purchPrice) {
        this.purchPrice = purchPrice;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public Boolean getChange() {
        return isChange;
    }

    public void setChange(Boolean change) {
        isChange = change;
    }

    public Boolean getProductOilFlag() {
        return productOilFlag;
    }

    public void setProductOilFlag(Boolean productOilFlag) {
        this.productOilFlag = productOilFlag;
    }

    public Integer getProductOilType() {
        return productOilType;
    }

    public void setProductOilType(Integer productOilType) {
        this.productOilType = productOilType;
    }

    public String getProductLineName() {
        return productLineName;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
