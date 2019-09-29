package com.zb.vo;

import java.io.Serializable;

/**
 * 评价vo
 */
public class PjVo implements Serializable {
    public  Integer id;//评价id
    public  String content;//评价内容
    public  String reply;//回复内容
    public  String etime;//创建时间
    public Integer el;//1好 2.中3差
    public  String orderid;//订单编号
    public  String cname;//商品名称


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public Integer getEl() {
        return el;
    }

    public void setEl(Integer el) {
        this.el = el;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
