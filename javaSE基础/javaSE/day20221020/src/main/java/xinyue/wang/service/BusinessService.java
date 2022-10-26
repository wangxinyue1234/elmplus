package xinyue.wang.service;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import xinyue.wang.dao.BusinessDao;
import xinyue.wang.dao.FoodDao;
import xinyue.wang.dao.OrderMapDao;
import xinyue.wang.pojo.Admin;
import xinyue.wang.pojo.Business;
import xinyue.wang.pojo.Food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessService {
    private BusinessDao businessDao = new BusinessDao();
    private FoodDao foodDao = new FoodDao();
    private OrderMapDao orderMapDao = new OrderMapDao();

    //注册新商家
    public String registerNew(String na, String pass, String repass) {
        String msg = "";
        //组装数据
        if (na.length() == 0 || pass.length() == 0 || repass.length() == 0 || !pass.equals(repass)) {
            msg = "注册消息有误";
        } else {
            //业务整合
            //查询是否存在同名用户
            Business business = new Business();
            business.setBusinessName(na);
            if (businessDao.selectByCondition(business) == null) {//可以注册
                //插入新商家
                business.setPassword(pass);//安全考虑
                Boolean aBoolean = businessDao.insertSelective(business);
                if (aBoolean) {
                    msg = "恭喜，注册成功";
                } else {
                    msg = "数据插入失败";
                }
            } else {
                msg = "用户名已存在";
            }
        }
        //返回状态
        return msg;
    }

    //删除某个商家
    public String removeOne(Integer id) {
        String msg = "";
        //Boolean aBoolean = businessDao.deleteByPrimaryKey1(id);
        //lists = foodDao.selectByCondition(id);//bid
        // orderMapDao.deleteByList(lists);
        //foodDao.deleteByCondition(new Food());
        Boolean aBoolean = businessDao.deleteByPrimaryKey1(id);
        return msg = aBoolean ? "成功" : "失败";
    }

    public String loginCheck(String name, String pass) {
        String message = "";
        //将用户输入散碎数据组装为对象，方便传递
        if (name.length() == 0 || pass.length() == 0) {
            message = "用户名或密码都不能为空";
        } else {
            Business business = new Business(name, pass);
            //调用Dao层接口执行SQL
            Business ret = businessDao.selectByCondition(business);
            //根据Dao层返回组装状态信息
            if (ret == null) {
                message = "用户名和密码不匹配";
            } else {
                Date date = new Date();
                System.out.println(ret.getUptime().getTime());
                System.out.println(date.getTime());
                long day = (date.getTime() - ret.getUptime().getTime()) / (1000 * 60 * 60 * 24);
                Date in = new Date();
                message = "恭喜您，您已经称为会员" + day + "天";
            }
        }
        return message;
    }
    //查询所有商家
    public List<Business> selectAll(){
        List<Business> businessList =businessDao.selectAll();
        return businessList;
    }

}