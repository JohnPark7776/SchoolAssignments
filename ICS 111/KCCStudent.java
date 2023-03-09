/**
* Student Object in Class.
*/

public class KCCStudent {

   //**** Instance variables *****
   
   /** The student's name. */
   private String name = "";
   /** The student ID number. */
   private int id = 0;
   /** The student GPA. */
   private double gpa = -1.0;

   //**** Constructor ******
   /**
   * Makes a KCCStudent.
   * @param newName the Student name.
   * @param newID the Student id.
   * @param newGPA the Student's GPA
   */
   public KCCStudent(String newName, int newID, double newGPA) {
      this.name = newName;
      this.id = newID;
      this.gpa = newGPA;
   
   } //close constructor
   
   /** toString method.
   * used in printing
   * @return A String representation of the object.
   */
   public String toString() {
      String s = "Name: " + this.name;
      s = s + "\nID: " + this.id;
      s = s + "\nGPA: " + this.gpa;
      return s;
   }
   
   //Get Methods
   /**
   * gets the Student name.
   * @return the name
   */
   public String getName() {
      return this.name;
   }

   /**
   * gets the Student id.
   * @return the id number
   */
   public int getID() {
      return this.id;
   }
   
   /**
   * gets the Student gpa.
   * @return the gpa value
   */
   public double getGPA() {
      return this.gpa;
   }
   
   //Set methods.
   
   /** Set the student name.
   * @param n the new name.
   */
   public void setName(String n) {
      this.name = n;
   }
  /** Set the student id.
   * @param i the new id number.
   */ 
   public void setID(int i) {
      this.id = i;
   }
   /** Set the student gpa.
   * @param g the new gpa value.
   */
   public void setGPA(double g) {
      this.gpa = g;
   }

} //close class