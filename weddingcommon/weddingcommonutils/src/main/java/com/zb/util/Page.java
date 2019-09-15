package com.zb.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
*分页
* */
public class Page<T> implements Serializable
{
    //当前页
    private Integer index;
    //显示条目数
    private Integer size;
    //总页数
    private Integer total;
    //总记录数
    private Integer count;
    //数据
    private List<T> list =new ArrayList<T>();

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
            this.total = this.count%this.size==0?this.count/this.size:this.count/this.size+1;
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
