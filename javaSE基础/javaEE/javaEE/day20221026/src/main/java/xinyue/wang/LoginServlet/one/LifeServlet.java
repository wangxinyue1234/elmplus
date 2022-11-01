package xinyue.wang.controller.LoginServlet.one;

import xinyue.wang.controller.LoginServlet.utils.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/life")
public class LifeServlet extends HttpServlet {
    private Connection conn;
    private PreparedStatement ps = null;
    private ResultSet rs =null;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }
    protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet  service()");
        PrintWriter writer = resp.getWriter();
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        String sql = "select * from admin where adminName=?and password=?";
        try {
            try {
                ps = conn.prepareStatement(sql);
                ps.setString(1, uname);
                ps.setString(2, upass);
                rs = ps.executeQuery();
                if (rs.next()) {
                    writer.println("success");
                } else {
                    writer.println("error");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                writer.close();
                DBUtils.close(rs, ps, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            writer.close();
            DBUtils.close(rs,ps,null);
        }
    }

    @Override
    public void destroy() {
        System.out.println("servlet入土了");
        //关闭资源
        DBUtils.close(null,null,conn);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("servlet出生了");
        //获取conn对象
        conn =DBUtils.getConn();
    }
}
