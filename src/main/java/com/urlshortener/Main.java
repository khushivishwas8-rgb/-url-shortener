package com.urlshortener;
import java.util.Map;
import java.util.Scanner;


public class Main {
   public  static void main(String[] args) {

        // to activate the old brain to work now
        URLShortener Shortener = new URLShortener();
        //ADD THIS -- load saved URLs when  program starts
       Map<String,String> saved = FileStorage.load();
       Shortener.loadAll(saved);

        // creating the scanner object
       Scanner sc = new Scanner(System.in);

        // wait for the user until they press enter and then return everything they typed in string
       // String input = sc.nextLine();

        // split

       // with a loop : raed continously
        while (true) {
           String input = sc.nextLine().trim();


            // split

            String[] parts = input.split(" ");
            String command = parts[0].toLowerCase(); //first word



            if (input.equals("Quit")) {
                break;  // exit the loop
            }


            //handle each comand
            switch (command) {

                case "shorten" -> {
                    if (parts.length < 2) {
                        System.out.println("shorten <url>");
                    } else {
                        String slug = Shortener.shorten(parts[1]);
                        System.out.println("Shortened! Slug:" + slug);
                    }
                }

                case "expand" -> {
                    if (parts.length < 2) {
                        System.out.print("Usage: exapnd <slug>");
                    } else {
                        String url = Shortener.expand(parts[1]);
                        if (url != null) {
                            System.out.println("URL:" + url);
                        } else {
                            System.out.println("Slug not found.");
                        }
                    }
                }

                case "list" -> {
                    Shortener.listAll();
                }

                case "quit" -> {
                    FileStorage.save(Shortener.getAll());
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }

                default -> {
                    System.out.println("Unknown command. Try: shorten, expand,list,quit,default");
                }
            }


            System.out.println(); //blank line between command


        }
    }

}