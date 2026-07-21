/*Create a class called Employee that includes three pieces of information as instance variables- 
first name, a last name and a monthly salary. Your class should have a constructor that 
initializes the three instance variables. Provide a set and a get method for each instance 
variable. If the monthly salary is not positive, set it to 0.0. Write a test application named 
EmployeeTest that demonstrates class Employee's capabilities. Create two Employee objects 
and display each object's yearly salary. Then give each Employee a 10% raise and display each 
Employee's yearly salary again.*/

public class Employee {
    
    String firstName;
    String lastName;
    double monthlySalary;

    Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

 
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    double getMonthlySalary() {
        return monthlySalary;
    }

    
    void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    
    double yearlySalary() {
        return monthlySalary * 12;
    }
}
