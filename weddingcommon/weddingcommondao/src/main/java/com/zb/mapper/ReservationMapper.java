package com.zb.mapper;
import com.zb.pojo.Reservation;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper {

	public Reservation getReservationById(@Param(value = "id") Integer id)throws Exception;

	public List<Reservation>	getReservationListByMap(Map<String,Object> param)throws Exception;

	public Integer getReservationCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertReservation(Reservation reservation)throws Exception;

	public Integer updateReservation(Reservation reservation)throws Exception;

	public Integer deleteReservationById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteReservation(Map<String,List<String>> params);

}
