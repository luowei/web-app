package com.common.dao.custom.impl;

import com.common.dao.custom.UserDaoCustom;
import com.common.domain.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 12-12-27
 * Time: 下午3:59
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDaoCustom {

    public List<User> list() {
        String sql = "select * from user";
       return getJdbcTemplate().query(sql,new UserRowMapper());
    }

    private class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("sex"),
                    rs.getInt("age"),
                    rs.getString("address"),
                    rs.getString("profile"));
            return user;
        }
    }
}
