package com.cn.czz.cameraphone.model;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author Czz
 * @Date 2023/6/7 17:28
 * @Version 1.0
 **/
@Data
public class Phone {

    private String ID;

    //客户端IP地址
    private String CLIENT_IP;

    //设备号
    private String CLIENT_NO;

    //设备手机号
    private String CLIENT_PHONE;

    //设备使用次数
    private Integer CLIENT_SUM;

}
