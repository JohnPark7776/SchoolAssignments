import java.util.Scanner;
import java.util.Random;
/**
* Sep 20 2021 Class.
* @author John Park
* @since 10/13/21
*/

//class declaration header
public class Oct13Class {
   static final int MAX = 6;
   static final int MIN = 1;
   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {
      
      Random ranGen = new Random(); //generator
      double dNum = 0.0;
      double dNum2 = 0.0;
      double tolerance = 0.00001;
      double difference = 0.0;
      float fNum = 0;
      int i = ranGen.nextInt();
      int j = ranGen.nextInt();
      
      //generate random double
      //will be between 0.0 and 1.0
      dNum = ranGen.nextDouble();
      System.out.println(dNum);
      
      //generate random float
      fNum = ranGen.nextFloat();
      System.out.println(fNum);
      
      //compare to random doubles for equality
      dNum = ranGen.nextDouble();
      dNum2 = ranGen.nextDouble();
      //calculates difference
      difference = Math.abs(dNum - dNum2);
      if (difference < tolerance) {
         System.out.println(dNum + " is equal to " + dNum2);
         System.out.println("The difference is: " + difference);
      } else {
         System.out.println(dNum + " is not equal to " + dNum2);
         System.out.println("The difference is: " + difference);
      }
      
      //generate ints with range
      //between 0 - 5
      i = ranGen.nextInt(6);
      j = ranGen.nextInt(6);
      
      System.out.println(i);
      System.out.println(j);
      
      //numbers within a range not starting at 0
      //numbers between MAX and MIN values
      i = (ranGen.nextInt(MAX - MIN + 1) + MIN);
      System.out.println(i);

   } //closes main method

} //closes class
