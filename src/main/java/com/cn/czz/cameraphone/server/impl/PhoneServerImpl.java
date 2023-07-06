package com.cn.czz.cameraphone.server.impl;

import com.alibaba.druid.util.StringUtils;
import com.cn.czz.cameraphone.mapper.PhoneMapper;
import com.cn.czz.cameraphone.model.Phone;
import com.cn.czz.cameraphone.server.IPhoneServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName PhomeImpl
 * @Description TODO
 * @Author Czz
 * @Date 2023/6/7 17:32
 * @Version 1.0
 **/
@Service
public class PhoneServerImpl implements IPhoneServer {

    private Logger log = LoggerFactory.getLogger(PhoneServerImpl.class);


    @Resource
    private PhoneMapper phoneMapper;

    @Override
    public void saveInfo(Phone phone) {

        String ID = phoneMapper.selectInfo(phone);
        if (StringUtils.isEmpty(ID)) {
            UUID uuid = UUID.randomUUID();
            phone.setID(uuid.toString());
            phone.setCLIENT_SUM(1);
            phoneMapper.saveInfo(phone);
        } else {
            phone.setID(ID);
            phoneMapper.upDataInfo(phone);
        }

    }
}
