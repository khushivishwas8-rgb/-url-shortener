package com.urlshortener;


public class Main {
    static void main(String[]args) {

        // Instantiate our new controller/brain
        URLShortener shortener = new URLShortener();

        // Shorten two sample web addresses
        String slug1 = shortener.shorten("https://google.com");
        String slug2 = shortener.shorten("https://amazon.com");

       // print our the randomly generated slugs
        System.out.println("Slug 1:"+ slug1);
        System.out.println("Slug 2:"+ slug2);

        // Test expanding them back to verify they match original values
        System.out.println("Expanded 1: " + shortener.expand(slug1) );
        System.out.println("Expanded 2:" +  shortener.expand(slug2) );

        // Test an invaild edge case
        System.out.println(" Testing invalid slug:" +  shortener.expand("xxxx") );

        //List everything currently tracked in memory
        System.out.println("\n---Listing All Store Pairs --- ");

    }

}
