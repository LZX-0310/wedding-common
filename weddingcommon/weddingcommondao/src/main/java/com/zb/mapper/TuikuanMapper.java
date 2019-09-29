package com.zb.mapper;

import com.zb.vo.TuikuanVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TuikuanMapper {
    public List<TuikuanVo>FindTuikuanAll(Map<String,Object>map)throws  Exception;

    public  int getTuikuanCount(Map<String,Object>map)throws Exception;
}
