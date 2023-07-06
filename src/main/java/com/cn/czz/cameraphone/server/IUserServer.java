package com.cn.czz.cameraphone.server;

import com.cn.czz.cameraphone.model.UserInfo;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName IUserServer
 * @Description TODO
 * @Author Czz
 * @Date 2023/7/3 15:59
 * @Version 1.0
 **/
@Service
public interface IUserServer {

    public Boolean existUserInfo(UserInfo user);

    public Map<String, String> insertUserInfo(UserInfo user);

}
