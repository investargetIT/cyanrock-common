package com.cyanrocks.common.vo.api;

import java.math.BigDecimal;
import java.util.List;

/**
 * 接口请求和响应数据通用共享字段
 *
 * @author JonyFu
 *
 */
public class DataVo {
    private Long sid;
    private Long errCode;
    private List<DataVo> menus;
    private List<DataVo> childMenus;
    private List<DataVo> payAList;
    private List<DataVo> creList;
    private List<DataVo> menuPerms;
    private List<DataVo> skuReplaces;
    private Double stockNum;
    private String chargeUnit;
    private Integer category;
    private String menuUrl;
    private String taxNo;
    private String text;
    private Double cost;
    private String orderChannel;
    private String groupCustomerName;
    private String groupCustomerAccount;
    private String messageId;
    private List<String> customerCodes;
    private List<String> reportCodes;
    private List<String> labelIdList;
    private Boolean role;
    private String ouOrderNo;
    private Double qty;
    private Double closeQty;
    private Double salesPrice;
    private String menuCode;
    private String groupCode;
    private String menuName;
    private String bizStatus;
    private String parentCode;
    private String parentName;
    private String menuRoute;
    private String menuType;
    private String menuLevel;
    private String permDesc;
    private String permType;
    private String permUrl;
    private String permCode;
    private Long seqId;
    private Long appResid;
    private Boolean exists;
    private Boolean enabled;
    private Boolean hidden;
    private String appId;
    private String platform;
    private String apiName;
    private String path;
    private String sku;
    private String customerName;
    private List<String> skus;
    private Integer v;
    private Boolean superManager;
    private Integer isPublic;
    private Integer isFrozen;
    private Integer exemptFreightCost;
    private Integer opState;
    private String deptAgency;
    private Integer priority;
    private String deptCode;
    private String tertiaryDeptCode;
    private String tertiaryDeptName;
    private String deptName;
    private String apiValue;
    private String expCode;
    private Double amount;
    private Double avalCredit;
    private String origin;
    private String payMethodName;
    private String invoicevf;
    private String invoicevat;
    private String r3Code;
    private String staffCode;
    private String contactName;
    private String contactCodeR3;
    private String tel;
    private String ecCode;
    private String jobNumber;
    private String telExt;
    private String traceId;
    private String expNo;
    private Integer type;
    private String typeName;
    private Integer level;
    private String levelId;
    private String levelCode;
    private String obdNo;
    private String contactNo;
    private String sendTime;
    private String address;
    private String consignee;
    private String phone;
    private String reason;
    private Double orderCount;
    private Double sendCount;
    private String vrkme;
    private String punit;
    private Integer packqty;
    private String price;
    private String cellphone;
    private String skuName;
    private String brandName;
    private String mfrpn;
    private String tplname;
    private String obdLineNo;
    private String orderLineNo;
    private String brName;
    private String sex;
    private String workflowType;
    private String billNo;
    private String orderStatus;
    private String itemSku;
    private String sapAvailable;
    private String approvalStatus;
    private String workflowNo;
    private String fromCurrency;
    private String password;
    private Long departmentid;
    private String workcode;
    private String spk;
    private Long totalSize;
    private String createdate;
    private String subcompanyname;
    private String departmentname;
    private Integer status;
    private Long managerid;
    private String lastname;
    private String mobile;
    private String lastmoddate;
    private String loginid;
    private Integer page;
    private DataVo params;
    private String toCurrency;
    private Double exchRate;
    private Double fromFactor;
    private Double toFactor;
    private String errMsg;
    // simpleSku skus入参
    private List<String> codes;
    private List<String> nos;
    private Integer statusCode;
    private String avatarPhoto;
    private List<String> authorizations;
    private List<String> appResUrls;
    private String refreshToken;
    private String expireTime;
    private Boolean admin;
    private Boolean roleAdmin;
    private String jobCode;
    private String purchaseCode;
    private DataVo roles;
    private List<Long> rids;
    private String key;
    private String whCode;
    private String secret;
    private String billingType;
    private Long itemId;
    private Long brandId;
    private Long parentId;
    private List<Long> parentIds;
    private Long productLineId;
    private Long segmentId;
    private Integer expiresIn;
    private String accessToken;
    private String token;
    private String orderNo;
    private String orderNoYtd;
    private String orderNo24;
    private String customerCode;
    private String customerCodeYtd;
    private String customerCode24;
    private Integer curPage;
    private Integer pageSize;
    private String fileName;
    private String name;
    private Boolean success;
    private List<String> pd;
    private List<String> pm;
    private List<String> pcm;
    private String createTime;
    private String startTime;
    private String endTime;
    private String userCode;
    private String userName;
    private String pwd;
    private String email;
    private List<Long> ids;
    private List<Long> permissionIds;
    private List<Long> moduleIds;
    private List<Long> menuIds;
    private String url;
    private String code;
    private Long requestid;
    private String msg;
    private String value;
    private String icon;
    private Boolean selected;
    private List<DataVo> dataList;
    private Long menuId;
    private Long moduleId;
    private Long permissionId;
    private String introduce;
    private Integer num;
    private Integer stock;
    private Double stockCount;
    private Double befstockCount;
    private Double aftstockCount;
    private Integer opt;
    private Integer optType;
    // 总页数
    private Long totalPage;
    // 总记录数
    private Long totalCount;
    private DataVo loginUser;
    private DataVo data;
    private Long id;
    private Long productId;
    private Long categoryId;
    private Long familyId;
    private String categoryName;
    private String familyName;
    private String levelName;
    private String topCategory;
    private String productLine;
    private String segment;
    private String group;
    private String skuCode;
    private String skuZhName;
    private String skuEnName;
    private Long userId;
    private String plePlan;
    private String gp1Plan;
    private Double gp124m;
    private Double gp1Ttl;
    private Double gp1Ytd;
    private Double netSalesTtl;
    private Double netSalesYtd;
    private Double netSales24m;
    private String pleSoldPlan;
    private String skuSoldPlan;
    private String billingTarget;
    private String stockSoldttl;
    private String skuSoldYtd;
    private String skuSold24M;
    private Double gpTtl;
    private Double gpYtd;
    // 24M
    private Double gpTtf;
    private Double netValTtl;
    private Double netValYtd;
    private Double netVal24m;
    private Double sourcingPlan;
    private Double occupyCount;
    private Double befoccupyCount;
    private Double aftoccupyCount;
    private Double changeCount;
    private Double afsCount;
    private Double befafsCount;
    private Double aftafsCount;
    private String updateTime;
    private String note;
    private String message;
    private String profitCenter;
    private String officeCode;
    private String officeName;
    private String mainSalesId;
    private String mainSalesName;
    private String province;
    private String provinceCode;
    private String city;
    private String cityCode;
    private String district;
    private String districtCode;
    private Long provinceId;
    private Long cityId;
    private String channel;
    private Boolean isApplyGroup;
    private String sourceChannel;

    private BigDecimal proportion;
    private BigDecimal amountProportion;
    private String customerPurchaseNo;

    // 是否联合运营 false-否 true-是
    private Boolean jointVentureFlag;
    // 联合运营公司code
    private String jointVentureCompanyCode;
    // 计价方式 1-含税模式 2-未税模式-2位精度 3-未税模式-4位精度
    private Integer pricingMethod;
    // 联合运营公司
    private String jointVentureCompanyName;
    // CSR审核时间
    private String csrReviewTime;

    private String itemCode;

    private String itemName;

    private String productLineCode;

    private String productLineName;

    private String segmentCode;

    private String segmentName;

    private String familyCode;

    private String categoryCode;

    // 物流商, 承运商 模糊查询
    private String tplnameLike;
    // 物流商为空: 勾选则true, 默认null
    private Boolean tplnameIsEmpty;
    // 快递单号为空: 勾选则true, 默认null
    private Boolean expCodeIsEmpty;

    // 包装特殊要求
    private String packageRequireDetail;
    // 运输交付要求
    private String transportRequireDetail;
    // 随货单据要求
    private String goodsReceiptRequireDetail;
    // 是否中转站
    private Boolean changeWareHouse;
    //是否企配仓订单    0不是，1是
    private Integer companyWarehouse;

    //客户是否存在超期未支付的账款
    private boolean existExpiredAr;

    public String getTplnameLike() {
        return tplnameLike;
    }

    public Boolean getChangeWareHouse() {
        return changeWareHouse;
    }

    public void setChangeWareHouse(Boolean changeWareHouse) {
        this.changeWareHouse = changeWareHouse;
    }

    public void setTplnameLike(String tplnameLike) {
        this.tplnameLike = tplnameLike;
    }

    public Boolean getTplnameIsEmpty() {
        return tplnameIsEmpty;
    }

    public void setTplnameIsEmpty(Boolean tplnameIsEmpty) {
        this.tplnameIsEmpty = tplnameIsEmpty;
    }

    public Boolean getExpCodeIsEmpty() {
        return expCodeIsEmpty;
    }

    public void setExpCodeIsEmpty(Boolean expCodeIsEmpty) {
        this.expCodeIsEmpty = expCodeIsEmpty;
    }

    public String getCsrReviewTime() {
        return csrReviewTime;
    }

    public void setCsrReviewTime(String csrReviewTime) {
        this.csrReviewTime = csrReviewTime;
    }

    public Integer getPricingMethod() {
        return pricingMethod;
    }

    public List<String> getLabelIdList() {
        return labelIdList;
    }

    public void setLabelIdList(List<String> labelIdList) {
        this.labelIdList = labelIdList;
    }

    public void setPricingMethod(Integer pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    public String getCustomerPurchaseNo() {
        return customerPurchaseNo;
    }

    public List<String> getReportCodes() {
        return reportCodes;
    }

    public void setReportCodes(List<String> reportCodes) {
        this.reportCodes = reportCodes;
    }

    public void setCustomerPurchaseNo(String customerPurchaseNo) {
        this.customerPurchaseNo = customerPurchaseNo;
    }

    public BigDecimal getProportion() {
        return proportion;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
    }

    public Double getFromFactor() {
        return fromFactor;
    }

    public void setFromFactor(Double fromFactor) {
        this.fromFactor = fromFactor;
    }

    public Double getToFactor() {
        return toFactor;
    }

    public void setToFactor(Double toFactor) {
        this.toFactor = toFactor;
    }

    public BigDecimal getAmountProportion() {
        return amountProportion;
    }

    public void setAmountProportion(BigDecimal amountProportion) {
        this.amountProportion = amountProportion;
    }

    public String getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public Boolean getIsApplyGroup() {
        return isApplyGroup;
    }

    public void setIsApplyGroup(Boolean isApplyGroup) {
        this.isApplyGroup = isApplyGroup;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public Double getStockNum() {
        return stockNum;
    }

    public void setStockNum(Double stockNum) {
        this.stockNum = stockNum;
    }

    public Boolean getSuperManager() {
        return superManager;
    }

    public void setSuperManager(Boolean superManager) {
        this.superManager = superManager;
    }

    public String getMainSalesId() {
        return mainSalesId;
    }

    public void setMainSalesId(String mainSalesId) {
        this.mainSalesId = mainSalesId;
    }

    public Double getCloseQty() {
        return closeQty;
    }

    public void setCloseQty(Double closeQty) {
        this.closeQty = closeQty;
    }

    public String getMainSalesName() {
        return mainSalesName;
    }

    public void setMainSalesName(String mainSalesName) {
        this.mainSalesName = mainSalesName;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    public String getNote() {
        return note;
    }

    public List<DataVo> getSkuReplaces() {
        return skuReplaces;
    }

    public void setSkuReplaces(List<DataVo> skuReplaces) {
        this.skuReplaces = skuReplaces;
    }

    public String getMessage() {
        return message;
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getErrCode() {
        return errCode;
    }

    public Double getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Double changeCount) {
        this.changeCount = changeCount;
    }

    public Double getAfsCount() {
        return afsCount;
    }

    public void setAfsCount(Double afsCount) {
        this.afsCount = afsCount;
    }

    public void setErrCode(Long errCode) {
        this.errCode = errCode;
    }

    public Double getOccupyCount() {
        return occupyCount;
    }

    public void setOccupyCount(Double occupyCount) {
        this.occupyCount = occupyCount;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getPwd() {
        return pwd;
    }

    public String getStockSoldttl() {
        return stockSoldttl;
    }

    public String getGroupCustomerName() {
        return groupCustomerName;
    }

    public void setGroupCustomerName(String groupCustomerName) {
        this.groupCustomerName = groupCustomerName;
    }

    public String getGroupCustomerAccount() {
        return groupCustomerAccount;
    }

    public String getItemSku() {
        return itemSku;
    }

    public void setItemSku(String itemSku) {
        this.itemSku = itemSku;
    }

    public String getSapAvailable() {
        return sapAvailable;
    }

    public void setSapAvailable(String sapAvailable) {
        this.sapAvailable = sapAvailable;
    }

    public void setGroupCustomerAccount(String groupCustomerAccount) {
        this.groupCustomerAccount = groupCustomerAccount;
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

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getProductLineCode() {
        return productLineCode;
    }

    public void setProductLineCode(String productLineCode) {
        this.productLineCode = productLineCode;
    }

    public String getProductLineName() {
        return productLineName;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName;
    }

    public String getSegmentCode() {
        return segmentCode;
    }

    public void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
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

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public void setStockSoldttl(String stockSoldttl) {
        this.stockSoldttl = stockSoldttl;
    }

    public String getSkuSoldYtd() {
        return skuSoldYtd;
    }

    public void setSkuSoldYtd(String skuSoldYtd) {
        this.skuSoldYtd = skuSoldYtd;
    }

    public List<DataVo> getMenus() {
        return menus;
    }

    public void setMenus(List<DataVo> menus) {
        this.menus = menus;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<DataVo> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<DataVo> childMenus) {
        this.childMenus = childMenus;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getOuOrderNo() {
        return ouOrderNo;
    }

    public void setOuOrderNo(String ouOrderNo) {
        this.ouOrderNo = ouOrderNo;
    }

    public List<DataVo> getMenuPerms() {
        return menuPerms;
    }

    public void setMenuPerms(List<DataVo> menuPerms) {
        this.menuPerms = menuPerms;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public String getEcCode() {
        return ecCode;
    }

    public void setEcCode(String ecCode) {
        this.ecCode = ecCode;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public String getReason() {
        return reason;
    }

    public Double getAvalCredit() {
        return avalCredit;
    }

    public void setAvalCredit(Double avalCredit) {
        this.avalCredit = avalCredit;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setPayMethodName(String payMethodName) {
        this.payMethodName = payMethodName;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public List<DataVo> getPayAList() {
        return payAList;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPayAList(List<DataVo> payAList) {
        this.payAList = payAList;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public List<DataVo> getCreList() {
        return creList;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreList(List<DataVo> creList) {
        this.creList = creList;
    }

    public String getParentName() {
        return parentName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getMenuRoute() {
        return menuRoute;
    }

    public void setMenuRoute(String menuRoute) {
        this.menuRoute = menuRoute;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getPermDesc() {
        return permDesc;
    }

    public void setPermDesc(String permDesc) {
        this.permDesc = permDesc;
    }

    public String getPermType() {
        return permType;
    }

    public void setPermType(String permType) {
        this.permType = permType;
    }

    public String getPermUrl() {
        return permUrl;
    }

    public void setPermUrl(String permUrl) {
        this.permUrl = permUrl;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Integer getExemptFreightCost() {
        return exemptFreightCost;
    }

    public void setExemptFreightCost(Integer exemptFreightCost) {
        this.exemptFreightCost = exemptFreightCost;
    }

    public String getDeptAgency() {
        return deptAgency;
    }

    public void setDeptAgency(String deptAgency) {
        this.deptAgency = deptAgency;
    }

    public Integer getOpState() {
        return opState;
    }

    public void setOpState(Integer opState) {
        this.opState = opState;
    }

    public String getPermCode() {
        return permCode;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<String> getSkus() {
        return skus;
    }

    public void setSkus(List<String> skus) {
        this.skus = skus;
    }

    public void setPermCode(String permCode) {
        this.permCode = permCode;
    }

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getSkuSold24M() {
        return skuSold24M;
    }

    public List<Long> getRids() {
        return rids;
    }

    public void setRids(List<Long> rids) {
        this.rids = rids;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getStockCount() {
        return stockCount;
    }

    public void setStockCount(Double stockCount) {
        this.stockCount = stockCount;
    }

    public void setSkuSold24M(String skuSold24M) {
        this.skuSold24M = skuSold24M;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public Double getNetValTtl() {
        return netValTtl;
    }

    public Double getSourcingPlan() {
        return sourcingPlan;
    }

    public void setSourcingPlan(Double sourcingPlan) {
        this.sourcingPlan = sourcingPlan;
    }

    public void setNetValTtl(Double netValTtl) {
        this.netValTtl = netValTtl;
    }

    public Double getGp124m() {
        return gp124m;
    }

    public List<String> getCustomerCodes() {
        return customerCodes;
    }

    public void setCustomerCodes(List<String> customerCodes) {
        this.customerCodes = customerCodes;
    }

    public void setGp124m(Double gp124m) {
        this.gp124m = gp124m;
    }

    public Double getGp1Ttl() {
        return gp1Ttl;
    }

    public void setGp1Ttl(Double gp1Ttl) {
        this.gp1Ttl = gp1Ttl;
    }

    public Double getGp1Ytd() {
        return gp1Ytd;
    }

    public void setGp1Ytd(Double gp1Ytd) {
        this.gp1Ytd = gp1Ytd;
    }

    public Double getNetSalesTtl() {
        return netSalesTtl;
    }

    public void setNetSalesTtl(Double netSalesTtl) {
        this.netSalesTtl = netSalesTtl;
    }

    public Double getNetSalesYtd() {
        return netSalesYtd;
    }

    public void setNetSalesYtd(Double netSalesYtd) {
        this.netSalesYtd = netSalesYtd;
    }

    public Double getNetSales24m() {
        return netSales24m;
    }

    public void setNetSales24m(Double netSales24m) {
        this.netSales24m = netSales24m;
    }

    public Long getRequestid() {
        return requestid;
    }

    public void setRequestid(Long requestid) {
        this.requestid = requestid;
    }

    public Double getNetValYtd() {
        return netValYtd;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public void setNetValYtd(Double netValYtd) {
        this.netValYtd = netValYtd;
    }

    public Double getNetVal24m() {
        return netVal24m;
    }

    public void setNetVal24m(Double netVal24m) {
        this.netVal24m = netVal24m;
    }

    public Double getGpTtl() {
        return gpTtl;
    }

    public void setGpTtl(Double gpTtl) {
        this.gpTtl = gpTtl;
    }

    public Double getGpYtd() {
        return gpYtd;
    }

    public void setGpYtd(Double gpYtd) {
        this.gpYtd = gpYtd;
    }

    public Double getBefstockCount() {
        return befstockCount;
    }

    public void setBefstockCount(Double befstockCount) {
        this.befstockCount = befstockCount;
    }

    public Double getAftstockCount() {
        return aftstockCount;
    }

    public void setAftstockCount(Double aftstockCount) {
        this.aftstockCount = aftstockCount;
    }

    public Double getBefoccupyCount() {
        return befoccupyCount;
    }

    public void setBefoccupyCount(Double befoccupyCount) {
        this.befoccupyCount = befoccupyCount;
    }

    public Double getAftoccupyCount() {
        return aftoccupyCount;
    }

    public void setAftoccupyCount(Double aftoccupyCount) {
        this.aftoccupyCount = aftoccupyCount;
    }

    public Double getBefafsCount() {
        return befafsCount;
    }

    public void setBefafsCount(Double befafsCount) {
        this.befafsCount = befafsCount;
    }

    public Double getAftafsCount() {
        return aftafsCount;
    }

    public void setAftafsCount(Double aftafsCount) {
        this.aftafsCount = aftafsCount;
    }

    public Double getGpTtf() {
        return gpTtf;
    }

    public void setGpTtf(Double gpTtf) {
        this.gpTtf = gpTtf;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPlePlan() {
        return plePlan;
    }

    public String getGp1Plan() {
        return gp1Plan;
    }

    public void setGp1Plan(String gp1Plan) {
        this.gp1Plan = gp1Plan;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getPleSoldPlan() {
        return pleSoldPlan;
    }

    public void setPleSoldPlan(String pleSoldPlan) {
        this.pleSoldPlan = pleSoldPlan;
    }

    public Long getAppResid() {
        return appResid;
    }

    public void setAppResid(Long appResid) {
        this.appResid = appResid;
    }

    public String getSkuSoldPlan() {
        return skuSoldPlan;
    }

    public void setSkuSoldPlan(String skuSoldPlan) {
        this.skuSoldPlan = skuSoldPlan;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getTertiaryDeptCode() {
        return tertiaryDeptCode;
    }

    public void setTertiaryDeptCode(String tertiaryDeptCode) {
        this.tertiaryDeptCode = tertiaryDeptCode;
    }

    public String getTertiaryDeptName() {
        return tertiaryDeptName;
    }

    public void setTertiaryDeptName(String tertiaryDeptName) {
        this.tertiaryDeptName = tertiaryDeptName;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getContactCodeR3() {
        return contactCodeR3;
    }

    public void setContactCodeR3(String contactCodeR3) {
        this.contactCodeR3 = contactCodeR3;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTelExt() {
        return telExt;
    }

    public void setTelExt(String telExt) {
        this.telExt = telExt;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getPath() {
        return path;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getBillingTarget() {
        return billingTarget;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void setBillingTarget(String billingTarget) {
        this.billingTarget = billingTarget;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setPlePlan(String plePlan) {
        this.plePlan = plePlan;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(String topCategory) {
        this.topCategory = topCategory;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getR3Code() {
        return r3Code;
    }

    public void setR3Code(String r3Code) {
        this.r3Code = r3Code;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getSegment() {
        return segment;
    }

    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getInvoicevf() {
        return invoicevf;
    }

    public void setInvoicevf(String invoicevf) {
        this.invoicevf = invoicevf;
    }

    public String getInvoicevat() {
        return invoicevat;
    }

    public void setInvoicevat(String invoicevat) {
        this.invoicevat = invoicevat;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getSpk() {
        return spk;
    }

    public void setSpk(String spk) {
        this.spk = spk;
    }

    public Integer getOpt() {
        return opt;
    }

    public void setOpt(Integer opt) {
        this.opt = opt;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getValue() {
        return value;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Double getExchRate() {
        return exchRate;
    }

    public String getWorkcode() {
        return workcode;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public String getObdNo() {
        return obdNo;
    }

    public void setObdNo(String obdNo) {
        this.obdNo = obdNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Double orderCount) {
        this.orderCount = orderCount;
    }

    public Double getSendCount() {
        return sendCount;
    }

    public void setSendCount(Double sendCount) {
        this.sendCount = sendCount;
    }

    public String getVrkme() {
        return vrkme;
    }

    public void setVrkme(String vrkme) {
        this.vrkme = vrkme;
    }

    public String getPunit() {
        return punit;
    }

    public void setPunit(String punit) {
        this.punit = punit;
    }

    public Integer getPackqty() {
        return packqty;
    }

    public void setPackqty(Integer packqty) {
        this.packqty = packqty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMfrpn() {
        return mfrpn;
    }

    public void setMfrpn(String mfrpn) {
        this.mfrpn = mfrpn;
    }

    public String getTplname() {
        return tplname;
    }

    public void setTplname(String tplname) {
        this.tplname = tplname;
    }

    public String getObdLineNo() {
        return obdLineNo;
    }

    public void setObdLineNo(String obdLineNo) {
        this.obdLineNo = obdLineNo;
    }

    public String getOrderLineNo() {
        return orderLineNo;
    }

    public void setOrderLineNo(String orderLineNo) {
        this.orderLineNo = orderLineNo;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getSubcompanyname() {
        return subcompanyname;
    }

    public void setSubcompanyname(String subcompanyname) {
        this.subcompanyname = subcompanyname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setExchRate(Double exchRate) {
        this.exchRate = exchRate;
    }

    public List<Long> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<Long> parentIds) {
        this.parentIds = parentIds;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getWhCode() {
        return whCode;
    }

    public void setWhCode(String whCode) {
        this.whCode = whCode;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIcon() {
        return icon;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getUserId() {
        return userId;
    }

    public DataVo getParams() {
        return params;
    }

    public void setParams(DataVo params) {
        this.params = params;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getExpCode() {
        return expCode;
    }

    public void setExpCode(String expCode) {
        this.expCode = expCode;
    }

    public String getExpNo() {
        return expNo;
    }

    public void setExpNo(String expNo) {
        this.expNo = expNo;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getAvatarPhoto() {
        return avatarPhoto;
    }

    public void setAvatarPhoto(String avatarPhoto) {
        this.avatarPhoto = avatarPhoto;
    }

    public List<String> getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(List<String> authorizations) {
        this.authorizations = authorizations;
    }

    public List<String> getAppResUrls() {
        return appResUrls;
    }

    public void setAppResUrls(List<String> appResUrls) {
        this.appResUrls = appResUrls;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getManagerid() {
        return managerid;
    }

    public void setManagerid(Long managerid) {
        this.managerid = managerid;
    }

    public String getMobile() {
        return mobile;
    }

    public List<String> getNos() {
        return nos;
    }

    public void setNos(List<String> nos) {
        this.nos = nos;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLastmoddate() {
        return lastmoddate;
    }

    public void setLastmoddate(String lastmoddate) {
        this.lastmoddate = lastmoddate;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getRoleAdmin() {
        return roleAdmin;
    }

    public void setRoleAdmin(Boolean roleAdmin) {
        this.roleAdmin = roleAdmin;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public DataVo getRoles() {
        return roles;
    }

    public void setRoles(DataVo roles) {
        this.roles = roles;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getWorkflowType() {
        return workflowType;
    }

    public void setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getWorkflowNo() {
        return workflowNo;
    }

    public void setWorkflowNo(String workflowNo) {
        this.workflowNo = workflowNo;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getSkuCode() {
        if (skuCode != null) {
            skuCode = skuCode.trim();
        }
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        if (skuCode != null) {
            skuCode = skuCode.trim();
        }
        this.skuCode = skuCode;
    }

    public String getSkuZhName() {
        return skuZhName;
    }

    public void setSkuZhName(String skuZhName) {
        this.skuZhName = skuZhName;
    }

    public String getSkuEnName() {
        return skuEnName;
    }

    public void setSkuEnName(String skuEnName) {
        this.skuEnName = skuEnName;
    }

    public DataVo getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(DataVo loginUser) {
        this.loginUser = loginUser;
    }

    public DataVo getData() {
        return data;
    }

    public void setData(DataVo data) {
        this.data = data;
    }

    public List<DataVo> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataVo> dataList) {
        this.dataList = dataList;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public String getAppId() {
        return appId;
    }

    public String getOrderNoYtd() {
        return orderNoYtd;
    }

    public void setOrderNoYtd(String orderNoYtd) {
        this.orderNoYtd = orderNoYtd;
    }

    public String getOrderNo24() {
        return orderNo24;
    }

    public void setOrderNo24(String orderNo24) {
        this.orderNo24 = orderNo24;
    }

    public String getCustomerCodeYtd() {
        return customerCodeYtd;
    }

    public void setCustomerCodeYtd(String customerCodeYtd) {
        this.customerCodeYtd = customerCodeYtd;
    }

    public String getCustomerCode24() {
        return customerCode24;
    }

    public void setCustomerCode24(String customerCode24) {
        this.customerCode24 = customerCode24;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public List<String> getPd() {
        return pd;
    }

    public void setPd(List<String> pd) {
        this.pd = pd;
    }

    public List<String> getPm() {
        return pm;
    }

    public void setPm(List<String> pm) {
        this.pm = pm;
    }

    public List<String> getPcm() {
        return pcm;
    }

    public void setPcm(List<String> pcm) {
        this.pcm = pcm;
    }

    public List<String> getCodes() {
        return codes;
    }

    public DataVo setCodes(List<String> codes) {
        this.codes = codes;
        return this;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getBrName() {
        return brName;
    }

    public void setBrName(String brName) {
        this.brName = brName;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Long getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(Long productLineId) {
        this.productLineId = productLineId;
    }

    public Long getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    public String getApiValue() {
        return apiValue;
    }

    public void setApiValue(String apiValue) {
        this.apiValue = apiValue;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getSid() {
        return sid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<Long> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public List<Long> getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(List<Long> moduleIds) {
        this.moduleIds = moduleIds;
    }

    public List<Long> getMenuIds() {
        return menuIds;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setMenuIds(List<Long> menuIds) {
        this.menuIds = menuIds;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getJointVentureFlag() {
        return jointVentureFlag;
    }

    public void setJointVentureFlag(Boolean jointVentureFlag) {
        this.jointVentureFlag = jointVentureFlag;
    }

    public String getJointVentureCompanyCode() {
        return jointVentureCompanyCode;
    }

    public void setJointVentureCompanyCode(String jointVentureCompanyCode) {
        this.jointVentureCompanyCode = jointVentureCompanyCode;
    }

    public String getJointVentureCompanyName() {
        return jointVentureCompanyName;
    }

    public void setJointVentureCompanyName(String jointVentureCompanyName) {
        this.jointVentureCompanyName = jointVentureCompanyName;
    }

    public String getPackageRequireDetail() {
        return packageRequireDetail;
    }

    public void setPackageRequireDetail(String packageRequireDetail) {
        this.packageRequireDetail = packageRequireDetail;
    }

    public String getTransportRequireDetail() {
        return transportRequireDetail;
    }

    public void setTransportRequireDetail(String transportRequireDetail) {
        this.transportRequireDetail = transportRequireDetail;
    }

    public String getGoodsReceiptRequireDetail() {
        return goodsReceiptRequireDetail;
    }

    public void setGoodsReceiptRequireDetail(String goodsReceiptRequireDetail) {
        this.goodsReceiptRequireDetail = goodsReceiptRequireDetail;
    }

    public Integer getCompanyWarehouse() {
        return companyWarehouse;
    }

    public void setCompanyWarehouse(Integer companyWarehouse) {
        this.companyWarehouse = companyWarehouse;
    }

    public boolean getExistExpiredAr() {
        return existExpiredAr;
    }

    public void setExistExpiredAr(boolean existExpiredAr) {
        this.existExpiredAr = existExpiredAr;
    }

    @Override
    public String toString() {
        return "DataVo [sid=" + sid + ", appId=" + appId + ", apiName=" + apiName + ", apiValue=" + apiValue
                + ", expCode=" + expCode + ", expNo=" + expNo + ", brName=" + brName + ", sex=" + sex
                + ", workflowType=" + workflowType + ", billNo=" + billNo + ", approvalStatus=" + approvalStatus
                + ", workflowNo=" + workflowNo + ", fromCurrency=" + fromCurrency + ", password=" + password
                + ", departmentid=" + departmentid + ", workcode=" + workcode + ", spk=" + spk + ", totalSize="
                + totalSize + ", createdate=" + createdate + ", subcompanyname=" + subcompanyname + ", departmentname="
                + departmentname + ", status=" + status + ", managerid=" + managerid + ", lastname=" + lastname
                + ", mobile=" + mobile + ", lastmoddate=" + lastmoddate + ", loginid=" + loginid + ", page=" + page
                + ", params=" + params + ", toCurrency=" + toCurrency + ", exchRate=" + exchRate + ", errMsg=" + errMsg
                + ", codes=" + codes + ", statusCode=" + statusCode + ", avatarPhoto=" + avatarPhoto
                + ", authorizations=" + authorizations + ", appResUrls=" + appResUrls + ", refreshToken=" + refreshToken
                + ", expireTime=" + expireTime + ", admin=" + admin + ", roleAdmin=" + roleAdmin + ", jobCode="
                + jobCode + ", roles=" + roles + ", key=" + key + ", whCode=" + whCode + ", secret=" + secret
                + ", itemId=" + itemId + ", brandId=" + brandId + ", parentId=" + parentId + ", parentIds=" + parentIds
                + ", productLineId=" + productLineId + ", segmentId=" + segmentId + ", expiresIn=" + expiresIn
                + ", accessToken=" + accessToken + ", token=" + token + ", orderNo=" + orderNo + ", orderNoYtd="
                + orderNoYtd + ", orderNo24=" + orderNo24 + ", customerCode=" + customerCode + ", customerCodeYtd="
                + customerCodeYtd + ", customerCode24=" + customerCode24 + ", curPage=" + curPage + ", pageSize="
                + pageSize + ", fileName=" + fileName + ", name=" + name + ", pd=" + pd + ", pm=" + pm + ", pcm=" + pcm
                + ", createTime=" + createTime + ", startTime=" + startTime + ", endTime=" + endTime + ", userCode="
                + userCode + ", userName=" + userName + ", pwd=" + pwd + ", email=" + email + ", ids=" + ids
                + ", permissionIds=" + permissionIds + ", moduleIds=" + moduleIds + ", menuIds=" + menuIds + ", url="
                + url + ", code=" + code + ", requestid=" + requestid + ", msg=" + msg + ", value=" + value + ", icon="
                + icon + ", selected=" + selected + ", dataList=" + dataList + ", menuId=" + menuId + ", moduleId="
                + moduleId + ", permissionId=" + permissionId + ", mplist="  + ", introduce=" + introduce
                + ", num=" + num + ", stockCount=" + stockCount + ", opt=" + opt + ", optType=" + optType
                + ", totalPage=" + totalPage + ", totalCount=" + totalCount + ", loginUser=" + loginUser + ", data="
                + data + ", id=" + id + ", productId=" + productId + ", categoryId=" + categoryId + ", familyId="
                + familyId + ", categoryName=" + categoryName + ", familyName=" + familyName + ", levelName="
                + levelName + ", topCategory=" + topCategory + ", productLine=" + productLine + ", segment=" + segment
                + ", group=" + group + ", skuCode=" + skuCode + ", skuZhName=" + skuZhName + ", skuEnName=" + skuEnName
                + ", userId=" + userId + ", plePlan=" + plePlan + ", gp1Plan=" + gp1Plan + ", gp124m=" + gp124m
                + ", gp1Ttl=" + gp1Ttl + ", gp1Ytd=" + gp1Ytd + ", netSalesTtl=" + netSalesTtl + ", netSalesYtd="
                + netSalesYtd + ", netSales24m=" + netSales24m + ", pleSoldPlan=" + pleSoldPlan + ", skuSoldPlan="
                + skuSoldPlan + ", billingTarget=" + billingTarget + ", stockSoldttl=" + stockSoldttl + ", skuSoldYtd="
                + skuSoldYtd + ", skuSold24M=" + skuSold24M + ", gpTtl=" + gpTtl + ", gpYtd=" + gpYtd + ", gpTtf="
                + gpTtf + ", netValTtl=" + netValTtl + ", netValYtd=" + netValYtd + ", netVal24m=" + netVal24m
                + ", sourcingPlan=" + sourcingPlan + ", orderStatus=" + orderStatus + ", sourceChannel=" + sourceChannel
                + ", proportion=" + proportion + ", amountProportion=" + amountProportion + ", customerPurchaseNo="
                + customerPurchaseNo + "]";
    }

    public DataVo() {
        super();
    }
}
