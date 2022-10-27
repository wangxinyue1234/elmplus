import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//使用前先设置编码集
        resp.setCharacterEncoding("utf-8");
        String uname =req.getParameter("uname");
        String upass =req.getParameter("upass");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=uft-8");
        String flag = "";
        if("张三".equals(uname)&&"123".equals(upass)){
            flag ="登录成功";
        }else{
            flag ="登录失败";
        }
        writer.println("<html>");
        writer.println("  <head><title>Servlet</title></head>");
        writer.println("  <body>");
        writer.println("登录状态，" + uname +"!"+ flag+ "，欢迎来到Servlet的世界！");
        writer.println("  </body>");
        writer.println("</html>");
        writer.close();
        System.out.println(uname);
    }
}
