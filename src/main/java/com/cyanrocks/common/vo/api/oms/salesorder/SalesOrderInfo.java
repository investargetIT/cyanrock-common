package com.cyanrocks.common.vo.api.oms.salesorder;

import com.cyanrocks.common.vo.api.PageRespVO;
import java.io.Serializable;

/**
 * @version V2.0
 * @author: Anny.Song
 * @create: 2023/2/22 14:40
 * @description:
 **/
public class SalesOrderInfo implements Serializable {
    private com.cyanrocks.common.vo.api.oms.salesorder.SalesOrderSnapshotRespVo salesOrderSnapshotRespVo;
    private PageRespVO<SalesOrderDetailResVo>  pageLineVO;

    public SalesOrderSnapshotRespVo getSalesOrderSnapshotRespVo() {
        return salesOrderSnapshotRespVo;
    }

    public void setSalesOrderSnapshotRespVo(SalesOrderSnapshotRespVo salesOrderSnapshotRespVo) {
        this.salesOrderSnapshotRespVo = salesOrderSnapshotRespVo;
    }

    public PageRespVO<SalesOrderDetailResVo> getPageLineVO() {
        return pageLineVO;
    }

    public void setPageLineVO(PageRespVO<SalesOrderDetailResVo> pageLineVO) {
        this.pageLineVO = pageLineVO;
    }
}
