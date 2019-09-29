package com.zb.mapper;
import com.zb.pojo.Warehouse;
import com.zb.vo.Xlvo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WarehouseMapper {
	//唯一查
	public Warehouse getWarehouseById(@Param(value = "id") Integer id)throws Exception;
     //全部查
	public List<Warehouse>	getWarehouseListByMap(Map<String,Object> map)throws Exception;

   //查次数
	public Integer getWarehouseCountByMap(Map<String,Object> map)throws Exception;
    //添加
	public Integer insertWarehouse(Warehouse warehouse)throws Exception;
    //修改
	public Integer updateWarehouse(Warehouse warehouse)throws Exception;

	public Integer deleteWarehouseById(@Param(value = "id") Integer id)throws Exception;

    //查销量
	public List<Xlvo>getXl()throws Exception;
}
