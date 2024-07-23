package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * 客户保税区校验响应展示VO
 */
public class CustomerBondRespVo extends BaseVo {

    /**
     * 是否保税区(字段值)
     */
    private Boolean toBond;

    /**
     * 是否可编辑(前端用来判断控件是否可编辑)
     */
    private Boolean edit;

    public Boolean getToBond() {
        return toBond;
    }

    public void setToBond(Boolean toBond) {
        this.toBond = toBond;
    }

    public Boolean getEdit() {
        return edit;
    }

    public void setEdit(Boolean edit) {
        this.edit = edit;
    }

    @Override
    public String toString() {
        return "CustomerBondRespVo{" +
                "toBond=" + toBond +
                ", edit=" + edit +
                '}';
    }
}
