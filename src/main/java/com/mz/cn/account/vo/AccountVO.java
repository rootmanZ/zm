package com.mz.cn.account.vo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description <p></p>
 * @Author: Huanglin
 * @Date: 2021/3/8 11:41
 * @Version 0.0.1
 */
public class AccountVO extends PageVO {

    private Integer id;
    /**
     * 账号(用户名)
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 平台名称
     */
    private String platform;
    /**
     * 第二级平台名称
     */
    private String nextPlatform;
    /**
     * 创建时间
     */
    private LocalDateTime creatDate;
    /**
     * 修改时间
     */
    private Date modifyDate;
    /**
     * 是否有效
     */
    private String statue;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 加密盐
     */
    private String salt;

    /**
     * 备注
     */
    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getNextPlatform() {
        return nextPlatform;
    }

    public void setNextPlatform(String nextPlatform) {
        this.nextPlatform = nextPlatform;
    }

    public LocalDateTime getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(LocalDateTime creatDate) {
        this.creatDate = creatDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
