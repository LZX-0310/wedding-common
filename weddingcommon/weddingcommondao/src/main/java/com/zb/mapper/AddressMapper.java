package com.zb.mapper;
import com.zb.pojo.Address;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

/**
 * 地址表
 */
@Mapper
public interface AddressMapper {

	public Address getAddressById(@Param(value = "id") Integer id)throws Exception;

	public List<Address>	getAddressListByMap(Map<String,Object> param)throws Exception;

	public Integer getAddressCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertAddress(Address address)throws Exception;

	public Integer updateAddress(Address address)throws Exception;

	public Integer deleteAddressById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteAddress(Map<String,List<String>> params);

}
