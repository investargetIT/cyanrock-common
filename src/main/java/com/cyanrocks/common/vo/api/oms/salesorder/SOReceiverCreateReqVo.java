package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * @version V2.0
 * @author: John.Hu
 * @create: 2022/4/26 11:11 AM
 * @description:创建订单收件信息视图类
 **/
public class SOReceiverCreateReqVo {

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
     * 收件人市Code
     */
    private String cityCode;

    /**
     * 收件人区/县code
     */
    private String districtCode;

    /**
     * 收件人省名称
     */
    private String province;

    /**
     * 收件人市名称
     */
    private String city;

    /**
     * 收件人县名称
     */
    private String district;

    /**
     * 收件人邮政编码
     */
    private String shipZip;
    /**
     * 是否保税区
     */
    private Boolean toBond;

    /**
     * 收货人邮箱
     */
    private String consigneeEmail;

    /**
     * 收货地区-sapCode
     */
    private String shipRegionSapCode;

    public String getShipRegionSapCode() {
        return shipRegionSapCode;
    }

    public void setShipRegionSapCode(String shipRegionSapCode) {
        this.shipRegionSapCode = shipRegionSapCode;
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

    public Boolean getToBond() {
        return toBond;
    }

    public void setToBond(Boolean toBond) {
        this.toBond = toBond;
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
    }
}
