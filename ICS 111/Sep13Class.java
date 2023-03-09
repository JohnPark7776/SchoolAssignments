/**
 * Sep 13 2021 Class.
 * @author John Park
 * @since 09/13/21
*/

//class declaration header
public class Sep13Class {
   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {

      //variables
      int x = 7;
      int y = 19;
      boolean isGreater;
      boolean isSmaller;
      boolean isEqual;
      
      isGreater = x > y;
      isSmaller = x < y;
      isEqual = x == y;
      
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      
      System.out.println("x > y? " + isGreater);
      System.out.println("X < y? " + isSmaller);
      System.out.println("x == y? " + isEqual);
      
      //make x equal to y
      x = y;
      
      //compare again
      isGreater = x >= y;
      isSmaller = x <= y;
      
      isEqual = x == y;
      
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      
      System.out.println("x > y? " + isGreater);
      System.out.println("X < y? " + isSmaller);
      System.out.println("x == y? " + isEqual); 
   } //closes main method
} //closes class