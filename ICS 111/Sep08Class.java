/**
* Sep 08 2021 Class.
* @author John Park
* @since 09/08/21
*/

//class declaration header
public class Sep08Class {
   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {
   
      //variables
      int i = 37;
      int j = 4; 
      int total = 0;
      
      total = i + j;
      
      //print area
      System.out.println(i + " + " + j + " = " + total);
      
      System.out.println(i + j);
      
      total = j - i;
      System.out.println(total);
      
      //multiplication
      total = j * i;
      System.out.println(total);
      System.out.println(j + " x " + i + " = " + total);
      
      //division
      total = i/j; //37/4 is not an integer!
      System.out.println(total);
      System.out.println(i + " / " + j + " = " + total);
      
      total = i % j; //modulus or remainder
      System.out.println(i + " % " + j + " = " + total);
   
   } //closes main method
} //closes class
