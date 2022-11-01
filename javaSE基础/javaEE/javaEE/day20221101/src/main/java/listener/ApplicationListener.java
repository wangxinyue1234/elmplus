package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.*;

public class ApplicationListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        System.out.println("Web服务器启动，application对象创建");
        File file = new File("c:/a.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
            FileReader fileReader =null;
            try{

            }catch (){

            }
        }
        count = Integer.valueOf(s);
        count++;

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
        System.out.println("Web服务器关闭，application对象关闭");
        this.count
    }
}
