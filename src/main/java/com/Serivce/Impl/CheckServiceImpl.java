package com.Serivce.Impl;

import com.DAO.CheckDAO;
import com.DAO.Impl.Checkimpl;
import com.Serivce.CheckService;
import domain.Comit;

public class CheckServiceImpl implements CheckService {
    private CheckDAO CheckDAO =new Checkimpl();
    @Override
    public Boolean OK(Comit comitDo) {
        Boolean ok = CheckDAO.OK(comitDo);
        return ok;
    }
    @Override
    public int NO(Comit comitDo) {
        int no = CheckDAO.NO(comitDo);
        return no;

    }
}
