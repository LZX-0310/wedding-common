package com.zb.pojo;

import java.io.Serializable;

/**
 * 商家处罚表
 */
public class Punishment implements Serializable {
    private  Integer id;//处罚id
    private  Integer businessId;//商家id
    private  Integer punishmentfs;//处罚分数
    private  String yuanyin;//处罚原因
    private  String createtime;//处罚时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getPunishmentfs() {
        return punishmentfs;
    }

    public void setPunishmentfs(Integer punishmentfs) {
        this.punishmentfs = punishmentfs;
    }

    public String getYuanyin() {
        return yuanyin;
    }

    public void setYuanyin(String yuanyin) {
        this.yuanyin = yuanyin;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
