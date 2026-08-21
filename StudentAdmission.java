public class StudentAdmission{
  int rollno;
  String name;
  String course;
  int sem;
  double fees;

  // Default constructor
 StudentAdmission() {
   this.rollno = 0;
   this.name = "Unknown";
   this.course = "Not Known";
   this.sem = 1;
   this.fees = 0;
   }

  // Constructor with only name
  StudentAdmission(String name) {
   this.name = name;
   }

  // Constructor with name and course
   StudentAdmission(String name, String course) {
    this.name = name;
    this.course = course;
    }

   // Constructor with all values
   StudentAdmission(int rollno, String name, String course, int sem, double fees) {
     this.rollno = rollno;
     this.name = name;
     this.course = course;
     this.sem = sem;
     this.fees = fees;
    }

  // Duplicate constructor
   StudentAdmission(StudentAdmission s) {
    this(s.rollno, s.name, s.course, s.sem, s.fees);
    }

   void displayStudent() {
     System.out.println("Roll Number : " + rollno);
     System.out.println("Name : " + name);
     System.out.println("Course : " + course);
     System.out.println("Semester : " + sem);
     System.out.println("Fees : " + fees);
    }

   // Calculate remaining fees after paying some amount
   void CalculateRemainingFees(double paid) {
       double remaining = fees - paid;
       System.out.println("Remaining Fees : " + remaining);
    }

 public static void main(String args[]) {

 StudentAdmission s1 = new StudentAdmission();
 System.out.println("Default Constructor:");
 s1.displayStudent();

 StudentAdmission s2 = new StudentAdmission("Sapna");
 System.out.println("\nName Only:");
 s2.displayStudent();

 StudentAdmission s3 = new StudentAdmission("Sapna", "BCA");
 System.out.println("\nName and Course:");
 s3.displayStudent();

 StudentAdmission s4 = new StudentAdmission(101, "Sapna", "BCA", 3, 50000);
 System.out.println("\nAll Details:");
 s4.displayStudent();

 s4.CalculateRemainingFees(30000);

 StudentAdmission s5 = new StudentAdmission(s4);
 System.out.println("\nCopy Constructor:");
 s5.displayStudent();
    }
}