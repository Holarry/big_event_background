package com.holary.service;

import com.holary.pojo.User;

/**
 * @Author: Holary
 * @Date: 2023/11/9 17:07
 * @Description: UserService
 */
public interface UserService {
    /**
     * description: 根据用户名查询用户, 用于判断用户是否存在
     *
     * @param username: 用户名
     * @return: com.holary.pojo.User
     */
    User findByUsername(String username);

    /**
     * description: 注册用户
     *
     * @param username: 用户名
     * @param password: 密码
     * @return: void
     */
    void register(String username, String password);
}