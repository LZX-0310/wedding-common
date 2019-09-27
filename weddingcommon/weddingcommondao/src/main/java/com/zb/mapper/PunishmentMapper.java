package com.zb.mapper;

import com.zb.pojo.Punishment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PunishmentMapper {
    //商家处罚记录的添加
    public  int insertPunishment(Punishment punishment)throws Exception;
}
