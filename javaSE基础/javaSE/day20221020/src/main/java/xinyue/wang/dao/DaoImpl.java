package xinyue.wang.dao;

import java.util.List;

public interface DaoImpl<T> {
    public abstract Boolean deleteByPrimaryKey(Integer id);
    T selectByPrimaryKey(Integer id);
    List<T> selectAll();
    Boolean insertSelective(T obj);
    Boolean updateSelective(T obj);
}