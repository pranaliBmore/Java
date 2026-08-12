/*Develope java application using user define package create a package name student to store and 
display the student detail such as roll no ,name and marks create another package name 
result to calculate percentage and grade of a student write and application programme to import and use a packages*/

package student;

public class Student {
    public int roll_no;
    public String name;
    public double marks;

    public Student(int roll_no,String name,double marks)
{
    this.roll_no=roll_no;
    this.name=name;
    this.marks=marks;
}
public void display(){
    System.out.println("Roll No: "+roll_no);
    System.out.println("Name: "+name);
    System.out.println("Marks: "+marks);
    }   
}