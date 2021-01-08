package com.linux4fun.controller;

import com.linux4fun.entity.Book;
import com.linux4fun.exception.BookException;
import com.linux4fun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") long id, Model model) {
        Book book = bookService.getById(id);
        if (book == null) throw new BookException("" + id);

        model.addAttribute(book);
        return "bookDetail";
    }

}
