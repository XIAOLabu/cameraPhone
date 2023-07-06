package com.cn.czz.cameraphone.mapper;

import com.cn.czz.cameraphone.model.Phone;
import org.springframework.stereotype.Service;

/**
 * @ClassName PhoneMapper
 * @Description TODO
 * @Author Czz
 * @Date 2023/6/7 17:32
 * @Version 1.0
 **/
@Service
public interface PhoneMapper {

    public void saveInfo(Phone phone);

    public String selectInfo(Phone phone);

    public void upDataInfo(Phone phone);
}
