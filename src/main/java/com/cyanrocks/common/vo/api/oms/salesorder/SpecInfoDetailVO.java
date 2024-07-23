package com.cyanrocks.common.vo.api.oms.salesorder;

import javax.validation.constraints.NotNull;

/**
 * @version V2.0
 * @author: Steven Qin
 * @create: 2022/10/25 3:20 PM
 * @description:修改特定信息通用接口
 **/
public class SpecInfoDetailVO {

    /**
     * 序号
     */
    @NotNull(message = "序号不能为空")
    private Integer lineNum;
    /**
     * SKU号
     */
    private String sku;
    /**
     * 产品名称
     */
    private String productNameZh;
    /**
     * 客户物料号
     */
    private String customerSku;
    /**
     * 客户产品名称
     */
    private String customerProductName;
    /**
     * 税收分类编码
     */
    private String taxNo;

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCustomerSku() {
        return customerSku;
    }

    public void setCustomerSku(String customerSku) {
        this.customerSku = customerSku;
    }

    public String getCustomerProductName() {
        return customerProductName;
    }

    public void setCustomerProductName(String customerProductName) {
        this.customerProductName = customerProductName;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getProductNameZh() {
        return productNameZh;
    }

    public void setProductNameZh(String productNameZh) {
        this.productNameZh = productNameZh;
    }
}
