import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double hoursWorked;
    private double hourlyRate;

    public Employee(String name, int id, double hoursWorked, double hourlyRate) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculateSalary() {
        // Implement your salary calculation logic here
        return hoursWorked * hourlyRate;
    }
}