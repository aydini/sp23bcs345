package aydin.courseproject;

public class MainApp {
    public static void main(String[] args) {
        // creating "BCS 345" with
        // 25 student capacity
        Course javaCourse = new Course("BCS 345", 25);
        
        // create few actual students 
        // and add them to the java course
        Student s1 = new Student(101, "Brown");
        Student s2 = new Student(102, "Michaels");
        javaCourse.addOneStudent(s1);
        javaCourse.addOneStudent(s2);
        
        Student[]  otherStudents = {
            new Student(103, "Applebaum"), 
            new Student(104, "Phillips")
        };
        javaCourse.addStudents(otherStudents);
        
        
    }
}
