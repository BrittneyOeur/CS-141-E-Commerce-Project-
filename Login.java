/**
 * @ Linh Nguyen
 * @ June 7, 2019
 *
 *   This program already has a set username and password
 *   if invalid, for either the username/password, the program will ask the user to re-enter 
 *   their information and once they are logged in, the program will print out a 
 *   message that they are logged in.
 */
 
import java.util.Scanner; 

public class Login {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      /**
       * Variables to set up the username and password
       * Did not create a text file to save the username and password
       * This is a gist as to how the login page will run for this store.
       */
      
      String user = "user1";
      String pass = "shoes";
      
      System.out.println("Welcome to Vibes of Shoes!");
      System.out.println();
      System.out.println("Please log in:");
      
      /**
       * This input will ask the user to enter their username.
       * If valid, there will be no ouput until the user have entered their password.
       */
      
      System.out.print("Enter your username: ");
      String username = input.next();
      
      /**
       * This input will ask the user to enter their password.
       * If the user name or password is incorrect, then the program will tell the user what they've entered is incorrect.
       */
   
      System.out.print("Enter your password: ");
      String password = input.next();
      
      System.out.println();
   
      if (username.equals(user) && password.equals(pass)) {
         System.out.print("You are logged in.");
      } 
      else {
         System.out.println("Invalid, please try again.");
      }
      while ((!username.equals(user) && !password.equals(pass)) 
      || (!username.equals(user) && password.equals(pass)) 
      || (username.equals(user) && !password.equals(pass)))
      {
      
         System.out.println();
         System.out.println("Please log in:");
      
         System.out.print("Enter your username: ");
         username = input.next();
      
         System.out.print("Enter your password: ");
         password = input.next();
      
         if (username.equals(user) && password.equals(pass)) {
            System.out.print("You are logged in.");
         } 
         else {
            System.out.println("Invalid, please try again.");
         }
      }      
   }
}