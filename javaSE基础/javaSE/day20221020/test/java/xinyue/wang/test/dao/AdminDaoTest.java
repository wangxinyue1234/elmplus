package xinyue.wang.test.dao;

import org.junit.Test;
import xinyue.wang.dao.AdminDao;
import xinyue.wang.pojo.Admin;

public class AdminDaoTest {
    @Test
    public void testSelectOne(){
        AdminDao adminDao = new AdminDao();
        Admin admin = adminDao.selectByPrimaryKey(1);
        System.out.println(admin);
        return;
    }

    @Test
    public void testDeleteOne(){
        AdminDao adminDao = new AdminDao();
        Boolean aBoolean = adminDao.deleteByPrimaryKey(3);
        System.out.println(aBoolean);
        return;
    }
}