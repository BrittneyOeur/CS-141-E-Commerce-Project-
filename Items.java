 /**
  * @ Brittney Oeur
  * @ Version: June 7, 2019
  */

public class Items {
   private String productName;
   private double productPrice;
   private int productQuantity;  

   public Items() {
   
      productName = "none";
      productPrice = 0;
      productQuantity = 0;
   }
   
// Have this in case I need to alter something:
   public Items(String x, double y, int z) {
      productName = x;
      productPrice = y;
      productQuantity = z;
   }
   
   public void setName(String name) {
      productName = name;
   }
   
   public void setPrice(double price) {
      productPrice = price;
   }
   
   public void setQuantity(int amount) {
      productQuantity = amount;
   }
   
   public String getName() {
      return productName;
   }
   
   public double getPrice() {
      return productPrice;
   }
   
   public int getQuantity() {
      return productQuantity;
   }
}