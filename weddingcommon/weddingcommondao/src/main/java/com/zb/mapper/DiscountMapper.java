package com.zb.mapper;

import com.zb.pojo.Discount;
import org.apache.ibatis.annotations.Mapper;

/**
 * 折扣表Mapper
 */
@Mapper
public interface DiscountMapper {
    //优惠卷添加方法
    public   int insetdiscount(Discount discount)throws Exception;
}
