/** 
 * To create a quote with Escape characters without println.
 * @author John Park
 * @since 09/01/21
*/
public class QuoteJohnpark {

   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {
      //String objects
      String s1 = "\"To be or not to be\",";
      String s2 = "That is the question- 'I think'";
      String s3 = "\\maybe not";
      String s4 = "-William Shakespeare and Me...";
      String s5 = "\n"; //adds line
      String s6 = "\t"; //adds single tab
      String s7 = "\t\t"; //adds double tab
      
      //print code
      System.out.print(s1 + s5 + s6 + s2 + s5 + s3 + s5 + s7 + s4);
   } //closes main method
} //closes class
