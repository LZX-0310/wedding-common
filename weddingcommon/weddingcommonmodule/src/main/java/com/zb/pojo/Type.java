package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   类型表
*/
public class Type implements Serializable {
    //编号
    private Integer id;
    //名称
    private String tname;
    //类型id
    private Integer typeid;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setTname (String  tname){
        this.tname=tname;
    }
    public  String getTname(){
        return this.tname;
    }
}
