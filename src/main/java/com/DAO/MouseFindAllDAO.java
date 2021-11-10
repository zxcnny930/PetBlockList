package com.DAO;

import domain.BlockList;
import domain.Comit;

import java.util.List;

public interface MouseFindAllDAO {
    public List <BlockList> MouseFindAll();

    List<BlockList> DogFindAll();

    List<BlockList> CatFindAll();

    List<Comit> ComitAll();
}
