package com.zb.vo;

import com.zb.pojo.Commodity;

import java.io.Serializable;

/**
 * 商品销量表
 */
public class Xlvo implements Serializable {
    //商品编号
    private  Integer commodityid;
    //商品总销量
    private  Integer  sumsale;
    //商品对象
    private String cname;


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getSumsale() {
        return sumsale;
    }

    public void setSumsale(Integer sumsale) {
        this.sumsale = sumsale;
    }
}

