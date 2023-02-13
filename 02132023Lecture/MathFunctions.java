/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aydin._classwork;

/**
 *
 * @author itlabs
 */
public class MathFunctions {
    public static double PI = 3.14; 
      
    // write a displayDate method
    // parameters: three integers month, day, year 
    // and a seperator (string)
    public void displayDate(int month, 
                            int day, int year, 
                            String seperator){
        System.out.println(month + seperator
                           + day + seperator
                           + year );
    }
    
    // overload displayDate method
    // parameters: month (String), day (int), 
    public void displayDate(String month, 
                            int day, int year 
                            ){
        System.out.println(month + " " 
                            + day + " ," + year );
    }
    
   
}
