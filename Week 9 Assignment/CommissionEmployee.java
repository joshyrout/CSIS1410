import java.io.IOException;

public class CommissionEmployee extends Employee {

	
	double commissionPercentage;
	
	
	public CommissionEmployee(int employeeID, double commission) throws IOException {
		super(employeeID);
		this.commissionPercentage = commission;
		
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
						+ "Supervisor Name : %s\n   Bonus           : %s\n   Department      : %s\n   Insurance       : %s\n   Hiredate        : %s\n   Phone           : %s\n   Commission Percentage : %.2f\r\n"
				,employeeID, firstName, lastName, age, title, status, supervisor_id, supervisor_name, bonus, department, insurance, hiredate, phone, commissionPercentage);
		System.out.print("=======================================================\n");
	}

	
}
