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