package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   商品表
*/
public class Commodity implements Serializable {
    //编号
    private Integer id;
    //商品名称
    private String cname;
    //商品价格
    private double price;
    //商品描述
	private String describ;
	//商品状态1上架2下架
	private Integer state;
	//标题
	private String title;
    //商家id
	private  Integer businessid;
	//折扣价格
	private  Integer zkprice;
	//商品类型
	private  Integer xtypeid;
	//和es同步
	private String timestamp;
	//添加时间
	private String date;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getXtypeid() {
		return xtypeid;
	}

	public void setXtypeid(Integer xtypeid) {
		this.xtypeid = xtypeid;
	}


	public Integer getZkprice() {
		return zkprice;
	}

	public void setZkprice(Integer zkprice) {
		this.zkprice = zkprice;
	}

	public Integer getBusinessid() {
		return businessid;
	}

	public void setBusinessid(Integer businessid) {
		this.businessid = businessid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescrib() {
		return describ;
	}

	public void setDescrib(String describ) {
		this.describ = describ;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}