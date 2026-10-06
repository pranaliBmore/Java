class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

 class Manager extends Employee {

    String Dept;

    Manager(String name, double salary, String Dept) {
        super(name, salary);
        this.Dept = Dept;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + Dept);
    }
}
public class Exp_8 {
    public static void main(String[] args) {
        Manager m=new Manager("Pranali", 2000, "Data Analyst"); 
        m.display();
    }
    
}