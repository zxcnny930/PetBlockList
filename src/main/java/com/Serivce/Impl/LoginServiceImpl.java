package com.Serivce.Impl;

import com.DAO.Impl.LoginDaoImpl;
import com.DAO.LoginDao;
import com.Serivce.LoginService;
import domain.Login;

public class LoginServiceImpl implements LoginService {
    LoginDao dao = new LoginDaoImpl();
    @Override
    public boolean Login(Login login) {
        return dao.Login(login);
    }
}
