/**
 * @ Brittney Oeur and Linh Nguyen
 * @ June 7, 2019
 *
 *   This programs allow the user to add a certain amount of shoes they want 
 *   into their cart and then it will calculate the total of their purchase, as well
 *   how much points they have earned. Afterwards, the program will ask the user
 *   their card information and then will give the user a tracking number for their entire purchase.
 */

import java.util.*;

public class ShoppingCheckout {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
   
      Items casualSneakers =  new Items();
      Items athleticShoes = new Items();
      
      CardInformation cardInfo = new CardInformation();
      
      String itemName;
      double itemCost = 0;
      int itemCount = 0;
      double totalPrice = 0;
      
      int Points = 0;
      
      String cardName;
      String cardNum;
      int expM = 0;
      int expY = 0;
      int CVV = 0;
      
      int trackingNumber = 0;
      
      // --------------------------------------------------
      // Program ask for user's input and takes that 
      // information to rally up the total calculation:
      // ---------------------------------------------------
   
      System.out.println("Item #1: Converse: $40.00");
      System.out.println("Item #2: Nike: $80.00");
      
      System.out.println();
      
      System.out.print("Enter item #1 name: ");
      itemName = input.nextLine();
      
      /**
       * Tell the user to enter the item #1's name
       */
      
      while (!itemName.equalsIgnoreCase("Converse")) {
         System.out.print("Invalid, please re-enter the name for item #1: ");
         itemName = input.nextLine();
      }
      
      System.out.print("Enter item #1 price: ");
      itemCost = input.nextDouble();
      
      /**
       * Tell the user to enter the item #1's price
       */
      
      while (itemCost < 40 || itemCost > 40) {
            System.out.print("Invalid, please re-enter the price: ");
            itemCost = input.nextDouble();
      }
      
      System.out.print("Enter how many you'd like to purchase: ");
      itemCount = input.nextInt();
      
      /**
       * Ask the user how many of item #1 they want
       */
      
      while (itemCount < 0) {
         System.out.print("Invalid, please re-enter how much you would like to purchase: ");
         itemCount = input.nextInt();
      }
      
      // Saves the information for item #1:
      casualSneakers.setName(itemName);
      casualSneakers.setPrice(itemCost);
      casualSneakers.setQuantity(itemCount);
      
      System.out.println();
      
      System.out.print("Ener item #2 name: ");
      input.nextLine();
      itemName = input.nextLine();
      
      /**
       * Tell the user to enter the item #2's name
       */
      
      while (!itemName.equalsIgnoreCase("Nike")) {
         System.out.print("Invalid, please re-enter the name for item #2: ");
         itemName = input.nextLine();
      }
      
      System.out.print("Enter item #2 price: ");
      itemCost = input.nextDouble();
      
      /**
       * Tell the user to enter the item #2's price
       */
      
       while (itemCost < 80 || itemCost > 80) {
            System.out.print("Invalid, please re-enter the price: ");
            itemCost = input.nextDouble();
      }
      
      System.out.print("Enter how many you'd like to purchase: ");
      itemCount = input.nextInt();
      
      /**
       * Ask the user how many of item #2 they want
       */
      
      while (itemCount < 0) {
         System.out.print("Invalid, please re-enter how much you would like to purchase: ");
         itemCount = input.nextInt();
      }
      
      // Saves the information for item #2:
      athleticShoes.setName(itemName);
      athleticShoes.setPrice(itemCost);
      athleticShoes.setQuantity(itemCount);
      
      System.out.println();
      
      // Calculate the total price:
      totalPrice = (casualSneakers.getPrice() * casualSneakers.getQuantity() + athleticShoes.getPrice() * athleticShoes.getQuantity());
      
      // Every ten dollar spent, the user will recieve one point:
      for (int p = 1; p <= totalPrice/10; p++) {
         if (totalPrice % 10 == 0) {
            Points++;
         }
      }
      
      System.out.println("You have earned a total of: " + Points + " points!");
      System.out.println("(When you have accumulated 100 points, you will recieve a 5% discount coupon for your next purchase)");
      
      System.out.println();
      
      System.out.println("Total of your purchase: $" + totalPrice);
      
      System.out.println();
      
      // --------------------------------------------------
      // Program ask for user's card information 
      // to complete/pay their entire purchase:
      // --------------------------------------------------
      System.out.println(" :PAYMENT METHOD: ");
      System.out.println("*ONLY ACCEPTING VISA*");
      
      System.out.print("Please enter your full name: ");
      input.nextLine();
      cardName = input.nextLine();
      
       /**
       * Card information - 16 digits:
       * This input must only be integers, no doubles or String.
       * It will only work if the user enter a number.
       */
      
      System.out.print("Please enter your 16-digit card number: ");
      cardNum = input.next();
      
      while(!isValid(cardNum)) {
         System.out.print("Invalid, please re-enter your card number: ");
         cardNum = input.next();
      }
      
      System.out.println("Please enter the expiration date of your card:");
      System.out.print("Month (ex: 04): ");
      expM = input.nextInt();
      
      while(expM > 12 || expM < 1) {
         System.out.print("Invalid, please re-enter: ");
         expM = input.nextInt();
      }
      
      System.out.print("Year (ex: 99): ");
      expY = input.nextInt();
      
      while (expY < 0) {
         System.out.print("Invalid, please re-enter: ");
         expY = input.nextInt();
      }
      
      System.out.print("Please enter the CVV of your card: ");
      CVV = input.nextInt(); 
      
      // Saves the card information into the user's account:
      cardInfo.setName(cardName);
      cardInfo.setNumber(cardNum);
      cardInfo.setExpMonth(expM);
      cardInfo.setExpYear(expY);
      cardInfo.setCode(CVV);
      
      System.out.println();
      
      // --------------------------------------------------
      // Program will give the user their tracking number:
      // --------------------------------------------------
      System.out.println("ORDER SUMMARY: ");
      
      System.out.println();
      
      System.out.println(":Item #1:");
      System.out.println("Name: " + casualSneakers.getName().toUpperCase());
      System.out.println("Price: $" + casualSneakers.getPrice());
      System.out.println("Quantity: " + casualSneakers.getQuantity());
      
      System.out.println();
      
      System.out.println(":Item #2:");
      System.out.println("Name: " + athleticShoes.getName().toUpperCase());
      System.out.println("Price: $" + athleticShoes.getPrice());
      System.out.println("Quantity: " + athleticShoes.getQuantity());
      
      System.out.println();
      
      System.out.println("Points: " + Points);
      System.out.println("Total: $" + totalPrice);
      
      System.out.println();
      
       /**
       * The output will be 22 digits that is between numbers 1-9
       * It will be different whenever the user runs the program
       */
      
      System.out.println("Your tracking number is: ");
      for (int t = 0; t <= 22; t++) {
         trackingNumber = rand.nextInt(10);
         System.out.print(trackingNumber);
      } 
      
      System.out.println();
      
      System.out.println("Thank you for shopping with us!");  
   }
   
      // --------------------------------------------------
      // Validates the user's card number:
      // --------------------------------------------------
       public static boolean isValid(String input) {
         if (input.length()!=16) {
            return false;
         }
         return true;
      }
}