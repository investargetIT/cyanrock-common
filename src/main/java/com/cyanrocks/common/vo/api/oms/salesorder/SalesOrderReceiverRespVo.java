package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * 销售订单收货信息响应展示VO
 */
public class SalesOrderReceiverRespVo extends BaseVo {

    /**
     * sid
     */
    private Long sid;

    /**
     * 订单号
     */
    private String orderNo;

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
     * 是否保税区
     */
    private Boolean toBond;

    /**
     * 收货地区
     */
    private String receivingArea;

    /**
     * 收货人邮箱
     */
    private String consigneeEmail;

    /**
     * 收货地区-sapCode
     */
    private String shipRegionSapCode;

    /**
     * 收货地址是否高亮(true高亮/false不高亮)
     */
    private Boolean receiveHighlight;

    public Boolean getReceiveHighlight() {
        return receiveHighlight;
    }

    public void setReceiveHighlight(Boolean receiveHighlight) {
        this.receiveHighlight = receiveHighlight;
    }

    public String getShipRegionSapCode() {
        return shipRegionSapCode;
    }

    public void setShipRegionSapCode(String shipRegionSapCode) {
        this.shipRegionSapCode = shipRegionSapCode;
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
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

    public Boolean getToBond() {
        return toBond;
    }

    public void setToBond(Boolean toBond) {
        this.toBond = toBond;
    }

    public String getReceivingArea() {
        return receivingArea;
    }

    public void setReceivingArea(String receivingArea) {
        this.receivingArea = receivingArea;
    }

    @Override
    public String toString() {
        return "SalesOrderReceiverRespVo{" +
                "sid=" + sid +
                ", orderNo='" + orderNo + '\'' +
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
                ", toBond=" + toBond +
                ", receivingArea='" + receivingArea + '\'' +
                ", consigneeEmail='" + consigneeEmail + '\'' +
                ", shipRegionSapCode='" + shipRegionSapCode + '\'' +
                ", receiveHighlight=" + receiveHighlight +
                '}';
    }
}
