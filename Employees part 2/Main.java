import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Joshua Routledge
public class Main {

	public static void main(String[] args) throws IOException {

		
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter an employee ID number or enter -1 for all employees: ");
		if(s1.hasNextInt()) {
			int middle = s1.nextInt();
				if(middle != -1) {
					if(EmployeeInfo.doesExist(middle)) {
						Employee e2 = new Employee(middle);
						e2.printEmployee();
					} else {
						System.out.println("id is not valid");
					}
				} else {
					allEmployees();
				}
			} else {
				allEmployees();
			}
		s1.close();
	}
	
	public static void updateEmployeeInfo(Employee employee, int  employeeID, String firstName, String lastName, int age, String title, double salary, String status) {
		
		employee.setEmployeeID(employeeID);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAge(age);
		employee.setTitle(title);
		employee.setSalary(salary);
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
