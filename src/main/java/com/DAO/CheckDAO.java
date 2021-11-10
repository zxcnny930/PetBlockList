package com.DAO;

import domain.Comit;

public interface CheckDAO {
    Boolean OK(Comit comitDo);
    int  NO(Comit comitDo);
}
