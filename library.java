 abstract class LibraryResource {
    private String title;
    private String author;
  
    public LibraryResource(String title, String author) {
      this.title = title;
      this.author = author;
    }
  
    public String getTitle() {
      return title;
    }
  
    public void setTitle(String title) {
      this.title = title;
    }
  
    public String getAuthor() {
      return author;
    }
  
    public void setAuthor(String author) {
      this.author = author;
    }
  
    public abstract void displayDetails();
  }
  
class Book extends LibraryResource {
   
    private int pageCount;
  
    public Book(String title, String author, int pageCount) {
      super(title, author);
      this.pageCount = pageCount;
    }
   
  
    public int getPageCount() {
      return pageCount;
    }
  
    public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
    }
  
    @Override
    public void displayDetails() {
        
      System.out.println("** Book Details **");
      System.out.println("Title: " + getTitle());
      System.out.println("Author: " + getAuthor());
      System.out.println("Page Count: " + getPageCount());
    }
  }
  
   class Magazine extends LibraryResource {
    private String issueDate;
  
    public Magazine(String title, String author, String issueDate) {
      super(title, author);
      this.issueDate = issueDate;
    }
  
    public String getIssueDate() {
      return issueDate;
    }
  
    public void setIssueDate(String issueDate) {
      this.issueDate = issueDate;
    }
  
    @Override
    public void displayDetails() {
      System.out.println("** Magazine Details **");
      System.out.println("Title: " + getTitle());
      System.out.println("Author: " + getAuthor());
      System.out.println("Issue Date: " + getIssueDate());
    }
  }
  
 class DVD extends LibraryResource {
    private int duration;
  
    public DVD(String title, String author, int duration) {
      super(title, author);
      this.duration = duration;
    }
  
    public int getDuration() {
      return duration;
    }
  
    public void setDuration(int duration) {
      this.duration = duration;
    }
  
    @Override
    public void displayDetails() {
      System.out.println("** DVD Details **");
      System.out.println("Title: " + getTitle());
      System.out.println("Author: " + getAuthor());
      System.out.println("Duration (mins): " + getDuration());
    }
  }
  
  public class library {
    public static void main(String[] args) {
      LibraryResource book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1178);
      LibraryResource magazine1 = new Magazine("National Geographic", "Various", "2023-10-01");
      LibraryResource dvd1 = new DVD("The Shawshank Redemption", "Frank Darabont", 142);
  
      // Display details for each resource
      book1.displayDetails();
      magazine1.displayDetails();
      dvd1.displayDetails();
    }
  }
  