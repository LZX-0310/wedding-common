package com.zb.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderId {

    //生成订单编号
    public String getOrderId(String i){
        Random random = new Random();
        Integer shu = random.nextInt(1000000);
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String date = df.format(new Date());
        String orderid = date+shu;

            orderid = i+orderid;

        return orderid;
    }


}
