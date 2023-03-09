import java.util.Scanner; //allows use of Scanner
/**
* To get 3 input from user and find average length of chars.
* @author John Park
* @since 09/22/2021
*/
public class FunWithStringsJohnpark {
   /**
   * main method.
   * @param args not used
   */
   public static void main(String[] args) {
      //declare variables
      Scanner userIn = new Scanner(System.in);
      String sIn1 = "";
      String sIn2 = "";
      String sIn3 = "";
      
      //asks user for String input
      System.out.println("Please enter a string.");
      //read a String from user
      sIn1 = userIn.nextLine();
      //reads back what user has entered
      System.out.println("The first String you entered is: " + "'" + sIn1 
         + "'" + ", " + "it is " + sIn1.length() + " characters long.");
      
      //asks user for String input 2
      System.out.println("Please enter a second string.");
      //read a String from user
      sIn2 = userIn.nextLine();
      //reads back what user has entered
      System.out.println("The second String you entered is: " + "'" + sIn2 
         + "'" + ", " + "it is " + sIn2.length() + " characters long.");
      
      //asks user for String input 3
      System.out.println("Please enter a third string.");
      //read a String from user
      sIn3 = userIn.nextLine();
      //reads back what user has entered
      System.out.println("The third String you entered is: " + "'" + sIn3 
         + "'" + ", " + "it is " + sIn3.length() + " characters long.");
      
      
      //sends strings to averageStrings method
      //this assumes your String variables are named sIn1, sIn2, sIn3
      averageStrings(sIn1, sIn2, sIn3);
      //send strings to replaceChars method
      replaceChars(sIn1, sIn2, sIn3);
      
      //print final message
      System.out.print("Good bye! Hope you have a nice day!");
   
   } //closes main method
   /**
   * Prints lengths and average length of Strings.
   *
   * @param s1 The first String
   * @param s2 The second String
   * @param s3 The third String
   */
   public static void averageStrings(String s1, String s2, String s3) {
   
      //do assigned stuff to strings and print out in here
      //Variables
      int s1Char = s1.length();
      int s2Char = s2.length();
      int s3Char = s3.length();
      double dS1Char = 0;
      double dS2Char = 0;
      double dS3Char = 0;
      //Changes int to double
      dS1Char = (double) s1Char;
      dS2Char = (double) s2Char;
      dS3Char = (double) s3Char;
      
      //average formula
      double charAvgForm = 0;
      String charAvgFormS = "";
      charAvgForm = (dS1Char + dS2Char + dS3Char) / 3; //gets the average
      charAvgFormS = String.format("%.2f", charAvgForm); //changes double to String
      //prints result
      System.out.printf("The average length of your Strings is: " + charAvgFormS
         + " characters." + "\n");
   } //end averageStrings
   /**
   * Replaces chars in three Strings.
   *
   * @param s1 The first String.
   * @param s2 The second String.
   * @param s3 The third String.
   */
   public static void replaceChars(String s1, String s2, String s3) {
   
      //do assigned stuff to strings to print out in here
      //variables
      String replaceS1 = s1.replace("e", "o");
      String replaceS2 = s2.replace("a", "i");
      String replaceS3 = s3.replace("s", "z");
      //print out new string with letters replaced
      System.out.println("The changed first string: " + replaceS1);
      System.out.println("The changed second string: " + replaceS2);
      System.out.println("The changed third string: " + replaceS3);
   } //end replaceChars
   
} //closes class
