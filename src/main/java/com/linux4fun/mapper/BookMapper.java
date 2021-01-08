package com.linux4fun.mapper;

import com.linux4fun.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(@Param("bookId") long id);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> queryAll();

}
