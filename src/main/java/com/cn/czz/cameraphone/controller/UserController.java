package com.cn.czz.cameraphone.controller;

import com.cn.czz.cameraphone.model.UserInfo;
import com.cn.czz.cameraphone.server.IUserServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @ClassName 用户管理
 * @Description TODO
 * @Author Czz
 * @Date 2023/7/3 15:52
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    IUserServer userServer;

    private Logger log = LoggerFactory.getLogger(UserController.class);

    @PostMapping(value = "/login")
    public String index(UserInfo user, Model model) {
        log.info("====>{}编号的用户登录校验", user.getUserNo());
        Boolean userSign = userServer.existUserInfo(user);
        if (userSign){
            return "index";
        }else{
            model.addAttribute("msg","用户未注册，或者用户密码错误");
            return "error";
        }
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insertUserInfo(UserInfo user, Model model){
        log.info("====>用户注册信息{}", user.toString());
        Map<String, String> msgMap
                = userServer.insertUserInfo(user);
        String code = msgMap.get("code");
        model.addAttribute("msg", msgMap.get("msg"));
        if ("0000".equals(code)){
            return "login";
        } else {
            return "error";
        }
    }
}
