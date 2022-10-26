package xinyue.wang.ui;

import xinyue.wang.pojo.Business;
import xinyue.wang.service.AdminService;
import xinyue.wang.service.BusinessService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AdminViewImpl implements AdminView{
    private static Scanner scanner = new Scanner(System.in);
    private AdminService adminService = new AdminService();
    private BusinessService businessService = new BusinessService();
    @Override
    public void showAll() {

    }

    @Override
    public void showSubMenu() {
        int choice = 0;
        while(true){
            System.out.println("--------------------管理员子菜单-----------------");
            System.out.println("1   信息管理");
            System.out.println("2   商家管理");
            System.out.println("3   商家列表");
            System.out.println("0   返回上级菜单");
            System.out.println("----------------------------------------------");
            System.out.print("请输入菜单编号：");
            choice = scanner.nextInt();
            switch (choice){
                case 0:
                    return;
                case 3:
                    BusinessView businessView= new BusinessViewImpl();
                    businessView.showAll();
                    System.out.print("输入要删除的id：");
                    int id = scanner.nextInt();
                    businessService.removeOne(id);
                    break;
                case 1:
                    registerNewBusiness();
                   break;
                case 2:
                    break;
                default:
                    System.out.println("输入错误请重新输入");
            }
        }
    }
    //管理员子菜单
    public static void registerNewBusiness(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商店名称：");
        String name = scanner.nextLine();
        System.out.print("请输入商店密码：");
        String pass = scanner.nextLine();
        System.out.print("请重复输入商店密码：");
        String repass = scanner.nextLine();
        System.out.print("请输入商店地址：");
        String address = scanner.nextLine();
        System.out.print("请输入起始价格：");
        String starPrice = scanner.nextLine();
        System.out.print("请输入商店介绍：");
        String explain = scanner.nextLine();
        BusinessService businessService = new BusinessService();
        String status = businessService.registerNew(name, pass,repass);
        System.out.println(status);
        //跟据返回情况，决定是转到管理员界面还是返回主菜单
        if (status.startsWith("恭喜")) {
            System.out.println("注册商家成功");
        } else {
            return;
        }
    }

}
