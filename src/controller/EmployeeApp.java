package controller;

import java.util.Scanner;

import Service.EmployeeService;
import ServiceImpl.EmployeeServiceImpl;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService e = new EmployeeServiceImpl();
		System.out.println("*********Welcome to Employee Database***********");
		System.out.println("________________________________________________");
		while (true) {
			System.out.println("\n\n***********MENU***********");
			System.out.println(
					"1. Add Employee\n2. Display All Employee Details.\n3. Search Employee by ID.\n4. Search Employee by Name.\n5. Find Employees by Range of Salary.");
			System.out.println(
					"6. Find Employee by Salary.\n7. Find Employee by Designation\n8. Find Employee by Age.\n9. Update Employee.");
			System.out.println("10. Remove Employee By ID.\n11. Remove All the Employee.\n12. Exit ");
			System.out.print("\nEnter your option : ");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				e.addEmployee();
				break;
			case 2:
				e.getAllEmployee();
				break;
			case 3:
				e.getEmployeeByID();
				break;
			case 4:
				e.findEmployeeByName();
				break;
			case 5:
				e.findEmployeeByRangeOfSal();
				break;
			case 6:
				e.findEmployeeBySal();
				break;
			case 7:
				e.findEmployeeByDesignation();
				break;
			case 8:
				e.findEmployeeByAge();
				break;
			case 9:
				e.updateEmployee();
				break;
			case 10:
				e.removeEmployeeByID();
				break;
			case 11:
				e.removeAllEmployee();
				break;
			case 12:
				System.out.println("\n*******Thank you Visit Again*******");
				sc.close();
				System.exit(0);
			default:
				System.out.println("\n!!!!!!**** Invalid Option ****!!!!!!");
			}
		}

	}
}
