package com.hty.controller;

import com.hty.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteBookController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        BookService bookService = null;
        try {
            bookService = new BookService();
            int i = bookService.deleteBook(id);
            req.setAttribute("books", bookService.selectAllBooks());
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
