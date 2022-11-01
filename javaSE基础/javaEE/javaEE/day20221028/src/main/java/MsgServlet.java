import com.fasterxml.jackson.databind.ObjectMapper;
import utils.MessageAndData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/msg.do")
public class MsgServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Access-Control-Allow-Origin","*");

        String name="wangxiny";
        ArrayList

        MessageAndData.success("select")
        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json;charset=uft-8");

        ObjectMapper objectMapper =new ObjectMapper();
        objectMapper.writeValueAsString();

        writer.print(objectMapper);
        writer.close();
    }
}

