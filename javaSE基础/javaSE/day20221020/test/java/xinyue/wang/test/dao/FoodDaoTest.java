package xinyue.wang.test.dao;

import org.junit.Test;
import xinyue.wang.dao.FoodDao;
import xinyue.wang.pojo.Food;

public class FoodDaoTest {

    @Test
    public void testFoodWithObj(){
        FoodDao foodDao = new FoodDao();
        Food food = foodDao.selectByPrimaryKeyWithObject(1);
        System.out.println(food);
    }
}