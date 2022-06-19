package com.hty.controller;

import com.hty.entity.Book;
import com.hty.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ToUpdateBookController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        try {
            BookService bookService = new BookService();
            Book book = bookService.selectBookById(id);
            req.setAttribute("book", book);
            req.getRequestDispatcher("/updateBook.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
