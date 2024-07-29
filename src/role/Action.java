package role;

import model.Bookstore;
import model.Book;

public interface Action {
  void addBook(Bookstore store, Book book);

  void removeBook(Bookstore store, Book book);

  void buyBook(Bookstore store, Book book);

  void performAction();

  void displayUserInfo();
}
