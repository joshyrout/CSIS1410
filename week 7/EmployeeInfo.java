import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeInfo {

	
	
	public static void main(String[] args) throws IOException {
		
		populateArrayList();

	}
	
	
	static ArrayList<String[]> populateArrayList() throws IOException{
			
		ArrayList<String[]> employeeInfo = new ArrayList<String[]>();
		File fileName = new File("C:\\\\Data\\\\EmployeeData.csv");
		
			if (fileName.exists()) {
				
				BufferedReader br1 = null;
				String line = "";
				String csvSplitBy = ",";
				br1 = new BufferedReader(new FileReader(fileName));
				
				while((line = br1.readLine()) != null) {
					
					String[] employee = line.split(csvSplitBy);
					employeeInfo.add(employee);
				}
				br1.close();
				return employeeInfo;
			} else {
				System.out.printf("File %s does not exist.%n",fileName);
				return employeeInfo;
			}
			
		}
	
	static ArrayList<Integer> getAllIds() throws IOException{
		
		ArrayList<Integer> employeeInfo = new ArrayList<Integer>();
		File fileName = new File("C:\\\\Data\\\\EmployeeData.csv");
		
			if (fileName.exists()) {
				
				BufferedReader br1 = null;
				String line = "";
				String csvSplitBy = ",";
				br1 = new BufferedReader(new FileReader(fileName));
				
				while((line = br1.readLine()) != null) {
					
					String[] employee = line.split(csvSplitBy);
					employeeInfo.add(Integer.parseInt(employee[0].replaceAll("[^\\d]", "")));
				}
				br1.close();
				return employeeInfo;
			} else {
				System.out.printf("File %s does not exist.%n",fileName);
				return employeeInfo;
			}
			
		}

	static boolean doesExist(int employeeId) throws IOException{
		
		File fileName = new File("C:\\\\Data\\\\EmployeeData.csv");
		
			if (fileName.exists()) {
				
				BufferedReader br7 = null;
				String line = "";
				String csvSplitBy = ",";
				br7 = new BufferedReader(new FileReader(fileName));
				
				while((line = br7.readLine()) != null) {
					
					String[] employee = line.split(csvSplitBy);
					
					if(Integer.parseInt(employee[0].replaceAll("[^\\d]", "")) == employeeId) {
						br7.close();
						return true;
					}
					
				}
				br7.close();
				return false;
			} else {
				System.out.printf("File %s does not exist.%n",fileName);
				
				return false;
			}
			
		}
	
	static String[] populate1Employee(int employeeId) throws IOException{
		
		File fileName = new File("C:\\\\Data\\\\EmployeeData.csv");
		String[] notFound = {"-1"};
		
			if (fileName.exists()) {
				
				BufferedReader br2 = null;
				String line = "";
				String csvSplitBy = ",";
				br2 = new BufferedReader(new FileReader(fileName));
				
				while((line = br2.readLine()) != null) {
					
					String[] employee = line.split(csvSplitBy);
					
					if(Integer.parseInt(employee[0].replaceAll("[^\\d]", "")) == employeeId) {
						br2.close();
						return employee;
					}
					
				}

				br2.close();
				return notFound;
			} else {
				System.out.printf("File %s does not exist.%n",fileName);
				return notFound;
			}
			
		}
	
	static String supervisorName(int supervisorId) throws IOException{
		
		File fileName = new File("C:\\\\Data\\\\EmployeeData.csv");
		
			if (fileName.exists()) {
				
				BufferedReader br3 = null;
				String line = "";
				String csvSplitBy = ",";
				br3 = new BufferedReader(new FileReader(fileName));
				
				while((line = br3.readLine()) != null) {
					
					String[] employee = line.split(csvSplitBy);
					
					if(Integer.parseInt(employee[0].replaceAll("[^\\d]", "")) == supervisorId) {
						String fullName = employee[1] + " " + employee[2];
						br3.close();
						return fullName;
					}
					
				}

				br3.close();
				return "";
			} else {
				System.out.printf("File %s does not exist.%n",fileName);
				
				return "";
			}
			
		}

	static int supervisorId(String supervisorName) throws IOException{
		
		File fileName = new File("C:\\\\Data\\\\EmployeeData.csv");
		
		
			if (fileName.exists()) {
				
				BufferedReader br4 = null;
				String line = "";
				String csvSplitBy = ",";
				br4 = new BufferedReader(new FileReader(fileName));
				
				while((line = br4.readLine()) != null) {
					
					String[] employee = line.split(csvSplitBy);
					
					String fullName = employee[1] + " " + employee[2];
					
					if(fullName.equals(supervisorName) ) {
						br4.close();
						return Integer.parseInt(employee[0]);
					}
					
				}
	
				br4.close();
				return -1;
			} else {
				System.out.printf("File %s does not exist.%n",fileName);
				return -1;
			}
			
		}
		
		
}
