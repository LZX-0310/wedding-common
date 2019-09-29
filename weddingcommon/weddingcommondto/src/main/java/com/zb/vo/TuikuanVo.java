package com.zb.vo;

import java.io.Serializable;

/**
 * 退款表vo
 */
public class TuikuanVo implements Serializable {
    private  Integer id;//退款id
    private  Integer businessid;//商家意见
    private  Integer state;//买家意见
    private  Integer details;//商品状态
    private  String address;//退货地址
    private  String yuanyin;//操作原因
    private  String orderid;//订单编号
    private  String uname;//用户姓名
    private  String phone;//用户手机号


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDetails() {
        return details;
    }

    public void setDetails(Integer details) {
        this.details = details;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYuanyin() {
        return yuanyin;
    }

    public void setYuanyin(String yuanyin) {
        this.yuanyin = yuanyin;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
