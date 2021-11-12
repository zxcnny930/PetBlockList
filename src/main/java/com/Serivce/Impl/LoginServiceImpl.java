package com.Serivce.Impl;

import com.DAO.Impl.LoginDaoImpl;
import com.DAO.LoginDao;
import com.Serivce.LoginService;
import domain.Login;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginServiceImpl implements LoginService {
    @Override
    public Login Login(Login login) {
        LoginDao dao = new LoginDaoImpl();
        return dao.Login(login);
    }
}
