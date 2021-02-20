package com.mz.cn.plan.entity;

import java.time.LocalDateTime;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huanglin
 * @since 2021-02-18
 */
public class Plan extends Model<Plan> {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    /**
     * 计划创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;
    /**
     * 计划结束时间
     */
    @TableField("end_time")
    private LocalDateTime endTime;
    /**
     * 主题
     */
    private String title;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 完成完成时间
     */
    @TableField("complete_time")
    private LocalDateTime completeTime;
    /**
     * 0 未完成 1 已完成 2 未完成已过期 3 逾期完成 4 提前完成 
     */
    private Integer status;
    /**
     *
     */
    private String creator;
    private String terminator;
    /**
     * 优先级1 重要紧急 2重要不紧急 3 紧急不重要 4 不紧急不重要
     */
    private Integer priority;
    /**
     * 计划类型  a 工作 b  娱乐
     */
    private String type;
    /**
     * 逻辑删除
     */
    private String del;
    /**
     * 计划开始时间
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDateTime getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(LocalDateTime completeTime) {
        this.completeTime = completeTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTerminator() {
        return terminator;
    }

    public void setTerminator(String terminator) {
        this.terminator = terminator;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Plan{" +
        ", id=" + id +
        ", createTime=" + createTime +
        ", endTime=" + endTime +
        ", title=" + title +
        ", remarks=" + remarks +
        ", completeTime=" + completeTime +
        ", status=" + status +
        ", creator=" + creator +
        ", terminator=" + terminator +
        ", priority=" + priority +
        ", type=" + type +
        ", del=" + del +
        "}";
    }
}
