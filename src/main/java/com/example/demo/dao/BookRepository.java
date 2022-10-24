package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Zhai
 * 2022/10/24 17:05
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
