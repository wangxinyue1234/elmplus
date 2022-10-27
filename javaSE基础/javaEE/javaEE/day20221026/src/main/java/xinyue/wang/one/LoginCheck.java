package xinyue.wang.one;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginCheck extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }
    protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String adminName=req.getParameter("uname");
        String password = req.getParameter("upass");
        PrintWriter writer =resp.getWriter();
        writer.println("return: ");
        if ("zs".equals(adminName)&&"123".equals(password)){
            writer.println("success");
        }else {
            writer.println("error");
        }
        writer.close();
    }
}
