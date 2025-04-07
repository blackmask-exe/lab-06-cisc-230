package lab06;
 
public class FullTimeEmployee extends AbstractEmployee {
    protected double bonusAmount;
 
    public FullTimeEmployee(String name, JobTypes jobType, double basePay, double bonusAmount) {
        this.employeeName = name;
        this.jobType = jobType;
        this.basePay = basePay;
        this.bonusAmount = calculateBonusAmount();
        this.employeeNumber = totalEmployees;
        totalEmployees +=1;
    }
 
    public double calculateSalary() {
        return this.basePay + this.bonusAmount;
 
    }
    public double calculateBonusAmount () {
    	return this.basePay * 0.1;
    }
}