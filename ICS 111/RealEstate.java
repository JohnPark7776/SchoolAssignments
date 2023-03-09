import java.util.Scanner; //Allows use of scanner
import java.util.InputMismatchException; //Allows use of this exception
import java.text.DecimalFormat; //Allows use of DecimalFormat
/**
 * Driver program for House.java & HouseException.java.
 * Does multiple methods based on user input
 * @author: John Park
 * @since 01/13/2022
*/
public class RealEstate {
   /**Constant Variables.**/
   static final int SIZE = 100;
   
    /** MLS Object. **/
   private static int mls = 0;
   /** Bedroom Object. **/
   private static int bedrooms = 0;
   /** Price Object. **/
   private static double price = 0;
   /** Seller's Name Object. **/
   private static String seller = "";
   
   /** House Array. **/
   private static House[] houseArray = new House[SIZE];

   /** Price DecimalFormat. **/
   private static DecimalFormat pf1 = new DecimalFormat("######0.00");
   
   /**
   * main method.
   * @param args not used
   * @throws HouseException for House h
   */
   public static void main(String[] args) throws HouseException {
      //declare global variables
      Scanner s = new Scanner(System.in);
      int tester = 0;
      int counter = 0;
      String choice = "";
      boolean endLoop = false;
      boolean endLoop2 = false;
      
      //welcome statement
      System.out.println("Welcome! This program is to " 
         + "add House(s) to your List!\n You may add up to 100 houses.\n");
      
      /** 
      * for loop to do actions based on user input.
      * Option 1: Adds House
      * Does not allow for duplicate MLS
      * Option 2: Removes House
      * Based on MLS entered by user
      * Option 3: Prints all houses <= user input price
      * Option 4: Prints all houses saved
      * Option 0: Exits program and thanks user
      */
      for (int i = 0; i < SIZE; i++) {
         System.out.println("Options:\n 1 = Add House\n 2 = Remove House\n "
            + "3 = Print House less than given price\n " 
            + "4 = Print all added House\n 0 = End Program");
         choice = s.nextLine().trim();

         while (!endLoop) {
         
            switch (choice) {
               case "1": 
                  /**
                  * Allows user to just re-input information
                  * instead of returning back to menu
                  */
                  while (!endLoop2) {
                     /* get House information from user */
                     //mls
                     if (tester == 0) {
                        tester = userMls(houseArray);
                     }
                     //bedrooms
                     if (tester == 1) {
                        tester = userBedrooms();
                     }
                     //price
                     if (tester == 2) {
                        tester = userPrice();
                     }
                     //seller
                     if (tester == 3) {
                        tester = userSeller();
                     }
                     if (tester == 4) {
                        House h = new House(mls, bedrooms, price, seller);
                        houseArray[i] = h;
                        System.out.println("This house was added to your list:" 
                           + "\n" + h.toString());
                        tester = 0;
                        endLoop = true;
                        break;
                     }
                  }
                  break;
               //removes house
               case "2": 
                  removeHouse(houseArray);
                  endLoop = true;
                  break;
               //prints houses <= price
               case "3":
                  priceChecker(houseArray);
                  endLoop = true;
                  break;
               //prints all houses
               case "4": 
                  printAll(houseArray);
                  endLoop = true;
                  break;
               //exits program
               case "0":
                  i = 10000;
                  endLoop = true;
                  break;
               default: 
                  System.out.println("Please input 0, 1, 2, 3, or 4 only");
                  i--;
                  endLoop = true;
                  break;
            }
         } //closes while loop
         //Restarts while loop if Option "0" isn't inputted
         if (i != 10000) {
            endLoop = false;
         } else {
            System.out.print("Thank You and Good Bye!");
         }
      } //closes for loop
   } //closes main
   
   /** 
   * userHouse function.
   * gets House MLS from user
   * @param hArray represents houseArray
   * @return Returns int number to either move on to Bedroom(1) or restart(0)
   * @throws HouseException for House h
   */
   public static int userMls(House[] hArray) throws HouseException {
      //declare variables
      Scanner sc = new Scanner(System.in);
      House h = new House(10001, 1, 1, "Ty");
      int sInput;
      boolean endLoop = false;
      
      //while loop to get House
      while (!endLoop) {
         try {
            System.out.println("Please enter House's MLS number");
            sInput = sc.nextInt();
            //tests whether MLS is already used or not
            if (mlsTest(hArray, sInput)) {
               System.out.println("Error! This MLS is already in use");
               endLoop = true;
               return 0;
            //inputs MLS if not used
            } else {
               h.setMls(sInput);
               mls = sInput;
               endLoop = true;
            } 
         } catch (HouseException he) {
            System.out.println(he.getMessage());
            endLoop = true;
            return 0;
         } catch (InputMismatchException ime) {
            System.out.println("Error! Please input only numbers");
            endLoop = true;
            return 0;
         }  
      } //closes while loop
      return 1;
   } //closes userHouse();
   
   /**
   * mlsTest function.
   * test if mls is already used or not
   * @param hArray represents houseArray
   * @param m represents mls from userHouse()
   * @return true or false whether mls is already used or not
   */
   public static boolean mlsTest(House[] hArray, int m) {
      //declare variables
      for (int i = 0; i < hArray.length; i++) {
         if (hArray[i] != null) {
            if (m == hArray[i].getMls()) {
               return true;
            } 
         }
      } //closes for loop
      return false;
   } //closes mlsTest()
   
   /**
   * userBedrooms function.
   * gets amount of Bedrooms from user
   * @return Returns int number to either move on to Price(2) or restart(1)
   * @throws HouseException for House h
   */
   public static int userBedrooms() throws HouseException {
      //declare variables
      Scanner sc = new Scanner(System.in);
      House h = new House(mls, 1, 1, "Ty");
      int sInput;
      boolean endLoop = false;
      
      //while loops to get amount of Bedroom(s)
      while (!endLoop) {
         try {
            System.out.println("Please enter amount of Bedroom(s).");
            sInput = sc.nextInt();
            h.setBedrooms(sInput);
            bedrooms = sInput;
            endLoop = true;
         } catch (HouseException he) {
            System.out.println(he.getMessage());
            return 1;
         } catch (InputMismatchException ime) {
            System.out.println("Error! Please input only numbers");
            return 1;
         }
      } //closes while loop
      return 2;
   } //closes userBedrooms()
   
   /** 
   * userPrice function.
   * gets price of house from user
   * @return Returns int number to either move on to seller(3) or restart(2)
   * @throws HouseException for House h
   */
   public static int userPrice() throws HouseException {
      //declare variables
      Scanner sc = new Scanner(System.in);
      House h = new House(mls, bedrooms, 1, "Ty");
      double sInput;
      boolean endLoop = false;
      
      //while loops to get amount of price
      while (!endLoop) {
         try {
            System.out.println("Please enter price of House.");
            sInput = sc.nextDouble();
            h.setPrice(sInput);
            price = sInput;
            endLoop = true;
         } catch (HouseException he) {
            System.out.println(he.getMessage());
            endLoop = true;
            return 2;
         } catch (InputMismatchException ime) {
            System.out.println("Error! Please input only numbers");
            endLoop = true;
            return 2;
         }
      } //closes while loop
      return 3;
   } //closes userPrice()
   
   /** 
   * userSeller function.
   * gets Seller's name from user
   * @return Returns int number to either move on(4) or restart(3)
   * @throws HouseException for House h
   */
   public static int userSeller() throws HouseException {
      //declare variables
      Scanner sc = new Scanner(System.in);
      House h = new House(mls, bedrooms, price, "Ty");
      String sInput = "";
      boolean endLoop = false;
      
      //while loops to get amount of price
      while (!endLoop) {
         try {
            System.out.println("Please enter Seller's name.");
            sInput = sc.nextLine();
            h.setSeller(sInput);
            seller = sInput;
            endLoop = true;
         } catch (HouseException he) {
            System.out.println(he.getMessage());
            endLoop = true;
            return 3;
         }
      } //closes while loop
      return 4;
   } //closes userSeller()
   
   /** 
   * removeHouse function.
   * remove House of user choice
   * @param hArray represents houseArray
   */
   public static void removeHouse(House[] hArray) {
      //declare variables
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      boolean test = false;
      
      System.out.println("Please enter the House's MLS you want to remove.");
      try {
         choice = sc.nextInt();
         for (int j = 0; j < hArray.length; j++) {
            while (hArray[j] != null) {
               int mlsRemoveTest = hArray[j].getMls();
               if (mlsRemoveTest == choice) {
                  System.out.println("MLS: " + choice + " removed.");
                  hArray[j] = null;
                  test = true;
                  break;
               }
               break; 
            }
         } //closes for(j) loop
         if (!test) {
            System.out.println("There was no house with that MLS.");
         }
      } catch (InputMismatchException ime) {
         System.out.println("Error! Please input only numbers");
      }
   } //closes removeHouse()
   
   /** 
   * priceChecker() function.
   * prints all houses <= price
   * @param hArray represents houseArray
   */
   public static void priceChecker(House[] hArray) {
      try {
         System.out.println("Please input the price you can afford.");
         //declare variables
         Scanner sc = new Scanner(System.in);
         double sInput = sc.nextDouble();
         double pCheckTest;
         int counter = 1;
         boolean contain = true;
         
         System.out.println("You have entered " + pf1.format(sInput) + ".\n");
         
         //for loop to look for prices and print <= sInput
         for (int i = 0; i < hArray.length; i++) {
            if (houseArray[i] != null) {
               pCheckTest = hArray[i].getPrice();
               if (pCheckTest <= sInput) {
                  System.out.println((counter) + ". " + hArray[i].toString());
                  counter += 1;
               } 
               
            }
         } //closes for loop
         if (counter == 1) {
            System.out.println("There is no Houses equal "
               + "or cheaper than price.");
         }
      } catch (InputMismatchException ime) {
         System.out.println("Error! Please input only numbers.\n");
      } 
   } //closes priceChecker()
   
   /**
   * printAll() function.
   * prints all houses saved
   * @param hArray represents houseArray
   */
   public static void printAll(House[] hArray) {
      System.out.println("\nHere are the Houses we have so far:\n");
      //declare variables
      int counter = 1;
      for (int i = 0; i < hArray.length; i++) {
         if (hArray[i] != null) {
            System.out.println((counter) + ". " + hArray[i].toString());
            counter += 1;
         }
      } //closes for loop
   } //closes printAll()

} //closes class
