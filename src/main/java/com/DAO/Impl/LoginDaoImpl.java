package com.DAO.Impl;

import Utils.JDBCUtils;
import com.DAO.LoginDao;
import domain.Login;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LoginDaoImpl implements LoginDao {
    private  JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public Login Login(Login login) {
        Login user = null;
        try {

            String sql = "select * from admin where account = ? and password = ?";

            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Login>(Login.class), login.getAccount(),login.getPassword());
        } catch (Exception e) {

        }

        return user;
    }
}
