package aydin.payrollsystem;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "bob", "Jones", "333-33-3333", 10000, .06);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300);                
      
      BasePlusCommissionEmployee eren = new BasePlusCommissionEmployee(
              "Eren", "Inan", "555-55-555", 2000, 0.2, 5000);
      
     
      // create four-element Employee array
      Employee[] employees = new Employee[5]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;
      employees[4] = eren;
      
      System.out.println("\nListing all the employees whose first name starts with letter B...");            
      for (Employee currentEmployee : employees) {
         if (currentEmployee.getFirstName().charAt(0) == 'B' ||
                 currentEmployee.getFirstName().charAt(0) == 'b'){ 
            System.out.println(currentEmployee); // invokes toString       
            System.out.printf(
                "earned $%,.2f%n%n", currentEmployee.earnings());
         }
      }             
      
      System.out.println("\nListing all the BasePlusCommissioneEmployee...");            
      for (Employee currentEmployee : employees) {
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            System.out.println(currentEmployee); // invokes toString       
            System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
         }
      }
      
      System.out.println("\nEnhanced for loop is listing all the employees...");            
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString       
         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());         
      } 
      
      System.out.println("\nFor loop with an index...");            
      // for loop example using index i 
      for (int i=0; i < employees.length; i++) {
         System.out.println(employees[i]); // invokes toString       
         System.out.printf(
            "earned $%,.2f%n%n", employees[i].earnings());
      } 

   } 
   
} 
