package com.zb.pojo;

import java.io.Serializable;

/**
 * 折扣表
 */
public class Discount  implements Serializable {
    private  Integer id;
    private  Integer userid;
    private  Integer commodityid;
    private  Integer price;
    private  Integer state;
    private  Integer commdoityprice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCommdoityprice() {
        return commdoityprice;
    }

    public void setCommdoityprice(Integer commdoityprice) {
        this.commdoityprice = commdoityprice;
    }
}
