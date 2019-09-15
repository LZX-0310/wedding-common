package com.zb.mapper;
import com.zb.pojo.Warehouse;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WarehouseMapper {

	public Warehouse getWarehouseById(@Param(value = "id") Integer id)throws Exception;

	public List<Warehouse>	getWarehouseListByMap(Map<String,Object> param)throws Exception;

	public Integer getWarehouseCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertWarehouse(Warehouse warehouse)throws Exception;

	public Integer updateWarehouse(Warehouse warehouse)throws Exception;

	public Integer deleteWarehouseById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteWarehouse(Map<String,List<String>> params);

}
