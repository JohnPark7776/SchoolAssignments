import java.util.Scanner; //allows use of Scanner

/**
 * Gets height and radius of cylinder from user to calculate area.
 * @author John Park
 * @since 09/15/21
*/
public class AreaOfACylinderJohnpark {
   /**
   * Constant Variables.
   */
   static final double PI = Math.PI;
   /** main method.
   * @param args not used
   */
   public static void main(String[] args) {
      
      Scanner userIn = new Scanner(System.in);
      //String variables
      String sIn = "";
      String sIn2 = "";
      
      //Number variables
      double radius = 0;
      double height = 0;
      double area = 0;
      
      //Tell user to enter radius
      System.out.println("Please enter the radius of your cylinder:");
      System.out.println("NOTE: Please input only numerical integers." 
         + " (decimals are okay)");
      
      //Get input from Scanner
      sIn = userIn.nextLine(); //reads keyboard until enter key is pressed
      
      //Change string to integer
      radius = Double.parseDouble(sIn);
      System.out.println("You have entered a radius of: " + radius);
      
      
      
      //Tell user to enter height
      System.out.println("Please enter the height of your cylinder:");
      System.out.println("NOTE: Please input only numerical integers."
         + "(decimals are okay)");
      
      //Get input from Scanner
      sIn2 = userIn.nextLine();
      
      //Change string to integer(2)
      height = Double.parseDouble(sIn2);
      System.out.println("You have entered a height of: " + height);
      
      //Computing the area of with given inputs
      area = (2 * PI * radius * height) + (2 * PI * radius * radius);
      System.out.printf("The area of the cylinder with given input is: "
         + "%.2f%n", area);
      
   } //closes main method
} //closes class
