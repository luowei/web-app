package com.common.service.impl;

import com.common.dao.UserDao;
import com.common.domain.User;
import com.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 12-12-27
 * Time: 下午4:12
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public List<User> list() {

        return (List<User>)userDao.findAll();
    }

    @Override
    public List<User> customList() {

        return userDao.list();
    }
}
