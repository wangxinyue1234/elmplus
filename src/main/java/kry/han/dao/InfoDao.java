package kry.han.dao;

import kry.han.pojo.Business;
import kry.han.pojo.Info;

import java.util.List;

public class InfoDao implements DaoImpl<Info>{
    @Override
    public Boolean deleteByPrimarykey(Integer id) {
        return null;
    }

    @Override
    public Info selectByPrimarykey(Integer id) {
        return null;
    }

    @Override
    public List<Info> selsctAll() {
        return null;
    }

    @Override
    public Boolean insertSelective(Info obj) {
        return null;
    }

    @Override
    public Boolean updateSelective(Info obj) {
        return null;
    }
}
