package result;

import student.Student;

public class Result {
public  double calculatemark(Student s)
    {
        return s.marks;
    }
    public String calculategrade(float percentage)
    {
        if (percentage >= 90){
            return "A+";
        }  
        else if (percentage >= 80){
            return "A";
        }
        else if (percentage >= 70){
            return "B";
        }
        else if (percentage >= 60){
            return "C";
        } 
        else if (percentage >= 50){
            return "D";
        }
        else{
            return "F";
        }
    }
    }