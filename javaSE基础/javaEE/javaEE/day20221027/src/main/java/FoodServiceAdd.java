

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FoodServiceAdd extends HttpServlet {
    private Connection conn;
    private PreparedStatement ps=null;
    private ResultSet rs=null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doP(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doP(req,resp);
    }
    protected void doP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig=  this.getServletConfig();
        String setC=servletConfig.getInitParameter("setC");
        System.out.println(setC);
        req.setCharacterEncoding(setC);
        resp.setCharacterEncoding(setC);
        resp.setContentType("text/html;charset=utf-8");
        String foodName=req.getParameter("foodname");
        String foodExplain=req.getParameter("foodExplain");
        Double foodPrice=Double.valueOf(req.getParameter("foodPrice"));
        Integer bid=Integer.valueOf(req.getParameter("foodbid"));

        String sql="insert into food(foodName, foodExplain, foodPrice, bid) value (?,?,?,?)";
        String S="";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,foodName);
            ps.setString(2,foodExplain);
            ps.setDouble(3,foodPrice);
            ps.setInt(4,bid);
            int fl=ps.executeUpdate();
            if (fl>0){
                S="成功";
            }else {
                S="失败";
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        DBUtils.close(ps,null);
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("  <head><title>Servlet</title></head>");
        out.println("  <body>");
        out.println("返回状态，" + S + "！");
        out.println("  </body>");
        out.println("</html>");
        out.close();
    }
    @Override
    public void destroy() {
        DBUtils.close(null,conn);
    }

    @Override
    public void init() throws ServletException {
        conn= DBUtils.getConn();
    }
}