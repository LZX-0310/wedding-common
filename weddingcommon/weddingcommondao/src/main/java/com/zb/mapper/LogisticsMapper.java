package com.zb.mapper;
import com.zb.pojo.Logistics;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogisticsMapper {

	public Logistics getLogisticsById(@Param(value = "id") Integer id)throws Exception;

	public List<Logistics>	getLogisticsListByMap(Map<String,Object> param)throws Exception;

	public Integer getLogisticsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertLogistics(Logistics logistics)throws Exception;

	public Integer updateLogistics(Logistics logistics)throws Exception;

	public Integer deleteLogisticsById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteLogistics(Map<String,List<String>> params);

}
