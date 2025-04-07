package lab06;
import java.util.ArrayList;

public class Company {
	private ArrayList<Employee> employeeArray;
	public Company () {
		employeeArray = new ArrayList<>();
		
	}
	
	public void showEmployees () {
		for (int i = 0; i < employeeArray.size(); i++) {
			employeeArray.get(i).displayDetails();
		}
		
	}
	
	public void addEmployee (String employeeName, int jobSelection, double basePay) {
		if (jobSelection == 1) {
			employeeArray.add(new FullTimeEmployee(employeeName, JobTypes.FullTime, basePay, 100.0));
		} else if (jobSelection == 2) {
			employeeArray.add(new PartTimeEmployee(employeeName, JobTypes.PartTime, basePay, 80.0));
		} else if (jobSelection == 3) {
			employeeArray.add(new InternEmployee(employeeName, JobTypes.Intern, basePay));
		} else {
			System.out.println("Please choose a valid number");
		}
		
	}
	
	public void deleteEmployee (int employeeNumber) {
		employeeArray.remove(employeeNumber - 1);
		System.out.println("Employee was deleted successfully.");
	}
} 

