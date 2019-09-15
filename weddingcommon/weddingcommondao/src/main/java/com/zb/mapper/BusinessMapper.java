package com.zb.mapper;

import com.zb.pojo.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BusinessMapper {
    //唯一查
	public Business getBusinessById(@Param(value = "id") Integer id)throws Exception;
    //全部查
	public List<Business>	getBusinessListByMap(Map<String, Object> map)throws Exception;
    //查询次数
	public Integer getBusinessCountByMap(Map<String, Object> map)throws Exception;
     //商家信息管理之添加
	public Integer insertBusiness(Business business)throws Exception;

	//商家审核
	public Integer updateBusiness(Business business)throws Exception;

	public Integer deleteBusinessById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteBusiness(Map<String, List<String>> params);
	//商家处罚
	public Integer updateBusinessFraction(@Param(value = "cffraction")Integer cffraction,@Param(value = "id")Integer id)throws Exception;

}
