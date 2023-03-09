/**
* Pokemon.java exceptions.
* @author John Park
* @since 11/16/2021
*/

public class PokemonException extends RuntimeException {
   // extends causes inheritance from RuntimeException
   
   /**
   * constructor with message String.
   * @param message The error message
   */
   public PokemonException(String message) {
      //call super class constructor
      super(message);
   } //close constructor
   
   /**
   * constructor with no message.
   */
   public PokemonException() {
      super("There is an error");
   } //close constructor 
} //closes class

