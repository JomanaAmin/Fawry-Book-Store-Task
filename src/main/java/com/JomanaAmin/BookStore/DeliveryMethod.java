package com.JomanaAmin.BookStore;

public class DeliveryMethod {
    public static void  mailService(Book book,String emailAddress){
        System.out.println("----Mailing Service-----");
        System.out.println("To be emailed:");
        System.out.println(book.showDetails());
        System.out.println("To the following email address:"+ emailAddress);
    }
    public static double shippingService(Book book,String address,int quantity){
        double shippingRate=0.5;
        double shippingFees=shippingRate*quantity;
        System.out.println("----Shipping Service-----");
        System.out.println("To be shipped:");
        System.out.println(book.showDetails());
        System.out.println("Quantity bought: "+quantity);
        System.out.println("To the following address:"+ address);
        System.out.println("Shipping Fees: "+shippingFees);
        return shippingFees;
    }
}
