package com.cyanrocks.common.vo.api.oms.salesorder;

import com.cyanrocks.common.vo.api.oms.salesorder.csr.TagsVO;
import java.util.ArrayList;
import java.util.List;

/**
 * 销售订单响应展示VO
 */
public class SalesOrderRespVo extends BaseVo {

    /**
     * 订单ID
     */
    private Long sid;

    /**
     * 订单渠道
     */
    private String channel;
    /**
     * 订单渠道
     */
    private Integer channelCode;

    /**
     * 下单时间
     */
    private String orderTime;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * erp订单号
     */
    private String erpOrderNo;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 订单状态code
     */
    private String orderStatusCode;

    /**
     * 订单类型描述
     */
    private String category;
    /**
     * 订单类型
     */
    private Integer categoryStatus;

    /**
     * 外部订单号
     */
    private String ouOrderNo;

    /**
     * 下单客户编号
     */
    private String customerCode;

    /**
     * 下单客户名称
     */
    private String customerName;

    /**
     * 下单客户手机
     */
    private String customerPhone;

    /**
     * 主销售编号
     */
    private String salesNo;

    /**
     * 主销售姓名
     */
    private String salesName;

    /**
     * 销售主管
     */
    private String salesSupervisor;

    /**
     * 订单所属公司名称
     */
    private String companyName;

    /**
     * 订单所属公司Code
     */
    private String companyCode;


    /**
     * 头运费
     */
    private String freight;

    /**
     * 国际运费
     */
    private String interFreight;

    /**
     * 总运费
     */
    private String totalFreight;

    /**
     * 关税
     */
    private String tariff;

    /**
     * 期望发货日期
     */
    private String sendDate;

    /**
     * 客户期望交期
     */
    private String expectedDate;

    /**
     * 交货方式
     */
    private String shipType;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 交货方式code
     */
    private String shipTypeCode;

    /**
     * 支付方式code
     */
    private String paymentMethodCode;

    /**
     * 支付条件code
     */
    private String paymentTermsCode;

    /**
     * 订单商品总数量
     */
    private String goodsNumTotal;

    /**
     * 是否需要发票
     */
    private String needInvoice;

    /**
     * 是否一次性发货
     */
    private Boolean partialShipment;

    /**
     * 客户备注
     */
    private String userRemark;

    /**
     * CSR备注
     */
    private String csrRemark;

    /**
     * 订单总金额
     */
    private String amount;

    /**
     * 商品总金额
     */
    private String goodsAmount;

    /**
     * 折扣总金额
     */
    private String discountAmount;

    /**
     * 毛利率
     */
    private String gpRate;

    /**
     * 客户采购单号
     */
    private String customerPurchaseNo;

    /**
     * 采购单位名称
     */
    private String purchaseName;
    /**
     * 采购单位客户号
     */
    private String purchaseCode;
    /**
     * 采购单位主销售
     */
    private String purchaseSalesName;
    /**
     * 是否使用二级code
     */
    private Boolean needPurchase;

    /**
     * 支付条件
     */
    private String paymentTerms;

    /**
     * 是否同步SAP
     */
    private Boolean syncSap;

    /**
     * 有无附件
     */
    private Boolean attached;

    /**
     * ordertag标记
     */
    private String ordertag;

    /**
     * 需要审核信息
     */
    private List<TagsVO> orderTags = new ArrayList<>();

    /**
     * 联系人
     */
    private String contactsName;

    /**
     * 联系人code
     */
    private String contactsCode;

    /**
     * 可使用的Rebate Pool的金额
     */
    private String rebate;

    /**
     * 计算SellingPrice时使用的折扣代码
     */
    private String discountCode;

    /**
     * 网站优惠券
     */
    private String couponCode;

    /**
     * CSR审单时间
     */
    private String csrReviewTime;

    /**
     * CSR审单人
     */
    private String csrReviewUser;

    /**
     * 商机编号
     */
    private String oppoId;

    /**
     * 商机名称
     */
    private String oppoValue;

    /**
     * 下单人姓名
     */
    private String purchaseAccount;

    /**
     * 下单人电话
     */
    private String purchaseTel;

    /**
     * 30天内重复
     */
    private Boolean thirtyRepeat;

    /**
     * 关联订单号
     */
    private String relationOrderNo;

    /**
     * 总计金额未税/净价
     */
    private String netPrice;

    /**
     * 替换状态
     */
    private Integer replaceStatus;
    /**
     * 替换指定供应商状态
     */
    private Integer appointSupplierStatus;
    /**
     * 替换指定供应商状态名称
     */
    private String appointSupplierStatusName;

    /**
     * 替换状态名称
     */
    private String replaceStatusName;


    /**
     * 是否替换
     */
    private Boolean replace;
    /**
     * 是否指定供应商
     */
    private Boolean appointSupplier;

    /**
     * 放单备注
     */
    private String releaseRemark;

    /**
     * 报价有效日期(订单有效期至)
     */
    private String validToDate;

    /**
     * 收件人姓名
     */
    private String receiverName;
    /**
     * 收件人联系电话
     */
    private String receiverPhone;
    /**
     * 收件人手机
     */
    private String receiverMobile;
    /**
     * 收件人地址
     */
    private String receiverAddress;
    /**
     * 收件人省份code
     */
    private String provinceCode;
    /**
     * 收件人城市Code
     */
    private String cityCode;
    /**
     * 收件人区/县code
     */
    private String districtCode;
    /**
     * 收件人省份
     */
    private String province;
    /**
     * 收件人城市
     */
    private String city;
    /**
     * 收件人区/县
     */
    private String district;
    /**
     * 收件人邮政编码
     */
    private String shipZip;
    /**
     * 分机号
     */
    private String extensionNumber;
    /**
     * VAT发票-注册电话分机
     */
    private String vatTelExt;
    /**
     * 是否保税区
     */
    private Boolean toBond;
    /**
     * 特殊编码
     */
    private String specialCode;

    /**
     * 收货地区
     */
    private String receivingArea;

    /**
     * 发票类型
     */
    private String invoiceType;

    /**
     * 发票类型code
     */
    private String invoiceTypeCode;

    /**
     * 发票抬头类型
     */
    private Integer invoiceTitleType;

    /**
     * 普通发票抬头
     */
    private String invoiceTitle;

    /**
     * VAT发票-单位名称
     */
    private String vatCompanyName;

    /**
     * VAT发票-纳税人识别号
     */
    private String vatTaxNo;

    /**
     * VAT发票-注册地址
     */
    private String vatAddress;

    /**
     * VAT发票-注册电话
     */
    private String vatPhone;

    /**
     * VAT发票-开户银行
     */
    private String vatBankName;

    /**
     * VAT发票-银行账户
     */
    private String vatBankNo;

    /**
     * 发票收件人
     */
    private String invoiceReceiver;

    /**
     * 发票收件地址
     */
    private String invoiceAddress;

    /**
     * 发票收件邮编
     */
    private String invoiceZip;

    /**
     * 发票收件人-固话
     */
    private String invoiceTel;

    /**
     * 发票收件人-手机
     */
    private String invoiceMobile;

    /**
     * invoiceEmail
     */
    private String invoiceEmail;

    /**
     * 发票是否随货
     */
    private Integer followMerchandise;

    /**
     * 是否运费调整过（包括运费分摊及免运费）
     */
    private Boolean adjustFreight;

    /**
     * 同步时间
     */
    private String syncTime;

    /**
     * sap回复时间
     */
    private String sapConfirmTime;

    /**
     * 回写源系统订单号的时间
     */
    private String notifiedTime;

    /**
     * 承运商代号
     */
    private String tplCode;

    /**
     * SAP信用状态
     */
    private String sapCreditStatus;

    /**
     * 信用状态
     */
    private Boolean creditStatus;

    /**
     * 用户邮箱
     */
    private String contactEmail;

    /**
     * 发票收件地区
     */
    private String invoiceReceiveRegion;

    /**
     * 收货人邮箱
     */
    private String consigneeEmail;

    /**
     * 是否vip价格
     */
    private Integer isVip;

    /**
     * 收货地区-sapCode
     */
    private String shipRegionSapCode;

    /**
     * 发票寄送信息-sapCode
     */
    private String invoiceSapCode;

    /**
     * 发票-开票信息sapCode
     */
    private String vatSapCode;

    /**
     * 支付条件高亮(true高亮/false不高亮)
     */
    private Boolean paymentTermsHighLight;
    /**
     * 销售智能设备 (true高亮/false不高亮)
     */
    private Boolean intelDeviceHighLight;

    /**
     * 支付方式高亮(true高亮/false不高亮)
     */
    private Boolean paymentMethodHighLight;
    /***集团号***/
    private String groupCustomerAccount;
    /***集团名称***/
    private String groupCustomerName;

    /**
     * 业务类型
     */
    private Integer businessType;
    /**
     * 销售智能设备
     */
    private Integer   intelDevice;
    /**
     * 业务类型展示
     */
    private String businessTypeStr;
    /**
     * 计价方式
     */
    private Integer pricingMethod;
    /**
     * 当前订单计价方式
     */
    private Integer oPricingMethod;
    /**
     * 是否
     */
    private String completed;
    /**
     * 完结时间
     */
    private String completedTime;
    /**
     * 支付状态
     */
    private String payStatus;
    /**
     * 支付时间
     */

    private String payTime;
    /**
     * 客户超期说明
     */
    private String arOverdue;

    public String getGroupCustomerName(){
        return groupCustomerName;
    }

    public String getCompleted() {
        return completed;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public Integer getPricingMethod() {
        return pricingMethod;
    }

    public Integer getoPricingMethod() {
        return oPricingMethod;
    }

    public void setoPricingMethod(Integer oPricingMethod) {
        this.oPricingMethod = oPricingMethod;
    }

    public void setPricingMethod(Integer pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    public Integer getAppointSupplierStatus() {
        return appointSupplierStatus;
    }

    public void setAppointSupplierStatus(Integer appointSupplierStatus) {
        this.appointSupplierStatus = appointSupplierStatus;
    }

    public String getAppointSupplierStatusName() {
        return appointSupplierStatusName;
    }

    public void setAppointSupplierStatusName(String appointSupplierStatusName) {
        this.appointSupplierStatusName = appointSupplierStatusName;
    }

    public void setGroupCustomerName(String groupCustomerName){
        this.groupCustomerName = groupCustomerName;
    }

    public Boolean getAppointSupplier() {
        return appointSupplier;
    }

    public void setAppointSupplier(Boolean appointSupplier) {
        this.appointSupplier = appointSupplier;
    }

    public String getGroupCustomerAccount(){
        return groupCustomerAccount;
    }

    public void setGroupCustomerAccount(String groupCustomerAccount){
        this.groupCustomerAccount = groupCustomerAccount;
    }

    public Boolean getPaymentTermsHighLight() {
        return paymentTermsHighLight;
    }

    public void setPaymentTermsHighLight(Boolean paymentTermsHighLight) {
        this.paymentTermsHighLight = paymentTermsHighLight;
    }

    public Integer getIntelDevice() {
        return intelDevice;
    }

    public void setIntelDevice(Integer intelDevice) {
        this.intelDevice = intelDevice;
    }

    public Boolean getIntelDeviceHighLight() {
        return intelDeviceHighLight;
    }

    public void setIntelDeviceHighLight(Boolean intelDeviceHighLight) {
        this.intelDeviceHighLight = intelDeviceHighLight;
    }

    public Boolean getPaymentMethodHighLight() {
        return paymentMethodHighLight;
    }

    public void setPaymentMethodHighLight(Boolean paymentMethodHighLight) {
        this.paymentMethodHighLight = paymentMethodHighLight;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public Boolean getNeedPurchase() {
        return needPurchase;
    }

    public void setNeedPurchase(Boolean needPurchase) {
        this.needPurchase = needPurchase;
    }

    public String getShipRegionSapCode() {
        return shipRegionSapCode;
    }

    public void setShipRegionSapCode(String shipRegionSapCode) {
        this.shipRegionSapCode = shipRegionSapCode;
    }

    public String getInvoiceSapCode() {
        return invoiceSapCode;
    }

    public void setInvoiceSapCode(String invoiceSapCode) {
        this.invoiceSapCode = invoiceSapCode;
    }

    public String getVatSapCode() {
        return vatSapCode;
    }

    public void setVatSapCode(String vatSapCode) {
        this.vatSapCode = vatSapCode;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
    }

    public String getInvoiceReceiveRegion() {
        return invoiceReceiveRegion;
    }

    public void setInvoiceReceiveRegion(String invoiceReceiveRegion) {
        this.invoiceReceiveRegion = invoiceReceiveRegion;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(String orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public String getTplCode() {
        return tplCode;
    }

    public void setTplCode(String tplCode) {
        this.tplCode = tplCode;
    }

    public String getSapCreditStatus() {
        return sapCreditStatus;
    }

    public void setSapCreditStatus(String sapCreditStatus) {
        this.sapCreditStatus = sapCreditStatus;
    }

    public Boolean getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(Boolean creditStatus) {
        this.creditStatus = creditStatus;
    }

    public List<TagsVO> getOrderTags() {
        return orderTags;
    }

    public void setOrderTags(List<TagsVO> orderTags) {
        this.orderTags = orderTags;
    }

    public String getNotifiedTime() {
        return notifiedTime;
    }

    public void setNotifiedTime(String notifiedTime) {
        this.notifiedTime = notifiedTime;
    }

    public String getSapConfirmTime() {
        return sapConfirmTime;
    }

    public void setSapConfirmTime(String sapConfirmTime) {
        this.sapConfirmTime = sapConfirmTime;
    }

    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime;
    }

    public Boolean getAdjustFreight() {
        return adjustFreight;
    }

    public void setAdjustFreight(Boolean adjustFreight) {
        this.adjustFreight = adjustFreight;
    }

    public Boolean getReplace() {
        return replace;
    }

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    public String getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }

    public String getReleaseRemark() {
        return releaseRemark;
    }

    public void setReleaseRemark(String releaseRemark) {
        this.releaseRemark = releaseRemark;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(Integer channelCode) {
        this.channelCode = channelCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOuOrderNo() {
        return ouOrderNo;
    }

    public void setOuOrderNo(String ouOrderNo) {
        this.ouOrderNo = ouOrderNo;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(String salesNo) {
        this.salesNo = salesNo;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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

    public String getTotalFreight() {
        return totalFreight;
    }

    public void setTotalFreight(String totalFreight) {
        this.totalFreight = totalFreight;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getGoodsNumTotal() {
        return goodsNumTotal;
    }

    public void setGoodsNumTotal(String goodsNumTotal) {
        this.goodsNumTotal = goodsNumTotal;
    }

    public String getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(String needInvoice) {
        this.needInvoice = needInvoice;
    }

    public Boolean getPartialShipment() {
        return partialShipment;
    }

    public void setPartialShipment(Boolean partialShipment) {
        this.partialShipment = partialShipment;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getCsrRemark() {
        return csrRemark;
    }

    public void setCsrRemark(String csrRemark) {
        this.csrRemark = csrRemark;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(String goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getGpRate() {
        return gpRate;
    }

    public void setGpRate(String gpRate) {
        this.gpRate = gpRate;
    }

    public String getCustomerPurchaseNo() {
        return customerPurchaseNo;
    }

    public void setCustomerPurchaseNo(String customerPurchaseNo) {
        this.customerPurchaseNo = customerPurchaseNo;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }


    public Boolean getSyncSap() {
        return syncSap;
    }

    public void setSyncSap(Boolean syncSap) {
        this.syncSap = syncSap;
    }


    public String getOrdertag() {
        return ordertag;
    }

    public void setOrdertag(String ordertag) {
        this.ordertag = ordertag;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getContactsCode() {
        return contactsCode;
    }

    public void setContactsCode(String contactsCode) {
        this.contactsCode = contactsCode;
    }

    public String getRebate() {
        return rebate;
    }

    public void setRebate(String rebate) {
        this.rebate = rebate;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getCsrReviewTime() {
        return csrReviewTime;
    }

    public void setCsrReviewTime(String csrReviewTime) {
        this.csrReviewTime = csrReviewTime;
    }

    public String getCsrReviewUser() {
        return csrReviewUser;
    }

    public void setCsrReviewUser(String csrReviewUser) {
        this.csrReviewUser = csrReviewUser;
    }

    public String getOppoId() {
        return oppoId;
    }

    public void setOppoId(String oppoId) {
        this.oppoId = oppoId;
    }

    public String getOppoValue() {
        return oppoValue;
    }

    public void setOppoValue(String oppoValue) {
        this.oppoValue = oppoValue;
    }

    public String getPurchaseAccount() {
        return purchaseAccount;
    }

    public void setPurchaseAccount(String purchaseAccount) {
        this.purchaseAccount = purchaseAccount;
    }

    public String getPurchaseTel() {
        return purchaseTel;
    }

    public void setPurchaseTel(String purchaseTel) {
        this.purchaseTel = purchaseTel;
    }

    public Boolean getThirtyRepeat() {
        return thirtyRepeat;
    }

    public void setThirtyRepeat(Boolean thirtyRepeat) {
        this.thirtyRepeat = thirtyRepeat;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getRelationOrderNo() {
        return relationOrderNo;
    }

    public void setRelationOrderNo(String relationOrderNo) {
        this.relationOrderNo = relationOrderNo;
    }

    public String getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(String netPrice) {
        this.netPrice = netPrice;
    }

    public Integer getReplaceStatus() {
        return replaceStatus;
    }

    public void setReplaceStatus(Integer replaceStatus) {
        this.replaceStatus = replaceStatus;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getShipZip() {
        return shipZip;
    }

    public void setShipZip(String shipZip) {
        this.shipZip = shipZip;
    }

    public String getExtensionNumber() {
        return extensionNumber;
    }

    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public Boolean getToBond() {
        return toBond;
    }

    public void setToBond(Boolean toBond) {
        this.toBond = toBond;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public String getReceivingArea() {
        return receivingArea;
    }

    public void setReceivingArea(String receivingArea) {
        this.receivingArea = receivingArea;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getInvoiceTitleType() {
        return invoiceTitleType;
    }

    public void setInvoiceTitleType(Integer invoiceTitleType) {
        this.invoiceTitleType = invoiceTitleType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getVatCompanyName() {
        return vatCompanyName;
    }

    public void setVatCompanyName(String vatCompanyName) {
        this.vatCompanyName = vatCompanyName;
    }

    public String getVatTaxNo() {
        return vatTaxNo;
    }

    public void setVatTaxNo(String vatTaxNo) {
        this.vatTaxNo = vatTaxNo;
    }

    public String getVatAddress() {
        return vatAddress;
    }

    public void setVatAddress(String vatAddress) {
        this.vatAddress = vatAddress;
    }

    public String getVatPhone() {
        return vatPhone;
    }

    public void setVatPhone(String vatPhone) {
        this.vatPhone = vatPhone;
    }

    public String getVatBankName() {
        return vatBankName;
    }

    public void setVatBankName(String vatBankName) {
        this.vatBankName = vatBankName;
    }

    public String getVatBankNo() {
        return vatBankNo;
    }

    public void setVatBankNo(String vatBankNo) {
        this.vatBankNo = vatBankNo;
    }

    public String getInvoiceReceiver() {
        return invoiceReceiver;
    }

    public void setInvoiceReceiver(String invoiceReceiver) {
        this.invoiceReceiver = invoiceReceiver;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getInvoiceZip() {
        return invoiceZip;
    }

    public void setInvoiceZip(String invoiceZip) {
        this.invoiceZip = invoiceZip;
    }

    public String getInvoiceTel() {
        return invoiceTel;
    }

    public void setInvoiceTel(String invoiceTel) {
        this.invoiceTel = invoiceTel;
    }

    public String getInvoiceMobile() {
        return invoiceMobile;
    }

    public void setInvoiceMobile(String invoiceMobile) {
        this.invoiceMobile = invoiceMobile;
    }

    public String getInvoiceEmail() {
        return invoiceEmail;
    }

    public void setInvoiceEmail(String invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
    }

    public Integer getFollowMerchandise() {
        return followMerchandise;
    }

    public void setFollowMerchandise(Integer followMerchandise) {
        this.followMerchandise = followMerchandise;
    }

    public String getVatTelExt() {
        return vatTelExt;
    }

    public void setVatTelExt(String vatTelExt) {
        this.vatTelExt = vatTelExt;
    }

    public Boolean getAttached() {
        return attached;
    }

    public void setAttached(Boolean attached) {
        this.attached = attached;
    }

    public String getErpOrderNo() {
        return erpOrderNo;
    }

    public void setErpOrderNo(String erpOrderNo) {
        this.erpOrderNo = erpOrderNo;
    }

    public String getReplaceStatusName() {
        return replaceStatusName;
    }

    public void setReplaceStatusName(String replaceStatusName) {
        this.replaceStatusName = replaceStatusName;
    }

    public String getShipTypeCode() {
        return shipTypeCode;
    }

    public void setShipTypeCode(String shipTypeCode) {
        this.shipTypeCode = shipTypeCode;
    }

    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }

    public void setPaymentTermsCode(String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }

    public String getSalesSupervisor() {
        return salesSupervisor;
    }

    public void setSalesSupervisor(String salesSupervisor) {
        this.salesSupervisor = salesSupervisor;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    public void setInvoiceTypeCode(String invoiceTypeCode) {
        this.invoiceTypeCode = invoiceTypeCode;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getBusinessTypeStr() {
        return businessTypeStr;
    }

    public void setBusinessTypeStr(String businessTypeStr) {
        this.businessTypeStr = businessTypeStr;
    }

    public String getPurchaseSalesName() {
        return purchaseSalesName;
    }

    public void setPurchaseSalesName(String purchaseSalesName) {
        this.purchaseSalesName = purchaseSalesName;
    }

    public String getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(String completedTime) {
        this.completedTime = completedTime;
    }

    public String getArOverdue() {
        return arOverdue;
    }

    public void setArOverdue(String arOverdue) {
        this.arOverdue = arOverdue;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    @Override
    public String toString() {
        return "SalesOrderRespVo{" +
                "sid=" + sid +
                ", channel='" + channel + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", erpOrderNo='" + erpOrderNo + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderStatusCode='" + orderStatusCode + '\'' +
                ", category='" + category + '\'' +
                ", ouOrderNo='" + ouOrderNo + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", salesNo='" + salesNo + '\'' +
                ", salesName='" + salesName + '\'' +
                ", salesSupervisor='" + salesSupervisor + '\'' +
                ", companyName='" + companyName + '\'' +
                ", freight='" + freight + '\'' +
                ", interFreight='" + interFreight + '\'' +
                ", totalFreight='" + totalFreight + '\'' +
                ", tariff='" + tariff + '\'' +
                ", sendDate='" + sendDate + '\'' +
                ", shipType='" + shipType + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", shipTypeCode='" + shipTypeCode + '\'' +
                ", paymentMethodCode='" + paymentMethodCode + '\'' +
                ", paymentTermsCode='" + paymentTermsCode + '\'' +
                ", goodsNumTotal='" + goodsNumTotal + '\'' +
                ", needInvoice='" + needInvoice + '\'' +
                ", partialShipment=" + partialShipment +
                ", userRemark='" + userRemark + '\'' +
                ", csrRemark='" + csrRemark + '\'' +
                ", amount='" + amount + '\'' +
                ", goodsAmount='" + goodsAmount + '\'' +
                ", discountAmount='" + discountAmount + '\'' +
                ", gpRate='" + gpRate + '\'' +
                ", customerPurchaseNo='" + customerPurchaseNo + '\'' +
                ", purchaseName='" + purchaseName + '\'' +
                ", paymentTerms='" + paymentTerms + '\'' +
                ", syncSap=" + syncSap +
                ", attached=" + attached +
                ", ordertag='" + ordertag + '\'' +
                ", orderTags=" + orderTags +
                ", contactsName='" + contactsName + '\'' +
                ", contactsCode='" + contactsCode + '\'' +
                ", rebate='" + rebate + '\'' +
                ", discountCode='" + discountCode + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", csrReviewTime='" + csrReviewTime + '\'' +
                ", csrReviewUser='" + csrReviewUser + '\'' +
                ", oppoId='" + oppoId + '\'' +
                ", oppoValue='" + oppoValue + '\'' +
                ", purchaseAccount='" + purchaseAccount + '\'' +
                ", purchaseTel='" + purchaseTel + '\'' +
                ", thirtyRepeat=" + thirtyRepeat +
                ", relationOrderNo='" + relationOrderNo + '\'' +
                ", netPrice='" + netPrice + '\'' +
                ", replaceStatus=" + replaceStatus +
                ", replaceStatusName='" + replaceStatusName + '\'' +
                ", replace=" + replace +
                ", releaseRemark='" + releaseRemark + '\'' +
                ", validToDate='" + validToDate + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", receiverMobile='" + receiverMobile + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", districtCode='" + districtCode + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", shipZip='" + shipZip + '\'' +
                ", extensionNumber='" + extensionNumber + '\'' +
                ", vatTelExt='" + vatTelExt + '\'' +
                ", toBond=" + toBond +
                ", specialCode='" + specialCode + '\'' +
                ", receivingArea='" + receivingArea + '\'' +
                ", invoiceType='" + invoiceType + '\'' +
                ", invoiceTypeCode='" + invoiceTypeCode + '\'' +
                ", invoiceTitleType=" + invoiceTitleType +
                ", invoiceTitle='" + invoiceTitle + '\'' +
                ", vatCompanyName='" + vatCompanyName + '\'' +
                ", vatTaxNo='" + vatTaxNo + '\'' +
                ", vatAddress='" + vatAddress + '\'' +
                ", vatPhone='" + vatPhone + '\'' +
                ", vatBankName='" + vatBankName + '\'' +
                ", vatBankNo='" + vatBankNo + '\'' +
                ", invoiceReceiver='" + invoiceReceiver + '\'' +
                ", invoiceAddress='" + invoiceAddress + '\'' +
                ", invoiceZip='" + invoiceZip + '\'' +
                ", invoiceTel='" + invoiceTel + '\'' +
                ", invoiceMobile='" + invoiceMobile + '\'' +
                ", invoiceEmail='" + invoiceEmail + '\'' +
                ", followMerchandise=" + followMerchandise +
                ", adjustFreight=" + adjustFreight +
                ", syncTime='" + syncTime + '\'' +
                ", sapConfirmTime='" + sapConfirmTime + '\'' +
                ", notifiedTime='" + notifiedTime + '\'' +
                ", tplCode='" + tplCode + '\'' +
                ", sapCreditStatus='" + sapCreditStatus + '\'' +
                ", creditStatus=" + creditStatus +
                ", contactEmail='" + contactEmail + '\'' +
                ", invoiceReceiveRegion='" + invoiceReceiveRegion + '\'' +
                ", consigneeEmail='" + consigneeEmail + '\'' +
                ", isVip=" + isVip +
                ", shipRegionSapCode='" + shipRegionSapCode + '\'' +
                ", invoiceSapCode='" + invoiceSapCode + '\'' +
                ", vatSapCode='" + vatSapCode + '\'' +
                ", paymentTermsHighLight=" + paymentTermsHighLight +
                ", paymentMethodHighLight=" + paymentMethodHighLight +
                '}';
    }
}
