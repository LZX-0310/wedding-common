package com.zb.vo;

import java.io.Serializable;

/**
 * 已支付待支付统计表
 */
public class JeVo implements Serializable {
    private  Integer je;//金额
    private  Integer state;//状态 1.未付款2.已付款

    public Integer getJe() {
        return je;
    }

    public void setJe(Integer je) {
        this.je = je;
    }
}
