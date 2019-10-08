package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   退款表
*/
public class Refund implements Serializable {
    //编号
    private Integer id;
    //引用订单编号
    private Integer orderid;
    //状态(1只退款2退货退款)
    private Integer state;
    //1未寄回2已寄回3商家已签收
    private Integer details;
    //退货地址
    private String address;
    //引用商家id
    private Integer businessid;
    //引用用户id
    private Integer userid;
    //操作原因
    private  String yuanyin;



    //get set 方法


    public String getYuanyin() {
        return yuanyin;
    }

    public void setYuanyin(String yuanyin) {
        this.yuanyin = yuanyin;
    }

    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setOrderid (Integer  orderid){
        this.orderid=orderid;
    }
    public  Integer getOrderid(){
        return this.orderid;
    }
    public void setState (Integer  state){
        this.state=state;
    }
    public  Integer getState(){
        return this.state;
    }
    public void setDetails (Integer  details){
        this.details=details;
    }
    public  Integer getDetails(){
        return this.details;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setBusinessid (Integer  businessid){
        this.businessid=businessid;
    }
    public  Integer getBusinessid(){
        return this.businessid;
    }
    public void setUserid (Integer  userid){
        this.userid=userid;
    }
    public  Integer getUserid(){
        return this.userid;
    }
}
