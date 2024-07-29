import model.Book;
import model.Bookstore;
import model.DigitalBook;
import model.PrintedBook;
import role.Admin;
import role.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        Bookstore store = new Bookstore(); // Polymorpisme

        Admin admin = new Admin("admin1", "password123");
        Customer customer = new Customer("cust1", "password456");

        Book book1 = new DigitalBook("Digital Book", "Author D", 10.99, 2.0);
        Book book2 = new PrintedBook("Printed Book", "Author P", 15.99, 1.0);

        admin.addBook(store, book1);
        admin.addBook(store, book2);

        store.displayBooks();

        customer.buyBook(store, book1);

        store.displayBooks();
    }
}
