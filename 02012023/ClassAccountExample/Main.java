/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aydin.classwork;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        
        Account account1;
        Account account2;
        account1 = new Account();
        account1.setName("Gili");
        System.out.println( "name in account1: " + account1.getName() );                        
        System.out.println( "name in account1: " + account2.getName() );     // will give error here since account2 is not initialized using new                    
    }
}
