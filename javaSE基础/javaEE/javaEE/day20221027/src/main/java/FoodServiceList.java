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
@WebServlet(urlPatterns = "/list.do")
public class FoodServiceList extends HttpServlet {
    private Connection conn;
    private PreparedStatement ps = null;
    private ResultSet rs =null;
    @Override
    public void init() throws ServletException {
        conn = DBUtils.getConn();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        String foodName = req.getParameter("foodName");
        String foodExplain = req.getParameter("foodExplain");
        Double foodPrice =Double.valueOf(req.getParameter("foodPrice"));
        Integer bid =Integer.valueOf(req.getParameter("bid"));
        String flag = "";

        String sql = "insert into food(foodName,foodExplain,foodPrice,bid)value(?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, foodName);
            ps.setString(2, foodExplain);
            ps.setDouble(3,foodPrice);
            ps.setInt(4,bid);
            rs = ps.executeQuery();
            if (rs.next()) {
                writer.println("添加成功");
            } else {
                writer.println("添加失败");
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
        super.destroy();
    }
}
