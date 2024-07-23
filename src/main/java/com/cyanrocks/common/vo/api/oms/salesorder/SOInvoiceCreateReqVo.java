package com.cyanrocks.common.vo.api.oms.salesorder;

import javax.validation.constraints.NotNull;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/4/26 11:05 AM
 * @description:创建订单发票信息请求视图类
 **/
public class SOInvoiceCreateReqVo {


    /**
     * 发票类型，1：增值税专用发票，2：普通发票，3：无需发票
     */
    @NotNull(message="发票类型，不能为空")
    private String invoiceType;

    /**
     * 发票抬头类型，1：个人，2：单位
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
     * 发票收件人姓名
     */
    private String invoiceReceiver;

    /**
     * 发票收件人邮箱
     */
    private String invoiceEmail;

    /**
     * 发票是否随货 0:否 1：是
     */
    private Integer followMerchandise;

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
     * 发票收件地区
     */
    private String invoiceReceiveRegion;
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
    /**
     * 发票寄送信息-sapCode
     */
    private String invoiceSapCode;

    /**
     * 发票-开票信息sapCode
     */
    private String vatSapCode;

    /**
     * 付款方客户号
     */
    private String  payerCustomerAccount;

    public String getPayerCustomerAccount() {
        return payerCustomerAccount;
    }

    public void setPayerCustomerAccount(String payerCustomerAccount) {
        this.payerCustomerAccount = payerCustomerAccount;
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

    public String getInvoiceReceiveRegion() {
        return invoiceReceiveRegion;
    }

    public void setInvoiceReceiveRegion(String invoiceReceiveRegion) {
        this.invoiceReceiveRegion = invoiceReceiveRegion;
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

}
