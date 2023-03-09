import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
import java.util.ArrayList; //allows Array List
import java.util.Random; //allows use of Random Generator
import java.awt.Color;
/**
* PokemonGUIJohnpark.java - Program for user to 
* choose Pokemon and save it into an array.
* @author John Park
* @since 11/25/2021
*/ 

public class PokemonGUIJohnpark extends JPanel {
   
   /********* label. ************/
   private JLabel lTitle = new JLabel("Choose your Pokemon!");
   /********* label. ************/
   private JLabel lMsg = new JLabel("                ");
   /******* button. ****************/
   private JButton bMakePoke = new JButton(" Make Pokemon ");
   /******* button. ****************/
   private JButton bList = new JButton(" List Pokemon ");
   
   /********* sub-panel. *********/
   private JPanel topSubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel centerSubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel bottomSubPanel = new JPanel();
   /** we can declare and initialize ActionListener obj. */
   private GUIListener listener = new GUIListener();
   
   /******** text field for user entry. *******/
   private JTextField tfName = new JTextField(25);
   /********** Choice drop down menu for Pokemon. **/
   private Choice chPoke = new Choice();

   /******** Pokemon. *********/
   private Pokemon pk;
   /******* capacity of Pokemon array. ****/
   private final int capacity = 6;
   /******** Array of Pokemon. ***************/
   private ArrayList<Pokemon> aL = new ArrayList<Pokemon>(capacity);
   /******** counter for Pokemon. ***************/
   private int count = 0;
   
   /*********** MIN for HP. *************/
   private final int min = 0;
   /*********** MAX for HP. *************/
   private final int max = 401;
   
   /********** Makes title Light Blue. **********/
   private static final Color LIGHT_BLUE = new Color(51, 204, 255);
   
   /******** String for holding Pokemon for display. */ 
   private String sOut = new String("");
   //parameters are default size in (rows,cols) chars
   private JTextArea textArea = new JTextArea(20, 25);
   
   /** Make TextArea scrollable. **********************/
   //textArea is put inside this.              (right here)            
   private JScrollPane scroll = new JScrollPane(textArea, 
      JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   
   /** 
   * Constructor to hold everything.
   */
   public PokemonGUIJohnpark() {
      
      this.setLayout(new BorderLayout()); //Border panel layout
      this.setPreferredSize(new Dimension(400, 500));
      topSubPanel.setBackground(LIGHT_BLUE); //north area color
      centerSubPanel.setBackground(Color.white); //center area color
      bottomSubPanel.setBackground(Color.white); //bottomSubPanel area color
      
      //adding title to the topSubPanel
      topSubPanel.add(lTitle);
      this.add("North", topSubPanel); //adding top sub-panel to North
      
      //labels initialized
      JLabel lPokemon = new JLabel("Pokemon: ");
      JLabel lSpace = new JLabel("                                      ");
      JLabel lNickname = new JLabel("\nPokemon's Nickname: ");
      
      //add choices to the choice dropdown list
      chPoke.add("Choose");
      chPoke.add("Bulbasaur");
      chPoke.add("Venusaur");
      chPoke.add("Ivysaur");
      chPoke.add("Squirtle");
      chPoke.add("Wartortle");
      chPoke.add("Blastoise");
      chPoke.add("Charmander");
      chPoke.add("Charmeleon");
      chPoke.add("Charizard");
      
      //add labels, textFields and choice
      centerSubPanel.add(lPokemon);
      centerSubPanel.add(chPoke);
      centerSubPanel.add(lSpace);
      centerSubPanel.add(lNickname);
      centerSubPanel.add(tfName);
      
      //set up the textArea for holding list
      //make the textArea look like the background instead of white
      textArea.setBackground(Color.white);
      //make it not editable by user
      textArea.setEditable(false);
      //set up scrollPane appearance and size (textArea already inside it) 
      scroll.setBorder(null);
      //add scrollPane to panel, textArea inside. 
      centerSubPanel.add(scroll);         
      scroll.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
      //add the center sub-panel to Center of main panel
      add("Center", centerSubPanel);
      
      //adding message and buttons to the bottomSubPanel sub-panel
      bottomSubPanel.add(lMsg);
      bottomSubPanel.add(bMakePoke);
      bMakePoke.addActionListener(listener); //add listener to button
      bottomSubPanel.add(bList);
      bList.addActionListener(listener); //add listener to button 
     //add bottomSubPanel sub-panel to South area of main panel      
      add("South", bottomSubPanel);  
   } //closes constructor
   /**
   * Private ActionListener class.
   */
   private class GUIListener implements ActionListener {
      
      /**
      * ActionPerformed method.
      * @param event what button is clicked.
      */ 
      public void actionPerformed(ActionEvent event) {
         
         if (event.getSource() == bMakePoke) {
            //declare variables
            String species = "";
            String nickName = "";
            int hp = ranNumGen();
            
            //get information from user
            species = chPoke.getSelectedItem();
            nickName = tfName.getText();
            
            try {
               if (count < capacity) {
                  switch (species) {
                     case "Bulbasaur": 
                        pk = new Pokemon(species, nickName, 1, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Venusaur":
                        pk = new Pokemon(species, nickName, 2, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Ivysaur":
                        pk = new Pokemon(species, nickName, 3, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Squirtle":
                        pk = new Pokemon(species, nickName, 7, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Wartortle":
                        pk = new Pokemon(species, nickName, 8, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Blastoise":
                        pk = new Pokemon(species, nickName, 9, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Charmander":
                        pk = new Pokemon(species, nickName, 4, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Charmeleon":
                        pk = new Pokemon(species, nickName, 5, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     case "Charizard":
                        pk = new Pokemon(species, nickName, 6, hp);
                        aL.add(pk);
                        lMsg.setText("Pokemon added");
                        textArea.setText((count + 1) + ". " + pk.toString());
                        count++;
                        break;
                     default:
                        lMsg.setText("Please choose a Pokemon");
                        break;
                  } //closes switch
                  
               } else {
                  //Else statement to add only 6 pokemons
                  lMsg.setText("Only able to add 6 Pokemons!");
                  //removes bMakePoke when 6 Pokemon are made
                  bottomSubPanel.remove(bMakePoke); 
               } //closes if/else statement
               
            } catch (PokemonException pe) {
               lMsg.setText(pe.getMessage());
            } //closes try/catch
         } //closes makePoke
         if (event.getSource() == bList) {
            for (int i = 0; i < aL.size(); i++) {
               
               sOut += (i + 1) + ". " + aL.get(i).toString();
               textArea.setText(sOut);
               
            } 
         } //closes bList
      } //closes actionPerformed
   } //closes GUIlistener
   /**
   * Creates random number for HP between 0 - 401.
   * @return int 
   */
   public int ranNumGen() {
      //allows the usage of the random generator
      Random ranNum = new Random();
      //Creates random number between 0 - 401 inclusive
      int ranHP = ranNum.nextInt((max - min) + 1) + min;
      //returns random HP generated 
      return ranHP;
   } //closes ranNumGen
} //closes class
