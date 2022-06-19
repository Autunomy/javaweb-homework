package com.hty.controller;

import com.hty.service.UserService;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class SigninController extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String date1 = req.getParameter("date");
        String xueyuan = req.getParameter("xueyuan");

        java.util.Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(date1);

        Date date = new Date(parse.getTime());

        try {
            UserService userService = new UserService();

            int i = userService.addUser(username, password, date, xueyuan);
            resp.sendRedirect("/login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
