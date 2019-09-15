package com.zb.mapper;
import com.zb.pojo.Forum;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ForumMapper {

	public Forum getForumById(@Param(value = "id") Integer id)throws Exception;

	public List<Forum>	getForumListByMap(Map<String,Object> param)throws Exception;

	public Integer getForumCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertForum(Forum forum)throws Exception;

	public Integer updateForum(Forum forum)throws Exception;

	public Integer deleteForumById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteForum(Map<String,List<String>> params);

}
