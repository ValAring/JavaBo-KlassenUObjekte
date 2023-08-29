package org.example;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setNewBook("Erste Hilfe Typographie", "Friedrich Forssman", "3-865321-474-3");
        Book book2 = new Book();
        book2.setNewBook("Color and Light", "James Gurney", "973-235432-9771-2");
        Book book3 = new Book();
        book3.setNewBook("Mobile Business", "Erich Staudt", "3-363117-12-X");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        Book book4 = new Book();
        book4.setNewBook("Inside the PC", "Abbeville Press", "555-865321-474-3");

        Library library = new Library();
        library.addBooksToLib(0, book4);

        System.out.println(library.toString());
    }
}