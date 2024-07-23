package com.cyanrocks.common.vo.api.oms.salesorder;

/**
 * 销售订单相关信息响应展示VO
 */
public class SalesOrderRelevantRespVo {

    /**
     * 报价单号
     */
    private String quotCode;

    /**
     * 报价单类型
     */
    private String quotType;

    /**
     * 流程ID
     */
    private String processId;

    /**
     * 流程名称
     */
    private String processName;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务状态
     */
    private String taskStatus;

    /**
     * 发起时间
     */
    private String processLaunchTime;

    /**
     * 结束时间
     */
    private String processEndTime;

    /**
     * 候选人
     */
    private String candidate;

    /**
     * 处理人
     */
    private String handler;

    /**
     * 流程描述
     */
    private String processDescribe;

    public String getQuotCode() {
        return quotCode;
    }

    public void setQuotCode(String quotCode) {
        this.quotCode = quotCode;
    }

    public String getQuotType() {
        return quotType;
    }

    public void setQuotType(String quotType) {
        this.quotType = quotType;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getProcessLaunchTime() {
        return processLaunchTime;
    }

    public void setProcessLaunchTime(String processLaunchTime) {
        this.processLaunchTime = processLaunchTime;
    }

    public String getProcessEndTime() {
        return processEndTime;
    }

    public void setProcessEndTime(String processEndTime) {
        this.processEndTime = processEndTime;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getProcessDescribe() {
        return processDescribe;
    }

    public void setProcessDescribe(String processDescribe) {
        this.processDescribe = processDescribe;
    }

    @Override
    public String toString() {
        return "SalesOrderRelevantRespVo{" +
                "quotCode='" + quotCode + '\'' +
                ", quotType=" + quotType +
                ", processId='" + processId + '\'' +
                ", processName='" + processName + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", processLaunchTime='" + processLaunchTime + '\'' +
                ", processEndTime='" + processEndTime + '\'' +
                ", candidate='" + candidate + '\'' +
                ", handler='" + handler + '\'' +
                ", processDescribe='" + processDescribe + '\'' +
                '}';
    }
}
