package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Reservation implements Serializable {
	//编号
	private Integer id;
	//商家id
	private Integer merchandiseid;
	//预约人
	private String rname;
	//预约手机号
	private String rphone;
	//预约时间
	private String maketime;
	//下单时间
	private String ordertime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMerchandiseid() {
		return merchandiseid;
	}

	public void setMerchandiseid(Integer merchandiseid) {
		this.merchandiseid = merchandiseid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRphone() {
		return rphone;
	}

	public void setRphone(String rphone) {
		this.rphone = rphone;
	}

	public String getMaketime() {
		return maketime;
	}

	public void setMaketime(String maketime) {
		this.maketime = maketime;
	}

	public String getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
}