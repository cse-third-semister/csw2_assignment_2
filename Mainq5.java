 /*class College {
    private String collegeName;
    private String collegeLoc;
  
    public College(String collegeName, String collegeLoc) {
      this.collegeName = collegeName;
      this.collegeLoc = collegeLoc;
    }
  
    public String getCollegeName() {
      return collegeName;
    }
  
    public String getCollegeLoc() {
      return collegeLoc;
    }
  
    @Override
    public String toString() {
      return "College{" +
        "collegeName='" + collegeName + '\'' +
        ", collegeLoc='" + collegeLoc + '\'' +
        '}';
    }
  }
  
 class Student {
    private int studentId;
    private String studentName;
    private College college;
  
    public Student(int studentId, String studentName, College college) {
      this.studentId = studentId;
      this.studentName = studentName;
      this.college = college;
    }
  
    public int getStudentId() {
      return studentId;
    }
  
    public String getStudentName() {
      return studentName;
    }
  
    public College getCollege() {
      return college;
    }
  
    public void displayStudentInfo() {
      System.out.println("Student ID: " + studentId);
      System.out.println("Student Name: " + studentName);
      System.out.println("College: " + college.getCollegeName() + " (" + college.getCollegeLoc() + ")");
    }
  }
  
  public class Mainq5 {
    public static void main(String[] args) {
    
      College college1 = new College("MIT", "Cambridge, MA");
      College college2 = new College("Stanford University", "Stanford");
  
   
      Student student1 = new Student(1001, "Alice", college1);
      Student student2 = new Student(1002, "Bob", college2);
  
  
      System.out.println("Colleges:");
      System.out.println(college1);
      System.out.println(college2);
  
     
      System.out.println("\nStudents:");
      student1.displayStudentInfo();
      student2.displayStudentInfo();
    }
  }*/
  