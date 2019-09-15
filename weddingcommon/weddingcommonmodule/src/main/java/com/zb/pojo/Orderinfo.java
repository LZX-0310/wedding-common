package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   订单表
*/
public class Orderinfo implements Serializable {
	//编号
	private Integer id;
	//订单编号
	private String orderid;
	//收货地址
	private String address;
	//手机号
	private String phone;
	//用户id
	private String userid;
	//订单状态(1未发货2已发货3已签收)
	private Integer state;
	//下单时间
	private String datetime;
	//总价
	private double price ;
	//备注
	private String remrks;
	//运费
	private double freight;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRemrks() {
		return remrks;
	}

	public void setRemrks(String remrks) {
		this.remrks = remrks;
	}

	public double getFreight() {
		return freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}
}