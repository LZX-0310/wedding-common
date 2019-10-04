package com.zb.service;
import com.zb.pojo.User;
import java.util.Map;

public interface UserService {
    /**
     * 注册
     */
    public int addUser(User user) throws Exception;
    /**
     * 登录
     */
    public User loginUser(Map<String, Object> map) throws Exception;

    /**
     * 忘记密码（根据手机号查询用户）
     */
    public User getUserByPhone(String phone) throws Exception;

    /**
     * 修改密码(修改个人信息)
     */
    public int  updatePassword(User user) throws Exception;
    /**
     *查看个人信息
     */

    public User getUserById(Integer id) throws Exception;
    /**
     * 注销用户信息
     */
    public int deleteUser(Integer id) throws Exception;

    /**
     * 短信验证
     */
    public int sendSms(String phone)throws Exception;

    /**
     * 短信提取
     */
    public Map<String,Object> getSms()throws Exception;
    /**
     * 验证账号是否存在
     */

    public User getUserByNumber(String number)throws Exception;
}
