package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   物流表
*/
public class Logistics implements Serializable {
    //编号
    private Integer id;
    //物流名称
    private String lname;
    //物流编号
    private String logisticsId;
    //订单编号
    private Integer orderid;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setLname (String  lname){
        this.lname=lname;
    }
    public  String getLname(){
        return this.lname;
    }
    public void setLogisticsId (String  logisticsId){
        this.logisticsId=logisticsId;
    }
    public  String getLogisticsId(){
        return this.logisticsId;
    }
    public void setOrderid (Integer  orderid){
        this.orderid=orderid;
    }
    public  Integer getOrderid(){
        return this.orderid;
    }
}
