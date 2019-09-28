package com.zb.mapper;

import com.zb.vo.JeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface JeMapper {
    public JeVo getje(@Param("state") Integer state)throws Exception;
}
