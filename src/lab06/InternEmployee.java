package lab06;

public class InternEmployee extends AbstractEmployee {

    public InternEmployee(String name, JobTypes jobType, double basePay) {
        this.employeeName = name;
        this.jobType = jobType;
        this.basePay = basePay;
        this.employeeNumber = totalEmployees;
        totalEmployees +=1;
    }

    public double calculateSalary() {
        return this.basePay;

    }
}