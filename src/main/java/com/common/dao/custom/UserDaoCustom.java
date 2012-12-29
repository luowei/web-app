package com.common.dao.custom;

import com.common.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 12-12-27
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 */
public interface UserDaoCustom extends BaseDao<User> {
    List<User> list();
}
