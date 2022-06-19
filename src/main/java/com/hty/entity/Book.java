package com.hty.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Integer id;
    private String bookname;
    private String bookauthor;
    private String bookprice;
}
