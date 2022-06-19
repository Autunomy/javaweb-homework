package com.hty.controller;

import com.hty.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateBookController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookname = req.getParameter("bookname");
        String bookauthor = req.getParameter("bookauthor");
        Integer bookprice = Integer.valueOf(req.getParameter("bookprice"));
        Integer id = Integer.valueOf(req.getParameter("id"));
        try {
            BookService bookService = new BookService();
            bookService.updateBook(id,bookname, bookauthor, bookprice);
            req.setAttribute("books", bookService.selectAllBooks());
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
