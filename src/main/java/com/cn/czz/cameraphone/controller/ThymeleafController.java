package com.cn.czz.cameraphone.controller;

import com.cn.czz.cameraphone.model.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ThymeleafController
 * @Description TODO
 * @Author Czz
 * @Date 2023/6/25 11:45
 * @Version 1.0
 **/
@Controller
public class ThymeleafController {

    @RequestMapping(value = "/thymeleaf/index")
    public String index(UserInfo user) {
        String userNo = user.getUserNo();
        String passWord = user.getPassWord();
        return "index";
    }

    @RequestMapping(value = "/thymeleaf/homepage")
    public String homepage(Model model) {
        model.addAttribute("data", "SpringBoot 成功集成 Thymeleaf 模版！");
        return "index";
    }

    @RequestMapping(value = "/thymeleaf/templet")
    public String templet(Model model) {
        model.addAttribute("data", "SpringBoot 成功集成 Thymeleaf 模版！");
        return "templet";
    }

    @RequestMapping(value = "/thymeleaf/setmeal")
    public String setmeal(Model model) {
        model.addAttribute("data", "SpringBoot 成功集成 Thymeleaf 模版！");
        return "setmeal";
    }

    @RequestMapping(value = "/thymeleaf/login")
    public String login(Model model) {
        model.addAttribute("data", "SpringBoot 成功集成 Thymeleaf 模版！");
        return "login";
    }

    @RequestMapping(value = "/thymeleaf/register")
    public String register(Model model) {
        model.addAttribute("data", "SpringBoot 成功集成 Thymeleaf 模版！");
        return "register";
    }

}
