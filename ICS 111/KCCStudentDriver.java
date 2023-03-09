/**
* Driver class for KCCStudent
*/
public class KCCStudentDriver {

   public static void main (String[] args) {
   
      //Testing the constructor
   
      KCCStudent s1 = new KCCStudent("Bobby Smith", 1, 3.0);
      KCCStudent s2 = new KCCStudent("Sandy Jones", 2, 2.75);
      KCCStudent s3 = new KCCStudent("Reggie Grant", 3, 4.0);


      
      // Testing the toString method
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      
      s2.setName("Carl Smith");
      s3.setID(4);
      s1.setGPA(3.98);
      
          
      //not allowed due to private instance variables
      //s2.name = "John Smith";
      //s3.gpa = 53321.43;
      
      //use get methods for access to instance variables  

      String sName = s2.getName();
      System.out.println("S2's name is: " + sName);
      
      int sID = s3.getID();
      System.out.println("S3's id is: " + sID);
      
      double sGPA = s1.getGPA();
      System.out.println("S1's gpa is: " + sGPA);
   
      System.out.println(s1.toString());
      System.out.println(s2);
      System.out.println(s3);
   } //close main
} //close class