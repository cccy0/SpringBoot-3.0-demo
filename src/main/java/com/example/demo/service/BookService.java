package com.example.demo.service;

import com.example.demo.dao.BookRepository;
import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author Zhai
 * 2022/10/24 17:06
 */
@Service
public class BookService {


    private BookRepository bookRepository;

    @Autowired
    private void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Page<Book> list (Integer page, Integer size) {
        return bookRepository.findAll(PageRequest.of(page, size));
    }

    public Book create(Book resource) {
        return bookRepository.save(resource);
    }
}
