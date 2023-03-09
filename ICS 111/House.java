import java.text.DecimalFormat; //Allows use of DecimalFormat
/**
 * Defines House objects.
 * @author John Park
 * @version 1.0
 * @since 01/11/2022
*/
public class House {
   /******* Instance Variables *******/
   
   /** MLS Object. */
   private int mls = 0;
   /** Bedroom Object. */
   private int bedrooms = 0;
   /** Price Object. */
   private double price = 0;
   /** Seller's Name Object. */
   private String seller = "";
   
   /** Price DecimalFormat. **/
   private DecimalFormat pf1 = new DecimalFormat("######0.00");

   //***** Constructor ******
   
   /**
   * Makes a Home Listing.
   * @param newMls the Home's listing number.
   * @param newBedrooms the amount of Bedrooms.
   * @param newPrice the price of Home.
   * @param newSeller the Seller's name.
   * @throws HouseException according to specific error in param
   */
   public House(int newMls, int newBedrooms, double newPrice, String newSeller) 
      throws HouseException {
      /* Checks for specific conditions and 
         throws HouseException when fails conditions */
      
      //checks if MLS is in range between 10001 and 99999 (inclusive)
      setMls(newMls);
      //checks if bedroom is in range between 0 and 5 (inclusive)
      setBedrooms(newBedrooms);
      //checks if price is in range between 0 and 1000000 (inclusive)
      setPrice(newPrice);
      //checks if Seller's name has at least 2 characters
      setSeller(newSeller.trim());
   
   } //closes constructor
   
   /** toString method.
   * used in printing
   * @return A String representation of the object.
   */
   public String toString() {
      String s = "Home's MLS: " + this.mls;
      s = s + "\nAmount of Bedroom(s): " + this.bedrooms;
      s = s + "\nHome's Price: $" + pf1.format(this.price);
      s = s + "\nSeller's name: " + this.seller + "\n\n";
      return s;
   
   } //closes toString()
   
   //get methods
   
   /**
   * gets the Home's MLS.
   * @return the mls
   */
   public int getMls() {
      return this.mls;
   }
   
   /**
   * gets amount of Bedroom(s).
   * @return the bedroom
   */
   public int getBedrooms() {
      return this.bedrooms;
   }

   /**
   * gets the price of Home.
   * @return the price
   */
   public double getPrice() {
      return this.price;
   }
   
   /**
   * gets the Seller's name.
   * @return the seller
   */
   public String getSeller() {
      return this.seller;
   }

   //Set methods.
   
   /** Set the Home's MLS.
   * @param m the new MLS
   * @throws HouseException if int is not between 10001 & 99999
   */
   public void setMls(int m) throws HouseException {
      if (m >= 10001 && m <= 99999) {
         this.mls = m;
      } else {
         throw new HouseException("MLS must be between 10001 & 99999");
      }
   } 
   
   /** Set the amount of Bedroom(s).
   * @param b the new amount of Bedroom(s)
   * @throws HouseException if int is not between 0 & 5
   */
   public void setBedrooms(int b) throws HouseException {
      if (b >= 0 && b <= 5) {
         this.bedrooms = b;
      } else {
         throw new HouseException("Bedroom must be between 0 & 5");
      }
   }
   
   /** Set the price of Home.
   * @param p the new price.
   * @throws HouseException if double is not between 0 & 1000000
   */
   public void setPrice(double p) throws HouseException {
      if (p >= 0 && p <= 1000000) {
         String hue = pf1.format(p);
         this.price = Double.parseDouble(hue);
      } else {
         throw new HouseException("Price must be between 0 & 1000000");
      }
   }
   
   /** Set the Seller's name.
   * @param s the new Seller's name.
   * @throws HouseException if String doesn't <=2 non-blank Characters
   */
   public void setSeller(String s) throws HouseException {
      if (s.length() < 2) {
         throw new HouseException("Seller's name must at least be 2 char long");
      } else {
         this.seller = s;
      }
   }
   
} //closes class
