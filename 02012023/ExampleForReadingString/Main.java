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
        int myInt;
        String word;
        String line;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int, word, line");        
        
        myInt = scanner.nextInt();
        word = scanner.next();
        line = scanner.nextLine();
        
        System.out.println("int: " + myInt + "\n" +
                           "word: " + word + "\n" +
                           "line: " + line + "\n" );        
                
    }
}
