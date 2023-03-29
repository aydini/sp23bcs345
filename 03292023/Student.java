package aydin._classwork;

public class Student extends Person {
     private double gpa;
     
     @Override // class Student overrides class Person's toString
     public String toString(){          
      //return super.toString() + " "+ gpa;    
      return fName + " " + lName + " "+ gpa;    // this code works
                    // now since fName and lName are protected in super
                    // class Person
     }
     
     // default constructor with parameters
     public Student(){
         super(); // call the constructor for Person
         this.gpa = 0.0;       
     }
     // constructor with parameters
     public Student(String fName, String lName, double gpa){
         super(fName, lName); // call the constructor for Person
         this.gpa = gpa;       
     }
     
     
}
