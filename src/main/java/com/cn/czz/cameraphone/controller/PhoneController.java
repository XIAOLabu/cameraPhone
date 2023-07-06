package com.cn.czz.cameraphone.controller;

import com.alibaba.druid.util.StringUtils;
import com.cn.czz.cameraphone.model.Phone;
import com.cn.czz.cameraphone.server.IPhoneServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName PhoneController
 * @Description TODO
 * @Author Czz
 * @Date 2023/6/7 17:33
 * @Version 1.0
 **/
@RestController
@RequestMapping("/phone")
public class PhoneController {

    private Logger log = LoggerFactory.getLogger(PhoneController.class);

    @Resource
    private IPhoneServer phoneServer;

    @PostMapping("/saveInfo")
    @ResponseBody
    public void saveInfo(String CLIENT_IP, String CLIENT_NO, String CLIENT_PHONE) {
        Phone phone = new Phone();
        phone.setCLIENT_PHONE(CLIENT_PHONE);
        phone.setCLIENT_NO(CLIENT_NO);
        phone.setCLIENT_IP(CLIENT_IP);
        log.info("开始写入设备信息,{}", phone);
        try {
            phoneServer.saveInfo(phone);
        } catch (Exception e) {
            log.error("写入出错");
            e.printStackTrace();
        } finally {
            log.info("写入完毕");
        }
    }

}
