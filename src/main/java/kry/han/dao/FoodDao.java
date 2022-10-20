package kry.han.dao;

import kry.han.pojo.Business;
import kry.han.pojo.Food;

import java.util.List;

public class FoodDao implements DaoImpl<Food>{
    @Override
    public Boolean deleteByPrimarykey(Integer id) {
        return null;
    }

    @Override
    public Food selectByPrimarykey(Integer id) {
        return null;
    }

    @Override
    public List<Food> selsctAll() {
        return null;
    }

    @Override
    public Boolean insertSelective(Food obj) {
        return null;
    }

    @Override
    public Boolean updateSelective(Food obj) {
        return null;
    }
}
