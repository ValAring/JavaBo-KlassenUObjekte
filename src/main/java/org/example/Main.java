package org.example;
public class Main {
    public static void main(String[] args) {

        Book book4 = new Book("Inside the PC", "Abbeville Press", "555-865321-474-3");

        Library library = new Library();
        library.addBooksToLib(book4);

        System.out.println(library.toString());
    }
}