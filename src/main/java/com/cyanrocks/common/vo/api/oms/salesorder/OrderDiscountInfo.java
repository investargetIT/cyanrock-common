package com.cyanrocks.common.vo.api.oms.salesorder;

import java.io.Serializable;
import java.util.List;

/**
 * @author annySong
 * @version 1.0
 * @date 2022/8/25 9:53
 */

public class OrderDiscountInfo implements Serializable {
    /**
     * 是否含有csp价格
     */
    private Boolean cspDiscount;
    /**
     * 折扣明细
     */
    private List<SODiscountCreateReqVo> discountLines;

    public Boolean getCspDiscount() {
        return cspDiscount;
    }

    public void setCspDiscount(Boolean cspDiscount) {
        this.cspDiscount = cspDiscount;
    }

    public List<SODiscountCreateReqVo> getDiscountLines() {
        return discountLines;
    }

    public void setDiscountLines(List<SODiscountCreateReqVo> discountLines) {
        this.discountLines = discountLines;
    }
}