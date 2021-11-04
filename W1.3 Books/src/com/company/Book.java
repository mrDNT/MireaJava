package com.company;

public class Book {
    String name;
    String author;
    String genre;
    int year;
    public Book(String name, String author, String genre, int year){
        this.name = name;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Books name is " + name + '\'' +
                ", author is " + author + '\'' +
                ", genre is " + genre + '\'' +
                ", First time published in year " + year +
                '}';
    }
}
