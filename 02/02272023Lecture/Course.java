
package aydin.courseproject;

public class Course {
    private String courseCode;
    private Student[] stdList; // students in the course
    private int stdCount; // student Count
     
    public void addStudents(Student[] newStudents){
        // copy each student from newStudents array
        // to the stdList array
        for (int i = 0 ; i < newStudents.length ; i++){
            this.stdList[this.stdCount] = newStudents[i];
            stdCount++; //!!! to do: check the array length before
                        // adding and incrementing
        }
    }
    
    // constructor with parameters
    public Course(String courseCode,
            int courseCapacity){
        this.courseCode = courseCode;
        if (courseCapacity > 0){
            stdList = new Student[courseCapacity];
        }
        else {
            stdList = new Student[25];
        }
        stdCount = 0;        
    }    
    public void addOneStudent(Student newStudent){
        if (stdCount < stdList.length ){
            stdList[stdCount] = newStudent;
            stdCount++;
        }
    }
    
 }
