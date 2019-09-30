package com.zb.vo;

import java.io.Serializable;

public class CwVo implements Serializable {
    private  Integer id;
    private  Integer commodity;//商品id
    private  Integer stock;//初始库存
    private  Integer price ;//进货价
    private  Integer sale;//销售量
    private  Integer purchase;//进货量
    private  Integer xystock;//现有库存
    private  String updatetime;//修改时间
    private  String cname;//商品名称


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodity() {
        return commodity;
    }

    public void setCommodity(Integer commodity) {
        this.commodity = commodity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    public Integer getXystock() {
        return xystock;
    }

    public void setXystock(Integer xystock) {
        this.xystock = xystock;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
