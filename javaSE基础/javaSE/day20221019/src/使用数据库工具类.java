import java.sql.*;
import java.text.SimpleDateFormat;

public class 使用数据库工具类 {
    public static void main(String[] args) throws SQLException {
        OperatorBuser operatorBuser = new OperatorBuser();
      operatorBuser.addTest();
        operatorBuser.delTest();
        operatorBuser.closeRes();
    }
}
//操作buser表的业务类
class OperatorBuser{
    private Connection conn = null;
    private Statement stat = null;
    private ResultSet rs = null;

    public OperatorBuser() throws SQLException {
        conn = DButil.getConn();
        stat = conn.createStatement();
    }
    public void closeRes(){
        DButil.close(null,stat,conn);
    }

    //增
    public void addTest() throws SQLException {
        String sql = "insert into buser (username,password,phone) value ('zs111','123','119210')";
        stat.execute(sql);
    }
    //删
    public void delTest() throws SQLException {
        String sql = "delete from buser where id=1";
        stat.execute(sql);
    }
    //改
    
    //查
    public void selectTest() throws SQLException {
        String sql = "select * from buser";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()){
            System.out.println(rs.getString("username"));
            //对时间进行格式化
            Timestamp cDate = rs.getTimestamp("uptime");
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
            String s = simpleDateFormat.format(cDate);
            System.out.println(s);
        }
        DButil.close(rs,null,null);
    }

}
