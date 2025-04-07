package lab06;

public abstract class AbstractEmployee implements Employee {
    protected String employeeName;
    protected JobTypes jobType;
    protected double basePay;
    static int totalEmployees = 1;
    protected int employeeNumber;
    
    public void displayDetails() {
        System.out.println("Employee #" + this.employeeNumber + " | " +"Name: " + this.employeeName + " | " + "Job Type: " + this.jobType + " | " + "Salary: $"+ this.calculateSalary());
    }
}
