package com.pooja.library.controller;

import com.pooja.library.model.Book;
import com.pooja.library.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<?> addBook( @RequestBody Book book) {
        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Title cannot be empty.");
        }
        return ResponseEntity.ok(bookService.addBook(book));
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable int id) {
        Book book = bookService.getBookById(id);
        return book != null ? ResponseEntity.ok(book) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id)
                ? ResponseEntity.ok("Book deleted successfully.")
                : ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}/availability")
    public ResponseEntity<?> updateAvailability(@PathVariable int id,
                                                @RequestParam boolean available) {
        return bookService.updateAvailability(id, available)
                ? ResponseEntity.ok("Availability updated.")
                : ResponseEntity.notFound().build();
    }
}
