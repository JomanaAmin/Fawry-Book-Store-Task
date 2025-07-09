package com.JomanaAmin.BookStore;

public class EBook extends Book {
    static boolean sellable = true;
    final BookType type=BookType.EBOOK;
    private double price;
    private String fileType;

    public EBook(String ISBN, String title, int yearPublished, double price, String fileType ){
        super(ISBN, title, yearPublished);
        this.price=price;
        this.fileType=fileType;
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
                        +"\nFile Type: "+this.fileType
                        +"\nPrice: "+this.price
                        +"\nType: E-Book"
                        +"\nSellable? "+sellable;
    }
    @Override
    public double buyBook(int quantity, String emailAddress, String address){
        DeliveryMethod.mailService(this,emailAddress);
        return this.price*quantity;
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
