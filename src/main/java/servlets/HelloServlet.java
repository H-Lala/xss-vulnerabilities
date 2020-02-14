package servlets;

import cookie.Cookies;
import freemaker.FreeMaker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloServlet extends HttpServlet {
    FreeMaker freeMaker = new FreeMaker();
    List<String> links = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, Object> data = new HashMap<>();

        links.add("Name");
        data.put("links",links);
        freeMaker.render("hello.ftl", data, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookies cookies = new Cookies(req, resp);
        String name = req.getParameter("name");
        Map<String, Object> data = new HashMap<>();
        data.put("links", links);
        data.put("name",name);
        data.put("header", "Login result");
        freeMaker.render("index.ftl", data, resp);

    }
}
