package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.NotNull;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/4/15 10:20 AM
 * @description:订单创建行明细请求参数封装
 **/
public class SODetailCreateReqVo implements Serializable {

    /**
     * 销售数量
     */
    @NotNull(message = "销售数量，不能为空")
    private Double qty;

    /**
     * 询比价转换比
     */
    private BigDecimal inqConvertRate;

    /**
     * 关税
     */
    private Double tariff = 0D;

    /**
     * 行运费
     */
    private Double freight = 0D;

    /**
     * 行国际运费
     */
    private Double interFreight = 0D;

    /**
     * 客户物料号
     */
    private String customerSku;

    /**
     * 客户采购单行号
     */
    private String poItemNo;

    /**
     * sku类型 10:目录品 20:FA物料 50:美国馆物料
     */
    @NotNull(message = "sku类型，不能为空")
    private Integer skuType;

    /**
     * 物料号
     */
    @NotNull(message = "物料号，不能为空")
    private String sku;

    /**
     * 产品号
     */
    private String groupCode;

    /**
     * 产品名称(中文)
     */
    @NotNull(message = "产品名称(中文)，不能为空")
    private String productNameZh;

    /**
     * 产品名称(英文)
     */
    private String productNameEn;

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
    private Double listPrice = 0D;

    /**
     * 含税销售成交价
     */
    private Double salesPrice = 0D;

    /**
     * 不含税销售成交价
     */
    private Double salesPriceNet = 0D;

    /**
     * 销售起订量增幅
     */
    private Long salesMoqIncrement;
    /***最小起订量***/
    private Integer salesMoq;

    /**
     * GrossProfitRate毛利率
     */
    private Double gpRate = 0D;

    /**
     * 小计含税
     */
    private Double totalAmount = 0D;

    /**
     * 小计未税
     */
    private Double totalAmountNet = 0D;

    /**
     * 小计折扣金额，负值
     */
    private Double totalDiscount = 0D;

    /**
     * 签约折扣百分比
     */
    private Double contractDiscountPerc;


    /**
     * 是否可退货
     */
    @NotNull(message = "是否可退货，不能为空")
    private Integer supplierReturn;

    /**
     * 是否可换货
     */
    @NotNull(message = "是否可换货，不能为空")
    private Integer supplierExchange;
    /**
     * 是否直送产品
     */
    @NotNull(message = "是否直送产品，不能为空")
    private Boolean dropShipFlag;

    /**
     * 产品业务状态，pms查询物料信息时的业务状态
     */
    private Integer bizStatus;

    /**
     * 单行是否一次性发货
     */
    private Boolean itemCompleteDeliv;

    /**
     * 客户请求发货日（yyyy-MM-dd）
     */
    private String reqDelivString;

    /**
     * 预计发货日期(yyyy-MM-dd)
     */
    private String deliveryDate;

    /**
     * 税号
     */
    private String taxNo;

    /**
     * 7层sku
     */
    private String skuLocal;

    /**
     * 过账标记
     */
    private Boolean btoBFlag;

    /**
     * 标准销售单位SAPcode
     */
    private String salesUomCode;

    /**
     * 产品信息对象
     */
    private com.cyanrocks.common.vo.api.oms.salesorder.SODetailProduceCreateReqVo produceInfo;

    /**
     * oms报价单-单号
     */
    private String quotationNo;
    /**
     * oms报价单-行id
     */
    private Long quotationLineId;

    /**
     * 交货周期
     */
    private Integer leadTime;

    /**
     * 替换销售单位(计量单位)
     */
    private String replaceUomCode;

    /**
     * 折扣明细
     */
    private List<com.cyanrocks.common.vo.api.oms.salesorder.SODiscountCreateReqVo> discountLines;
    /**
     *
     */
    private String lineProjectStatus;
    /**
     * 外部系统行号
     */
    private String outLineNum;

    /**
     * 订单行sid
     */
    private Long orderLineId;

    /**
     * 内部系统行号
     */
    private Integer lineNum;

    /**
     * 客户物料描述（MDM编码描述）
     * @return
     */
    private String customerProductName;
    /**
     * 使用单位
     */
    private String useDept;
    /**
     * sku图片信息
     */
    private String imageUrl;

    /**
     * 客户期望交期 (yyyy-MM-dd)
     */
    private String expectedDate;

    /**
     * 仓库编号
     */
    private String wareCode;

    public Double getQty() {
        return qty;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getInqConvertRate() {
        return inqConvertRate;
    }

    public void setInqConvertRate(BigDecimal inqConvertRate) {
        this.inqConvertRate = inqConvertRate;
    }

    public String getOutLineNum() {
        return outLineNum;
    }

    public void setOutLineNum(String outLineNum) {
        this.outLineNum = outLineNum;
    }

    public String getLineProjectStatus() {
        return lineProjectStatus;
    }

    public void setLineProjectStatus(String lineProjectStatus) {
        this.lineProjectStatus = lineProjectStatus;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public String getReplaceUomCode() {
        return replaceUomCode;
    }

    public void setReplaceUomCode(String replaceUomCode) {
        this.replaceUomCode = replaceUomCode;
    }

    public Double getTariff() {
        return tariff;
    }

    public void setTariff(Double tariff) {
        this.tariff = tariff;
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

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
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

    public Long getSalesMoqIncrement() {
        return salesMoqIncrement;
    }

    public void setSalesMoqIncrement(Long salesMoqIncrement) {
        this.salesMoqIncrement = salesMoqIncrement;
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

    public Double getTotalAmountNet() {
        return totalAmountNet;
    }

    public void setTotalAmountNet(Double totalAmountNet) {
        this.totalAmountNet = totalAmountNet;
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

    public Boolean getItemCompleteDeliv() {
        return itemCompleteDeliv;
    }

    public void setItemCompleteDeliv(Boolean itemCompleteDeliv) {
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

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
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

    public String getSalesUomCode() {
        return salesUomCode;
    }

    public void setSalesUomCode(String salesUomCode) {
        this.salesUomCode = salesUomCode;
    }

    public String getQuotationNo() {
        return quotationNo;
    }

    public void setQuotationNo(String quotationNo) {
        this.quotationNo = quotationNo;
    }

    public Long getQuotationLineId() {
        return quotationLineId;
    }

    public void setQuotationLineId(Long quotationLineId) {
        this.quotationLineId = quotationLineId;
    }

    public List<com.cyanrocks.common.vo.api.oms.salesorder.SODiscountCreateReqVo> getDiscountLines() {
        return discountLines;
    }

    public void setDiscountLines(List<com.cyanrocks.common.vo.api.oms.salesorder.SODiscountCreateReqVo> discountLines) {
        this.discountLines = discountLines;
    }

    public com.cyanrocks.common.vo.api.oms.salesorder.SODetailProduceCreateReqVo getProduceInfo() {
        return produceInfo;
    }

    public void setProduceInfo(com.cyanrocks.common.vo.api.oms.salesorder.SODetailProduceCreateReqVo produceInfo) {
        this.produceInfo = produceInfo;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public Long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(Long orderLineId) {
        this.orderLineId = orderLineId;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public Integer getSalesMoq(){
        return salesMoq;
    }

    public void setSalesMoq(Integer salesMoq){
        this.salesMoq = salesMoq;
    }

    public String getCustomerProductName() {
        return customerProductName;
    }

    public void setCustomerProductName(String customerProductName) {
        this.customerProductName = customerProductName;
    }

    public String getUseDept() {
        return useDept;
    }

    public void setUseDept(String useDept) {
        this.useDept = useDept;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getWareCode() {
        return wareCode;
    }

    public void setWareCode(String wareCode) {
        this.wareCode = wareCode;
    }
}
