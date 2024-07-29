package role;

import model.Book;
import model.Bookstore;

public class Customer extends User implements Action {
  public Customer(String username, String password) {
    super(username, password);
  }

  @Override
  public void addBook(Bookstore store, Book book) {
    System.err.println("Hanya Admin");
  }

  @Override
  public void removeBook(Bookstore store, Book book) {
    System.err.println("Hanya Admin");
  }

  @Override
  public void buyBook(Bookstore store, Book book) {
    store.sellBook(book);
    System.out.println("Customer bought the book: " + book.getTitle());
  }

  @Override
  public void performAction() {
    System.out.println("Customer performing an action.");
  }

  @Override
  public void displayUserInfo() {
    System.out.println("Customer Username: " + getUsername());
  }
}
