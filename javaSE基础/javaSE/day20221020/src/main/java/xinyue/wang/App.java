package xinyue.wang;

import xinyue.wang.dao.AdminDao;

public class App {
    public static void main(String[] args) {
        System.out.println("欢迎使用ele后台管理系统");
        AdminDao adminDao = new AdminDao();
        Boolean aBoolean = adminDao.deleteByPrimaryKey(3);
        if(aBoolean){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
}
