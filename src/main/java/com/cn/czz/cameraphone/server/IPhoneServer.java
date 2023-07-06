package com.cn.czz.cameraphone.server;

import com.cn.czz.cameraphone.model.Phone;
import org.springframework.stereotype.Service;

/**
 * @ClassName IPhome
 * @Description TODO
 * @Author Czz
 * @Date 2023/6/7 17:32
 * @Version 1.0
 **/
@Service
public interface IPhoneServer {

    public void saveInfo(Phone phone);
}
