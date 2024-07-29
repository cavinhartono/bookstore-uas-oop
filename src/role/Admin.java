package role;

import model.Book;
import model.Bookstore;

public class Admin extends User implements Action {
  // Constructor
  public Admin(String username, String password) {
    super(username, password);
  }

  @Override
  public void addBook(Bookstore store, Book book) {
    store.addBook(book);
    System.out.println("Admin added a new book: " + book.getTitle());
  }

  @Override
  public void removeBook(Bookstore store, Book book) {
    store.removeBook(book);
    System.out.println("Admin removed the book: " + book.getTitle());
  }

  @Override
  public void buyBook(Bookstore store, Book book) {
    System.err.println("Hanya Customer yang bisa");
  }

  // Inilah Overriding
  @Override
  public void performAction() {
    System.out.println("Admin performing an action.");
  }

  // Inilah Overriding
  @Override
  public void displayUserInfo() {
    System.out.println("Admin Username: " + getUsername());
  }
}
