package com.zb.mapper;
import com.zb.pojo.Replies;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RepliesMapper {

	public Replies getRepliesById(@Param(value = "id") Integer id)throws Exception;

	public List<Replies>	getRepliesListByMap(Map<String,Object> param)throws Exception;

	public Integer getRepliesCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertReplies(Replies replies)throws Exception;

	public Integer updateReplies(Replies replies)throws Exception;

	public Integer deleteRepliesById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteReplies(Map<String,List<String>> params);

}
