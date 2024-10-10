package com.pluralsight;

import java.util.Scanner;

public class Main {


    public static Book[] books = new Book[5];



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int selection;

        books[0] = new Book(1, "1984", "9780198185215", false);
        books[1] = new Book(2, "les Miserables", "9788447303342", false);
        books[2] = new Book(3, "Tale of Two Cities", "0140430547", false);
        books[3] = new Book(4, "Of Mice and Men", "9780137170180", false);
        books[4] = new Book(5, "Great Expectations", "9781512308846", false);


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
                    listCheckedOut();
                    break;
                case 3:
                    checkOut(scan);
                    break;
                case 4:
                    checkIn(scan);
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
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!Book.getCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getName());
            }
        }

    }
    public static void listCheckedOut(){


            System.out.println("Books Checked Out:");

            for (Book book : books) {
                if (Book.getCheckedOut()) {
                    System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getName());
                }
            }

    }
    public static void checkOut(Scanner scan){
        System.out.print("Enter book ID to check out: ");
        int bookId = scan.nextInt();
        scan.nextLine(); // Consume newline
        System.out.print("Enter your name: ");
        String userName = scan.nextLine();

        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!Book.getCheckedOut()) {
                    book.setCheckedOutBy(userName);
                    System.out.println("You have checked out " + book.getName());
                    book.setCheckedOut(true);
                    book.setCheckedOutBy(userName);
                    return;
                } else {
                    System.out.println("Book is already checked out.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
    public static void checkIn(Scanner scan){
        System.out.print("Enter book ID to check in: ");
        int bookId = scan.nextInt();
        scan.nextLine(); // Consume newline

        for (Book book : books) {
            if (book.getId() == bookId) {
                if (Book.getCheckedOut()) {
                    System.out.println("You have returned " + book.getName());
                    book.setCheckedOut(false);
                    book.setCheckedOutBy(null);
                    return;
                } else {
                    System.out.println("Book is not checked out.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
}


