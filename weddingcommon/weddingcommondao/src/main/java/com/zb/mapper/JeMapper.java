package com.zb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface JeMapper {
    public  Integer getje(@Param("state") Integer state)throws Exception;
}
