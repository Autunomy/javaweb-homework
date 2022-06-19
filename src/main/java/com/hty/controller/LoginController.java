package com.hty.controller;

import com.hty.entity.User;
import com.hty.service.BookService;
import com.hty.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try {
            UserService userService = new UserService();
            BookService bookService = new BookService();
            User user = userService.selectUserByUsernameAndPassword(username, password);
            System.out.println(user);
            if(user != null){
                HttpSession session = req.getSession();
                session.setAttribute("user",user);
                req.setAttribute("books",bookService.selectAllBooks());
                req.getRequestDispatcher("/index.jsp").forward(req,resp);
            }else{
                resp.sendRedirect("/login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
