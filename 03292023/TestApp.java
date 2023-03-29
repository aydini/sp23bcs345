package aydin._classwork;

public class TestApp {

    public static void main(String[] args) {
        Person p = new Person("Mike", "Smith");
        Person p2 = new Person();
        Student s = new Student();        
        Student s2 = new Student("Alice", "Wonder", 4.0);        
        
        System.out.println("Student s:" + s.toString()); // explicitly call toString method
        System.out.println("Student s:" + s); // implicit call toString method
        System.out.println("Student s2:" + s2.toString()); // explicitly call toString method
        
        
        
        System.out.println("Person p: " +  p.toString()); // explicitly call toString method
        System.out.println("Person p: " + p); // implicitly call toString method
        System.out.println("Person p2: " +p2); // implicitly call toString method
    }
}
