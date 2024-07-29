package model;

public class PrintedBook extends Book {
  // Encapsulation
  private double weight;

  // Constructor
  public PrintedBook(String title, String author, double price, double weight) {
    super(title, author, price);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Inilah Overriding
  @Override
  public void displayInfo() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Price: RP." + getPrice());
    System.out.println("Weight: " + weight + "kg");
  }
}
