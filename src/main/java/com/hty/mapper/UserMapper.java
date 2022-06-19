package com.hty.mapper;

import com.hty.entity.User;
import com.hty.util.CreateDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

public class UserMapper {
    private QueryRunner queryRunner = new QueryRunner();
    private DataSource dataSource = CreateDataSource.createDataSource();

    public UserMapper() throws Exception {
    }


    //根据用户名和密码查询用户
    public User selectUserByUsernameAndPassword(String username,String password) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);

        String sql = "select * from user where username = ? and password = ?";

        User user = queryRunner.query(sql, new BeanHandler<>(User.class), username, password);
        return user;
    }

    //增加一个用户
    public int addUser(String username,String password,Date date,String xueyuan) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "insert into user(username,password,born,xueyuan) values(?,?,?,?)";

        int i = queryRunner.update(sql, username, password, date, xueyuan);
        return i;
    }
}
