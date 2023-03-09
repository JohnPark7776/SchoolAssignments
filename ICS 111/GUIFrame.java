import javax.swing.JFrame;
/**
* Nov 22 2021 Class.
* @author John Park
* @since 11/22/21
*/

//class declaration header
public class GUIFrame {

   /** main method header.
   * @param args not used.
   */
   public static void main(String[] args) {
      JFrame frame = new JFrame("First GUI");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //get ContentPane and add your Jpanel to it
      GUIPanel mainPanel = new GUIPanel();
      frame.add(mainPanel);
      frame.getContentPane();
      
      //get ready to display to screen
      frame.pack();
      //show on screen
      frame.setVisible(true);
      
      frame.pack();
   } //close main
         
} //close class