package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Zhai
 * 2022/10/24 17:11
 */
@RequestMapping("/books")
@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("")
    public ResponseEntity<Object> create (@RequestBody Book resource) {
        Book book = bookService.create(resource);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/list")
    public ResponseEntity<Object> list (@RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "10") Integer size) {
        Page<Book> list = bookService.list(page, size);
        return ResponseEntity.ok(list);
    }
}
