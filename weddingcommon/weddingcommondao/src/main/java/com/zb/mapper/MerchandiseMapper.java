package com.zb.mapper;
import com.zb.pojo.Merchandise;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MerchandiseMapper {

	public Merchandise getMerchandiseById(@Param(value = "id") Integer id)throws Exception;

	public List<Merchandise>	getMerchandiseListByMap(Map<String,Object> param)throws Exception;

	public Integer getMerchandiseCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertMerchandise(Merchandise merchandise)throws Exception;

	public Integer updateMerchandise(Merchandise merchandise)throws Exception;

	public Integer deleteMerchandiseById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteMerchandise(Map<String,List<String>> params);

}
