package com.cn.czz.cameraphone.model;

import lombok.Data;

/**
 * @ClassName UserInfo
 * @Description TODO
 * @Author Czz
 * @Date 2023/6/28 18:15
 * @Version 1.0
 **/
@Data
public class UserInfo {
    private String userNo;
    private String passWord;
    private String userName;
    private String userPhone;
    private Integer level;
}
