package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   回帖表
*/
public class Replies implements Serializable {
    //编号
    private Integer id;
    //引用用户编号
    private Integer userid;
    //回帖内容
    private String content;
    //引用论坛id
    private Integer forumid;
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
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setForumid (Integer  forumid){
        this.forumid=forumid;
    }
    public  Integer getForumid(){
        return this.forumid;
    }
}
