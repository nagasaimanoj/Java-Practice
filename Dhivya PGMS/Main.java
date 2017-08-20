<<<<<<< HEAD
class Book{
    public String title, author;

    Book(String title, String author){
=======
import java.io.*;
import java.util.*;

// class book
class Book {

    public String title;
    public String author;

    Book(String title, String author) {

>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
        this.title = title;
        this.author = author;
    }
}
<<<<<<< HEAD
class Library {
    private final java.util.List<Book> books;

    Library (java.util.List<Book> books){
        this.books = books; 
    }

    public java.util.List<Book> getTotalBooksInLibrary(){
        return books;  
    }
}
class Main{
    public static void main (String[] args){

        java.util.List<Book> books = new java.util.ArrayList<Book>();
        books.add(new Book("EffectiveJ Java", "Joshua Bloch"));
        books.add(new Book("Thinking in Java", "Bruce Eckel"));
        books.add(new Book("Java: The Complete Reference", "Herbert Schildt"));
        
        for(Book bk : new Library(books).getTotalBooksInLibrary()){
            System.out.println("Title : " + bk.title + " and "+" Author : " + bk.author);
=======
public String getName(){
return author;
}
  public void setTitle(String tit) {
title = tit;
}
public String getTitle(){
return title;
}*/
}

// Libary class contains 
// list of books.
class Library {

    // reference to refer to list of books.
    private final List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary() {

        return books;
    }

}

// main method
class Main {
    public static void main(String[] args) {

        // Creating the Objects of Book class.
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        // Creating the list which contains the 
        // no. of books.
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);

        List<Book> bks = library.getTotalBooksInLibrary();
        for (Book bk : bks) {

            System.out.println("Title : " + bk.title + " and "
                    + " Author : " + bk.author);
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
        }
    }
}