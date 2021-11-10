package com.DAO.Impl;

import Utils.JDBCUtils;
import com.DAO.ComitDAO;
import domain.Comit;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ComitImpl implements ComitDAO {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public boolean Comits(Comit comitDo) {
        String sql = "insert into comit(pet,name,gender,location,date,phone,prove)"
                + "values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                comitDo.getPet(),
                comitDo.getName(),
                comitDo.getGender(),
                comitDo.getLocation(),
                comitDo.getDate(),
                comitDo.getPhone(),
                comitDo.getProve()
        );
        return true;
    }
}
