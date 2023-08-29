package org.example;

import java.util.Arrays;

public class Library {
    private Book[] myBooks;


    public Library(){
        myBooks = new Book[10];
        //myBooks[0] = new Book("Erste Hilfe Typographie", "Friedrich Forssman", "3-865321-474-3");
        //myBooks[1] = new Book("Color and Light", "James Gurney", "973-235432-9771-2");
        //myBooks[2] = new Book("Mobile Business", "Erich Staudt", "3-363117-12-X");
    }

    public void addBooksToLib(int a, Book newBook){
        myBooks[a] = newBook;
    }

    @Override
    public String toString() {
        return "Books in my library: " + Arrays.toString(myBooks);
    }
}
