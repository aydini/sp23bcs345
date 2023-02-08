/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itlabs
 */
public class MathFunctions {
    public static double PI = 3.14; 
    public double aNonStaticVariable = 3.14; 
    
    // method to find sum of three numbers
    // static methods are also called "class methods"
    public static double getSum_staticVersion(double n1, double n2,
            double n3){        
        double sum = n1 + n2 + n3;        
        return sum;
    }
    // method to find sum of three numbers
    // non-static methods are also called "instance methods"
    public double getSum_nonStaticVersion(double n1, double n2,
            double n3){        
        double sum = n1 + n2 + n3;        
        return sum;
    }
   // method that will find the square of a given number
    //...
    
    
}
