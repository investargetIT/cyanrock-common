package com.cyanrocks.common.vo.api.oms.salesorder;

import java.util.List;

import com.cyanrocks.common.vo.api.PageReqVO;

/**
 * 报价转订单下一步-请求VO
 */
public class SalesOrderQuotationReqVo extends PageReqVO {


    /**
     * 报价单行ID
     */
    private List<Long> quotLineIdList;

    /**
     * 报价单ID
     */
    private List<Long> quotIdList;

    public List<Long> getQuotLineIdList() {
        return quotLineIdList;
    }

    public void setQuotLineIdList(List<Long> quotLineIdList) {
        this.quotLineIdList = quotLineIdList;
    }

    public List<Long> getQuotIdList() {
        return quotIdList;
    }

    public void setQuotIdList(List<Long> quotIdList) {
        this.quotIdList = quotIdList;
    }

    @Override
    public String toString() {
        return "SalesOrderQuotationReqVo{" +
                "quotLineIdList=" + quotLineIdList +
                ", quotIdList=" + quotIdList +
                '}';
    }
}
