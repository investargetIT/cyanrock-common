package com.cyanrocks.common.constant;

/**
 * 异步实时处理服务列表
 *
 * @author 符冬
 *
 */
public interface NotifyServiceNames {
    /**
     * 订单妥投
     */
    String ORDER_DELIVERYNOTICE = "/omsnotify/deliveryNotice/salesOrder";
    /**
     * eando 与报废
     */
    String SCRAPORDER_DELIVERYNOTICE = "/omsnotify/deliveryNotice/scrapOrder";
    /**
     * 售后-妥投
     *
     */
    String AFTERORDER_DELIVERYNOTICE = "/omsnotify/deliveryNotice/afterOrder";
    /**
     * 借样妥投
     */
    String SAMPLEORDER_DELIVERYNOTICE = "/omsnotify/deliveryNotice/sampleOrder";

    /**
     * 实时推送订单数据到OMS报表
     */
    String PUSHORDERTOOMSREPORTDATAWITHINCREAMENT = "/omsnotify/api/pushOrderToOmsReportDataWithIncreament";

    /**
     * 实时推送报价单数据到OMS报表
     */
    String PUSHQUOTATIONTOOMSREPORTDATAWITHINCREAMENT = "/omsnotify/api/pushQuotationToOmsReportDataWithIncreament";
    /**
     * 获取用户数据权限
     */
    String GETUSERPROFILE = "/omsnotify/api/getUserprofile";
    /**
     * 订单取消通知
     */
    String SYNCCANCELORDER = "/omsnotify/api/syncCancelOrder";
    /**
     * 获取订单商品数据
     */
    String GETORDERSKUDATAS = "/omsnotify/api/getOrderSkuDatas";
    /**
     * 获取订单基本信息
     */
    String GETSIMPLEORDERINFO = "/omsnotify/api/getSimpleOrderInfo";
    /**
     * 销售订单同步到SAP
     */
    String SAP_SYNCORDER = "/omsnotify/sap/syncOrder";
    /**
     *SAP  SO同步OMS
     */
    String PULL_SAPSOMODIFY="/omsnotify/sap/pullSapSoModify";

    /**
     * SAP回调订单处理结果
     */
    String SAP_SYNCORDERCALLBACK = "/omsnotify/sap/syncOrderCallBack";

    /**
     * 修改过期的报价单状态
     */
    String QUOTATION_SYNC_STATUS = "/omsnotify/quotation/syncQuotationStatus";
    /**
     * 根据SAP订单号获取OMS生成的原始单号
     */
    String GETOMSORIGINORDERNO = "/omsnotify/salesorder/getOmsOriginOrderNo";
    /**
     * 生成一个新的OMS内部订单号给外部渠道使用
     */
    String GENOMSORDERNO = "/omsnotify/salesorder/genOmsOrderNo";
    /**
     * 财务放单超期拒绝
     */
    String SALESORDER_FINANCE_RELEASE = "/omsnotify/salesorder/syncFinanceRelease";

    /**
     * 发票数据同步
     */
    String GUODIANAPI_SYNCINVOICE = "/thirdapi/guodianapi/syncinvoice";
    /**
     * 同步Mission
     */
    String OPENSO_SYNC_MISSION = "/omsnotify/openso/syncMission";
    /**
     * 关闭Mission
     */
    String OPENSO_CLOSE = "/omsnotify/openso/close";
    /**
     * 异步OA
     */
    String OA_SYNCOA = "/omsnotify/oa/syncOa";
    /**
     * Open SO预估交期清洗
     */
    String ZSD_GET_OPENSO_ALL = "/omsnotify/sap/syncOpenSo";
    /**
     * 查询订单是否更新预计交期
     */
    String GET_EST_DEL_DATE_SIGN = "/omsnotify/font/getEstDelDateSign";
    /**
     * 根据订单编号查询订单详情
     */
    String GET_ORDER_DETAIL = "/omsnotify/font/getOrderDetail/%s";
    /**
     * 根据SO取订单的客户信息
     */
    String TMS_ORDER_CUSTOMER_INFO = "/omsnotify/salesorder/getOrderCustomerInfo";
    /**
     * 根据SO号获取订单客户联系人信息
     */
    String TMS_ORDER_CONTRACT_INFO = "/omsnotify/salesorder/getOrderContractInfo";

    /**
     * 报价单-PDF下载
     */
    String QUOTATION_DOWN_PDF = "/omsnotify/quotation/quotExportPdf";
    String QUOTATION_EXPORT_EXCEL = "/omsnotify/quotation/exportQuotExcel";
    /**
     * 订单-PDF下载
     */
    String SalesORDER_DOWN_PDF = "/omsnotify/salesorder/downPdfUrl";
    /**
     * 查询需求单个数
     */
    String QUERY_INQUIRY_NUMBER = "/omsnotify/inquiry/queryInquiryNumber";
    /**
     * OMS调用BI，更新需求单AE配型(定时任务)
     */
    String  SYNC_INQUIRY_AE_MATCH= "/omsnotify/inquiry/syncInquiryAeMatch";
    /**
     * BI推送OMS，更新需求单AE配型
     */
    String  INQUIRY_UPDATE_AE_MATCH= "/omsnotify/inquiry/updateAeMatch";
    /**
     * 报价单-助力、运费调整消息通知
     */
    String QUOTATION_MSG_NOTIFY = "/omsnotify/quotation/msgNotify";
    /**
     * 官网-费用总计
     * */
    String WEBSITE_CALCULATION="/omsnotify/calculation";

    /**
     * 官企-报价单详情
     */
    String GW_QUOTATION_DETAIL= "/omsnotify/quotation/detail";
    /**
     * 官企/OMS-运费计算接口（通用接口）
     */
    String FREIGHT_CALCULATE = "/omsnotify/freightCalculate";
    /**
     * 官企-报价单转订单校验
     */
    String ES_CHECK_QUOTATION="/omsnotify/quotation/checkQuotation";
    /**
     * 官企-报价单分页
     */
    String ES_QUOTE_PAGE = "/omsnotify/quotation/esQuotePage";
    /**
     * 官企-首页-报价单列表
     */
    String QUOTE_HOME_PAGE = "/omsnotify/quotation/quoteHomePage";
    /**
     * 官企-报价单列表筛选总计金额
     */
    String QUOTE_TOTAL_AMOUNT = "/omsnotify/quotation/quoteTotalAmount";
    /**
     * 订单列表查询
     */
    String WEBSITE_ORDER_LIST="/omsnotify/salesorder/queryOrderList";
    /**
     * 查询订单详情
     */
    String WEBSITE_ORDER_DETAIL="/omsnotify/salesorder/queryOrderDetail";
    /**
     * 查询订单发货详情
     */
    String WEBSITE_ORDER_OBD_INFO="/omsnotify/salesorder/queryOrderObdInfo";
    /**
     * 查询订单订单统计
     */
    String WEBSITE_ORDER_TOTALINFO="/omsnotify/salesorder/queryOrderTotalInfo";
    /**
     * 订单状态数量统计
     */
    String WEBSITE_ORDER_TOTALSTATUSQTY="/omsnotify/salesorder/queryTotalStatusQty";
    /**
     * 企业客户在线创建报价单，邮件提醒主销售
     */
    String ENT_ADD_EMAIL_NOTIFY = "/omsnotify/quotation/entAddEmailNotify";
    /**
     * 报价单成本中心处理
     */
    String ENT_QUOTATION_COST_PROCESS = "/omsnotify/quotation/quotationCostProcess";

    /**
     * 更新报价单状态
     */
    String UPDATE_QUOTE_STATE = "/omsnotify/quotation/updateQuoteState";
    String ENT_QUOTE_STATUS_COUNT= "/omsnotify/quotation/getQuoteStatusCount";
    /**
     * 官企-更新客户内部审批状态
     */
    String ES_UPDATE_CUSTOMER_PROCESS = "/omsnotify/quotation/updateCustomerProcess";
    /**
     * 获取签收单列表
     */
    String GET_ORDERSIGNLIST_NOTIFY = "/omsnotify/obdMsg/getOrderSignList/";
    /**
     * 获取订单基础信息
     */
    String GET_ORDERVO= "/omsnotify/salesorder/queryOrderBase";
    /**
     * 获取订单状态列表
     */
    String GET_QUERYORDERSTATUS= "/omsnotify/salesorder/queryOrderStatus";
    /**
     * 需求单状态变更消息触达
     */
    String SEND_sendInquiryMsg= "/omsnotify/inquiry/sendInquiryMsg";
    /**
     * 修改订单完结字段
     */
    String SALESORDER_ORDERCOMPLETED= "/omsnotify/salesorder/orderCompleted";
    /**
     * 项目单
     */
    String SALESORDER_UPDATEMENUMATCHING= "/omsnotify/salesorder/updateMenuMatching";
    /**
     * 根据客户采购单号和客户号缩小订单号范围
     */
    String GET_BY_NOS = "/omsnotify/api/getOrderNosAndCustomerPurchaseNo";

    /**
     * 根据SO取订单的客户信息
     */
    String GET_PO_INFO = "/omsnotify/salesorder/getPoInfo";

    /**
     * SO进单异常监控支撑数据查询
     */
    String GET_ANOMALY_MONITORING = "/omsnotify/salesorder/getAnomalyMonitoring";

    /**
     *  SO 折扣信息异常监控
     */
    String MONITOR_ANOMALY_MONITORING = "/omsnotify/salesorder/anomalyMonitoring";
}
