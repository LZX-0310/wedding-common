package com.zb.mapper;

import com.zb.pojo.Yysdl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface YysdlMapper {
    //运行商登录
    public Yysdl getloginYysdl(Yysdl yysdl)throws Exception;

    //管理员列表
    public List<Yysdl>FindYysdlAll(Map<String,Object>map)throws  Exception;

    public  int getYysdlCount(Map<String,Object>map)throws Exception;

    //根据账户名唯一查
    public  Yysdl getYysdlgetusername(@Param("username")String username)throws Exception;


    //管理员添加
    public int insertYysdl(Yysdl yysdl)throws Exception;

}
