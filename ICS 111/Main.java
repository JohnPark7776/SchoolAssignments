import java.util.Scanner; //allows use of Scanner
/**
* GradesYouJohnpark - To give the user their letter grade when inputting an integer between 0-100.
* @author John Park
* @version 1.0
* @since 10/05/2021
*/
public class Main {
   /**
   * main method.
   * @param args not used
   */
   public static void main(String[] args) {
      Scanner input =  new Scanner(System.in);
      int size = input.nextInt();
      
      int[] iNum = new int[size];
      
      for (int i = 0; i < size; i++) {
         String num = input.nextLine();
      String[] sNum = num.split(" ");
         iNum[i] = Integer.parseInt(sNum[i]);
         System.out.println("for" + iNum[i]);
      }
      
      
   }
}
