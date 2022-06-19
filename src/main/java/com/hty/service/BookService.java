package com.hty.service;

import com.hty.entity.Book;
import com.hty.mapper.BookMapper;

import java.sql.SQLException;
import java.util.List;

public class BookService {
    private BookMapper bookMapper = new BookMapper();


    public BookService() throws Exception {
    }

    public Book selectBookById(int id) throws SQLException {
        return bookMapper.selectBookById(id);
    }

    public int addBook(String bookName,String bookauthor,Integer bookprice) throws SQLException {
        return bookMapper.addBook(bookName, bookauthor, bookprice);
    }

    public int updateBook(int id,String bookName,String bookauthor,Integer bookprice) throws SQLException {
        return bookMapper.updateBook(id, bookName, bookauthor, bookprice);
    }

    public List<Book> selectAllBooks() throws SQLException {
        return bookMapper.selectAllBooks();
    }

    public int deleteBook(int id) throws SQLException {
        return bookMapper.deleteBook(id);
    }
}
