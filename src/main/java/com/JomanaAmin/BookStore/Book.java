package com.JomanaAmin.BookStore;

import java.time.LocalDate;

public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int yearPublished;

    public String getISBN(){
        return this.ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public int getYearPublished(){
        return this.yearPublished;
    }

    public boolean isOutdated(int years){
        return (LocalDate.now().getYear()-this.yearPublished)>=years;
    }

    public Book(String ISBN, String title, int yearPublished ){
        this.ISBN=ISBN;
        this.title=title;
        this.yearPublished=yearPublished;
    }

    public abstract boolean isSellable();
    public abstract String showDetails();
    public abstract BookType getType();
    public abstract double buyBook(int quantity, String emailAddress, String address);
}
