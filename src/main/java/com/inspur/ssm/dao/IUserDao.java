package com.inspur.ssm.dao;


import com.inspur.ssm.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface IUserDao {
    void insertUser(User user);

    User selectByPrimaryKey(int userId);

    void updateUser(User user);
}
