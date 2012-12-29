package com.common.service;

import com.common.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 12-12-27
 * Time: 下午4:11
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {

    List<User> list();

    List<User> customList();
}
