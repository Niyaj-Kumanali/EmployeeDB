package ServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

import Service.EmployeeService;
import entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> list = new ArrayList<>();

	@Override
	public void addEmployee() {
		System.out.println("Enter Employee Details....\n");
		System.out.print("Enter Employee id : ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee name : ");
		String ename = sc.nextLine();
		System.out.print("Enter Employee Salary : ");
		double esal = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Employee Designation :");
		String edsg = sc.nextLine();
		System.out.print("Enter Employee Phone Number : ");
		long ephno = sc.nextLong();
		System.out.print("Enter Employee Age : ");
		int eage = sc.nextInt();
		list.add(new Employee(eid, ename, esal, edsg, ephno, eage));
		System.out.println("\nEmployee Added Successfully");
	}

	@Override
	public void getAllEmployee() {
		System.out.println("\n++++++++++++++++++++++++Employee Details++++++++++++++++++++++++");
		if (list.isEmpty()) {
			System.out.println("\nThere are no Employees.......!!!!");
		} else {
			for (Employee emp : list) {
				System.out.println(emp);
			}
		}
	}

	@Override
	public void getEmployeeByID() {
		System.out.print("\nEnter the Employee id : ");
		int eid = sc.nextInt();
		boolean flag = false;
		for (Employee emp : list) {
			if (eid == emp.getEid()) {
				System.out.println(emp);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("\nEid not found.....");

	}

	@Override
	public void findEmployeeByRangeOfSal() {
		System.out.println("Enter the lower range : ");
		double low = sc.nextDouble();
		System.out.println("Enter the higher range : ");
		double high = sc.nextDouble();

		System.out.println("Searching................");

		boolean flag = false;
		for (Employee emp : list) {
			if (low <= emp.getEsal() && high >= emp.getEsal()) {
				System.out.println(emp);
				flag = true;
			}
		}
		if (!flag)
			System.out.println("\nNo Employee Found.....");

	}

	@Override
	public void updateEmployee() {
		System.out.print("Enter the Employee ID: ");
		int eid = sc.nextInt();
		boolean flag = false;
		for (Employee emp : list) {
			if (eid == emp.getEid()) {
				System.out.println("******** MENU FOR UPDATE ********");
				System.out.println(
						"1. Employee Name.\n2. Employee Salary.\n3. Employee Designation.\n4. Employee Phone Number.\n5. Employee Age");
				System.out.println("\nEnter you option : ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter New Employee name : ");
					String ename = sc.next();
					emp.setEname(ename);
					break;
				case 2:
					System.out.print("Enter New Employee Salary : ");
					double esal = sc.nextDouble();
					emp.setEsal(esal);
					break;
				case 3:
					System.out.print("Enter New Employee Designation :");
					String edsg = sc.next();
					emp.setEdsg(edsg);
					break;
				case 4:
					System.out.print("Enter New Employee Phone Number : ");
					long ephno = sc.nextLong();
					emp.setEphno(ephno);
					break;
				case 5:
					System.out.print("Enter New Employee Age : ");
					int eage = sc.nextInt();
					emp.setEage(eage);
					break;
				default:
					System.err.println("Invalid choice");
				}
				System.out.println("Employee Updated Successfully...");
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("\nEid not found.....");

	}

	@Override
	public void findEmployeeBySal() {
		System.out.print("\nEnter the Employee Salary : ");
		double esal = sc.nextDouble();
		boolean flag = false;
		for (Employee emp : list) {
			if (esal == emp.getEsal()) {
				System.out.println(emp);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("\nSalary not found.....");

	}

	@Override
	public void findEmployeeByDesignation() {
		System.out.print("\nEnter the Employee Designation : ");
		String edsg = sc.nextLine();
		boolean flag = false;
		for (Employee emp : list) {
			if (edsg.equalsIgnoreCase(emp.getEdsg())) {
				System.out.println(emp);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("\nDesignation not found.....");

	}

	@Override
	public void findEmployeeByAge() {
		System.out.print("\nEnter the Employee Age : ");
		int eage = sc.nextInt();
		boolean flag = false;
		for (Employee emp : list) {
			if (eage == emp.getEage()) {
				System.out.println(emp);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("\nAge not found.....");

	}

	@Override
	public void findEmployeeByName() {
		System.out.print("\nEnter the Employee Name : ");
		String ename = sc.nextLine();
		boolean flag = false;
		for (Employee emp : list) {
			if (ename.equalsIgnoreCase(emp.getEname())) {
				System.out.println(emp);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("\nName not found.....");

	}

	@Override
	public void removeEmployeeByID() {
		System.out.print("\nEnter the Employee id : ");
		int eid = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (eid == list.get(i).getEid()) {
				list.remove(i);
				flag = true;
				System.out.println("!!!! Employee has been removed !!!!");
				break;
			}
		}
		if (!flag)
			System.out.println("\nEid not found.....");

	}

	@Override
	public void removeAllEmployee() {
		System.out.println("Are you sure? (y/n) ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'y') {
			list.clear();
			System.out.println("All the Employees has been removed from database...");
		}
		else {
			System.out.println("Thank you.....:)");
		}

	}

}
