import java.util.Scanner;
public class numberCheck2 {
   static final double PI = 3.14159;
   static final int HALF_CIRCLE = 180;
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String temp = "";
      double deg;
      double rads;
      
      System.out.println("Hey");
      temp = sc.nextLine();
      System.out.println(temp);
      
      try {
         deg = Double.parseDouble(temp);
         rads = deg * PI / HALF_CIRCLE;
         System.out.println(deg + "herro" + rads + " herro");
      } catch (NumberFormatException nfe) {
         System.out.println("You did not enter a valid number");
      }
      
   }
}
