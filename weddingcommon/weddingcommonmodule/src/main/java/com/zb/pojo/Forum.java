package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   论坛表
*/
public class Forum implements Serializable {
    //编号
    private Integer id;
    //引用账户类型id  发帖人
    private Integer userid;
    //标题
    private String title;
    //内容
    private String content;
    //回帖数
    private Integer sum;
    //点赞数
    private Integer num;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setUserid (Integer  userid){
        this.userid=userid;
    }
    public  Integer getUserid(){
        return this.userid;
    }
    public void setTitle (String  title){
        this.title=title;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setSum (Integer  sum){
        this.sum=sum;
    }
    public  Integer getSum(){
        return this.sum;
    }
    public void setNum (Integer  num){
        this.num=num;
    }
    public  Integer getNum(){
        return this.num;
    }
}
