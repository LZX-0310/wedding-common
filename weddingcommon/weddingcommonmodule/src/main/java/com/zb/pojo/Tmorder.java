package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   临时订单表
*/
public class Tmorder implements Serializable {
    //编号
    private Integer id;
    //临时订单号
    private String tmorderid;
    //商品数量
    private Integer num;
    //引用订单id表(如果是已付款必须有订单编号)
    private Integer orderid;
    //1未付款2已付款
    private Integer state;
    //引用商品id
    private String commodityid;
    //型号
    private String model;
    //下单时间
    private Date time;
    //用户Id
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
    public void setTmorderid (String  tmorderid){
        this.tmorderid=tmorderid;
    }
    public  String getTmorderid(){
        return this.tmorderid;
    }
    public void setNum (Integer  num){
        this.num=num;
    }
    public  Integer getNum(){
        return this.num;
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
    public void setCommodityid (String  commodityid){
        this.commodityid=commodityid;
    }
    public  String getCommodityid(){
        return this.commodityid;
    }
    public void setModel (String  model){
        this.model=model;
    }
    public  String getModel(){
        return this.model;
    }
    public void setTime (Date  time){
        this.time=time;
    }
    public  Date getTime(){
        return this.time;
    }
}
