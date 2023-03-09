import java.util.Random; //allows use of Random generator
import java.util.Collections; //allows use of reversing
import java.util.ArrayList; //allows Array List
import java.util.Arrays;
/**
 * Generates random Ints and creates histograms to equal the int.
 * @author John Park
 * @version 1.0
 * @since 10/30/21
*/
public class ArraysAndHistogramsJohnpark {
   //constant variables
   /** static final int SIZE for amount of random arrays to be generated. */
   static final int SIZE = 50; 
   /** static final int RMIN for minimum number to be generated. */
   static final int RMIN = 5; 
   /** static final int RMAX for maximum number to be generated. */
   static final int RMAX = 45; 
   /** main method.
   * @param args not used
   */
   public static void main(String[] args) {
      //Declare variables
      int[] arr = new int[SIZE]; //int array to hold ints as it's being generated
      String[] arrS = new String[SIZE]; //For turning Array List into String
      int sizeLength = arr.length; //Equals to final int SIZE
      int ranNumGen = 0; //Calls the rG() function for random number
      int reversedRanNum = 0; //Input for the histoMaker function
      String intToString = ""; //Turning the int into String
      ArrayList<String> arrLi = new ArrayList<String>(); //String Arraylist to reverse array
         
      System.out.println("Arrays:" + "\n"); 
      /* for Loop to display arrays and the reversed with histogram */
      //for loop function
      for (int i = 0; i < sizeLength; i++) {
         //reassigning variables
         ranNumGen = rG(); //generates random number
         arr[i] = ranNumGen; //Assigns the array with the random number
         intToString = String.valueOf(ranNumGen); //Turns random number into a string
         arrLi.add(intToString); //adds the string into String ArrayList
         //prints random number with a space underneath
         System.out.println(i + 1 + ". " + arr[i] + "\n"); 
         /** if statement starts after 50 random arrays are generated. 
         * create dash and reverse array list
         */
         if (i == (SIZE - 1)) {
         
            System.out.println("\n" + "-----------------------------------" 
               + "-------------------------------" + "\n" + "\n" 
               + "\n" + "Histograms:" + "\n");
            Collections.reverse(arrLi); //reverses the arrays
            
            //for loop for printing reversed arrays
            for (int u = 0; u < sizeLength; u++) {
               //ArraysList "object" to Arrays string[]
               arrS = arrLi.stream().toArray(String[]::new); 
               //Turns string[] into integer for histoMaker function
               reversedRanNum = Integer.parseInt(arrS[u]); 
               /* prints the reversed int with histograph from histoMaker.
               * if statement to make the histograph print all lined up
               * adds counter to easily see amount of numbers generated
               */
               if (reversedRanNum <= 9) {
                  System.out.println(u + 1 + ". " + reversedRanNum + "\t\t" 
                     + histoMaker(reversedRanNum) + "\n");
               } else if (u <= 8) {
                  System.out.println(u + 1 + ". " + reversedRanNum + "\t\t" 
                     + histoMaker(reversedRanNum) + "\n");
               } else {
                  System.out.println(u + 1 + ". " + reversedRanNum + "\t"  
                     + histoMaker(reversedRanNum) + "\n");
               } //ends if/else statement
               
            } //ends for loop with int u
               
         } //ends if statement with @param i==(SIZE - 1)
         
      } //ends main for loop
      
   } //closes main method
   
   /** randomNumberGenerator Function.
   * Creates integers in a range of 5 - 45.
   * @return Returns random integers in the range between 5 - 45
   */
   public static int rG() {
      //java.util declaration
      Random ranNum = new Random();

      /* Grabs random number in certain range using int variables */
      //range creator
      int range = ranNum.nextInt((RMAX - RMIN) + 1) + RMIN;
      
      
      /* returns random integer between 5 - 45 */
      //return
      return range;
      
   } //closes rangeGenerator
   
   /** histoMaker function.
   * @param reversedRanNum An integer containing
   * Creates histograph according to integer received and sends back as string.
   * @return Returns amount of "*" according to reversedRanNum back as String
   */
   public static String histoMaker(int reversedRanNum) {
      //declare variables
      int receivedRanNum = reversedRanNum;
      StringBuilder builder = new StringBuilder();
      for (int j = 0; j < receivedRanNum; j++) {
         builder.append("*");
      }
      return builder.toString(); //returns histograph as string
   } //closes histoMaker

} //closes class
