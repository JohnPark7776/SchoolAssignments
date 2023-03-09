import java.util.Scanner; //allows use of Scanner
import java.util.Random; //allows use of Random generator
import java.text.DecimalFormat; //allows use of DecimalFormat
/**
 * Creates random phone numbers depending on user choice.
 * @author John Park
 * @version 1.0
 * @since 10/18/21
*/
public class PhoneNumbersJohnpark {
   //constant variables

   /** main method.
   * @param args not used
   */
   public static void main(String[] args) {      /* catches possible error from user */
      //catch code
      
      try {
         //declarable variable
         Scanner userIn = new Scanner(System.in);
         Scanner userIn2 = new Scanner(System.in);
         String userChoice = "";
         String userChoice2 = "";
         /* Int variables for loop function */
         //Int variables
         int counter = 100;
         int limit = 100;
         int counter2 = 0;
         int limit2 = 0;

         //sentinel boolean
         boolean endLoop = false;
         //loop until stopping condition is given
         while (!endLoop) {
            //menu text
            System.out.println("\nPlease enter the number of your choice:");
            System.out.println("1. Print 1 phone number.");
            System.out.println("2. Print 10 phone numbers.");
            System.out.println("3. Print 25 phone numbers.");
            System.out.println("4. Print 50 phone numbers.");
            System.out.println("5. Print 75 phone numbers.");
            System.out.println("6. Print 100 phone numbers.");
            System.out.println("7. Choose amount of phone numbers to print.");
            System.out.println("8. Reuse input from 7.");
            System.out.println("0. Exit the program.");
            
            //Grabs input from user
            userChoice = userIn.nextLine();
            userChoice = userChoice.trim();
            
            
            //switch function to display results with user choice
            switch (userChoice) {
               case "0": endLoop = true; //sets sentient boolean to true
                  System.out.print("Bye!");
               break;
               case "1": limit = 1;
                  for (counter = 1; counter <= limit; counter++) {
                     System.out.println(counter + "\t" + generateNumber());
                  }
                  
               break;
               case "2": limit = 10;
                  for (counter = 1; counter <= limit; counter++) {
                     System.out.println(counter + "\t" + generateNumber());
                  }
                  
               break;
               case "3": limit = 25;
                  for (counter = 1; counter <= limit; counter++) {
                     System.out.println(counter + "\t" + generateNumber());
                  }
                  
               break;
               case "4": limit = 50;
                  for (counter = 1; counter <= limit; counter++) {
                     System.out.println(counter + "\t" + generateNumber());
                  }
                  
               break;
               case "5": limit = 75;
                  for (counter = 1; counter <= limit; counter++) {
                     System.out.println(counter + "\t" + generateNumber());
                  }
                  
               break;
               case "6": limit = 100;
                  for (counter = 1; counter <= limit; counter++) {
                     System.out.println(counter + "\t" + generateNumber());
                  } 
               break;
               case "7": System.out.println("Please input specific amount of phone numbers " 
                  + "to print.");
                  userChoice2 = userIn2.nextLine();
                  userChoice2 = userChoice2.trim();
                  counter2 = Integer.parseInt(userChoice2);
                  limit2 = Integer.parseInt(userChoice2);
                  for (counter2 = 1; counter2 <= limit2; counter2++) {
                     System.out.println(counter2 + "\t" + generateNumber());
                  }
               break;
               case "8": 
                  for (counter2 = 1; counter2 <= limit2; counter2++) {
                     System.out.println(counter2 + "\t" + generateNumber());
                  }
                  break;  
               default: System.out.println("*****Invalid menu choice.******" + "\n" 
                  + "Please enter either 0, 1, 2, 3, 4, 5, 6, 7, or 8" + "\n");
               break;
            } //closes switch
         } //closes while
      } catch (NumberFormatException nfe) {
         System.out.println("You did not enter a number! Exiting program.");
         
      }  // closes try/catch function
   } //closes main method
   /**
   * Creates a single phone number.
   * @return Returns phone number in DecimalFormat after being randomly generated
   */
   public static String generateNumber() {
      //declare variables
      Random ranNum = new Random();
      DecimalFormat aC = new DecimalFormat("(###)");
      DecimalFormat nT = new DecimalFormat(" ###-");
      DecimalFormat lF = new DecimalFormat("0000");
      
      
      /* Variables to only create certain random numbers for different section of phone # */
      //int variables for range
      int areaCode = 100;
      int aCRange = 800;
      int nextThree = 100;
      int nTRange = 751;
      int lastFour = 0;
      int lFRange = 9999;
      
      /* Grabs random number in certain range using int variables */
      //range creator
      int areaCodeR = ranNum.nextInt(aCRange - areaCode) + areaCode;
      int nextThreeR = ranNum.nextInt(nTRange - nextThree) + nextThree;
      int lastFourR = ranNum.nextInt((lFRange - lastFour) + 1) + lastFour;
      
      
      //prints phone number
      return aC.format(areaCodeR) + nT.format(nextThreeR) + lF.format(lastFourR);
      
      
   } //closes generateNumber method
   
} //closes class
