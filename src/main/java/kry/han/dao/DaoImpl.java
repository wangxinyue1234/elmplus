package kry.han.dao;

import java.util.List;

//接口
public interface DaoImpl<T>{
    public abstract Boolean deleteByPrimarykey(Integer id);
    T selectByPrimarykey(Integer id);
    List<T> selsctAll();
    Boolean insertSelective(T obj);
    Boolean updateSelective(T obj);

}
