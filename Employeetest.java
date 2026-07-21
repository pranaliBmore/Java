public class Employeetest {
    
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alex", "Seo", 300);
        Employee emp2 = new Employee("Park", "Kang", 400);

        System.out.println("Before 10% Raise:");
        System.out.println(emp1.getFirstName() + " Yearly Salary = " + emp1.yearlySalary());
        System.out.println(emp2.getFirstName() + " Yearly Salary = " + emp2.yearlySalary());

        
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println(emp1.getFirstName() + " Yearly Salary = " + emp1.yearlySalary());
        System.out.println(emp2.getFirstName() + " Yearly Salary = " + emp2.yearlySalary());
    }
}