package com.DAO.Impl;

import Utils.JDBCUtils;
import domain.Login;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LoginDaoImpl implements com.DAO.LoginDao {
    private  JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public boolean Login(Login login) {
        String sql = "select *from admin where=account and password";
        List<Login> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Login>(Login.class));
        if (query.size()>0){
            return true;
        }else
            return false;
    }
}
