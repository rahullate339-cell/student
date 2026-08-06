import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int id, String name, double salary) {
        employeeId = id;
        employeeName = name;
        basicSalary = salary;
    }

    double calculateHRA() {
        return basicSalary * 0.20;
    }

    double calculateDA() {
        return basicSalary * 0.15;
    }

    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

 public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);
        e.display();
    }
}