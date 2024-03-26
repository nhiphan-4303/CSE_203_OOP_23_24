/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab._2024;

/**
 *
 * @author hanie
 */
public class Book {

    private int id;
    private String title;
    private String authorName;
    private int publishedYear;
    private int totalPages;
    private float price;

    public Book() {
    }

    public Book(int id, String title, String authorName, int publishedYear, int totalPages, float price) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.totalPages = totalPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
