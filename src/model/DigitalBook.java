package model;

public class DigitalBook extends Book {
  // Encapsulation
  private double fileSize;

  // Constructor
  public DigitalBook(String title, String author, double price, double fileSize) {
    super(title, author, price);
    this.fileSize = fileSize;
  }

  public double getFileSize() {
    return fileSize;
  }

  public void setFileSize(double fileSize) {
    this.fileSize = fileSize;
  }

  // Inilah Overriding
  @Override
  public void displayInfo() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Price: $" + getPrice());
    System.out.println("File Size: " + fileSize + "MB");
  }
}
