import java.io.IOException;

// Joshua Routledge
public class Employee {

	
	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
//	private double salary;
	String status;
	int supervisor_id;
	String supervisor_name;
	boolean bonus;
	String department;
	int insurance;
	String hiredate;
	String phone;
	
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
	public int getSupervisor_id() {
		return supervisor_id;
	}
	public boolean isBonus() {
		return bonus;
	}
	public String getDepartment() {
		return department;
	}
	public int getInsurance() {
		return insurance;
	}
	public String getHiredate() {
		return hiredate;
	}
	public String getPhone() {
		return phone;
	}
	public String getSupervisor_name() {
		return supervisor_name;
	}
	
	
	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
	}
	public void setSupervisor_name(int supervisor_id) throws IOException {
		
		this.supervisor_name = EmployeeInfo.supervisorName(supervisor_id);
	}
	public void setBonus(boolean bonus) {
		if(this.bonus == false && bonus == true) {
//			this.salary = this.salary + 1000.00;
			this.bonus = bonus;
		} else if(this.bonus == true && bonus == false) {
//			this.salary = this.salary - 1000.00;
			this.bonus = bonus;
		}
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setInsurance(int insurance) {
		
		double adjustments = 0;
		
		switch(this.insurance) {
		
			case 0:
				adjustments = 0;
				break;
			case 1:
				adjustments = -2000;
				break;
			case 2:
				adjustments = -1500;	
				break;
			case 3:
				adjustments = -1000;
				break;
			case 4:
				adjustments = -500;
				break;
			default:
				break;
		
		}
		
		switch(insurance) {
		
			case 0:
				break;
			case 1:
				adjustments = adjustments + 2000;
				break;
			case 2:
				adjustments = adjustments + 1500;	
				break;
			case 3:
				adjustments = adjustments + 1000;
				break;
			case 4:
				adjustments = adjustments + 500;
				break;
			default:
				break;
		
		}
		
		this.insurance = insurance;
//		this.salary = this.salary - adjustments;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
		
		if(status.contains("C")){
			this.status = "Contractor";
		} else if(status.contains("S")){
			this.status = "Seasonal";
		} else if(status.contains("P")){
			this.status = "Part Time";
		} else if(status.contains("F")){
			this.status = "Full Time";
		} else {
			// this users status is unknown
			this.status = "U";
		}
			
	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	
	
	
	public Employee(int  employeeID, String firstName, String lastName, int age, String title, double salary, String status) {
		
		setEmployeeID(employeeID);
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setTitle(title);
//		setSalary(salary);
		setStatus(status);
		
		
	}
	
	public Employee(int  employeeID) throws IOException {
		
		 String[] infoFromCSV = EmployeeInfo.populate1Employee(employeeID);
		
		if (infoFromCSV.length < 2) {
			System.out.print("Failed to find employee");
		} else {
			String firstName = infoFromCSV[1];
			String lastName = infoFromCSV[2];
			int age = Integer.parseInt(infoFromCSV[3].replaceAll("[^\\d]", ""));
			String title = infoFromCSV[4];
//			double salary = Double.parseDouble(infoFromCSV[5].replaceAll("[^\\d\\,\\.]", "")) ;
			String status = infoFromCSV[6];
			int supervisor_id = Integer.parseInt(infoFromCSV[7].replaceAll("[^\\d]", ""));;
			boolean bonus = Boolean.parseBoolean(infoFromCSV[8].replaceAll("[^\\d]", ""));
			String department = infoFromCSV[9];
			int insurance = Integer.parseInt(infoFromCSV[10].replaceAll("[^\\d]", ""));
			String hiredate = infoFromCSV[11];
			String phone = infoFromCSV[12];
			setFirstName(firstName);
			setLastName(lastName);
			setAge(age);
			setTitle(title);
//			setSalary(salary);
			setStatus(status);
			setSupervisor_id(supervisor_id);
			setSupervisor_name(supervisor_id);
			setBonus(bonus);
			setDepartment(department);
			setInsurance(insurance);
			setHiredate(hiredate);
			setPhone(phone);
		}
		
		setEmployeeID(employeeID);
		
	}

	public void printEmployee () {
		
		String insurance = "";
		if(this.insurance == 0) {
			insurance = "None";
		} else {
			insurance = "Option " + this.insurance;
		}
		
		String bonus = "";
		if(this.bonus == false) {
			bonus = "None";
		} else {
			bonus = "Yes ";
		}
		
		
		String hiredate = this.hiredate.substring(5, 7) + "/" + this.hiredate.substring(8) + "/" + this.hiredate.substring(0, 4);
		String phone = "(" + this.phone.substring(0, 3) + ")" + this.phone.substring(3, 6) + "-" + this.phone.substring(6);
		
		System.out.print("=======================================================\n");
		System.out.printf("   Employee ID     : %d\n   Name            : %s %s\n   Age             : %d\n   Title           : %s\n   Status          : %s\n   Supervisor ID   : %d\n   "
						+ "Supervisor Name : %s\n   Bonus           : %s\n   Department      : %s\n   Insurance       : %s\n   Hiredate        : %s\n   Phone           : %s\n"
				,employeeID, firstName, lastName, age, title, status, supervisor_id, supervisor_name, bonus, department, insurance, hiredate, phone);
		System.out.print("=======================================================\n");
	}
	
}
