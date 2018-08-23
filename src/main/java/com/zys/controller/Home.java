package com.zys.controller;

import com.zys.dao.UserInfoMapper;
import com.zys.entitys.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Home {
    @Autowired
    UserInfoMapper userInfoMapper;
    @RequestMapping("/home.action")
    public void home(){
        List<UserInfo> userInfos = userInfoMapper.selectQuery();
        for (UserInfo userinfo: userInfos) {
            System.out.println("结果："+userinfo);
        }
    }
}
