package com.DAO.Impl;

import Utils.JDBCUtils;
import com.DAO.CheckDAO;
import domain.Comit;
import org.springframework.jdbc.core.JdbcTemplate;

public class Checkimpl implements CheckDAO {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    String sql=sql = "DELETE FROM comit WHERE name=?";

    @Override
    public Boolean OK(Comit comitDo) {
        String sq = sql = "DELETE FROM comit WHERE name=?";
        int id = comitDo.getPet();
        String sql=null;
        if(id==1) {
         sql = "insert into catblackuser(name,gender,locantion,date,phone)"
                 +"values(?,?,?,?,?,?)";
            jdbcTemplate.update(sql,
                    comitDo.getName(),
                    comitDo.getGender(),
                    comitDo.getLocation(),
                    comitDo.getDate(),
                    comitDo.getPhone()
                    );
             jdbcTemplate.update(sq,comitDo.getName());
        }
        if(id==2) {
            sql = "insert into dogblackuser(name,gender,locantion,date,phone)"
                    +"values(?,?,?,?,?,?)";
            jdbcTemplate.update(sql,
                    comitDo.getName(),
                    comitDo.getGender(),
                    comitDo.getLocation(),
                    comitDo.getDate(),
                    comitDo.getPhone()
                    );
              jdbcTemplate.update(sq,comitDo.getName());
        }
        if(id==3) {
            sql = "insert into mouseblackuser(name,gender,locantion,date,phone)"
                    +"values(?,?,?,?,?,?)";
            jdbcTemplate.update(sql,
                    comitDo.getName(),
                    comitDo.getGender(),
                    comitDo.getLocation(),
                    comitDo.getDate(),
                    comitDo.getPhone()
            );
             jdbcTemplate.update(sq,comitDo.getName());
        }


        return false;
    }


    @Override
    public int NO(Comit comitDo) {
        int id = comitDo.getId();
        String sql=sql = "DELETE FROM comit WHERE id=?";

        int rows = jdbcTemplate.update(sql,id);

        return rows;

    }
}
