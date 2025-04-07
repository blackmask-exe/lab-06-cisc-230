package lab06;
import java.util.ArrayList;
import java.util.Scanner;



//public class Main {
//    public static void main(String[] args) {
//        FullTimeEmployee employee1 = new FullTimeEmployee("Timmy", JobTypes.FullTime, 1000); // name, jobtype, bonuspay
//        PartTimeEmployee employee2 = new PartTimeEmployee("Jimmy (Mr Beast)", JobTypes.PartTime, 80); // name, jobtype, hours worked
//        InternEmployee employee3 = new InternEmployee("Ricky", JobTypes.Intern); // name, jobtype
//        System.out.println(employee3.calculateSalary()); 
//    }
//}

public class Main {
	
	static ArrayList<Employee> employeeArray = new ArrayList<>();
	
	public static void clearScreen() {
		for (int i=0; i<50; i++) {
			System.out.println("");
		}
	}



	public static void main(String[] args) {

		Company company = new Company();
		Scanner scanner = new Scanner(System.in);		
		Main.clearScreen();

		
		
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("What action would you like to take? (enter number)");
			System.out.println("1. Create an employee");
			System.out.println("2. Display the details of all employees currently in the company");
			System.out.println("3. Remove an employee");
			System.out.println("4. Nevermind, I'm done.");
//			System.out.println("5. Get account info");
//			System.out.println("6. Get transaction history");
//			System.out.println("7. Nevermind");

			System.out.println();
			
			int action = 0;

			
			try {
				action = scanner.nextInt();

			} catch(java.util.InputMismatchException err) {
				System.out.println("Please enter a number");
				
			}
			scanner.nextLine();

			
			switch (action) {
			case 1:
				System.out.println("What is the employee's name");
				String name = scanner.nextLine();
				
				System.out.println("Is this employee a Full-Time (1), Part-Time(2) or an Intern(3) ?");
				int employeeType = 0;
				try {
					employeeType = scanner.nextInt();

				} catch(java.util.InputMismatchException err) {
					System.out.println("Please enter a number");
					break;
					
				}

				System.out.println("What salary would you like to give to this employee (hourly for part time, monthly for all other)");
				double basePay = 0;
				try {
					basePay = scanner.nextDouble();

				} catch(java.util.InputMismatchException err) {
					System.out.println("Please enter a number");
					break;
					
				}
				if (basePay < 0) {
					System.out.println("Salaries cannot be a negative number, please try again");
//					throw new Error("Salaries cannot be negative, and you did it");
					
				} else {
					scanner.nextLine();
					System.out.println("");
					
					if (employeeType == 1) {
						company.addEmployee(name, 1, basePay); // full time employee with a salary of 6000 per month
					} else if (employeeType == 2) {
						company.addEmployee(name, 2, basePay); // intern employee with an hourly salary

					} else if (employeeType == 3) {
						company.addEmployee(name, 3, basePay); // the fixed stipend received by the employee
					} else {
						System.out.println("Please choose a valid number");
					}
				}
				
				
				
			break;

			case 2:
				company.showEmployees(); // loops through the arraylist in company and prints their details out
				break;

			case 3:
				System.out.println("What is the employee number of the employee that you would like to remove?");
				int removeEmployeeId = 0;
				try {
					removeEmployeeId = scanner.nextInt();

				} catch(java.util.InputMismatchException err) {
					System.out.println("Please enter a number");
					break;
					
				}

				company.deleteEmployee(removeEmployeeId);
				break;

			case 4:
				keepGoing = false;
				break;


			// some more cases that we want to include:
			// 1. display the details of each of the employee by calling the display all method of company
			// 2. remove an employee using employee id (implement employee id, not done that yet)
			// 3. a switch case to get out of the loop (keepGoing = false)


				
	
				

			default:
				System.out.println("Please enter a valid option from the above list");
				
				
				
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");

		}
		scanner.close();

	}

}
