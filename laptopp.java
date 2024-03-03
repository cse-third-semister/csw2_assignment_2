class Laptop {
    private String model;
    private double price;
  
    public void setModel(String model) {
      this.model = model;
    }
  
    public void setPrice(double price) {
      this.price = price;
    }
  
    @Override
    public String toString() {
      return "Laptop{" +
        "model='" + model + '\'' +
        ", price=" + price +
        '}';
    }
  }
  
public class laptopp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setModel("Dell inspiron 15");
    
        System.out.println(laptop); // Output: Laptop{model='Dell XPS 15', price=0.0}
      }
    
}
