package lab06;

public class PartTimeEmployee extends AbstractEmployee {
    private double hoursWorked;

    public PartTimeEmployee(String name, JobTypes jobType, double basePay, double hoursWorked) {
        this.employeeName = name;
        this.jobType = jobType;
        this.hoursWorked = hoursWorked;
        this.basePay = basePay;
        this.employeeNumber = totalEmployees;
        totalEmployees +=1;
    }

    public double calculateSalary() {
        return this.basePay * this.hoursWorked;
    }
}