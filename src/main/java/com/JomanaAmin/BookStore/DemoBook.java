package com.JomanaAmin.BookStore;

public class DemoBook extends Book{
    static boolean sellable=false;
    final BookType type=BookType.DEMOBOOK;
    public DemoBook(String ISBN, String title, int yearPublished ){
        super(ISBN,title,yearPublished);
    }

    @Override
    public boolean isSellable(){
        return sellable;
    }
    @Override
    public String showDetails(){
        return
                "ISBN: "+this.ISBN
                        +"\nTitle: "+this.title
                        +"\nYear Published: "+this.yearPublished
                        +"\nType: Demo Book"
                        +"\nSellable? "+sellable;
    }
    @Override
    public double buyBook(int quantity, String emailAddress, String address) throws IllegalStateException{
        throw new IllegalStateException("Demo books cannot be bought");
    }

    @Override
    public BookType getType(){
        return type;
    }

//    @Override
//    public BookType getType(){
//        return type;
//    }
}
