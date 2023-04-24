package aydin._classwork;

// Fig. 10.14: PayableInterfaceTest.java
// Payable interface test program processing Invoices and 
// Employees polymorphically.
public class PayableInterfaceTest {
   public static void main(String[] args) {
      // create four-element Payable array
      Payable[] payableObjects = new Payable[] {
         new Invoice("01234", "seat", 2, 375.00),
         new Invoice("56789", "tire", 4, 79.95),
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
         new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)
      };

      System.out.println(
         "Invoices and Employees processed polymorphically:"); 

      // write a for loop that will only
      // show the Invoice payables
      System.out.println("*** display Invoices only*****");
      for (int i= 0; i < payableObjects.length; i++)
      {
          if (payableObjects[i] instanceof Invoice)
          {
            System.out.printf("%n%s %npayment due: $%,.2f%n", 
            payableObjects[i].toString(), // could invoke implicitly
            payableObjects[i].getPaymentAmount());
          }
      }
      
      // generically process each element in array payableObjects
      System.out.println("*** display Invoices and Employees using regular for loop****");
      for (int i= 0; i < payableObjects.length; i++)
      {
        System.out.printf("%n%s %npayment due: $%,.2f%n", 
            payableObjects[i].toString(), // could invoke implicitly
            payableObjects[i].getPaymentAmount());
      }
      
      // generically process each element in array payableObjects
      System.out.println("*** display Invoices and Employees using enhanced for loop****");
      for (Payable currentPayable : payableObjects) {
         // output currentPayable and its appropriate payment amount
         System.out.printf("%n%s %npayment due: $%,.2f%n", 
            currentPayable.toString(), // could invoke implicitly
            currentPayable.getPaymentAmount()); // polymorhic call
      } 
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
