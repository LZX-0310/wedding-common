package com.zb.vo;

import java.io.Serializable;

/**
 * 商品销量表
 */
public class Xlvo implements Serializable {
    //商品编号
    private  Integer commodityid;
    //商品总销量
    private  Integer  sumsale;


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

