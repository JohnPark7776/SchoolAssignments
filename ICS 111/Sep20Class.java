import java.util.Scanner;
/**
* Sep 20 2021 Class.
* @author John Park
* @since 09/20/21
*/

//class declaration header
public class Sep20Class {
   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {
      
      Scanner sc;
   sc = new Scanner(System.in);
   String temp = "";
   int num1 = 0;
   
   System.out.println("Please rada rada");
   temp = sc.nextLine();
   
   num1= temp.length();
   System.out.println(num1);
   if (num1 <= 1) {
      System.out.println("Your string is: " + temp + ". Goodbye.\n");
   } else {
      System.out.println("Your String is: " + temp.substring(num1 / 2) + " " 
         + temp.substring(0, num1/2) + "\n");
   }
   
   } //closes main method

} //closes class
