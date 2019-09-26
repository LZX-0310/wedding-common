package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   商家表
*/
public class Business implements Serializable {
    //编号
    private Integer id;
    //账号
    private String number;
    //密码
    private String password;
    //店铺名称
    private String accout;
    //分数
    private Integer fraction;
    //商家地址
    private String address;
    //1已通过2待审核3已注销
    private Integer state;
    //注册时间
    private  String datetime;

    //get set 方法

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setNumber (String  number){
        this.number=number;
    }
    public  String getNumber(){
        return this.number;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setAccout (String  accout){
        this.accout=accout;
    }
    public  String getAccout(){
        return this.accout;
    }
    public void setFraction (Integer  fraction){
        this.fraction=fraction;
    }
    public  Integer getFraction(){
        return this.fraction;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
