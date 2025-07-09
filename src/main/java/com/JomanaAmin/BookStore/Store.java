package com.JomanaAmin.BookStore;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
    private ArrayList<Book> inventory;

    public Store(){
        this.inventory=new ArrayList<>();
    }

    public Book findISBN(String ISBN) throws IllegalStateException{
        for(Book book: this.inventory){
            if(book.getISBN().equals(ISBN)){
                return book;
            }
        }
        throw new IllegalStateException("ISBN does not exist.");
    }
/// May remove method from this class, and display books in UI class itself
    public void displayBooks(ArrayList<Book> books){
        if (books.isEmpty()){
            System.out.println("No books were outdated, so no books were removed.");
        }
        for(Book book: books){
            System.out.println("------------------------");
            System.out.println(book.showDetails());
        }
    }

    public void add(BookType bookType, String ISBN,String title, int yearPublished, double price, int stock, String fileType ){
        Book newBook=null;
        switch (bookType) {
            case BookType.DEMOBOOK:
                newBook=new DemoBook(ISBN,title,yearPublished);
                break;
            case BookType.EBOOK:
                newBook=new EBook(ISBN,title,yearPublished,price,fileType);
                break;
            case BookType.PAPER:
                newBook=new PaperBook(ISBN,title,yearPublished,price,stock);
                break;
        }
        inventory.add(newBook);

    }


    public void remove(int years){
        ArrayList<Book> outdatedBooks=new ArrayList<>();
        for (Book book:inventory){
            if (book.isOutdated(years)){
                outdatedBooks.add(book);
            }
        }
        System.out.println("BOOKS REMOVED: ");
        displayBooks(outdatedBooks);
    }
    public ArrayList<Book> getInventory(){
        return this.inventory;
    }
    public double buy(String ISBN, int quantity, String emailAddress, String address){
        double amountPaid=0.0;
        try{
            Book book=this.findISBN(ISBN);
            amountPaid=book.buyBook(quantity,emailAddress,address);
            System.out.println("Amount paid: "+amountPaid);

        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        return amountPaid;
    }
}
//+buy(isbn,quantity,email,address)
//{
//    throw error if book doesnt exist
//    reduce quantity of book in stock
//    return paid amount
//    if paper book-->send to shippingservice with address provided
//    if ebook-->send to mailservice with email provided}
//
