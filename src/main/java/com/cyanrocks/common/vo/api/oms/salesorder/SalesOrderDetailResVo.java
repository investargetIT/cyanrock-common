package com.cyanrocks.common.vo.api.oms.salesorder;

import java.math.BigDecimal;

/**
 * 销售订单行明细响应展示VO
 */
public class SalesOrderDetailResVo {
    //region fields
    /***是否成品油***/
    private Boolean productOilFlagBool;
    /**
     * 行ID
     */
    private Long sid;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 替换状态
     */
    private Integer replaceStatus;

    /**
     * 行号
     */
    private Integer lineNum;

    /**
     * 订单行ID
     */
    private Long orderLineId;

    /**
     * 行状态
     */
    private String lineStatus;

    /**
     * 订单数量
     */
    private Double qty;

    /**
     * 需求数量
     */
    private BigDecimal reqQty;

    /**
     * 客户单位
     */
    private String customerUnit;

    /**
     * 已发货数量
     */
    private Double closeQty;

    /**
     * 关税
     */
    private String tariff;

    /**
     * 行运费
     */
    private String freight;

    /**
     * 行国际运费
     */
    private String interFreight;

    /**
     * 客户物料号
     */
    private String customerSku;

    /**
     * 客户采购单行号
     */
    private String poItemNo;

    /**
     * sku类型
     */
    private String skuType;

    /**
     * sku
     */
    private String sku;

    /**
     * 产品号
     */
    private String groupCode;

    /**
     * 产品名称(中文)
     */
    private String productNameZh;
    /**
     * 【产品名称】原productNameZh字段取值按照 「品牌 商品名称 制造商型号」 productNameConcatStr 去拼
     */
    private String productNameConcatStr;


    /**
     * HSCode
     */
    private String hsCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 含税标准销售单价
     */
    private String listPrice;

    /**
     * 含税销售成交价
     */
    private String salesPrice;
    /**
     * csr审核保存-含税销售成交价
     */
    private String csrSalesPrice;

    /**
     * csr审核保存-不含税销售成交价
     */
    private String  csrSalesPriceNet;

    /**
     * csr审核保存-小计货品成交金额/小计含税
     */
    private String  csrTotalAmount;

    /**
     * csr审核保存-小计未税
     */
    private String  csrTotalAmountNet;
    /**
     * 不含税销售成交价
     */
    private String salesPriceNet;

    /**
     * 销售起订量增幅
     */
    private Long salesMoqIncrement;

    /**
     * GrossProfitRate毛利率
     */
    private BigDecimal gpRate;

    /**
     * 小计含税
     */
    private String totalAmount;

    /**
     * 小计未税
     */
    private String totalAmountNet;

    /**
     * 小计折扣金额，负值
     */
    private String totalDiscount;

    /**
     * 签约折扣百分比
     */
    private String contractDiscountPerc;

/*    *//**
     * 不可退换货/是否可退换货： 1: 不可退换货; 0: 可退换货;
     *//*
    private String noReturn;*/
    /**
     * 是否可退货
     */
    private Integer supplierReturn;

    /**
     * 是否可换货
     */
    private Integer supplierExchange;
    /**
     * 是否直送产品
     */
    private String dropShipFlag;

    /**
     * 产品业务状态
     */
    private String bizStatus;

    /**
     * 单行是否一次性发货
     */
    private String itemCompleteDeliv;

    /**
     * 客户请求发货日
     */
    private String reqDelivString;

    /**
     * 预计发货日期
     */
    private String deliveryDate;

    /**
     * 特殊需求备注
     */
    private String spercialRemark;

    /**
     * 行项目状态
     */
    private String lineProjectStatus;

    /**
     * 税号
     */
    private String taxNo;

    /**
     * 仓库编号
     */
    private String wareCode;

    /**
     * 仓库名称
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
     * 7层sku
     */
    private String skuLocal;

    /**
     * OBD单号
     */
    private String obdOrderNo;

    /**
     * 是否A换B
     */
    private String isAReplaceB;

    /**
     * 过账标记
     */
    private String btoBFlag;

    /**
     * 标准销售单位SAPcode
     */
    private String salesUomCode;

    /**
     * 品牌
     */
    private Integer brandCode;

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
     * 交货周期
     */
    private Integer leadTime;

    /**
     * 备货类型
     */
    private String stockType;
    /**
     * 小计金额最大修改值
     */
    private Double totalAmountMax;
    /**
     * 小计金额最小修改值
     */
    private Double totalAmountMin;

    /**
     * 成本价格
     */
    private BigDecimal cost;

    /**
     * 产品线号
     */
    private String productLineCode;

    /**
     * Segment号
     */
    private String segmentCode;

    /**
     * Family号
     */
    private String familyCode;

    /**
     * Category号
     */
    private String categoryCode;

    /**
     * 产品线名
     */
    private String productLineName;

    /**
     * Segment名
     */
    private String segmentName;

    /**
     * Family名
     */
    private String familyName;

    /**
     * Category名
     */
    private String categoryName;

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
     * 库存码
     */
    private String stockSkuCode;
    /**
     * 基础销售码数量
     */
    private BigDecimal unitQuantity;
    /**
     * 行折扣
     */
    private    OrderDiscountInfo discountInfo;
    /**
     *标记指定供应商
     */
    private Integer markAppointSupplier;
    /**
     * 指定供应商编号
     */
    private String localSupplierCode;
    /**
     * 指定供应商名称
     */
    private String localSupplierName;

    /**
     * 指定交期
     */
    private Integer localLeadTime;
    /**
     * 指定进价
     */
    private BigDecimal localPurchPrice;
    /**
     * 备注
     */
    private String localRemark;
    /**
     * 清单重复
     */
    private Integer repeat;

    /**
     * 客户期望交期
     */
    private String expectedDate;

    public BigDecimal getLocalPurchPrice() {
        return localPurchPrice;
    }

    public Integer getRepeat() {
        return repeat;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }

    public String getLocalSupplierName() {
        return localSupplierName;
    }

    public void setLocalSupplierName(String localSupplierName) {
        this.localSupplierName = localSupplierName;
    }

    public String getLocalRemark() {
        return localRemark;
    }

    public void setLocalRemark(String localRemark) {
        this.localRemark = localRemark;
    }

    public void setLocalPurchPrice(BigDecimal localPurchPrice) {
        this.localPurchPrice = localPurchPrice;
    }

    public Boolean getProductOilFlagBool(){
        return productOilFlagBool;
    }

    public void setProductOilFlagBool(Boolean productOilFlagBool){
        this.productOilFlagBool = productOilFlagBool;
    }

    public String getProductNameConcatStr(){
        return productNameConcatStr;
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




    public Integer getLocalLeadTime() {
        return localLeadTime;
    }

    public void setLocalLeadTime(Integer localLeadTime) {
        this.localLeadTime = localLeadTime;
    }

    public void setProductNameConcatStr(String productNameConcatStr){
        this.productNameConcatStr = productNameConcatStr;
    }

    public OrderDiscountInfo getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(OrderDiscountInfo discountInfo) {
        this.discountInfo = discountInfo;
    }

    public String getStorageLocationName() {
        return storageLocationName;
    }

    public String getStockSkuCode() {
        return stockSkuCode;
    }

    public void setStockSkuCode(String stockSkuCode) {
        this.stockSkuCode = stockSkuCode;
    }

    public BigDecimal getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(BigDecimal unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public Double getTotalAmountMax() {
        return totalAmountMax;
    }

    public void setTotalAmountMax(Double totalAmountMax) {
        this.totalAmountMax = totalAmountMax;
    }

    public String getCsrSalesPrice() {
        return csrSalesPrice;
    }

    public void setCsrSalesPrice(String csrSalesPrice) {
        this.csrSalesPrice = csrSalesPrice;
    }

    public String getCsrSalesPriceNet() {
        return csrSalesPriceNet;
    }

    public void setCsrSalesPriceNet(String csrSalesPriceNet) {
        this.csrSalesPriceNet = csrSalesPriceNet;
    }

    public String getCsrTotalAmount() {
        return csrTotalAmount;
    }

    public void setCsrTotalAmount(String csrTotalAmount) {
        this.csrTotalAmount = csrTotalAmount;
    }public Double getTotalAmountMin() {
        return totalAmountMin;
    }

    public String getCsrTotalAmountNet() {
        return csrTotalAmountNet;
    }

    public void setCsrTotalAmountNet(String csrTotalAmountNet) {
        this.csrTotalAmountNet = csrTotalAmountNet;
    }

    public void setTotalAmountMin(Double totalAmountMin) {
        this.totalAmountMin = totalAmountMin;
    }

    public void setStorageLocationName(String storageLocationName) {
        this.storageLocationName = storageLocationName;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public String getPhyUomCode() {
        return phyUomCode;
    }

    public void setPhyUomCode(String phyUomCode) {
        this.phyUomCode = phyUomCode;
    }

    public BigDecimal getReqQty() {
        return reqQty;
    }

    public void setReqQty(BigDecimal reqQty) {
        this.reqQty = reqQty;
    }

    public String getCustomerUnit() {
        return customerUnit;
    }

    public void setCustomerUnit(String customerUnit) {
        this.customerUnit = customerUnit;
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

    public Integer getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
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

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getInterFreight() {
        return interFreight;
    }

    public void setInterFreight(String interFreight) {
        this.interFreight = interFreight;
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

    public String getSkuType() {
        return skuType;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getProductNameZh() {
        return productNameZh;
    }

    public void setProductNameZh(String productNameZh) {
        this.productNameZh = productNameZh;
    }


    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getSalesPriceNet() {
        return salesPriceNet;
    }

    public void setSalesPriceNet(String salesPriceNet) {
        this.salesPriceNet = salesPriceNet;
    }

    public Long getSalesMoqIncrement() {
        return salesMoqIncrement;
    }

    public void setSalesMoqIncrement(Long salesMoqIncrement) {
        this.salesMoqIncrement = salesMoqIncrement;
    }

    public BigDecimal getGpRate() {
        return gpRate;
    }

    public void setGpRate(BigDecimal gpRate) {
        this.gpRate = gpRate;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getContractDiscountPerc() {
        return contractDiscountPerc;
    }

    public void setContractDiscountPerc(String contractDiscountPerc) {
        this.contractDiscountPerc = contractDiscountPerc;
    }

    public Integer getSupplierReturn() {
        return supplierReturn;
    }

    public void setSupplierReturn(Integer supplierReturn) {
        this.supplierReturn = supplierReturn;
    }

    public Integer getSupplierExchange() {
        return supplierExchange;
    }

    public void setSupplierExchange(Integer supplierExchange) {
        this.supplierExchange = supplierExchange;
    }

    public String getDropShipFlag() {
        return dropShipFlag;
    }

    public void setDropShipFlag(String dropShipFlag) {
        this.dropShipFlag = dropShipFlag;
    }

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }

    public String getItemCompleteDeliv() {
        return itemCompleteDeliv;
    }

    public void setItemCompleteDeliv(String itemCompleteDeliv) {
        this.itemCompleteDeliv = itemCompleteDeliv;
    }

    public String getReqDelivString() {
        return reqDelivString;
    }

    public void setReqDelivString(String reqDelivString) {
        this.reqDelivString = reqDelivString;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
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

    public String getObdOrderNo() {
        return obdOrderNo;
    }

    public void setObdOrderNo(String obdOrderNo) {
        this.obdOrderNo = obdOrderNo;
    }

    public String getIsAReplaceB() {
        return isAReplaceB;
    }

    public void setIsAReplaceB(String isAReplaceB) {
        this.isAReplaceB = isAReplaceB;
    }

    public String getBtoBFlag() {
        return btoBFlag;
    }

    public void setBtoBFlag(String btoBFlag) {
        this.btoBFlag = btoBFlag;
    }

    public String getSalesUomCode() {
        return salesUomCode;
    }

    public void setSalesUomCode(String salesUomCode) {
        this.salesUomCode = salesUomCode;
    }

    public String getTotalAmountNet() {
        return totalAmountNet;
    }

    public void setTotalAmountNet(String totalAmountNet) {
        this.totalAmountNet = totalAmountNet;
    }

    public Long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Long orderLineId) {
        this.orderLineId = orderLineId;
    }

    public Integer getReplaceStatus() {
        return replaceStatus;
    }

    public void setReplaceStatus(Integer replaceStatus) {
        this.replaceStatus = replaceStatus;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    // endregion


    @Override
    public String toString() {
        return "SalesOrderDetailResVo{" +
                "productOilFlagBool=" + productOilFlagBool +
                ", sid=" + sid +
                ", orderNo='" + orderNo + '\'' +
                ", replaceStatus=" + replaceStatus +
                ", lineNum=" + lineNum +
                ", orderLineId=" + orderLineId +
                ", lineStatus='" + lineStatus + '\'' +
                ", qty=" + qty +
                ", closeQty=" + closeQty +
                ", tariff='" + tariff + '\'' +
                ", freight='" + freight + '\'' +
                ", interFreight='" + interFreight + '\'' +
                ", customerSku='" + customerSku + '\'' +
                ", poItemNo='" + poItemNo + '\'' +
                ", skuType='" + skuType + '\'' +
                ", sku='" + sku + '\'' +
                ", groupCode='" + groupCode + '\'' +
                ", productNameZh='" + productNameZh + '\'' +
                ", productNameConcatStr='" + productNameConcatStr + '\'' +
                ", hsCode='" + hsCode + '\'' +
                ", remark='" + remark + '\'' +
                ", listPrice='" + listPrice + '\'' +
                ", salesPrice='" + salesPrice + '\'' +
                ", csrSalesPrice='" + csrSalesPrice + '\'' +
                ", csrSalesPriceNet='" + csrSalesPriceNet + '\'' +
                ", csrTotalAmount='" + csrTotalAmount + '\'' +
                ", csrTotalAmountNet='" + csrTotalAmountNet + '\'' +
                ", salesPriceNet='" + salesPriceNet + '\'' +
                ", salesMoqIncrement=" + salesMoqIncrement +
                ", gpRate=" + gpRate +
                ", totalAmount='" + totalAmount + '\'' +
                ", totalAmountNet='" + totalAmountNet + '\'' +
                ", totalDiscount='" + totalDiscount + '\'' +
                ", contractDiscountPerc='" + contractDiscountPerc + '\'' +
                ", supplierReturn=" + supplierReturn +
                ", supplierExchange=" + supplierExchange +
                ", dropShipFlag='" + dropShipFlag + '\'' +
                ", bizStatus='" + bizStatus + '\'' +
                ", itemCompleteDeliv='" + itemCompleteDeliv + '\'' +
                ", reqDelivString='" + reqDelivString + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", spercialRemark='" + spercialRemark + '\'' +
                ", lineProjectStatus='" + lineProjectStatus + '\'' +
                ", taxNo='" + taxNo + '\'' +
                ", wareCode='" + wareCode + '\'' +
                ", wareName='" + wareName + '\'' +
                ", storageLocation='" + storageLocation + '\'' +
                ", storageLocationName='" + storageLocationName + '\'' +
                ", skuLocal='" + skuLocal + '\'' +
                ", obdOrderNo='" + obdOrderNo + '\'' +
                ", isAReplaceB='" + isAReplaceB + '\'' +
                ", btoBFlag='" + btoBFlag + '\'' +
                ", salesUomCode='" + salesUomCode + '\'' +
                ", brandCode=" + brandCode +
                ", brandName='" + brandName + '\'' +
                ", mfgSku='" + mfgSku + '\'' +
                ", supplierSku='" + supplierSku + '\'' +
                ", phyUomCode='" + phyUomCode + '\'' +
                ", leadTime=" + leadTime +
                ", stockType='" + stockType + '\'' +
                ", totalAmountMax=" + totalAmountMax +
                ", totalAmountMin=" + totalAmountMin +
                ", cost=" + cost +
                ", productLineCode='" + productLineCode + '\'' +
                ", segmentCode='" + segmentCode + '\'' +
                ", familyCode='" + familyCode + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", productLineName='" + productLineName + '\'' +
                ", segmentName='" + segmentName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", jv=" + jv +
                ", jvCompanyCode='" + jvCompanyCode + '\'' +
                ", jvCompanyName='" + jvCompanyName + '\'' +
                ", discountInfo=" + discountInfo +
                '}';
    }
}