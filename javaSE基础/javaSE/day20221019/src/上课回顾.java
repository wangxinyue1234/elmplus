import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class 上课回顾 {
    public static void main(String[] args) {
       /* //1 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2 获取连接对象
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3310/mysql?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true","root","111111");
        //3 得到Statement 对象
        Statement stat = conn.createStatement();
        String sql = "select * from buser where id = "+aid;
        //4 通过Statement 对象执行语句
        ResultSet rs = stat.executeQuery(sql);
        //5 处理结果
        while(rs.next()){
            rs.getString("username");
        }
        //6 关闭资源
        rs.close();
        stat.close();
        conn.close();*/
    }
}
