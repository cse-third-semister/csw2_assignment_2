// Interface for enrollment system functionalities
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course) throws EnrollmentException;
    void dropStudent(Student student, Course course) throws EnrollmentException;
    void getEnrollmentDetails(Student student) throws EnrollmentException;
  }
  
  // Exception class for enrollment related errors
  class EnrollmentException extends Exception {
    public EnrollmentException(String message) {
      super(message);
    }
  }
  
  // Class representing a Student
  class Student {
    private String id;
    private String name;
  
    public String getId() {
      return id;
    }
  
    public void setId(String id) {
      this.id = id;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    @Override
    public String toString() {
      return "Student [id=" + id + ", name=" + name + "]";
    }
  }
  
  // Class representing a Course
  class Course {
    private String code;
    private String name;
  
    public String getCode() {
      return code;
    }
  
    public void setCode(String code) {
      this.code = code;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    @Override
    public String toString() {
      return "Course [code=" + code + ", name=" + name + "]";
    }
  }
  
  // Class responsible for managing enrollments (high cohesion)
  class EnrollmentManager implements EnrollmentSystem {
  
    @Override
    public void enrollStudent(Student student, Course course) throws EnrollmentException {
      // Implement logic to enroll student in the course
      // Throw EnrollmentException if student already enrolled or other issues
      System.out.println(student + " is enrolled in " + course);
    }
  
    @Override
    public void dropStudent(Student student, Course course) throws EnrollmentException {
      // Implement logic to drop student from the course
      // Throw EnrollmentException if student not enrolled or other issues
      System.out.println(student + " is dropped from " + course);
    }
  
    @Override
    public void getEnrollmentDetails(Student student) throws EnrollmentException {
      // Implement logic to fetch and format student enrollment details
      // Throw EnrollmentException if student not found or other issues
     
      System.out.println(student);
    }
  }
  
  // Main class to demonstrate system functionality
  public class enrollment {
    public static void main(String[] args) {
      EnrollmentSystem enrollmentSystem = new EnrollmentManager();
  
      Student student1 = new Student();
      student1.setId("12345");
      student1.setName("John Doe");
  
      Course course1 = new Course();
      course1.setCode("CS101");
      course1.setName("Introduction to Computer Science");
  
      try {
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.getEnrollmentDetails(student1);
      } catch (EnrollmentException e) {
        System.err.println("Error: " + e.getMessage());
      }
    }
  }
  