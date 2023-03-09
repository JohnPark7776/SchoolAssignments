import java.util.Scanner; //allows use of Scanner

/**
 * Sep 13 2021 Class.
 * @author John Park
 * @since 09/13/21
*/

//class declaration header
public class UserInput {
   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {

      Scanner userIn = new Scanner(System.in);
      
      String sIn = new String("");
      String sIn2 = 4;
      
      //process:
      
      //tell the user what to do, what should they enter?
      System.out.println("Please enter your name");
      
      //get the input from the scanner
      sIn = userIn.nextLine(); //reads keyboard until enter key is pressed
      
      //use the input
      System.out.println("You entered your name as: " + sIn);
      
      //ask for more info
      System.out.println("Please enter your favorite color: ");
      
      sIn2 = userIn.nextLine();
      System.out.println("You entered your favorite color as: " + sIn2);
      
      System.out.println(sIn + "'s favorite is " + sIn2);
      
      int num2 = Double.parseDouble(sIn2);
      

   } //closes main method
} //closes class
