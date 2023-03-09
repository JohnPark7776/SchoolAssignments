/**
 * Sep 01 2021 Class
 * @author John Park
 * @since 09/01/21
*/

//class declaration header
public class Sep01Class{

   //constant goes above main method header line
   /** constant for conversion. */
   static final double CONV_FACTOR = 2.2;

   /** main method header.
   * @param args not used.
   */
   
   public static void main(String[] args){
      //variables
      double wtInPounds = 10.5;//weight in pounds
      double wtInKilos = 0;//weight in kilos
      
      //formula in kilos = pounds / 2.2(CONV_FACTOR)
      wtInKilos = wtInPounds / CONV_FACTOR;
      //Area to put print codes
      System.out.println("I will convert pounds to kilos");
      System.out.println("Weight in pounds: " + wtInPounds);//prints out Weight in pounds: #
      System.out.println("Weight in kilos: " + wtInKilos);//prints out Weight in kilos: #
      
      //2nd wtInPounds
      wtInPounds = 37.234;
      //formula in kilos = pounds / 2.2(CONV_FACTOR)
      wtInKilos = wtInPounds / CONV_FACTOR;     
      //Area to put print codes
      System.out.println("Weight in pounds: " + wtInPounds);//prints out Weight in pounds: #
      System.out.print("Weight in kilos: " + wtInKilos);//prints out Weight in kilos: #
      
   }//closes main method
}//closes class