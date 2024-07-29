package model;

import java.util.List;
import java.util.ArrayList;

public class Bookstore {
  // Encapsulation
  private List<Book> Books;

  // Constructor
  public Bookstore() {
    Books = new ArrayList<>();
  }

  public void addBook(Book book) {
    Books.add(book);
  }

  public void removeBook(Book book) {
    Books.remove(book);
  }

  public void sellBook(Book book) {
    Books.remove(book);
  }

  public void displayBooks() {
    for (Book book : Books) {
      book.displayInfo();
      System.out.println();
    }
  }
}