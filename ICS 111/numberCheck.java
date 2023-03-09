import java.util.Scanner; //allows use of Scanner
public class numberCheck {
   public static void main(String[] args) {
      Scanner userIn = new Scanner(System.in);
      int numInput = 0;
      String scannerGrabber = "";
      System.out.println("Please enter an integer between 100~999");
      
      try {
         scannerGrabber = userIn.nextLine();
         scannerGrabber = scannerGrabber.replaceAll("\\s+", "");
         numInput = Integer.parseInt(scannerGrabber);
         if (numInput >= 100 && numInput <= 999) {
            System.out.println("Valid");
         } else {
            System.out.println("Invalid. Not between 100~999");
         }
      
      } catch (NumberFormatException nfe) {
         System.out.println("You did not enter an integer! Please enter an integer!");
      }
   }
}