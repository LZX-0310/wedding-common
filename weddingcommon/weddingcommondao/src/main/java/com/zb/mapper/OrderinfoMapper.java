package com.zb.mapper;
import com.zb.pojo.Orderinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderinfoMapper {
    //唯一查
	public Orderinfo getOrderinfoById(@Param(value = "orderid") Integer orderid)throws Exception;

	//全部查
	public List<Orderinfo>	getOrderinfoListByMap(Map<String,Object> param)throws Exception;
    //查次数
	public Integer getOrderinfoCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOrderinfo(Orderinfo orderinfo)throws Exception;

	public Integer updateOrderinfo(Orderinfo orderinfo)throws Exception;

	public Integer deleteOrderinfoById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteOrderinfo(Map<String,List<String>> params)throws Exception;

	public Integer updateState(Orderinfo orderinfo)throws Exception;

	public Integer updateLogisticsid(Orderinfo orderinfo)throws Exception;

	public Integer updateAddress(Orderinfo orderinfo)throws Exception;

}
