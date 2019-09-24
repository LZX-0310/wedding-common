package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   详细类型表
*/
public class Xtype implements Serializable {
    //编号
    private Integer id;
    //名称
    private String xname;
    //类型id
    private Integer typeid;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setXname (String  xname){
        this.xname=xname;
    }
    public  String getXname(){
        return this.xname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}
