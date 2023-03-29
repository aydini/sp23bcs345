package aydin._classwork;

public class Person {
    protected String fName;
    protected String lName;
    
    // default constructor
    public Person(){        
        this.fName = "noFname";        
        this.lName = "noLName";        
    }
     
    public Person(String fName,String lName){        
        this.fName = fName;
        this.lName = lName;        
    }
    
    @Override
    public String toString(){
        return fName + " " + lName;
    }
}
