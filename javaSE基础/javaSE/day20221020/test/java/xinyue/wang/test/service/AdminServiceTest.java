package xinyue.wang.test.service;

import org.junit.Test;
import xinyue.wang.service.AdminService;

import java.util.Scanner;

public class AdminServiceTest {
    @Test
    public  void testLogin (){
        AdminService adminService = new AdminService();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String msg = adminService.loginCheck(name,pass);
        System.out.println(msg);
    }
}
