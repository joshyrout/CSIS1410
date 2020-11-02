import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Joshua Routledge
public class Main {

	public static void main(String[] args) throws IOException {

		
		
//		Scanner s1 = new Scanner(System.in);
//		System.out.println("Enter an employee ID number or enter -1 for all employees: ");
//		if(s1.hasNextInt()) {
//			int middle = s1.nextInt();
//				if(middle != -1) {
//					if(EmployeeInfo.doesExist(middle)) {
//						Employee e2 = new Employee(middle);
//						e2.printEmployee();
//					} else {
//						System.out.println("id is not valid");
//					}
//				} else {
//					allEmployees();
//				}
//			} else {
//				allEmployees();
//			}
//		s1.close();
		
		HourlyEmployee h1 = new HourlyEmployee(1,20.00);
		SalaryEmployee s1 = new SalaryEmployee(2,87500.00);
		CommissionEmployee c1 = new CommissionEmployee(3,13);
		
		h1.printEmployee();
		s1.printEmployee();
		c1.printEmployee();
		
	}
	
	public static void updateEmployeeInfo(Employee employee, int  employeeID, String firstName, String lastName, int age, String title, String status) {
		
		employee.setEmployeeID(employeeID);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAge(age);
		employee.setTitle(title);
		employee.setStatus(status);
	}
	
	public static void allEmployees() throws IOException{
		ArrayList<Employee> employeeList = new ArrayList<Employee>(); 
		ArrayList<Integer> importList = EmployeeInfo.getAllIds();
		int i = 0;
		while (i <= importList.size()) {
			if(importList.contains(i)) {
				Employee e1 = new Employee(i);
				e1.printEmployee();
				employeeList.add(e1);
			}
			i++;
		}
		
	}
	
}
