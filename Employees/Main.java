// Joshua Routledge
public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(0, "John", "Doe", 52, "Sales Associate", 10000.25, "seasonal-part-time" );
		Employee e2 = new Employee(1);
		Employee e3 = new Employee(3);
		
		
		updateEmployeeInfo(e1, 0, "John", "Doe", 52, "Sales Associate", 100.25, "seasonal-part-time");
		updateEmployeeInfo(e2, 1, "Kal", "Drogo", 36, "Agressive Marketing", 32653.87, "part-time");
		updateEmployeeInfo(e3, 2, "Sharron", "Osborne", 18, "Management", 300000.00, "full-time");
		
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();

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
	
}
