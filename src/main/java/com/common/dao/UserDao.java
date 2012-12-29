package com.common.dao;

import com.common.dao.custom.UserDaoCustom;
import com.common.domain.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 12-12-27
 * Time: 下午3:36
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao  extends PagingAndSortingRepository<User, Integer>,
        JpaSpecificationExecutor<User>,UserDaoCustom {
}
