// Joshua Routledge
public class Employee {

	
	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getTitle() {
		return title;
	}
	public String getStatus() {
		return status;
	}

	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setStatus(String status) {
		
		if(status.contains("occasional")){
			this.status = "O";
		} else if(status.contains("seasonal")){
			this.status = "S";
		} else if(status.contains("part")){
			this.status = "P";
		} else if(status.contains("full")){
			this.status = "F";
		} else {
			// this users status is unknown
			this.status = "U";
		}
			
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Employee(int employeeID) {
		
		setEmployeeID(employeeID);
		
	}
	
	public Employee(int  employeeID, String firstName, String lastName, int age, String title, double salary, String status) {
		
		setEmployeeID(employeeID);
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setTitle(title);
		setSalary(salary);
		setStatus(status);
		
	}

	
	public void printEmployee () {
		
		System.out.print("========================================\n");
		System.out.printf("   Employee ID: %d\n   Name       : %s %s\n   Age        : %d\n   Title      : %s\n   Salary     : %.2f\n   Status     : %s\n",employeeID, firstName, lastName, age, title, salary, status);
		System.out.print("========================================\n");
	}
	
}
