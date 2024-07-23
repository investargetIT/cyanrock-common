package com.cyanrocks.common.vo.api.oms.salesorder;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @version V1.0
 * @author: John.Hu
 * @create: 2022-02-16 18:54
 * @description: 过度接口-API统一下单请求参数封装
 **/
public class SalesOrderVo {

	private Integer orderId;
	private Integer version;

	/**
	 * 是否vip
	 */
	private Boolean isVip;

	/**
	 * 渠道号
	 */
	@NotNull(message = "渠道号不能为空")
	private Integer channel;
	/**
	 * 源系统订单号
	 */
	private String sourceOrderId;

	private String orderTime;
	/**
	 * 客户编号
	 */
	@NotEmpty(message = "客户包编号不能为空")
	private String customerCode;
	/**
	 * R3联系人编号
	 */
	@NotEmpty(message = "R3联系人编号不能为空")
	private String contactCodeR3;
	/**
	 * 联系人邮箱
	 */
	private String contactEmail;
	/**
	 * 销售人
	 */
	private String salesName;
	/**
	 * 客户采购单号
	 */
	private String poNo;
	/**
	 * 外部系统采购单Url
	 */
	private String poUrl;
	/**
	 * 运费
	 */
	private Double freight = 0D;
	/**
	 * 国际运费
	 */
	private Double interFreight = 0D;
	/**
	 * 总运费
	 */
	private Double totalFreight = 0D;
	/**
	 * 关税
	 */
	private Double tariff = 0D;
	/**
	 * 是否运费调整过（包括运费分摊及免运费）
	 */
	private Boolean adjustFreight = false;
	/**
	 * 调整运费
	 */
	private Double adjustFreightAmount = 0D;
	/**
	 * 客户要求发货日
	 */
	private String reqDelivDate;
	/**
	 * 交货方式
	 */
	private Integer shipType;
	/**
	 * 支付条件
	 */
	private String paymentTerm;
	/**
	 * 支付方式
	 */
	private String paymentMethod;
	/**
	 * 发货一级区域
	 */
	private String shipRegionCode1;
	/**
	 * 发货二级区域
	 */
	private String shipRegionCode2;

	/**
	 * 发货三级区域
	 */
	private String shipRegionCode3;

	/**
	 * 发货区域-一、二、三级分类文本
	 */
	private String shipRegionName;

	/**
	 * 收货人名称
	 */
	@NotEmpty(message = "收货人名称不能为空")
	private String consigneeName;

	/**
	 * 收货人手机
	 */
	private String consigneeMobile;

	/**
	 * 收货人固话-号码
	 */
	private String consigneeTel;

	/**
	 * 收货人固话-分机
	 */
	private String consigneeTelExt;

	/**
	 * 收货人街道地址
	 */
	@NotEmpty(message = "收货人街道地址不能为空")
	private String shipStreet;

	/**
	 * 收货人邮编
	 */
	@NotEmpty(message = "收货人邮编不能为空")
	private String shipZip;

	/**
	 * 发票类型
	 */
	@NotEmpty(message = "发票类型不能为空")
	private String invoiceType;

	/**
	 * 发票抬头类型
	 */
	private Integer invoiceTitleType;

	/**
	 * 发票抬头
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
	private String vatTel;

	/**
	 * VAT发票-注册电话分机
	 */
	private String vatTelExt;

	/**
	 * VAT发票-开户银行
	 */
	private String vatBankName;

	/**
	 * VAT发票-银行账户
	 */
	private String vatBankAccount;

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
	 * 发票是否随货
	 */
	private Boolean invoiceWithGoods;

	/**
	 * 发票接收邮箱
	 */
	private String invoiceEmail;

	/**
	 * 是否一次性发货
	 */
	private Boolean completeDeliv;

	/**
	 * 用户备注
	 */
	private String userRemark;

	/**
	 * CSR备注
	 */
	private String csrRemark;

	/**
	 * 含税总金额
	 */
	private Double amount;

	/**
	 * 货品总计
	 */
	private Double goodsAmount;
	/**
	 * 整单折扣
	 */
	private Double gpRate;
	/**
	 * 折扣总计
	 */
	private Double totalDiscount;
	/**
	 * 可使用的Rebate Pool的金额
	 */
	private Double rebate;
	/**
	 * 网站促销活动代号
	 */
	private String campaignCode;
	/**
	 * 网站优惠券代号
	 */
	private String couponCode;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 同步状态
	 */
	private Integer skuSyncStatus;
	/**
	 * 同步时间
	 */
	private String syncTime;
	/**
	 * sap回复时间
	 */
	private String sapConfirmTime;
	/**
	 * sap销售订单号
	 */
	private String orderNo;
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
	private Integer creditStatus;
	/**
	 * 有效期至
	 */
	private String validTo;
	/**
	 * 信用放单原因代码
	 */
	private Integer creditReleaseCode;
	/**
	 * 信用放单备注
	 */
	private String creditReleaseRemark;
	/**
	 * 审核订单的用户
	 */
	private String checkOrderUser;
	/**
	 * 创建人
	 */
	private String createdUser;
	/**
	 * 创建时间
	 */
	private String createdTime;
	/**
	 * 最后修改日期
	 */
	private String lastModifiedTime;
	/**
	 * 最后修改人
	 */
	private String lastModifiedUser;
	/**
	 * 订单标记
	 */
	private Integer orderTag;
	/**
	 * 是否需要电话确认
	 */
	private Boolean needTelConfirm;
	/**
	 * 国电订单状态
	 */
	private String guoDianStatus;

	/**
	 * 国电采购单位id
	 */
	private String purchaseId;

	/**
	 * 采购单位名称
	 */
	private String purchaseName;

	/**
	 * 国电二级单位下单人姓名
	 */
	private String purchaseAccount;

	/**
	 * 下单人联系电话
	 */
	private String purchaseMobile;
	/**
	 * 发货锁定标记
	 */
	private Integer deliveryBlock;
//        /**
//         * 二级单位客户号
//         */
//        private String  purchaseCustomerCode;
//        /**
//         * CSR拒绝原因
//         */
//        private Integer  csrRejectReason;
//        /**
//         * 是否保税区
//         */
//        private Integer  isToBond;
//        /**
//         * CSR审核时间
//         */
//        private Date  csrReviewTime;
//        /**
//         * CSR审核人
//         */
//        private String  csrReviewUser;
//        /**
//         * 二维码信息
//         */
//        private String  qrCode;
//        /**
//         * 商机编号
//         */
//        private String  oppoId;
//        /**
//         * 商机名称
//         */
//        private String  oppoValue;
//        /**
//         * 所属公司编号
//         */
//        private String  branchCode;
//        /**
//         * 外部订单号
//         */
//        private String  outOrderId;
//        /**
//         * 捷站ID
//         */
//        private Integer  stationId;
//        /**
//         * 物料传输状态
//         */
//        private Integer  skuSendStatus;
	/**
	 * 客户名
	 */
	private String customerName;
	/**
	 * R3联系人名
	 */
	private String contactName;
//        /**
//         * 所属公司名称
//         */
//        private String  branchCompanyName;
	/**
	 * 订单行
	 */
	@NotEmpty(message = "订单行明细不能为空")
	private List<SalesOrderLineVo> lines;
	/**
	 * 报价单id
	 */
	private Integer omsQuotId;

	/**
	 * 运费优惠金额
	 */
	private Double freightDiscount;

	public Double getFreightDiscount() {
		return freightDiscount;
	}

	public void setFreightDiscount(Double freightDiscount) {
		this.freightDiscount = freightDiscount;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Integer getOmsQuotId() {
		return omsQuotId;
	}

	public void setOmsQuotId(Integer omsQuotId) {
		this.omsQuotId = omsQuotId;
	}

	public List<SalesOrderLineVo> getLines() {
		return lines;
	}

	public void setLines(List<SalesOrderLineVo> lines) {
		this.lines = lines;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public Boolean getIsVip() {
		return isVip;
	}

	public void setIsVip(Boolean isVip) {
		this.isVip = isVip;
	}

	public String getSourceOrderId() {
		return sourceOrderId;
	}

	public void setSourceOrderId(String sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getContactCodeR3() {
		return contactCodeR3;
	}

	public void setContactCodeR3(String contactCodeR3) {
		this.contactCodeR3 = contactCodeR3;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getSalesName() {
		return salesName;
	}

	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	public String getPoNo() {
		return poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public String getPoUrl() {
		return poUrl;
	}

	public void setPoUrl(String poUrl) {
		this.poUrl = poUrl;
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

	public Double getTotalFreight() {
		return totalFreight;
	}

	public void setTotalFreight(Double totalFreight) {
		this.totalFreight = totalFreight;
	}

	public Double getTariff() {
		return tariff;
	}

	public void setTariff(Double tariff) {
		this.tariff = tariff;
	}

	public Boolean getAdjustFreight() {
		return adjustFreight;
	}

	public void setAdjustFreight(Boolean adjustFreight) {
		this.adjustFreight = adjustFreight;
	}

	public Double getAdjustFreightAmount() {
		return adjustFreightAmount;
	}

	public void setAdjustFreightAmount(Double adjustFreightAmount) {
		this.adjustFreightAmount = adjustFreightAmount;
	}

	public String getReqDelivDate() {
		return reqDelivDate;
	}

	public void setReqDelivDate(String reqDelivDate) {
		this.reqDelivDate = reqDelivDate;
	}

	public Integer getShipType() {
		return shipType;
	}

	public void setShipType(Integer shipType) {
		this.shipType = shipType;
	}

	public String getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getShipRegionCode1() {
		return shipRegionCode1;
	}

	public void setShipRegionCode1(String shipRegionCode1) {
		this.shipRegionCode1 = shipRegionCode1;
	}

	public String getShipRegionCode2() {
		return shipRegionCode2;
	}

	public void setShipRegionCode2(String shipRegionCode2) {
		this.shipRegionCode2 = shipRegionCode2;
	}

	public String getShipRegionCode3() {
		return shipRegionCode3;
	}

	public void setShipRegionCode3(String shipRegionCode3) {
		this.shipRegionCode3 = shipRegionCode3;
	}

	public String getShipRegionName() {
		return shipRegionName;
	}

	public void setShipRegionName(String shipRegionName) {
		this.shipRegionName = shipRegionName;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getConsigneeMobile() {
		return consigneeMobile;
	}

	public void setConsigneeMobile(String consigneeMobile) {
		this.consigneeMobile = consigneeMobile;
	}

	public String getConsigneeTel() {
		return consigneeTel;
	}

	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}

	public String getConsigneeTelExt() {
		return consigneeTelExt;
	}

	public void setConsigneeTelExt(String consigneeTelExt) {
		this.consigneeTelExt = consigneeTelExt;
	}

	public String getShipStreet() {
		return shipStreet;
	}

	public void setShipStreet(String shipStreet) {
		this.shipStreet = shipStreet;
	}

	public String getShipZip() {
		return shipZip;
	}

	public void setShipZip(String shipZip) {
		this.shipZip = shipZip;
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

	public String getVatTel() {
		return vatTel;
	}

	public void setVatTel(String vatTel) {
		this.vatTel = vatTel;
	}

	public String getVatTelExt() {
		return vatTelExt;
	}

	public void setVatTelExt(String vatTelExt) {
		this.vatTelExt = vatTelExt;
	}

	public String getVatBankName() {
		return vatBankName;
	}

	public void setVatBankName(String vatBankName) {
		this.vatBankName = vatBankName;
	}

	public String getVatBankAccount() {
		return vatBankAccount;
	}

	public void setVatBankAccount(String vatBankAccount) {
		this.vatBankAccount = vatBankAccount;
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

	public Boolean getInvoiceWithGoods() {
		return invoiceWithGoods;
	}

	public void setInvoiceWithGoods(Boolean invoiceWithGoods) {
		this.invoiceWithGoods = invoiceWithGoods;
	}

	public String getInvoiceEmail() {
		return invoiceEmail;
	}

	public void setInvoiceEmail(String invoiceEmail) {
		this.invoiceEmail = invoiceEmail;
	}

	public Boolean getCompleteDeliv() {
		return completeDeliv;
	}

	public void setCompleteDeliv(Boolean completeDeliv) {
		this.completeDeliv = completeDeliv;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getGoodsAmount() {
		return goodsAmount;
	}

	public void setGoodsAmount(Double goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	public Double getGpRate() {
		return gpRate;
	}

	public void setGpRate(Double gpRate) {
		this.gpRate = gpRate;
	}

	public Double getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public Double getRebate() {
		return rebate;
	}

	public void setRebate(Double rebate) {
		this.rebate = rebate;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSkuSyncStatus() {
		return skuSyncStatus;
	}

	public void setSkuSyncStatus(Integer skuSyncStatus) {
		this.skuSyncStatus = skuSyncStatus;
	}

	public String getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(String syncTime) {
		this.syncTime = syncTime;
	}

	public String getSapConfirmTime() {
		return sapConfirmTime;
	}

	public void setSapConfirmTime(String sapConfirmTime) {
		this.sapConfirmTime = sapConfirmTime;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getNotifiedTime() {
		return notifiedTime;
	}

	public void setNotifiedTime(String notifiedTime) {
		this.notifiedTime = notifiedTime;
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

	public Integer getCreditStatus() {
		return creditStatus;
	}

	public void setCreditStatus(Integer creditStatus) {
		this.creditStatus = creditStatus;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public Integer getCreditReleaseCode() {
		return creditReleaseCode;
	}

	public void setCreditReleaseCode(Integer creditReleaseCode) {
		this.creditReleaseCode = creditReleaseCode;
	}

	public String getCreditReleaseRemark() {
		return creditReleaseRemark;
	}

	public void setCreditReleaseRemark(String creditReleaseRemark) {
		this.creditReleaseRemark = creditReleaseRemark;
	}

	public String getCheckOrderUser() {
		return checkOrderUser;
	}

	public void setCheckOrderUser(String checkOrderUser) {
		this.checkOrderUser = checkOrderUser;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public Integer getOrderTag() {
		return orderTag;
	}

	public void setOrderTag(Integer orderTag) {
		this.orderTag = orderTag;
	}

	public Boolean getNeedTelConfirm() {
		return needTelConfirm;
	}

	public void setNeedTelConfirm(Boolean needTelConfirm) {
		this.needTelConfirm = needTelConfirm;
	}

	public String getGuoDianStatus() {
		return guoDianStatus;
	}

	public void setGuoDianStatus(String guoDianStatus) {
		this.guoDianStatus = guoDianStatus;
	}

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getPurchaseName() {
		return purchaseName;
	}

	public void setPurchaseName(String purchaseName) {
		this.purchaseName = purchaseName;
	}

	public String getPurchaseAccount() {
		return purchaseAccount;
	}

	public void setPurchaseAccount(String purchaseAccount) {
		this.purchaseAccount = purchaseAccount;
	}

	public String getPurchaseMobile() {
		return purchaseMobile;
	}

	public void setPurchaseMobile(String purchaseMobile) {
		this.purchaseMobile = purchaseMobile;
	}

	public Integer getDeliveryBlock() {
		return deliveryBlock;
	}

	public void setDeliveryBlock(Integer deliveryBlock) {
		this.deliveryBlock = deliveryBlock;
	}

}
