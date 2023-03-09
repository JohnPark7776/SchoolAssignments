import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
* jUnit test for Pokemon.java.
* @author Lisa Miller
* @since 4/5/2018
*/
public class PokemonTest {


   /** Fixture initialization (common initialization
       *  for all tests). **/
   @Before public void setUp() {
   }


   /** toString method test.
   * checks that toString return is properly formatted.
   */
   @Test
   public void toStringTest() {
      Pokemon p = new Pokemon("Bulbasaur", "Bobby", 1, 85);
      Assert.assertEquals(" toString output not correct ",  
          "Species: Bulbasaur\nName: Bobby\nNumber: 1\nHP: 85", p.toString());
   
   }
   
  /**
   *  get methods test.
   * Checks that info returned correctly
   */ 
   @Test public void getMethodsTest() {
      Pokemon p = new Pokemon("Squirtle", "Sammy", 1, 67);
      Assert.assertTrue("getSpecies didn't return correct String. ",
          (p.getSpecies().equals("Squirtle")));
      Assert.assertTrue("getName didn't return correct String. ",
          (p.getName().equals("Sammy"))); 
      Assert.assertTrue("getNumber didn't return correct value. ",
          (p.getNumber() == 1)); 
      Assert.assertTrue("getHP didn't return correct value. ",
          (67 == p.getHP())); 
   }
   
  /**
   * set methods test.
   * Checks that info set correctly
   */
   @Test public void setMethodsTest() {
      Pokemon p = new Pokemon("Pikachu", "Pika", 123, 89);
      p.setName("Polly"); //use set method to change name
      p.setHP(125); //use set method to change HP
      Assert.assertTrue("setName test did not return correct name. ",
          (p.getName().equals("Polly")));  
      Assert.assertTrue("setHP test didn't return correct hp value. ",
          (125 == p.getHP())); 
   }
   
}
