package com.Serivce.Impl;

import com.DAO.ComitDAO;
import com.DAO.Impl.ComitImpl;
import com.Serivce.ComitSerivce;
import domain.Comit;

public class ComitSerivceimpl implements ComitSerivce {
    private ComitDAO comitDAO = new ComitImpl();

    @Override
    public boolean Comits(Comit comitDo) {

        if(comitDo.getCheckBox1() != null && comitDo.getPet() != 0){
            boolean comits = comitDAO.Comits(comitDo);
            return true;
        }
        return false;
    }
}
