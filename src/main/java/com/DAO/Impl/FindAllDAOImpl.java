package com.DAO.Impl;

import Utils.JDBCUtils;
import com.DAO.MouseFindAllDAO;
import domain.BlockList;
import domain.Comit;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class FindAllDAOImpl implements MouseFindAllDAO {
    private  JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<BlockList> MouseFindAll() {

        String sql = "select * from mouseblackuser";
        List<BlockList> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BlockList>(BlockList.class));
        return query;
    }

    @Override
    public List<BlockList> DogFindAll() {
        String sql = "select * from dogblackuser";
        List<BlockList> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BlockList>(BlockList.class));
        return query;
    }

    @Override
    public List<BlockList> CatFindAll() {
        String sql = "select * from catblackuser";
        List<BlockList> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BlockList>(BlockList.class));
        return query;
    }

    @Override
    public List<Comit> ComitAll() {
        String sql = "select * from comit";
        List<Comit> query = null;
        try {
            query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Comit>(Comit.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return query;
    }
}
