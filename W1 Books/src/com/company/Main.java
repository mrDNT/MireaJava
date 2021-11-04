package com.company;

public class Main {

    public static void main(String[] args) {
	Book first_book = new Book("Romeo and Juliet","William Shakespeare","Tragedy",1597);
	Book second_book = new Book("My first book","Demid Driga","Cyberpunk",2077);
	System.out.println(first_book.toString());
	System.out.println(second_book.toString());
    }
}
