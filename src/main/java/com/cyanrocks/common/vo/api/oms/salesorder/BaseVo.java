package com.cyanrocks.common.vo.api.oms.salesorder;

import java.util.Date;

/**
 * Vo通用字段
 *
 * @author Jimbo
 */
public abstract class BaseVo {
    /**
     * 是否删除，0否1是
     */
    private Integer deleted = 0;

    /**
     * 创建时间
     */
    private Date createTime = new Date();

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createId;

    /**
     * 创建名称
     */
    private String createName;

    /**
     * 更新人
     */
    private Long updateId;

    /**
     * 更新人名称
     */
    private String updateName;

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

}
