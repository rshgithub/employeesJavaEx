import java.util.List;

public class Department {
	
	String name;
	List<Employee> employees ;
	
	
	public Department() {
		
	}
	
	
	public Department(String name, List<Employee> employees) {
		this.name = name;
		this.employees = employees;
	}


	public float totalSalaryInDepartment() {
		
		float allSalaries = 0;
		
		for (Employee emp : employees){
			allSalaries+= emp.salaryAllowance();
		}
		
		return allSalaries ;
	}
	
	
	public void printAllEmployees() {
		for (Employee emp : employees){
			emp.printInformation();
		}
 	}
	
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		System.out.println(employee.fullName + " added as new employee succefully");
	}
	
	public void removeEmployee(int id) {
		employees.remove(id);
		System.out.println("employee of id = " + id + " removed succefully");
	}
	
	public void count() {
		System.out.println( employees.size() +" employees in this department");
	}

}
