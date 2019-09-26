package com.zb.mapper;
import com.zb.pojo.Type;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeMapper {

	public Type getTypeById(@Param(value = "id") Integer id)throws Exception;

	public List<Type> getTypeListByMap()throws Exception;

	public Integer getTypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertType(Type type)throws Exception;

	public Integer updateType(Type type)throws Exception;

	public Integer deleteTypeById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteType(Map<String,List<String>> params);

	public List<Type> listTypeGet(@Param("id")Integer id)throws Exception;

}
