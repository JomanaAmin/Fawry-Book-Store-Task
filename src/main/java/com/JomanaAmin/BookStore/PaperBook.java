package com.JomanaAmin.BookStore;

public class PaperBook extends Book{
    static boolean sellable = true;
    final BookType type=BookType.PAPER;
    private double price;
    private int stock;

    public PaperBook(String ISBN, String title, int yearPublished, double price, int stock){
        super(ISBN,title,yearPublished);
        this.stock=stock;
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public int getStock(){
        return this.stock;
    }
    public void reduceStock(int quantity) throws IllegalStateException{
        if (this.stock<quantity)
            throw new IllegalStateException("Only "+this.stock+" available in stock.");
        this.stock-=quantity;
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
                +"\nIn Stock: "+this.stock
                +"\nPrice: "+this.price
                +"\nType: PaperBook"
                +"\nSellable? "+sellable;
    }

    @Override
    public BookType getType(){
        return type;
    }

    @Override
    public double buyBook(int quantity, String emailAddress, String address){
        this.reduceStock(quantity);
        double shippingFees=DeliveryMethod.shippingService(this, address, quantity);
        return this.price*quantity+shippingFees;
    }
//    @Override
//    public BookType getType(){
//        return type;
//    }


}
