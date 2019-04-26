package com.hjl.bootdemo.web;

import com.hjl.bootdemo.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author jiale.he
 * @date 2019/04/26
 * @email jiale.he@mail.hypers.com
 */
@RestController
@RequestMapping("api")
public class BookController {
    static Map<Long, Book> books = new HashMap<>();
    // 原子变量
    static AtomicLong seq = new AtomicLong(20);

    static {
        for (int i = 0; i < 20; i++) {
            Long id = i + 1L;
            books.put(id, new Book(id, "name" + id, "isbn" + id, "出版社" + id, "2019-04-26"));
        }
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable("id") Long id) {
        books.remove(id);
        return "Delete Success!";
    }

    @PutMapping("books/{id}")
    public Book changeBookById(@PathVariable("id") Long id, @RequestBody Book book) {
        Book b = books.get(id);
        b.setBookName(book.getBookName());
        b.setIsbn(book.getIsbn());
        b.setPublisher(book.getPublisher());
        b.setPublishTime(book.getPublishTime());
        books.put(id, b);
        return b;
    }

    // 原子变量
    @PostMapping("books")
    public Book addBook(@RequestBody Book book) {
        // 增长
        Long id = seq.incrementAndGet();
        book.setBookId(id);
        books.put(id, book);
        return book;
    }

    @GetMapping("books/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return books.get(id);
    }

    @GetMapping("books")
    public List<Book> getBookList() {
        return new ArrayList<>(BookController.books.values());
    }
}
