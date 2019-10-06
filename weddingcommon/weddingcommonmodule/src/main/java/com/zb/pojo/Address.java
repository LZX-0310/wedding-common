package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   地址表
*/
public class Address implements Serializable {
    //编号
    private Integer id;
    //收件人
    private String name;
    //收货地址
    private String address;
    //联系电话
    private String phone;
    //邮编
    private Integer post;
    //用户id
    private Integer userid;
    //get set 方法

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setPost (Integer  post){
        this.post=post;
    }
    public  Integer getPost(){
        return this.post;
    }
}
