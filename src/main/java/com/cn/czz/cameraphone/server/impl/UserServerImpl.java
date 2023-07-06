package com.cn.czz.cameraphone.server.impl;

import com.cn.czz.cameraphone.mapper.UserMapper;
import com.cn.czz.cameraphone.model.UserInfo;
import com.cn.czz.cameraphone.server.IUserServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

import static com.cn.czz.cameraphone.util.CipherUtil.generatePasswd;

/**
 * @ClassName UserServerImpl
 * @Description TODO
 * @Author Czz
 * @Date 2023/7/3 16:00
 * @Version 1.0
 **/
@Service
public class UserServerImpl implements IUserServer {

    @Resource
    UserMapper userMapper;

    public Boolean existUserInfo(UserInfo user){
        String pwd = generatePasswd(user.getPassWord());
        Boolean sign = false;
        UserInfo userHouse = userMapper.selectUser(user.getUserNo());
        if (userHouse != null && userHouse.getPassWord().equals(pwd)) {
            sign = true;
        }
        return sign;
    }

    public Map<String, String> insertUserInfo(UserInfo user){
        Map<String, String> msgMap = new HashMap<>();
        String msg = "";
        String code = "";
        user.setLevel(1);
        String userName = user.getUserName();
        String userNo = user.getUserNo();
        user.setPassWord(generatePasswd(user.getPassWord()));
        Integer row = userMapper.insertUserInfo(user);
        if (row == 1){
            code = "0000";
            msg = "恭喜【" + userName + "】用户注册成功!您的登录账号为："+ userNo;
        } else {
            code = "0009";
            msg = "很遗憾~【" + userName + "】用户注册失败，请确认信息后重新注册";
        }
        msgMap.put("msg", msg);
        msgMap.put("code", code);
        return msgMap;
    }

}
