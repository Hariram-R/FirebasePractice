package com.example.android.booklist;

/**
 * Created by Hp on 3/27/2018.
 */

public class Book_Model {
    String book;
    String author;
    public Book_Model(){}
    public Book_Model(String book, String author) {
        this.book = book;
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuth() {
        return author;
    }

    public void setAuth(String author) {
        this.author = author;
    }
}
