package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * 销售订单开票、发票寄送信息响应展示VO
 */
public class SalesOrderInvoiceInfoRespVo extends BaseVo {

    /**
     * sid
     */
    private Long sid;

    /**
     * 订单号
     */
    private String orderNo;

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
     * VAT发票-注册电话分机
     */
    private String vatTelExt;

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
     * 发票收件地区
     */
    private String invoiceReceiveRegion;

    /**
     * 发票寄送信息-sapCode
     */
    private String invoiceSapCode;

    /**
     * 发票-开票信息sapCode
     */
    private String vatSapCode;

    /**
     * 发票高亮(true高亮/false不高亮)
     */
    private Boolean invoiceHighLight;

    /**
     * 开票高亮(true高亮/false不高亮)
     */
    private Boolean billingHighLight;

    /**
     * 发票类型(true高亮/false不高亮)
     */
    private Boolean invoiceTypeHighLight;
    /**
     * 省份code
     */
    private String provinceCode;
    /**
     * 城市Code
     */
    private String cityCode;
    /**
     * 区/县code
     */
    private String districtCode;

    public Boolean getInvoiceTypeHighLight() {
        return invoiceTypeHighLight;
    }

    public void setInvoiceTypeHighLight(Boolean invoiceTypeHighLight) {
        this.invoiceTypeHighLight = invoiceTypeHighLight;
    }

    public Boolean getInvoiceHighLight() {
        return invoiceHighLight;
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

    public void setInvoiceHighLight(Boolean invoiceHighLight) {
        this.invoiceHighLight = invoiceHighLight;
    }

    public Boolean getBillingHighLight() {
        return billingHighLight;
    }

    public void setBillingHighLight(Boolean billingHighLight) {
        this.billingHighLight = billingHighLight;
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

    public String getVatTelExt() {
        return vatTelExt;
    }

    public void setVatTelExt(String vatTelExt) {
        this.vatTelExt = vatTelExt;
    }

    public String getInvoiceReceiveRegion() {
        return invoiceReceiveRegion;
    }

    public void setInvoiceReceiveRegion(String invoiceReceiveRegion) {
        this.invoiceReceiveRegion = invoiceReceiveRegion;
    }

    public String getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    public void setInvoiceTypeCode(String invoiceTypeCode) {
        this.invoiceTypeCode = invoiceTypeCode;
    }

    @Override
    public String toString() {
        return "SalesOrderInvoiceInfoRespVo{" +
                "sid=" + sid +
                ", orderNo='" + orderNo + '\'' +
                ", invoiceType='" + invoiceType + '\'' +
                ", invoiceTypeCode='" + invoiceTypeCode + '\'' +
                ", invoiceTitleType=" + invoiceTitleType +
                ", invoiceTitle='" + invoiceTitle + '\'' +
                ", vatCompanyName='" + vatCompanyName + '\'' +
                ", vatTaxNo='" + vatTaxNo + '\'' +
                ", vatAddress='" + vatAddress + '\'' +
                ", vatTelExt='" + vatTelExt + '\'' +
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
                ", invoiceReceiveRegion='" + invoiceReceiveRegion + '\'' +
                ", invoiceSapCode='" + invoiceSapCode + '\'' +
                ", vatSapCode='" + vatSapCode + '\'' +
                ", invoiceHighLight=" + invoiceHighLight +
                ", billingHighLight=" + billingHighLight +
                '}';
    }
}
