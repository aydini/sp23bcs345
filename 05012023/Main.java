
package com.mycompany._classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // get age from user
   public static int readAgeFromUser(Scanner scanner) 
           throws InvalidAgeException {
      
      System.out.print("Enter an age between 0-120: ");    
      int age = scanner.nextInt();    
      if (age < 0 || age > 120){
          throw new InvalidAgeException("Invalid age "+ age);
      }
      return age;
   } 

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      boolean continueLoop = true; // determines if more input is needed

      do {                                                                
         try {                                                                          
            int age = readAgeFromUser(scanner);                         
            System.out.printf("%nThanks for entering a valid age");                                 
            continueLoop = false; // input successful; end looping        
         }                                                                           
         catch (InvalidAgeException iae) {        
            System.err.printf("%nException: %s%n",                       
               iae.getMessage());                                  
            scanner.nextLine(); // discard input so user can try again    
            System.out.printf(                                          
               "enter an age between 0-120. Please try again.%n%n");          
         }                                                                       
         catch (Exception e) {        
            System.err.printf("%nException: %s%n",                       
               e);                                  
            scanner.nextLine(); // discard input so user can try again    
            System.out.printf(                                          
               "Exception happened. Please try again.%n%n");          
         }                                                              
      } while (continueLoop);                                           
   } 
}
