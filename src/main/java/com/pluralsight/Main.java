package com.pluralsight;

import java.util.Scanner;

public class Main {


    public static Book books[] = new Book[5];
    public static int bookNum = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = 0;

        books[0] = new Book("1984", "9780198185215", false);
        books[1] = new Book("les Miserables", "9788447303342", false);
        books[2] = new Book("Tale of Two Cities", "0140430547", false);
        books[3] = new Book("Of Mice and Men", "9780137170180", false);
        books[4] = new Book("Great Expectations", "9781512308846" , false);

        while(true) {
            System.out.println("what would you like to do see: ");
            System.out.println("All Book (1)");
            System.out.println("Show Checked Out Books (2)");
            System.out.println("Check Out Book (3)");
            System.out.println("Return Book (4)");
            System.out.println("Exit (5)");
            selection = scan.nextInt();

            switch(selection){
                case 1:
                    listAllBooks();
                    break;
                case 2:
                    listCheckedOut(scan);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thank You for Coming!");
                    return;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }


        }



    }
    public static void listAllBooks() {

        System.out.println("Books Available:");

        // Iterate over the array of vehicles and print the details of each vehicle
        for (int i = 0; i < bookNum; i++) {
            System.out.println(books[i]);
        }


    }
    public static void listCheckedOut(Scanner scan){

        System.out.println("Books Checked Out:");

        // Iterate over the array of vehicles and print the details of each vehicle
        for (int i = 0; i < bookNum; i++) {
            if(books[i].getCheckedOut()) {
                System.out.println(books[i]);
            }
        }
        System.out.println("(C) to Check in or (X) to go home.");
        String checkOut = scan.nextLine();
        if(checkOut.equalsIgnoreCase("C")){
            System.out.println("What Book would you like to return?");




        }
    }
    public static void checkOut(Scanner scan){

    }
    public static void checkIn(Scanner scan){

    }

}
