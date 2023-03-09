import java.util.Scanner; //allows use of Scanner
/**
* ArrayOfPokemonJohnpark - Allows user to add up to 6 pokemons into a team.
* @author John Park
* @version 1.0
* @since 11/18/2021
*/
public class ArrayOfPokemonJohnpark {
   //constant variables
   /** static final double SIZE for amount of Pokemons in a team. */
   static final int SIZE = 6;
   
   /** The Pokemon's species. */
   private static String species = "";
   /** The Pokemon's name. */
   private static String name = "";
   /** The Pokemon's Pokedex number. */
   private static int number = 0;
   /** The Pokemon's HP number. */
   private static int hp = 1;
   /**
   * main method.
   * @param args not used
   */
   public static void main(String[] args) {
      //declare variables
      Scanner sc = new Scanner(System.in);
      Pokemon[] pokeArray = new Pokemon[SIZE];
      String choice = "";
      int tester = 0;
      int counter = 0;
      boolean endLoop = false;
      
      //welcome statement
      System.out.println("Welcome! This program is to add Pokemon(s) " 
         + "to your team!\n" + "You may add up to 6 Pokemons.\n");
         
      //for loop to get user input. 
      for (int i = 0; i < SIZE; i++) {
         System.out.println("Do you want to add a Pokemon " 
            + "to your team? y/n");
         choice = sc.nextLine().trim();
         
         while (!endLoop) {
            
            if (choice.equalsIgnoreCase("y")) {
               /*get Pokemon information from user*/
               //species
               if (tester == 0) {
                  tester = userSpecies();
               }
               //nickname
               if (tester == 1) {
                  tester = userName();
               }
               //number
               if (tester == 2) {
                  tester = userNum();
               }
               //HP 
               if (tester == 3) {
                  tester = userHP();
               }
               //Checks if there is 6 Pokemon or not
               if (tester == 4) {
                  Pokemon p = new Pokemon(species, name, number, hp);
                  pokeArray[i] = p;
                  System.out.println("This Pokemon was added to your team:\n" 
                     + p.toString());
                  tester = 0;
                  counter += 1;
                  endLoop = true;
               }
            } else if (choice.equalsIgnoreCase("n")) {
               i = 100;
               endLoop = true;
            } else {
               System.out.println("Invalid choice. Please choose "
                  + "either 'y' or 'n'.");
               i -= 1;
               endLoop = true;
            }
         } //closes while loop
         endLoop = false;
      } //closes for(i) loop
      
      //prints amount of Pokemon in team/array
      System.out.println("You have stored " + counter
         + " Pokemon(s) to your team.");
         
      //prints all Pokemon in team/array
      for (int j = 0; j < SIZE; j++) {
         if (pokeArray[j] != null) {
            System.out.println("\nPokemon " + (j + 1) 
               + ":\n" + pokeArray[j].toString());
         }
      }  //closes for(j) loop
      
   } //closes main method
   /** 
   * userSpecies function.
   * gets Pokemon species from user
   * @return Returns int number to either move on to name(1) or restart(0)
   */
   public static int userSpecies() {
      //declare variables
      Scanner sc = new Scanner(System.in);
      Pokemon p = new Pokemon("Herro", "", 1, 1);
      String sInput = "";
      boolean endLoop = false;
      
      //while loop to get species
      while (!endLoop) {
         try {
            System.out.println("Please enter Pokemon's species");
            sInput = sc.nextLine();
            p.setSpecies(sInput);
            species = sInput;
            endLoop = true;
         } catch (PokemonException pe) {
            System.out.println(pe.getMessage());
            endLoop = true;
            return 0;
         }
      }
      return 1;
   } //closes userSpecies()
   /** 
   * userName function.
   * gets Pokemon Nickname from user
   * @return Returns int number to either move on to name(2) or restart(1)
   */
   public static int userName() {
      //declare variables
      Scanner sc = new Scanner(System.in);
      Pokemon p = new Pokemon(species, "", 1, 1);
      String nInput = "";
      boolean endLoop = false;
      
      //while loop to get Nickname
      while (!endLoop) {
         try {
            System.out.println("Please enter Pokemon's nickname."
               + "(Enter nothing to skip)");
            nInput = sc.nextLine();
            p.setName(nInput);
            name = nInput;
            endLoop = true;
         } catch (PokemonException pe) {
            System.out.println(pe.getMessage());
            endLoop = true;
            return 1;
         }
      }
      return 2;
   } //closes userName()
   /** 
   * userNum function.
   * gets Pokedex Number from user
   * @return Returns int number to either move on to name(3) or restart(2)
   */
   public static int userNum() {
      //declare variables
      Scanner sc = new Scanner(System.in);
      Pokemon p = new Pokemon(species, name, 1, 1);
      int nuInput = -1;
      String temp = "";
      boolean endLoop = false;
      
      //while loop to get number
      while (!endLoop) {
         try {
            System.out.println("Please enter PokeDex number of Pokemon");
            temp = sc.nextLine();
            nuInput = Integer.parseInt(temp);
            p.setNumber(nuInput);
            number = nuInput;
            endLoop = true;
         } catch (NumberFormatException nfe) {
            System.out.println("Error! Please input only numbers for this");
            endLoop = true;
            return 2;
         } catch (PokemonException pe) {
            System.out.println(pe.getMessage());
            endLoop = true;
            return 2;
         }
      }
      return 3;
   } //closes userNum()
   /** 
   * userHP function.
   * gets Pokemon HP from user
   * @return Returns int number to either move on to name(4) or restart(3)
   */
   public static int userHP() {
      //declare variables
      Scanner sc = new Scanner(System.in);
      Pokemon p = new Pokemon(species, name, number, 1);
      int hInput = -1;
      String temp = "";
      boolean endLoop = false;
      
      //while loop to get Pokemon HP
      while (!endLoop) {
         try {
            System.out.println("Please enter Pokemon's HP");
            temp = sc.nextLine();
            hInput = Integer.parseInt(temp);
            p.setHP(hInput);
            hp = hInput;
            endLoop = true;
         } catch (NumberFormatException nfe) {
            System.out.println("Error! Please input only numbers for this");
            endLoop = true;
            return 3;
         } catch (PokemonException pe) {
            System.out.println(pe.getMessage());
            endLoop = true;
            return 3;
         }
      }
      return 4;
   } //closes userHP()
   
} //closes class
