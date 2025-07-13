package com.pooja.library.repository;

import com.pooja.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    // You can define custom query methods here, if needed
}
