package com.hty.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

public class CreateDataSource {
    public static DataSource createDataSource() throws Exception {
        Properties properties = new Properties();
        properties.load(CreateDataSource.class.getClassLoader().getResourceAsStream("db.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        return dataSource;
    }
}
