import java.util.Random;


/**
 * Pokedex.java a driver class for Pokemon Objects.
 * @author: Lisa Miller
 * @since 04/09/2020
*/

public class Pokedex {
   /** array size constant. */
   static final int SIZE = 10;
   static final int HP_RANGE = 151;
 
    /**Creates and tests Pokemon objects.
    *it stores 10 in an array of Pokemon
    *and then tests all class methods
    * @param args not used.
    */
   public static void main(String[] args) {
      
      int iNum = 0;
      int pNum = 0;
      int pHP = 0;
      String pName = "";
      String pSpecies = "";
      String[] speciesList = {"Bulbasaur", "Venusaur", "Ivysaur", "Squirtle",
         "Wartortle", "Blastoise", "Charmander", "Charmeleon", "Charizard",
         "Caterpie", "Metapod", "Butterfree"};
      String[] nameList = {"Alice", "Bob", "Carol", "Dave", "Edgar", "Francine", "Grant", "Harriet", "Iggy",
          "Jane", "Kile", "Lana", "Morrie", "Nancy"};
      Pokemon[ ] pokedexArr = new Pokemon[SIZE];
      Pokemon tempPoke;
      Random ranGen = new Random();
      
      System.out.println("I will make 10 Pokemon,");
      System.out.println("then will print the whole list using toString.");
     
      for (int i = 0; i < SIZE; i++) {
         //choose a random Pokemon from list of species
         pNum = ranGen.nextInt(speciesList.length);
         pSpecies = speciesList[pNum];
         pName = nameList[pNum];
         pHP = ranGen.nextInt(HP_RANGE); //random HP for Pokemon
         tempPoke = new Pokemon(pSpecies, pName, pNum, pHP);
         System.out.println("Adding " + tempPoke);
         //add new Pokemon to array. No name
         pokedexArr[i] = tempPoke;      
      
      }
   
      //print the array of Pokemon using toString
      System.out.println("\nPrinting all the Pokemon from your Pokedex:");
      System.out.println("****************************************");
      for (int i = 0; i < pokedexArr.length; i++) {
         System.out.println(i + " " + pokedexArr[i] + "\n");   
      }
   //    
//       //Print just species
      System.out.println("\nTesting getSpecies method");
      System.out.println("****************************************");
      for (int i = 0; i < SIZE; i++) {
         //call getSpecies and print
         System.out.println(i + " species: " + pokedexArr[i].getSpecies());    
      
      }
      //print just number
      System.out.println("\nTesting getNumber method");
      System.out.println("****************************************");
      for (int i = 0; i < SIZE; i++) {
         //call getSpecies and print
         System.out.println(i + " number: " + pokedexArr[i].getNumber());    
      
      } 
      
      //Rprint just HP
      System.out.println("\nTesting getHP method");
      System.out.println("****************************************");
      for (int i = 0; i < SIZE; i++) {
         //call getSpecies and print
         System.out.println(i + " HP: " + pokedexArr[i].getHP());    
      
      }       
       //Randomly choose 2 to set the name to same as species
      System.out.println("\nTesting setName and getName methods.");
      System.out.println("****************************************");
      for (int i = 0; i < 2; i++) {
         //choose a random Pokemon from array of Pokemon objects
         iNum = ranGen.nextInt(SIZE);
         System.out.println("\n" + iNum + " name before:\n" + pokedexArr[iNum].getName());  
         //call set name
         pokedexArr[iNum].setName(pokedexArr[iNum].getSpecies());
         //call getSpecies and print
         System.out.println(iNum + " with name changed to species: " + pokedexArr[iNum].getName());    
      
      }
       //Randomly choose 2 to set the HP
      System.out.println("\nTesting setHP method.");
      System.out.println("****************************************");
      for (int i = 0; i < 2; i++) {
         //choose a random Pokemon from array of Pokemon objects
         iNum = ranGen.nextInt(SIZE);
         
         System.out.println("\n" + iNum + " HP before:\n" + pokedexArr[iNum].getHP());  
         //call set HP
         pokedexArr[iNum].setHP(ranGen.nextInt(HP_RANGE));
         //call getHP and print
         System.out.println(iNum + " HP after:\n" + pokedexArr[iNum].getHP());    
        
      }
   
   }  //main method

}   //class
