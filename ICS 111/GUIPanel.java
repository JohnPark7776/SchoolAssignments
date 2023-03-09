import java.awt.*;
import javax.swing.*;

public class GUIPanel extends JPanel {
   /** GUIPanel constructor.
   * All layout happens in here.
   */
   public GUIPanel() {
      //set the opening size
      this.setPreferredSize(new Dimension(300, 300));
      this.setBackground(Color.cyan);
      
      this.add(label1);
      this.add(button1);
      
      
   }
}