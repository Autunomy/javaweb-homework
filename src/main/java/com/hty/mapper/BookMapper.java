package com.hty.mapper;

import com.hty.entity.Book;
import com.hty.util.CreateDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class BookMapper {
    private QueryRunner queryRunner = new QueryRunner();
    private DataSource dataSource = CreateDataSource.createDataSource();

    public BookMapper() throws Exception {
    }

    //根据id查询书籍
    public Book selectBookById(int id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);

        String sql = "select * from book where id = ?";

        Book book = queryRunner.query(sql, new BeanHandler<>(Book.class), id);
        return book;
    }

    //查询所有书籍
    public List<Book> selectAllBooks() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);

        String sql = "select * from book";

        List<Book> books = queryRunner.query(sql, new BeanListHandler<>(Book.class));
        return books;
    }

    //增加一本书籍
    public int addBook(String bookName,String bookauthor,Integer bookprice) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "insert into book(bookname,bookauthor,bookprice) values(?,?,?)";

        int i = queryRunner.update(sql, bookName, bookauthor, bookprice);
        return i;
    }

    //修改一本书籍
    public int updateBook(int id,String bookName,String bookauthor,Integer bookprice) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "update book set bookname = ?,bookauthor = ?,bookprice = ? where id = ?";

        int i = queryRunner.update(sql, bookName, bookauthor, bookprice, id);
        return i;
    }

    //删除一本书籍
    public int deleteBook(int id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "delete from book where id = ?";

        int i = queryRunner.update(sql, id);
        return i;
    }
}
