package com.Serivce.Impl;

import com.DAO.MouseFindAllDAO;
import com.DAO.Impl.FindAllDAOImpl;
import com.Serivce.FindAllSerivce;
import domain.BlockList;
import domain.Comit;

import java.util.List;

public class FindAllSerivceImpl implements FindAllSerivce {
   private MouseFindAllDAO DAO  = new FindAllDAOImpl();

    @Override
    public List<BlockList> mouseFindAll() {
        return DAO.MouseFindAll();
    }

    @Override
    public List<BlockList> DogFinfAll() {
        return DAO.DogFindAll();
    }

    @Override
    public List<BlockList> CatFindAll() {
        return DAO.CatFindAll();
    }

    @Override
    public List<Comit> comitList() {
        return DAO.ComitAll();
    }
}
