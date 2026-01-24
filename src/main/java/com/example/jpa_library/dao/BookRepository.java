package com.example.jpa_library.dao;

import com.example.jpa_library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Optional<Book> findByIsbn(String isbn);

    List<Book> findAllByDescriptionContainingIgnoreCase(String description);

    @Query("SELECT b from Book b WHERE upper(b.description) LIKE upper(:description)")
    List<Book> findForLikeDescription(String description);

}
