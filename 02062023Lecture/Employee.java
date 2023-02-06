/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aydin.classwork;

/**
 *
 * @author itlabs
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = 
            new Employee();
        Employee emp2 =
            new Employee("Mike",
            "Smith",
            60000);
        System.out.println("Hello");
        System.out.println(emp2.getSalary());               
    }
    
}
