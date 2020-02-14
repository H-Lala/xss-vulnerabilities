package servlets;

import freemaker.FreeMaker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IndexServlet extends HttpServlet {
    FreeMaker freeMaker = new FreeMaker();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, Object> data2 = new HashMap<>();
        List<String> fields2 = new ArrayList<>();
        String name = req.getParameter("name");

        fields2.add("Name");
        data2.put("fields2", fields2);

        freeMaker.render("index.ftl",data2,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/index.ftl");
    }
}
