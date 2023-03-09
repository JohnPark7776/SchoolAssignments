import java.util.Scanner; //allows use of Scanner
import java.util.stream.DoubleStream; //allows use of DoubleStream
/**
* ArrayOfGradesJohnpark - let's user input, up to 10, grades then get average.
* @author John Park
* @version 1.0
* @since 11/07/2021
*/
public class ArrayOfGradesJohnpark {
   //constant variables
   /** static final double SIZE for amount of random arrays to be generated. */
   static final int SIZE = 10;
   /**
   * main method.
   * @param args not used
   */
   public static void main(String[] args) {
      //declared variables
      double[] gArray = new double[SIZE];
      double grade = 0.0;
      double tester = 101;
      int counter = 0;
      double sumGrade = 0.0;
      double rGrade = 0.0;
      
      //boolean variables
      boolean endLoop = false;
      
      //print statement to welcome user and issue rules
      System.out.println("Hello! Please input up 10 grades/numbers then it will " 
         + "show all inputs from you and give you the average." + "\n" 
         + "If you have less than 10 grades, please just press 'enter'." 
         + "\n" + "Please input only numbers between 0 - 100. Decimals are " 
         + "allowed." + "\n");
      
      //while loop which adds up to 10 grades from user
      while (!endLoop) {
         //calls theLoop() and put info into tester to see if it's valid input
         tester = userGrade(counter + 1);
         //Checks if user only press enter
         if (tester == 12345.12345) {
            endLoop = true;
         } 
         //Input user grade into array of number between 0 - 100
         else if (tester >= 0 && tester <= 100) {
            grade = tester;
            gArray[counter] = grade;
            counter += 1;
            tester = 101;
            //if statement to stop at 10 grades
            if (counter == 10) {
               endLoop = true;
            } //ends counter if statement
         } //ends else if statement
      } //ends while loop
      
      System.out.println("Output: " + "\n");
      
      //for loop to print all grades in array
      for (int i = 0; i < 10; i++) {
         if (gArray[i] != 0.0d) {
            System.out.println("Grade " + (i + 1) + ": " 
               + gArray[i] + "%");
         }
      }
      
      System.out.println("Number of grades entered: " + counter + "\n");
      //Gets average of grade
      sumGrade = DoubleStream.of(gArray).sum();
      System.out.printf("Average grade: " 
         + "%.2f%%", roundGrade(sumGrade, counter));
      
   }
   /** 
   * userGrade function.
   * @param counter int containing
   * gets grade from user
   * @return Returns either user input or 12345.12345 when user presses only 'enter'
   */
   public static double userGrade(int counter) {
      //declared variables
      Scanner input = new Scanner(System.in);
      String sInput = "";
      double numInput = 101;
      boolean endLoop = false;
      
      //while loop to test if space is empty and valid input
      while (!endLoop) {
         System.out.println("Please enter grade " + counter);
         //try/catch for non number input
         try {
            sInput = input.nextLine().trim();
            //tests if user just presses 'enter'
            if (sInput.isEmpty()) {
               endLoop = true;
               return 12345.12345;
            }
            //if something is inputted, changes to double 
            numInput = Double.parseDouble(sInput);
            
            //tests if input is between 0 and 100
            if (numInput >= 0 && numInput <= 100) {
               counter += 1;
               endLoop = true;
            } else if (numInput < 0 || numInput > 100) {
               System.out.println("Please input number between 0 - 100");
               endLoop = true;
            }
            
         } catch (NumberFormatException nfe) {
            System.out.println("Please input number between 0 - 100");
            endLoop = true;
         } //ends try/catch
      } //closes while loop
      return numInput;
   } //closes userGrade
   
   /**
   * roundGrade function.
   * @param sumGrade double containing
   * @param counter int containing
   * Rounds the sum of all numbers in gArray
   * @return Returns rounded grade or 0 if enter is entered
   * right in the beginning 
   */
   public static double roundGrade(double sumGrade, int counter) {

      //declare variables
      double rGrade = sumGrade / counter;
      
      //if statement to check if NaN
      if (Double.isNaN(rGrade)) {
         return 0;
      } 
      return rGrade;
   } //closes roundGrade
} //closes class
