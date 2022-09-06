import java.util.ArrayList;

public class Company {

	String name;
	ArrayList<Department> departments;
	
	
	
	public Company( ) { 
	}
	
	public Company(String name, ArrayList<Department> departments) {
		this.name = name;
		this.departments = departments;
	}



	public void totalSalaryInCompany() {
		
		float allSalaries = 0;
		
		for (Department dep : departments){
			allSalaries+= dep.totalSalaryInDepartment();
		}
		
		System.out.println(" total company departments salary = " + allSalaries); 
	}
}
