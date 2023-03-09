
/**
 * Defines Pokemon objects.
 * @author John Park
 * @version 1.1
 * @since 11/16/21
*/
public class Pokemon {
   //**** Instance variables ******
   
   /** The Pokemon's species. */
   private String species = "";
   /** The Pokemon's name. */
   private String name = "";
   /** The Pokemon's Pokedex number. */
   private int number = 0;
   /** The Pokemon's HP number. */
   private int hp = 1;

   //***** Constructor ******
   
   /**
   * Makes a PokemonSpecies.
   * @param newSpecies the Pokemon's species
   * @param newName the Pokemon's name.
   * @param newNumber the Pokemon's Pokedex number.
   * @param newHP the Pokemon's HP.
   */
   public Pokemon(String newSpecies, String newName, int newNumber, int newHP) {
      //declared variables
      String s = newSpecies.trim();
      int i = newNumber;
      String n = newName.trim();
      int h = newHP;
      
      /* 
      * Checks for specific conditions 
      * and throws PokemonException when fails conditions 
      */
      //checks if species is empty.
      if (s.isEmpty()) {
         throw new PokemonException("Species name must not be empty.");
      } else {
         this.species = s;
      }
      //checks if Pokemon Number is between 1 - 151
      if (i >= 1 && i <= 151) {
         this.number = i;
      } else {
         throw new PokemonException("Number must be between 1 - 151.");
      }
      //checks if Pokemon name is empty or not. If empty, changes to species
      if (n.isEmpty()) {
         this.name = species;
      } else {
         this.name = n;
      }
      //checks if Pokemon HP is betwen 0 - 401
      if (h >= 0 && h <= 401) {
         this.hp = h;
      } else {
         throw new PokemonException("HP must be between 0 - 401.");
      }
   
   } //close constructor
   
    /** toString method.
   * used in printing
   * @return A String representation of the object.
   */
   public String toString() {
      String s = "Species: " + this.species;
      s = s + "\nName: " + this.name;
      s = s + "\nPokeDex #: " + this.number;
      s = s + "\nHP: " + this.hp + "\n\n";
      return s;
   } //Get Methods
    
   /**
   * gets the Pokemon's Species.
   * @return the species
   */
   public String getSpecies() {
      return this.species;
   }
   
   /**
   * gets the Pokemon's name.
   * @return the name
   */
   public String getName() {
      return this.name;
   }

   /**
   * gets the Pokemon's Pokedex number.
   * @return the Pokedex number
   */
   public int getNumber() {
      return this.number;
   }
   
   /**
   * gets the Pokemon's HP.
   * @return the Pokemon's HP
   */
   public int getHP() {
      return this.hp;
   }
   
   //Set methods.
   
   /** Set the new Pokemon's species.
   * @param s the new species
   * @throws PokemonException if String is empty or just spaces
   */
   public void setSpecies(String s) throws PokemonException {
      s = s.trim();
      if (s.isEmpty()) {
         throw new PokemonException("Species name must not be empty.");
      } else {
         this.species = s;
      }
   } 
   
   /** Set the Pokemon's number.
   * @param i the new Pokemon's number
   * @throws PokemonException if number is not between 1 - 151
   */
   public void setNumber(int i) throws PokemonException {
      if (i >= 1 && i <= 151) {
         this.number = i;
      } else {
         throw new PokemonException("Number must be between 1 - 151.");
      }
   }
   
   /** Set the Pokemon's name.
   * @param n the new name.
   * @throws PokemonException if name is empty. Replaces with Species
   */
   public void setName(String n) throws PokemonException {
      n = n.trim();
      if (n.isEmpty()) {
         this.name = species;
      } else {
         this.name = n;
      }
   }
   
   /** Set the Pokemon's HP.
   * @param h the new Pokemon's hp.
   * @throws PokemonException if hp isn't between 0 - 401
   */
   public void setHP(int h) throws PokemonException {
      if (h >= 0 && h <= 401) {
         this.hp = h;
      } else {
         throw new PokemonException("HP must be between 0 - 401.");
      }
   }





} //closes class
