package com.zb.mapper;
import com.zb.pojo.Replies;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RepliesMapper {

	public List<Replies> getRepliesByFid(@Param(value = "fid") Integer fid)throws Exception;

	public Integer insertReplies(Replies replies)throws Exception;

}
