package com.linux4fun.service.impl;

import com.linux4fun.dto.AppointExecution;
import com.linux4fun.entity.Book;
import com.linux4fun.mapper.BookMapper;
import com.linux4fun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    // 注入Serice依赖
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book getById(long bookId) {
        return bookMapper.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookMapper.queryAll();
    }

    @Override
    public AppointExecution appoint(long bookId, long studentId) {
        return null;
    }
}
