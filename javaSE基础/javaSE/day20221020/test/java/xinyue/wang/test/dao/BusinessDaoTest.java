package xinyue.wang.test.dao;

import org.junit.Test;
import xinyue.wang.dao.BusinessDao;

public class BusinessDaoTest {
    @Test
    public void testDeleteOne(){
        BusinessDao businessDao = new BusinessDao();
        Boolean aBoolean = businessDao.deleteByPrimaryKey(1);
        System.out.println(aBoolean);
        return;
    }
}
