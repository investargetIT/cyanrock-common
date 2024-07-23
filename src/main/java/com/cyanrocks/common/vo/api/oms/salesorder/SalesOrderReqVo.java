package com.cyanrocks.common.vo.api.oms.salesorder;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.cyanrocks.common.vo.api.PageReqVO;

/**
 * 销售订单请求VO
 */
public class SalesOrderReqVo extends PageReqVO {
    //region field
    /**
     * 订单渠道
     */
    private String channel;

    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单号集合
     */
    private List<String> orderNos;
    /***外部订单号***/
    private String ouOrderNo;
    /***所属集团name***/
    private String groupCustomerName;

    /**
     * 旧订单号
     */
    private Long oldOrderId;

    /**
     * ERP订单号
     */
    private String erpOrderNo;

    /**
     * 订单状态(全部订单无需必传,其他页面能进来必传,其中审核主数据传21,订单审核传22,财务放单传31))
     */
    private List<String> orderStatus;

    /**
     * 订单类型
     */
    private String category;


    /**
     * 订单所属公司名称
     */
    private String companyName;

    /**
     * 订单所属公司code
     */
    private String companyCode;

    /**
     * 下单客户编号
     */
    private String customerCode;

    /**
     * 下单客户名称
     */
    private String customerName;

    /**
     * 是否销售智能设备
     */
    private String intelDevice;

    /**
     * 排除取消状态订单
     */
    private String cancelOrderStatus;

    /**
     * 主销售编号
     */
    private String salesNo;

    /**
     * 主销售姓名
     */
    private String salesName;


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
     * 创建人
     */
    private String createName;

    /**
     * 创建开始时间(yyyy-MM-dd)
     */
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private String createTimeStart;

    /**
     * 创建结束时间(yyyy-MM-dd)
     */
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private String createTimeEnd;

    /**
     * 下单开始时间(yyyy-MM-dd)
     */
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private String orderTimeStart;

    /**
     * 下单结束时间(yyyy-MM-dd)
     */
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private String orderTimeEnd;

    /**
     * 用户邮箱
     */
    private String contactEmail;

    /**
     * 是否同步SAP(订单产品修改时需要传true)
     */
    private Boolean syncSap;

    /**
     * 查询标记(1:全部订单,2:订单修改申请查询)
     */
    private String querySign;

    /**
     * 是否过滤NC渠道
     */
    private Boolean nc;
    /**
     * 是否完结
     */
    private Boolean completed;
    /**
     * 报价单号
     */
    private String  quotCode;
    /**
     * sku
     */
    private String  sku;
    private List<String> paymentMethods;
    /**
     * 支付条件
     */
    private List<String> paymentTermsList;
    /**
     * 业务类型
     */
    private Integer businessType;
    /**
     * JV公司
     */
    private String jvCompanyName;
    /**
     * 是否匹配
     */
    private Boolean matchStatus;
    /**
     * 销售领导工号
     */
    private String salesSupervisor;
    //endregion

    //region getter setter

    public List<String> getPaymentMethods(){
        return paymentMethods;
    }

    public Boolean getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Boolean matchStatus) {
        this.matchStatus = matchStatus;
    }

    public void setPaymentMethods(List<String> paymentMethods){
        this.paymentMethods = paymentMethods;
    }

    public List<String> getPaymentTermsList() {
        return paymentTermsList;
    }

    public void setPaymentTermsList(List<String> paymentTermsList) {
        this.paymentTermsList = paymentTermsList;
    }

    public Boolean getNc() {
        return nc;
    }

    public String getQuotCode() {
        return quotCode;
    }

    public String getSku() {
        return sku;
    }

    public String getCancelOrderStatus() {
        return cancelOrderStatus;
    }

    public void setCancelOrderStatus(String cancelOrderStatus) {
        this.cancelOrderStatus = cancelOrderStatus;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void setQuotCode(String quotCode) {
        this.quotCode = quotCode;
    }

    public void setNc(Boolean nc) {
        this.nc = nc;
    }

    public Long getOldOrderId() {
        return oldOrderId;
    }

    public void setOldOrderId(Long oldOrderId) {
        this.oldOrderId = oldOrderId;
    }

    public String getQuerySign() {
        return querySign;
    }

    public void setQuerySign(String querySign) {
        this.querySign = querySign;
    }

    public Boolean getSyncSap() {
        return syncSap;
    }

    public void setSyncSap(Boolean syncSap) {
        this.syncSap = syncSap;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<String> getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(List<String> orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getErpOrderNo() {
        return erpOrderNo;
    }

    public void setErpOrderNo(String erpOrderNo) {
        this.erpOrderNo = erpOrderNo;
    }

    public String getOrderTimeStart() {
        return orderTimeStart;
    }

    public void setOrderTimeStart(String orderTimeStart) {
        this.orderTimeStart = orderTimeStart;
    }

    public String getOrderTimeEnd() {
        return orderTimeEnd;
    }

    public void setOrderTimeEnd(String orderTimeEnd) {
        this.orderTimeEnd = orderTimeEnd;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getOuOrderNo(){
        return ouOrderNo;
    }

    public void setOuOrderNo(String ouOrderNo){
        this.ouOrderNo = ouOrderNo;
    }

    public String getGroupCustomerName(){
        return groupCustomerName;
    }

    public void setGroupCustomerName(String groupCustomerName){
        this.groupCustomerName = groupCustomerName;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getJvCompanyName() {
        return jvCompanyName;
    }

    public void setJvCompanyName(String jvCompanyName) {
        this.jvCompanyName = jvCompanyName;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public String getPurchaseSalesName() {
        return purchaseSalesName;
    }

    public void setPurchaseSalesName(String purchaseSalesName) {
        this.purchaseSalesName = purchaseSalesName;
    }


    public String getIntelDevice() {
        return intelDevice;
    }

    public void setIntelDevice(String intelDevice) {
        this.intelDevice = intelDevice;
    }

    public List<String> getOrderNos() {
        return orderNos;
    }

    public void setOrderNos(List<String> orderNos) {
        this.orderNos = orderNos;
    }

    public String getSalesSupervisor() {
        return salesSupervisor;
    }

    public void setSalesSupervisor(String salesSupervisor) {
        this.salesSupervisor = salesSupervisor;
    }

    // endregion
    @Override
    public String toString() {
        return "SalesOrderReqVo{" +
                "channel='" + channel + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", erpOrderNo='" + erpOrderNo + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", category='" + category + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", salesNo='" + salesNo + '\'' +
                ", salesName='" + salesName + '\'' +
                ", customerPurchaseNo='" + customerPurchaseNo + '\'' +
                ", purchaseName='" + purchaseName + '\'' +
                ", createName='" + createName + '\'' +
                ", createTimeStart='" + createTimeStart + '\'' +
                ", createTimeEnd='" + createTimeEnd + '\'' +
                ", orderTimeStart='" + orderTimeStart + '\'' +
                ", orderTimeEnd='" + orderTimeEnd + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", syncSap=" + syncSap +
                ", querySign='" + querySign + '\'' +
                '}';
    }

}
