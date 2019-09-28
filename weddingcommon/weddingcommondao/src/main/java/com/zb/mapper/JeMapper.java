package com.zb.mapper;

import com.zb.vo.JeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface JeMapper {
    //查询待支付和已支付
    public JeVo getje(@Param("state") Integer state)throws Exception;
    //查询退款总金额
    public  JeVo getTuikuanje(@Param("state") Integer state)throws Exception;
}
