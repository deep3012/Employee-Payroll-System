import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Payroll System");

        // Input employee data
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        // Create an employee object
        Employee employee = new Employee(name, id, hoursWorked, hourlyRate);

        // Calculate and display salary
        double salary = employee.calculateSalary();
        System.out
                .println("Salary for employee " + employee.getName() + " (ID: " + employee.getId() + "): rs" + salary);

        // You can add more features like generating pay stubs, saving data to a file,
        // etc.

        scanner.close();
    }
}