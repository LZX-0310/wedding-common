package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   评价表
*/
public class Evaluate implements Serializable {
    //编号
    private Integer id;
    //评价内容
    private String content;
    //回复内容
    private String reply;
    //引用订单表id
    private Integer orderid;
    //评价时间
    private Date etime;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setReply (String  reply){
        this.reply=reply;
    }
    public  String getReply(){
        return this.reply;
    }
    public void setOrderid (Integer  orderid){
        this.orderid=orderid;
    }
    public  Integer getOrderid(){
        return this.orderid;
    }
    public void setEtime (Date  etime){
        this.etime=etime;
    }
    public  Date getEtime(){
        return this.etime;
    }
}
