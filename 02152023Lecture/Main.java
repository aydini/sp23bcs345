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
public class Main {
    
    public static void outputTheNumberDouble(int number ){
        int result;
        result = doubleTheNumber(number);
        System.out.println("number is " + number 
                           + " its double is "
                           + result);
    }    
    public static int doubleTheNumber(int number ){
        int result;
        result = number *2;
        return result;
    }
    public static void main(String[] args) {
        int aNumber = 6;
        outputTheNumberDouble(aNumber);
    }
    
}
