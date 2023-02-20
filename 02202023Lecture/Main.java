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
    public static void main(String[] args) {
     final int LEN = 5; // use final to create a constant    
     float[] fArray = new float[LEN];   
     fArray[0] = (float) 0.2367;
     fArray[1] = (float) 1.654654;
     
     // loop to output array items
     for (int i = 0; i < fArray.length; i++){
         System.out.printf("%.2f\n", fArray[i]);
     }  
     
     for (float fn : fArray){
         System.out.printf("%.2f\n", fn);
     } 
    } // end of main method
}
