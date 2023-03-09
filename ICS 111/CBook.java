public class CBook extends Pamphlet {
   protected int pages = 100;
   protected String title = "Children Book";
   
   public CBook(int pages, String title){
      this.pages = pages;
      this.title = title;
      
   }
   
   public String toString() {
      String s = "title: " + this.title;
      return s;
   }
}