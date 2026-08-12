import java.util.Scanner;
import student.Student;
import result.Result;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll No: ");
        int roll_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name: ");
        String name=sc.nextLine();

        System.out.println("marks out of 100: ");
        double marks=sc.nextDouble();

        Student s=new Student(roll_no,name,marks);
        Result r1=new Result();

        float percentage=(float) r1.calculatemark(s);
        String grade=r1.calculategrade(percentage);

        System.out.println("Student details ");
        s.display();
        System.out.println("Percentage: "+r1.calculatemark(s)+"%");
        System.out.println("Grade: "+grade);
    }

    } 
