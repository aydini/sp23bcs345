/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aydin.classwork;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        // get a number the user (keyboard)
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        
        myNumber = scanner.nextInt();
        
        // get the first leftmost digit
         
        System.out.println("first digit: " 
                            + myNumber/10000);
        System.out.println("floating point result: "
                            + myNumber/10000.0);
        System.out.println("second digit: " 
                            + myNumber/1000%10);
        
    }
}
