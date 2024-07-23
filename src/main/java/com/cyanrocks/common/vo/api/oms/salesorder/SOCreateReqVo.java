package com.cyanrocks.common.vo.api.oms.salesorder;

import com.cyanrocks.common.vo.api.oms.RefResourceVO;
import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/4/14 11:38 AM
 * @description:oms2.0统一下单接口请求参数封装
 **/
public class SOCreateReqVo implements Serializable {

    /**
     * 订单渠道
     */
    @NotNull(message = "渠道号，不能为空")
    private Integer channel;
    /**
     * 是否vip价格
     */
    private Integer isVip;
    /**
     * ec专用字段，PayStatusEnum
     */
    private  String payStatus;
    /**
     * ec专用字段，支付时间
     */
    private   String payTime;
    /**
     * 订单类型，10：普通订单 20：寄售结算订单 30：寄售补货订单 40：寄售退回订单
     */
    @NotNull(message = "订单类型，不能为空")
    private Integer category;
    /**
     * OMS订单号
     */
    private String orderNo;
    /**
     * 外部订单号
     */
    private String ouOrderNo;

    /**
     * 下单客户编号
     */
    @NotBlank(message = "客户号，不能为空")
    @Valid
    private String customerCode;

    private String customerName; // 会根据客户包编号查询

    /**
     * 下单客户手机
     */
    private String customerPhone;

    /**
     * 销售人员编号
     */
    private String salesNo;

    /**
     * 销售人员姓名
     */
    private String salesName;

    /**
     * 采购单位主销售编号
     */
    private String purchaseSalesCode;

    /**
     * 采购单位主销售名称
     */
    private String purchaseSalesName;

    private String companyCode; // 会根据客户包编号查询

    private String companyName; // 会根据客户包编号查询

    private String esCostCenterCode;

    private String esCostCenterName;

    /**
     * 企业站成本中心部门ID
     */

    private Long deptId;
    /**
     * 企业站成本中心部门名称
     */
    private String deptName;

    /**
     * 头运费
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
     * 期望发货日期 (yyyy-MM-dd)
     */
    private String sendDate;

    /**
     * 用户ip地址
     */
    private String ipAddress;
    /**
     * 交货方式，10：送货上门 20：自提 30：昆山门店自提
     */
    @NotNull(message = "交货方式不能为空")
    private String shipType;

    /**
     * 支付方式
     */
    @NotNull(message = "支付方式不能为空")
    private String paymentMethod;

    /**
     * 是否需要发票
     */
    @NotNull(message = "是否需要发票,不能为空")
    private Boolean needInvoice;

    /**
     * 是否一次性发货
     */
    @NotNull(message = "是否一次性发货,不能为空")
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
    private Double amount = 0D;

    /**
     * 商品总金额
     */
    private Double goodsAmount = 0D;

    /**
     * 折扣总金额
     */
    private Double discountAmount = 0D;

    /**
     * 毛利率
     */
    private Double gpRate = 0D;

    /**
     * 客户采购单号
     */
    private String customerPurchaseNo;

    /**
     * 客户采购时间 （yyyy-MM-dd HH:mm:ss）
     */

    private String customerPurchaseTime;

    /**
     * 采购单位名称
     */
    private String purchaseName;


    /**
     * 采购单位编号
     */
    private String purchaseCode;
    /**
     * 订单计价方式
     */
    private Integer soPricingMethod;

    /**
     * 支付条件,1:预付款 2:信用支付
     */
    @NotNull(message = "支付条件不能为空")
    private String paymentTerms;

    /**
     * 支付方式name
     */
    @NotNull(message = "支付方式中文名不能为空")
    private String paymentMethodName;

    /**
     * 支付条件name
     */
    @NotNull(message = "支付条件中文名不能为空")
    private String paymentTermsName;

    private String contactsName; // 会根据code查询

    /**
     * 联系人编号(R3)
     */
    private String contactsCode;

    /**
     * 计算SellingPrice时使用的折扣代码
     */
    private String discountCode;

    /**
     * 网站优惠券
     */
    private String couponCode;

    /**
     * 报价单单号
     */
    private String quotOrderNo;

    /**
     * 商机编号
     */
    private String oppoId;

    /**
     * 商机名称
     */
    private String oppoValue;

    /**
     * 订单有效期至（yyyy-MM-dd）
     */
    private String validToDate;

    /**
     * 下单时间（yyyy-MM-dd HH:mm:ss）
     */
    private String orderTime;

    /**
     * 下单人姓名
     */
    private String purchaseAccount;

    /**
     * 下单人电话
     */
    private String purchaseTel;

    /**
     * 30天内是否重复
     */
    private Boolean thirtyRepeat;

    /**
     * 总计金额未税/净价
     */
    private Double netPrice = 0D;

    /**
     * 用户邮箱
     */
    private String contactEmail;

    /**
     * 操作人名称
     */
    private String createName;

    /**
     * 操作人工号
     */
    private String createNo;
    /**
     * 预订单标记
     */
    private Boolean preFlag;
    /**
     * 是否需要特殊编码
     */
    private Boolean specialFlag;

    /**
     * 特殊编码
     */
    private String specialCode;

    /**
     * 是否运费调整过
     */
    private Boolean adjustFreight;

    private String profitCenter;

    /**
     * 承运商代号
     */
    private String tplCode;
    /**
     * 销售智能设备
     */
    private Integer   intelDevice;

    /**
     * 转订单来源渠道
     */
    private Integer  sourceChannel;

    /**
     * 收货信息对象
     */
    @NotNull(message = "收货信息不能为空")
    @Valid
    private SOReceiverCreateReqVo receiverInfo;

    /**
     * 发票信息对象
     */
    @NotNull(message = "发票信息不能为空")
    @Valid
    private SOInvoiceCreateReqVo invoiceInfo;
    /**
     * 买受人
     */
    private String buynerName;
    /**
     * 商城订单编号
     */
    private String thirdOrderNo;

    /**
     * 客户期望交期 (yyyy-MM-dd)
     */
    private String expectedDate;

    /**
     *  是否企配仓订单    0不是，1是
     */
    private Integer companyWarehouse;
    /**
     * 订单行明细
     */
    @NotNull(message = "订单行明细不能为空")
    @Valid
    private List<SODetailCreateReqVo> lines;

    /**
     * 订单折扣明细
     */
    private List<com.cyanrocks.common.vo.api.oms.salesorder.SODiscountCreateReqVo> discountLines;

    /**
     * 附件列表信息
     */
    private List<RefResourceVO> resourceVOList;

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public List<RefResourceVO> getResourceVOList() {
        return resourceVOList;
    }

    public Integer getSoPricingMethod() {
        return soPricingMethod;
    }

    public void setSoPricingMethod(Integer soPricingMethod) {
        this.soPricingMethod = soPricingMethod;
    }

    public void setResourceVOList(List<RefResourceVO> resourceVOList) {
        this.resourceVOList = resourceVOList;
    }

    public SOReceiverCreateReqVo getReceiverInfo() {
        return receiverInfo;
    }

    public Long getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public void setReceiverInfo(SOReceiverCreateReqVo receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    public Integer getIntelDevice() {
        return intelDevice;
    }

    public void setIntelDevice(Integer intelDevice) {
        this.intelDevice = intelDevice;
    }

    public String getEsCostCenterCode() {
        return esCostCenterCode;
    }

    public void setEsCostCenterCode(String esCostCenterCode) {
        this.esCostCenterCode = esCostCenterCode;
    }

    public String getEsCostCenterName() {
        return esCostCenterName;
    }

    public void setEsCostCenterName(String esCostCenterName) {
        this.esCostCenterName = esCostCenterName;
    }

    public Integer getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(Integer sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public SOInvoiceCreateReqVo getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(SOInvoiceCreateReqVo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public String getQuotOrderNo() {
        return quotOrderNo;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public void setQuotOrderNo(String quotOrderNo) {
        this.quotOrderNo = quotOrderNo;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
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

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Boolean getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(Boolean needInvoice) {
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

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getGpRate() {
        return gpRate;
    }

    public void setGpRate(Double gpRate) {
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

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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

    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }

    public String getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public List<SODetailCreateReqVo> getLines() {
        return lines;
    }

    public void setLines(List<SODetailCreateReqVo> lines) {
        this.lines = lines;
    }

    public List<com.cyanrocks.common.vo.api.oms.salesorder.SODiscountCreateReqVo> getDiscountLines() {
        return discountLines;
    }

    public void setDiscountLines(List<com.cyanrocks.common.vo.api.oms.salesorder.SODiscountCreateReqVo> discountLines) {
        this.discountLines = discountLines;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateNo() {
        return createNo;
    }

    public void setCreateNo(String createNo) {
        this.createNo = createNo;
    }

    public Boolean getPreFlag() {
        return preFlag;
    }

    public void setPreFlag(Boolean preFlag) {
        this.preFlag = preFlag;
    }

    public String getCsrRemark() {
        return csrRemark;
    }

    public void setCsrRemark(String csrRemark) {
        this.csrRemark = csrRemark;
    }

    public Boolean getAdjustFreight() {
        return adjustFreight;
    }

    public void setAdjustFreight(Boolean adjustFreight) {
        this.adjustFreight = adjustFreight;
    }

    public String getCustomerPurchaseTime() {
        return customerPurchaseTime;
    }

    public void setCustomerPurchaseTime(String customerPurchaseTime) {
        this.customerPurchaseTime = customerPurchaseTime;
    }

    public Boolean getSpecialFlag() {
        return specialFlag;
    }

    public void setSpecialFlag(Boolean specialFlag) {
        this.specialFlag = specialFlag;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public String getPaymentTermsName() {
        return paymentTermsName;
    }

    public void setPaymentTermsName(String paymentTermsName) {
        this.paymentTermsName = paymentTermsName;
    }

    public String getTplCode() {
        return tplCode;
    }

    public void setTplCode(String tplCode) {
        this.tplCode = tplCode;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public String getPurchaseSalesCode() {
        return purchaseSalesCode;
    }

    public void setPurchaseSalesCode(String purchaseSalesCode) {
        this.purchaseSalesCode = purchaseSalesCode;
    }

    public String getPurchaseSalesName() {
        return purchaseSalesName;
    }

    public void setPurchaseSalesName(String purchaseSalesName) {
        this.purchaseSalesName = purchaseSalesName;
    }

    public String getBuynerName() {
        return buynerName;
    }

    public void setBuynerName(String buynerName) {
        this.buynerName = buynerName;
    }

    public String getThirdOrderNo() {
        return thirdOrderNo;
    }

    public void setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
    }

    public Integer getCompanyWarehouse() {
        return companyWarehouse;
    }

    public void setCompanyWarehouse(Integer companyWarehouse) {
        this.companyWarehouse = companyWarehouse;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }
}
