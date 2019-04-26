package com.hjl.bootdemo.domain;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author jiale.he
 * @date 2019/04/26
 * @email jiale.he@mail.hypers.com
 */
public class Book {
    private Long bookId;
    private String bookName;
    private String isbn;
    private String publisher;
    private String publishTime;

    public Book() {
        super();
    }

    public Book(Long bookId, String bookName, String isbn, String publisher, String publishTime) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}
