
public class Employee {

	
	int empID;
	String fullName;
	String jobName ;
	float salary ;
	int childrenNumber ; 
	
	
	
	public Employee() {
 
	}
	
	public Employee(int empID, String fullName, String jobName, float salary, int childrenNumber) {
		this.empID = empID;
		this.fullName = fullName;
		this.jobName = jobName;
		this.salary = salary;
		this.childrenNumber = childrenNumber;
	}

	public float salaryInYear() {
		return salary * 12 ;
	}
	
	public float salaryAllowance() {
		int allowance = childrenNumber * 10 ;
		return salary + allowance ;
	}
	
	public void printInformation() {
		System.out.print("employee information : id = " + empID + "\n" +"name = " + fullName + "\n"+
				"job = " + jobName + "\n" + "salary = " + salary + "\n" +"children  = " + childrenNumber + "\n"
				+"salary in year  = " + salaryInYear() + "\n"+"salary allowance  = " + salaryAllowance() + "\n\n"
				);
	}	
	
	

}
