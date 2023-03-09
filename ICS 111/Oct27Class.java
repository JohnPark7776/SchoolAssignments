import java.util.Scanner;
import java.util.Random;
/**
* Sep 20 2021 Class.
* @author John Park
* @since 10/27/21
*/

//class declaration header
public class Oct27Class {
   static final int SIZE = 5;
   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String[] wordList = new String[SIZE];
      String s = "";
      
      for(int i = 0; i < SIZE; i++) {
         System.out.println("Please enter word " + (i + 1));
         wordList[i] = sc.nextLine();
         
      }
      
      System.out.println("Here is your list of words:");
      for(int j = 0; j < SIZE; j++) {
         System.out.println(wordList[j]);
         
      }
      
         } //closes main method

} //closes class
