package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   用户表11
*/
public class User implements Serializable {
	//编号
	private Integer id;
	//姓名
	private String uname;
	//所在地区
	private String address;
	//积分
	private Integer integral;
	//生日
	private String birthday;
	//手机号
	private String phone;
	//账号
	private String number;
	//密码
	private String password;
	//账号名称
	private String accout;
	//性别
	private Integer sex;
	//注册日期
	private String date;
	//1表示正常2注销3黑名单
    private Integer state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccout() {
		return accout;
	}

	public void setAccout(String accout) {
		this.accout = accout;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}