package com.zb.mapper;

import com.zb.pojo.ForumPhoto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ForumPhotoMapper {

    //上传图片
    public int insertPhoto(ForumPhoto forumPhoto);

    //根据论坛id查找图片
    public List<ForumPhoto> getforumPhotoByFid(@Param ("fid") Integer fid);

    //根据论坛id删除图片
    public int deletePhone(@Param ("fid")Integer fid);
}
