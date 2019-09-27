package com.zb.vo;

public class SearchParam {
    private String key;
    private Integer xtypeid;
    private Integer xtype;
    private Integer index;
    private Integer size;

    public Integer getXtype() {
        return xtype;
    }

    public void setXtype(Integer xtype) {
        this.xtype = xtype;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getXtypeid() {
        return xtypeid;
    }

    public void setXtypeid(Integer xtypeid) {
        this.xtypeid = xtypeid;
    }

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
}
