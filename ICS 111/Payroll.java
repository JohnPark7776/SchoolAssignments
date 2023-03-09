import java.util.Random; //Allows use of random generator
import java.util.Scanner; //Allows use of Scanner
import java.util.InputMismatchException; //Allows use of this exception
import java.text.DecimalFormat; //Allows use of DecimalFormat
import java.util.stream.IntStream; //Allows use of stream
/**
 * Displays Payroll for the amount of Employee(s).
 * from user
 * @author John Park
 * @version 1.0
 * @since 01/26/2022
*/
public class Payroll {
   /** Constant Variable, Days.*/
   private static final int DAYS = 5; 
   /** Constant variable, EMP. */
   private static final int EMP = 20;
   /** Constant variable, Regular Hours. */
   private static final int REGHOURS = 40;
   /** Constant variable, Regular Pay. */
   private static final double REGPAY = 14.50;
   /** Constant variable, Overtime Pay. */
   private static final double OTPAY = 21.75;
   
   /** DecimalFormat, 0.00.*/
   private static final DecimalFormat MONEY = new DecimalFormat("$###,##0.00");
   
   /** main method.
   * @param args not used
   */
   public static void main(String[] args) {
      //declare variables
      Scanner sc = new Scanner(System.in);
      int amountOfEmp = 0;
      int[][] empPayroll = new int[EMP][DAYS];
      
      
      //Welcome statements
      System.out.println("Welcome! Please input the amount of Employees " 
         + "you would like to get the Payroll for. \nWe will display how many "
         + "hours worked they worked per day, how much they earned during the "
         + "week, \nand also how much overtime if any.\n");
      //Instructions
      System.out.println("Please input the amount of Employees.(5-20)");
      
      /**
      * get amount of Employees from user  (5-20)
      * get amount of hours worked
      * get amount of hours worked per day 
      * from 0 - 12 hours
      * Regular hours = 14.50
      * overtime = 21.75 (over 40 hours)
      */
      try {
         amountOfEmp = sc.nextInt();
         if (amountOfEmp >= 5 && amountOfEmp <= 20) {
            calculatePayroll(empPayroll, amountOfEmp);
            System.out.println("\nThanks for using our program. Good-bye!");
         } else {
            System.out.println("Error! Please input amount of only 5-20.");
            System.out.println("Good-bye");
         }
      } catch (InputMismatchException ime) {
         System.out.println("Error! Please input amount of only 5-20.");
         System.out.println("Good-bye");
      }
      
   } //closes main method
   /**
   * calculatePayroll method.
   * Prints amount of hours worked per day
   * Print amount of employee(s) worked overtime
   * Print amount earned per week ($0.00)
   * @param arr represents empPayroll
   * @param empAmt represents amountOfEmployee
   */
   public static void calculatePayroll(int[][] arr, int empAmt) {
      //declare variables
      
      /** int[] hours stores hours from hoursGenerator()
      * to put into calcHours() method and get total
      */
      int[] hours = new int[empAmt];
      /** String[] otEmployee stores int i into 
      * String to display for which Employees
      * worked overtime.
      */
      String[] otEmployee = new String[empAmt];
      /** int[] otHours store overtime Hours 
      * to display 
      */
      int[] otHours = new int[empAmt];
      int counter = 0; //Counts amount of Employee who worked overtime
      
      /* Prints amount of hours worked per day */
      
      for (int i = 0; i < empAmt; i++) {
         System.out.print("\nEmployee " + (i + 1));
         System.out.println("\nMon\tTues\tWed\tThurs\tFri");
         
         for (int j = 0; j < DAYS; j++) {
            arr[i][j] = hoursGenerator();
            hours[j] = arr[i][j];
            //Prints hours worked and amount of spaces based on #
            if (arr[i][j] < 10) { 
               System.out.print(" " + arr[i][j] + " \t");
            } else {
               System.out.print(" " + arr[i][j] + "\t");
            }
            //calculates all hours of employee
            if (j == (DAYS - 1)) {
               int sum = IntStream.of(hours).sum();
               double c = calcHours(sum);
               if (sum > 40) {
                  System.out.println("\nTotal worked: " + sum  
                     + " hours\tTotal overtime: " + (sum - 40) 
                     + " hour(s)\tAmount paid: " + MONEY.format(c));
                  otEmployee[counter] = String.valueOf((i + 1));
                  otHours[counter] = (sum - 40);
                  counter += 1;
                  
                  
               } else {
                  System.out.println("\nTotal worked: " + sum 
                     + " hours\tTotal overtime: 0 hour(s)\tAmount paid: " 
                     + MONEY.format(c));
               }
               
            }
         }
      } //closes Employee Hours worked for(i) loop
      System.out.println("\nAmount of Employees worked overtime: " + counter);
      if (counter > 0) {
         for (int k = 0; k < counter; k++) {
            if (otEmployee != null) {
               System.out.println((k + 1) + ". Employee " 
                  + otEmployee[k] + " = " + otHours[k] + " hour(s).");
            }
         }
      } //closes if statement
   } //closes calculatePayroll()
   /**
   * hoursGenerator method.
   * generates random amount of hours 
   * from 0 - 12
   * @return Returns int hours
   */
   public static int hoursGenerator() {
      //declare variables
      Random r = new Random();
      int minHours = 0;
      int maxHours = 12;
      
      //random generator
      int ranHours = r.nextInt((maxHours - minHours) + 1) + minHours;
      
      return ranHours;
   } //closes hoursGenerator()
   /**
   * calcHours method.
   * calculates pay by amount of hours
   * @param s represents sum from calculatePayroll
   * @return double of total hours of employee
   */
   public static double calcHours(int s) {
      //declare variables
      double reg = REGHOURS * REGPAY;
      double total;
      double overtime;
      if (s <= 40) {
         total = s * REGPAY;
         return total;
      } else {
         overtime = (s - REGHOURS) * OTPAY;
         total = reg + overtime;
         return total;
      }
      
   } //closes calcHours()
} //closes class
