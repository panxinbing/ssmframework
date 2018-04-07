package com.inspur.ssm.service.impl;


import com.inspur.ssm.dao.IUserDao;
import com.inspur.ssm.pojo.User;
import com.inspur.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LTN on 2016/7/13.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}