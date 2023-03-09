/**
* Sep 27 2021 Class.
* @author John Park
* @since 09/29/21
*/

//class declaration header
public class Sep29Class {
   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {
      
      int x = 34; 
      int y = 9;
      boolean isTF = false;
      isTF = x > y; //assign true or false to variable

      
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      
      //only executes statement inside if condition is true
      if (x < y) {
         System.out.println("x is less than y");
      
      } else if (x > y) {
         System.out.println("x is greater than y");
      } else {
         System.out.println("x is equal y");
      }

      System.out.print("Goodbye");
      
   } //closes main method
} //closes class
