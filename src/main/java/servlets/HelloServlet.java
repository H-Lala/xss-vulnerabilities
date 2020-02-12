package servlets;

import cookie.Cookies;
import freemaker.FreeMaker;
import freemaker.FromRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HelloServlet extends HttpServlet {
    FreeMaker freeMaker= new FreeMaker();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, Object> data = new HashMap<>();
        List<String> fields = new ArrayList<>();
        fields.add("Name");
        data.put("fields", fields);
        data.put("message", "Please write your name");
        data.put("rout","/login");
        freeMaker.render("hello.ftl",data,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FromRequest fromRequest = new FromRequest(req);
        Cookies cookies = new Cookies(req,resp);
        String name = req.getParameter("name");
        resp.sendRedirect("/index");
    }
}
