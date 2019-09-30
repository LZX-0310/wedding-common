package com.zb.mapper;

import com.zb.vo.CwVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CwVoMapper {
    public List<CwVo>FindCwVoAll(Map<String,Object>map)throws Exception;

    public  int getCwVoCount(Map<String,Object>map)throws Exception;
    //根据商品编号查看过往记录
    public  List<CwVo>getCwVoByCommodity(Map<String,Object>map)throws Exception;

    public  int getCwVoCommodityCount(Map<String,Object>map)throws Exception;
}
