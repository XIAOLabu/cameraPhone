package com.cn.czz.cameraphone.mapper;

import com.cn.czz.cameraphone.model.UserInfo;
import org.apache.catalina.User;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author Czz
 * @Date 2023/7/3 15:56
 * @Version 1.0
 **/
public interface UserMapper {

    /**
     * 查询用户密码
     * @param UserNo
     * @return
     */
    UserInfo selectUser(String UserNo);

    Integer insertUserInfo(UserInfo user);
}
