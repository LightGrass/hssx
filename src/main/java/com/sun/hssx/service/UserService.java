package com.sun.hssx.service;

import com.sun.hssx.bean.Result;
import com.sun.hssx.bean.User;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/2 16:47
 * description:
 */
public interface UserService {

    /**
     * 登陆业务方法
     * @param user
     * @return
     */
    Result login(User user);
}