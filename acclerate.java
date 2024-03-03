interface Vehicle {
    void accelerate();
  
    void brake();
  }
  
  class Car implements Vehicle {
  
    @Override
    public void accelerate() {
      System.out.println("Car is accelerating!");
    }
  
    @Override
    public void brake() {
      System.out.println("Car is braking!");
    }
  
    // Method overloading with speed parameter
    public void accelerate(int speed) {
      System.out.println("Car is accelerating to " + speed + " mph!");
    }
  
    // Method overloading with speed and duration parameters
    public void accelerate(int speed, int duration) {
      System.out.println("Car is accelerating to " + speed + " mph for " + duration + " seconds!");
    }
  }
  
  class Bicycle implements Vehicle {
  
    @Override
    public void accelerate() {
      System.out.println("Bicycle is pedaling to gain speed!");
    }
  
    @Override
    public void brake() {
      System.out.println("Bicycle is slowing down!");
    }
  
    // Method overloading with gear parameter
    public void accelerate(int gear) {
      System.out.println("Bicycle is shifting to gear " + gear + " to accelerate!");
    }
  }
  
  public class acclerate {
    public static void main(String[] args) {
      // Create Car and Bicycle objects
      Car car = new Car();
      Bicycle bicycle = new Bicycle();
  
      // Test overridden methods
      car.accelerate();
      car.brake();
      bicycle.accelerate();
      bicycle.brake();
  
      // Demonstrate method overloading
      car.accelerate(60);
      car.accelerate(80, 5);
      bicycle.accelerate(3);
    }
  }
  