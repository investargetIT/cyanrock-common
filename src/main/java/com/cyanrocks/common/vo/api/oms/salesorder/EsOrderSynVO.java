package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * oms 订单状态变更消息通知
 **/
public class EsOrderSynVO implements Serializable {
    /**
     * 客户号
     */
    private String customerCode;
    /**
     * 订单变更类型
     */
    private String orderChangeType;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单行信息
     */
    private List<EsOrderLineSynVO> itemLines;
    /**
     * 变更时间
     */
    private Date gmtModified;
    /**
     * 报价单渠道
     */
    private String  channel;

    public EsOrderSynVO() {
    }

    public EsOrderSynVO(String customerCode, String orderChangeType, String orderNo, List<EsOrderLineSynVO> itemLines,Date gmtModified, String channel) {
        this.customerCode = customerCode;
        this.orderChangeType = orderChangeType;
        this.orderNo = orderNo;
        this.itemLines = itemLines;
        this.gmtModified = gmtModified;
        this.channel = channel;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getOrderChangeType() {
        return orderChangeType;
    }

    public void setOrderChangeType(String orderChangeType) {
        this.orderChangeType = orderChangeType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<EsOrderLineSynVO> getItemLines() {
        return itemLines;
    }

    public void setItemLines(List<EsOrderLineSynVO> itemLines) {
        this.itemLines = itemLines;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
