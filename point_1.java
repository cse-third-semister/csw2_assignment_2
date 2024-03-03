class Point {
    private int x;
    private int y;
  
 
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  

    public Point(Point other) {
      this.x = other.x;
      this.y = other.y;
    }
  
   
    public int getX() {
      return x;
    }
  
    public int getY() {
      return y;
    }
  

    public void setX(int x) {
      this.x = x;
    }
  
    public void setY(int y) {
      this.y = y;
    }
  
    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  

    
  }
public class point_1 {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        System.out.println("Point 1: " + point1);
    
        Point point2 = new Point(point1); 
        System.out.println("Point 2  copied: " + point2);
    
      
        point1.setX(5);
        point1.setY(6);
    
        System.out.println("Updated Point 1: " + point1);
        System.out.println("Point 2 remains unchanged: " + point2); 
      }
    
}
