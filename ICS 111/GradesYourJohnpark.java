import java.util.Scanner; //allows use of Scanner
/**
* GradesYouJohnpark - To give the user their letter grade when inputting an integer between 0-100.
* @author John Park
* @version 1.0
* @since 10/05/2021
*/
public class GradesYourJohnpark {
   /**
   * main method.
   * @param args not used
   */
   public static void main(String[] args) {
      //declare variables
      Scanner userIn = new Scanner(System.in);
      int gradeInput = 0;
      int gradeLetter = 0;
      boolean gradeTester = true;
      String scannerGrabber = "";
      System.out.println("Please enter an integer between 0~100 for your grade letter");
      
      /* Catches possible error from user */
      //catch code
      try {
         scannerGrabber = userIn.nextLine();
         System.out.println("You have entered " + scannerGrabber + ".");
         scannerGrabber = scannerGrabber.replaceAll("\\s+", "");
         gradeInput = Integer.parseInt(scannerGrabber);
      } catch (NumberFormatException nfe) {
         System.out.println("You did not enter an integer! Please enter an integer!");
         gradeTester = false;
      }
      
      /*Creates a numerical value from user to be added into a switch */
      //if else code
      if (gradeInput == 0 && gradeTester) {
         gradeLetter = 6;
      } else if (gradeInput < 0) {
         System.out.println("You entered an integer less than 0. " 
            + "Please input an integer between 0~100");
      } else if (gradeInput > 100) {
         System.out.println("You entered an integer greater than 100."
            + " Please input an integer between 0~100");
      } else if (gradeInput <= 59 && gradeInput > 0) {
         gradeLetter = 1;
      } else if (gradeInput <= 69 && gradeInput > 0) {
         gradeLetter = 2;
      } else if (gradeInput <= 79 && gradeInput > 0) {
         gradeLetter = 3;
      } else if (gradeInput <= 89 && gradeInput > 0) {
         gradeLetter = 4;
      } else if (gradeInput <= 99 && gradeInput > 0) {
         gradeLetter = 5;
      } else if (gradeInput == 100) {
         System.out.println("You got a 100?! How did you do that?! "
             + "Your grade is an A if you didn't know");
      }
      
      /* Switch code which gives the user their letter grade */
      //switch code
      switch (gradeLetter) {
         case 1: System.out.println("You got an F... Try better next time!");
         break;
         case 2: System.out.println("You got a D. Close, better luck next time!");
         break;
         case 3: System.out.println("You got a C. You passed but was that really your best?");
         break;
         case 4: System.out.println("You got a B! Pretty good!");
         break;
         case 5: System.out.println("You got an A! Good job!");
         break;
         case 6: System.out.println("You got a 0 meaning you got an F. Try harder next time!");
         break;
         default: System.out.println("Please try again!");
      }
      
      System.out.print("Have a great rest of your day!");
   } //closes main method
} //closes class
