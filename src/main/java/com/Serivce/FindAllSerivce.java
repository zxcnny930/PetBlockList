package com.Serivce;

import domain.BlockList;
import domain.Comit;

import java.util.List;

public interface FindAllSerivce {
    public List<BlockList> mouseFindAll();

    List<BlockList> DogFinfAll();

    List<BlockList> CatFindAll();

    List<Comit> comitList();
}
