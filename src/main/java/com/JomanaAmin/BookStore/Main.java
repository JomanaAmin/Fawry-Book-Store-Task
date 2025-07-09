package com.JomanaAmin.BookStore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store=new Store();
        store.add(BookType.EBOOK,"AS32Q","Lord of the rings",2025,200,0,"pdf");
        store.add(BookType.DEMOBOOK,"UE11W","Harry Potter",1970,0,0,"");
        store.add(BookType.PAPER,"PW52JK","IGCSE O Level Chemistry",2012,150,3,"");
        store.buy("UQ45AA",1,"jomana.hussein.c@gmail.com","6th of October city");
        store.buy("UE11W",1,"jomana.hussein.c@gmail.com","6th of October city");
        store.buy("PW52JK",10,"jomana.hussein.c@gmail.com","6th of October city");
        store.buy("PW52JK",2,"jomana.hussein.c@gmail.com","6th of October city");
        store.buy("AS32Q",1,"jomana.hussein.c@gmail.com","6th of October city");

        store.remove(4);
    }
}