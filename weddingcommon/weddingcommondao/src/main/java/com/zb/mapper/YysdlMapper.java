package com.zb.mapper;

import com.zb.pojo.Yysdl;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YysdlMapper {
    //运行商登录
    public Yysdl getloginYysdl(Yysdl yysdl)throws Exception;


}
