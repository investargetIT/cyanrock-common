package com.cyanrocks.common.vo.api.oms.salesorder;

import java.util.List;

import javax.validation.constraints.NotEmpty;

/**
 * @version V1.0
 * @author: John.Hu
 * @create: 2022-02-18 18:54
 * @description: 订单行明细视图类
 **/
public class SalesOrderLineVo {
    /**
     * 行号
     */
    private Integer  lineNum;
    /**
     * 修改版本号
     */
    private Integer  version;
    /**
     * 行状态
     */
    private Integer  lineStatus;
    /**
     * 订单数量
     */
    @NotEmpty( message = "订单数量不能为0")
    private Double  qty;
    /**
     * 已发货数量
     */
    private Double  closeQty;
    /**
     * 行运费
     */
    private Double  freight;
    /**
     * 行国际运费
     */
    private Double  interFreight;
    /**
     * 源单据Id
     */
    private Integer  baseDocId;
    /**
     * 源单据行号
     */
    private Integer  baseDocLineNum;
    /**
     * 客户物料号
     */
    private String  customerSku;
    /**
     * 客户采购订单号
     */
    private String  poItemNo;
    /**
     * Sku类型
     */
    @NotEmpty( message = "Sku类型不能为空")
    private Integer  skuType;
    /**
     * Sku号
     */
    @NotEmpty( message = "Sku号不能为空")
    private String  sku;
    /**
     * 产品线号
     */
    private Integer  productLineCode;
    /**
     * Segment号
     */
    private Integer  segmentCode;
    /**
     * Family号
     */
    private Integer  familyCode;
    /**
     * Category号
     */
    private Integer  categoryCode;
    /**
     * 产品名称(中文)
     */
    @NotEmpty( message = "产品名称(中文)不能为空")
    private String  productNameZh;
    /**
     * 产品名称(英文)
     */
    private String  productNameEn;
    /**
     * 品牌代号
     */
    private Integer  brandCode;
    /**
     * 品牌名称
     */
    private String  brandName;
    /**
     * 供应商代号
     */
    private String  supplierCode;
    /**
     * 制造商型号
     */
    private String  mfgSku;
    /**
     * 供应商型号
     */
    private String  supplierSku;
    /**
     * 规格
     */
    private String  techSpec;
    /**
     * 物理单位
     */
    @NotEmpty(message = "物理单位不能为空")
    private String  phyUomCode;
    /**
     * 采购包装单位
     */
    private String  purchUomCode;
    /**
     * 标准销售单位
     */
    private String  salesUomCode;
    /**
     * 每个销售包装单位中含物理单位个数
     */
    private Integer  salesPackQty;
    /**
     * 销售最小起订量
     */
    @NotEmpty(message = "销售最小起订量不能为0")
    private Integer  salesMoq;
    /**
     * 交付周期(天)
     */
    private Integer  leadTime;
    /**
     * 交付方式
     */
    private String  deliveryTerm;
    /**
     * 备货方式
     */
    private Integer  deliveryType;
    /**
     * 销售计价货币
     */
    private String  salesCurrency;
    /**
     * 采购计价货币
     */
    private String  purchCurrency;
    /**
     * 采购价日期起始
     */
    private String  purchFromDate;
    /**
     * 采购价日期截止
     */
    private String  purchToDate;
    /**
     * 是否含安装
     */
    private Boolean  containInstall;
    /**
     * 产品原产国
     */
    private String  madeinCountryCode;
    /**
     * 适用关税
     */
    private Double  tariff;
    /**
     * HS Code
     */
    private String  hsCode;
    /**
     * 报价时间
     */
    private String  quotTime;
    /**
     * Sourcing/FoundMRO报价人
     */
    private String  quotUser;
    /**
     * 报价有效日期
     */
    private String  quotValidDate;
    /**
     * 备注
     */
    private String  remark;
    /**
     * 含税标准销售单价
     */
    private Double  listPrice;
    /**
     * 含税销售成交价
     */
    private Double  salesPrice;
    /**
     * 不含税销售成交价
     */
    private Double  salesPriceNet;
    /**
     * 采购价
     */
    private Double  purchPrice;
    /**
     * 不含税成本价
     */
    private Double  cost;
    /**
     * 价格有效期至
     */
    private String  priceValidTo;
    /**
     * 毛利率
     */
    private Double  gpRate;
    /**
     * 小计含税成交金额
     */
    private Double  totalAmount;
    /**
     * 小计折扣金额，负值
     */
    private Double  totalDiscount;
    /**
     * 签约折扣百分比
     */
    private Double  contractDiscountPerc;
    /**
     * 备货类型
     */
    private String  stockType;
 /*   *//**
     * 不可退换货/是否可退换货： 1: 不可退换货; 0: 可退换货;
     *//*
    private Boolean  noReturn;*/
    /**
     * 是否直送产品
     */
    private Boolean  dropShipFlag;
    /**
     * 产品业务状态
     */
    private Integer  bizStatus;
    /**
     * 单行是否一次性发货
     */
    private Boolean  itemCompleteDeliv;
    /**
     * 客户请求发货日
     */
    private String  reqDelivDate;
    /**
     * 预计发货日期
     */
    private String deliveryDate;
    /**
     * GPS原始报价单号
     */
    private String  sourceQuotCode;
    /**
     * GPS原始报价单号 - 行号
     */
    private Integer  sourceQuotLineNum;
    /**
     * SuNing原始订单行号
     */
    private String  orderItemId;
    /**
     * 特殊需求备注
     */
    private String  spercialRemark;
    /**
     * 行项目状态
     */
    private String  lineProjectStatus;
    /**
     * 是否定制替换
     */
    private Integer  isChange;
    /**
     * 是否成品油_成品油标志: 0否; 1是
     */
    private Integer  productOilFlag;
    /**
     * 成品油种类
     */
    private Integer  productOilType;
    /**
     * 税号
     */
    private String  taxNo;
    /**
     * 仓库编号
     */
    private String  wareCode;
    /**
     * 货物起运点
     */
    private String  storageLocation;
    /**
     * 7层sku
     */
    private String  skuLocal;
    /**
     * 过账标记
     */
    private Boolean  btoBFlag;

    private List<SalesOrderLineDiscountVo> lines;

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(Integer lineStatus) {
        this.lineStatus = lineStatus;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getCloseQty() {
        return closeQty;
    }

    public void setCloseQty(Double closeQty) {
        this.closeQty = closeQty;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Double getInterFreight() {
        return interFreight;
    }

    public void setInterFreight(Double interFreight) {
        this.interFreight = interFreight;
    }

    public Integer getBaseDocId() {
        return baseDocId;
    }

    public void setBaseDocId(Integer baseDocId) {
        this.baseDocId = baseDocId;
    }

    public Integer getBaseDocLineNum() {
        return baseDocLineNum;
    }

    public void setBaseDocLineNum(Integer baseDocLineNum) {
        this.baseDocLineNum = baseDocLineNum;
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

    public Integer getProductLineCode() {
        return productLineCode;
    }

    public void setProductLineCode(Integer productLineCode) {
        this.productLineCode = productLineCode;
    }

    public Integer getSegmentCode() {
        return segmentCode;
    }

    public void setSegmentCode(Integer segmentCode) {
        this.segmentCode = segmentCode;
    }

    public Integer getFamilyCode() {
        return familyCode;
    }

    public void setFamilyCode(Integer familyCode) {
        this.familyCode = familyCode;
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProductNameZh() {
        return productNameZh;
    }

    public void setProductNameZh(String productNameZh) {
        this.productNameZh = productNameZh;
    }

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
    }

    public Integer getBrandCode() {
        return brandCode;
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

    public String getSalesUomCode() {
        return salesUomCode;
    }

    public void setSalesUomCode(String salesUomCode) {
        this.salesUomCode = salesUomCode;
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

    public String getPurchFromDate() {
        return purchFromDate;
    }

    public void setPurchFromDate(String purchFromDate) {
        this.purchFromDate = purchFromDate;
    }

    public String getPurchToDate() {
        return purchToDate;
    }

    public void setPurchToDate(String purchToDate) {
        this.purchToDate = purchToDate;
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

    public Double getTariff() {
        return tariff;
    }

    public void setTariff(Double tariff) {
        this.tariff = tariff;
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getQuotTime() {
        return quotTime;
    }

    public void setQuotTime(String quotTime) {
        this.quotTime = quotTime;
    }

    public String getQuotUser() {
        return quotUser;
    }

    public void setQuotUser(String quotUser) {
        this.quotUser = quotUser;
    }

    public String getQuotValidDate() {
        return quotValidDate;
    }

    public void setQuotValidDate(String quotValidDate) {
        this.quotValidDate = quotValidDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Double getSalesPriceNet() {
        return salesPriceNet;
    }

    public void setSalesPriceNet(Double salesPriceNet) {
        this.salesPriceNet = salesPriceNet;
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

    public String getPriceValidTo() {
        return priceValidTo;
    }

    public void setPriceValidTo(String priceValidTo) {
        this.priceValidTo = priceValidTo;
    }

    public Double getGpRate() {
        return gpRate;
    }

    public void setGpRate(Double gpRate) {
        this.gpRate = gpRate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Double getContractDiscountPerc() {
        return contractDiscountPerc;
    }

    public void setContractDiscountPerc(Double contractDiscountPerc) {
        this.contractDiscountPerc = contractDiscountPerc;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
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

    public Boolean getItemCompleteDeliv() {
        return itemCompleteDeliv;
    }

    public void setItemCompleteDeliv(Boolean itemCompleteDeliv) {
        this.itemCompleteDeliv = itemCompleteDeliv;
    }

    public String getReqDelivDate() {
        return reqDelivDate;
    }

    public void setReqDelivDate(String reqDelivDate) {
        this.reqDelivDate = reqDelivDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getSourceQuotCode() {
        return sourceQuotCode;
    }

    public void setSourceQuotCode(String sourceQuotCode) {
        this.sourceQuotCode = sourceQuotCode;
    }

    public Integer getSourceQuotLineNum() {
        return sourceQuotLineNum;
    }

    public void setSourceQuotLineNum(Integer sourceQuotLineNum) {
        this.sourceQuotLineNum = sourceQuotLineNum;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getSpercialRemark() {
        return spercialRemark;
    }

    public void setSpercialRemark(String spercialRemark) {
        this.spercialRemark = spercialRemark;
    }

    public String getLineProjectStatus() {
        return lineProjectStatus;
    }

    public void setLineProjectStatus(String lineProjectStatus) {
        this.lineProjectStatus = lineProjectStatus;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Integer getProductOilFlag() {
        return productOilFlag;
    }

    public void setProductOilFlag(Integer productOilFlag) {
        this.productOilFlag = productOilFlag;
    }

    public Integer getProductOilType() {
        return productOilType;
    }

    public void setProductOilType(Integer productOilType) {
        this.productOilType = productOilType;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getWareCode() {
        return wareCode;
    }

    public void setWareCode(String wareCode) {
        this.wareCode = wareCode;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getSkuLocal() {
        return skuLocal;
    }

    public void setSkuLocal(String skuLocal) {
        this.skuLocal = skuLocal;
    }

    public Boolean getBtoBFlag() {
        return btoBFlag;
    }

    public void setBtoBFlag(Boolean btoBFlag) {
        this.btoBFlag = btoBFlag;
    }

    public List<SalesOrderLineDiscountVo> getLines() {
        return lines;
    }

    public void setLines(List<SalesOrderLineDiscountVo> lines) {
        this.lines = lines;
    }
}
