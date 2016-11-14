package Servlet;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Leo on 2016/11/14.
 */
public class TestServlet extends HttpServlet {
//
//    private static ActiveXComponent com;
//    private static Dispatch disp;
    @Override
    public void init() throws ServletException {
//        com = new ActiveXComponent("CLSID:0F55CC69-97EF-42A9-B63D-D1831CB2B3B9");
//        disp = (Dispatch)com.getObject();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name=Dispatch.call(disp,"Name").getString().trim();
//        req.setAttribute("name",name);
//
//
//       req.getRequestDispatcher("check.jsp").forward(req,resp);
    }




    @Override
    public void destroy() {
        System.out.println("111");
    }
}
