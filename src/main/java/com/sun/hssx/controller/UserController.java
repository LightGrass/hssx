package com.sun.hssx.controller;

import com.sun.hssx.bean.Result;
import com.sun.hssx.bean.User;
import com.sun.hssx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/2 15:29
 * description:处理用户模块的请求的controller
 */

/**
 * 设计项目路径
 * 协议：//ip/项目标识/模块标识/动作标识
 * 例子:https://localhost/store/user/logout
 */
@RestController
/**
 * 我们controller返回json数据
 */
@RequestMapping("user") //访问的路径
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("login")
    /**
     * 方法的形参 会自动被赋值
     */
    public Result login(User user){

        Result restult = userService.login(user);
        return restult;
    }
}
//访问路径：localhost/jxcc/user/login?uAccount=  &uPassword=