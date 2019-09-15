package com.zb.mapper;

import com.zb.pojo.Refund;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface RefundMapper {

	public Refund getRefundById(@Param(value = "id") Integer id)throws Exception;

	public List<Refund>	getRefundListByMap(Map<String, Object> map)throws Exception;

	public Integer getRefundCountByMap(Map<String, Object> map)throws Exception;
	public Integer updateRefund(Refund refund)throws Exception;




	public Integer insertRefund(Refund refund)throws Exception;
	public Integer deleteRefundById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteRefund(Map<String, List<String>> params);

}
