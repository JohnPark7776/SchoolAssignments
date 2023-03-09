import javax.swing.JFrame;

/**
* PokemonFrameJohnpark.java - Creates frame for PokemonGUIJohnpark.
* @author John Park
* @since 11/25/2021
*/

public class PokemonFrameJohnpark {
   /** main method.
   * @param args not used
   */
   public static void main(String[] args) {
      //setup JFrame
      
      JFrame frm = new JFrame("Choose your Pokemon!");
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Add PokemonGUIJohnpark object to frame
      frm.getContentPane().add(new PokemonGUIJohnpark());
      
      //Display to screen
      frm.pack();
      frm.setVisible(true);
   } //closes main method
} //closes class
