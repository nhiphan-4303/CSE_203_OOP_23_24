/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab._2024;

import java.util.ArrayList;

/**
 *
 * @author hanie
 */
public class BookManage {

    private ArrayList<Book> bookList = new ArrayList<>();

    public BookManage() {
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public boolean checkId(int id) {
        for (Book b : bookList) {
            if (b.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public Book findById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

}
