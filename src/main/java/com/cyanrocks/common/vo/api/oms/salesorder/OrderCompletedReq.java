package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @version V2.0
 * @author: Anny.Song
 * @create: 2023/6/30 13:51
 * @description:
 **/
public class OrderCompletedReq implements Serializable {
    /**
     * 订单号
     */
    @NotBlank(message = "订单号不能为空")
    private String orderNo;
    /**
     * 是否完结（0 未完结 1 完结）
     */
    @NotNull(message = "是否完结字段不能为空")
    private Integer isCompleted;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Integer isCompleted) {
        this.isCompleted = isCompleted;
    }
}
