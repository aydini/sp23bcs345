
package aydin._classwork;


public class Main {

    public static void main(String[] args) {
        //--- Example of a subclass reference CANT refer to a super
        // class object
        //Bird b = new Animal(); // not allowed!        
        
        //--- Example of downcasting---
        //Animal a1 = new Animal();
        //Bird b = (Bird)(a1); // example of downcasting
        //b.move();
        
        //---Example of polymorhic calls
        /*
        Animal a = new Bird();
        a.move(); // polymorphic call
        a = new Fish();
        a.move(); // polymorphic call
        */
               
        // --- Example of how polymorphism is useful
        // when used with arrays in writing a main application
       // Animal[] animals = new  Animal[10];
        
        // we have two birds and a fish, add them to the array
        /*
        animals[0] = new Bird();
        animals[1] = new Bird();
        animals[2] = new Fish();
        
        // write a generic code to move all the animals
        // in the array
        for (int i = 0; i < 3; i++){
            animals[i].move(); // polymorphic call
        }
        */
        
        
        /*Animal animal = new Animal();
        animal.move();
        
        Bird bird = new Bird();
        bird.move();       
        
        Fish fish = new Fish();
        fish.move();*/       
    }    
}
