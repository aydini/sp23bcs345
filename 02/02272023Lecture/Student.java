package aydin.courseproject;

public class Student {
    private int id;
    private String lastName;
    
    // constructor with 
    // parameters
    public Student(int id, 
            String lastName){
        this.id = id;
        this.lastName = lastName;
    }
    public String toString(){
        return id + "\t" 
                + lastName;                
    }
    
}
