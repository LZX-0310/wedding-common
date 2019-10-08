package com.zb.mapper;

import com.zb.vo.PjVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PjVoMapper {
    public List<PjVo>FindPjVoAll(Map<String,Object>map)throws  Exception;

    public  int getPjVoCount(Map<String,Object>map)throws Exception;
}
