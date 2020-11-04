package com.sun.hssx.service.impl;

import com.sun.hssx.bean.Result;
import com.sun.hssx.bean.User;
import com.sun.hssx.mapper.UserMapper;
import com.sun.hssx.service.UserService;
import com.sun.hssx.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/2 16:54
 * description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(User user) {

        //1.账号密码加密处理
        String newPwd = DigestUtils.md5DigestAsHex(
                (user.getuPassword()+ Constants.SALT).getBytes());
        user.setuPassword(newPwd);
        //2.查询
        User retUser = userMapper.queryUser(user);
        //3.返回结果
        Result result = new Result();
        if (retUser != null) {
            //查询成功 设置返回状态为1
            result.setCode(1);
            result.setData(retUser);
        }else {
            result.setCode(0);
        }
        return result;
    }
}
