/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._classwork;

/**
 *
 * @author itlabs
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Circle  c = new Circle();
        Square  s = new Square();
        shapes[0] = c;
        shapes[1] = s;
        
        for (int i =0; i < 2; i++){
            shapes[i].getArea(); // polymorphic call
        }
        
    }
   
}
