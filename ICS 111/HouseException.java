/**
* House.java exceptions.
* @author John Park
* @since 01/11/2022
*/

public class HouseException extends Exception {
   // extends causes inheritance from Exception
   
   /**
   * constructor with message String.
   * @param message The error message
   */
   public HouseException(String message) {
      //call super class constructor
      super(message);
   } //close constructor
   
   /**
   * constructor with no message.
   */
   public HouseException() {
      super("There is an error");
   } //close constructor 
} //closes class

