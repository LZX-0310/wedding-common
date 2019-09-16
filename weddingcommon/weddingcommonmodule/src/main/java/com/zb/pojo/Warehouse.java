package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   仓库表
*/
public class Warehouse implements Serializable {
	//编号
	private Integer id;
	//引用商品表id
	private Integer commodityid;
	//库存量
	private Integer stock;
	//进货价
	private double price;
	//销售量
	private Integer sale;
	//进货量
	private  Integer purchase;
    //现有库存量
	private  Integer xystock;


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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(Integer commodityid) {
		this.commodityid = commodityid;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getSale() {
		return sale;
	}

	public void setSale(Integer sale) {
		this.sale = sale;
	}
}