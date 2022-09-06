import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.empID =1;
		employee1.fullName = "rawan";
		employee1.jobName = "dev";
		employee1.salary = 1500;
		employee1.childrenNumber = 2;
		
		employee1.salaryInYear();
		employee1.salaryAllowance();
		employee1.printInformation();
		
		System.out.print("-------------------------------------------------------\n");
		
		Employee employee2 = new Employee();
		employee2.empID =2;
		employee2.fullName = "aml";
		employee2.jobName = "dev";
		employee2.salary = 1600;
		employee2.childrenNumber = 1;
		
		employee2.salaryInYear();
		employee2.salaryAllowance();
		employee2.printInformation();
		
		System.out.print("-------------------------------------------------------\n");
		
		Employee employee3 = new Employee();
		employee3.empID =3;
		employee3.fullName = "aya";
		employee3.jobName = "dev";
		employee3.salary = 1200;
		employee3.childrenNumber = 7;
		
		employee3.salaryInYear();
		employee3.salaryAllowance();
		employee3.printInformation();
		
		System.out.print("------------------------------programming dep-------------------------\n");
 
		Department department1 = new Department();
		department1.name = "prpgramming"; 
		department1.employees = new ArrayList<>(); 
		Collections.addAll(department1.employees, employee1, employee2);
		System.out.print("\n------- totalSalaryInDepartment -------\n");
		System.out.println(" all department salaries = " + department1.totalSalaryInDepartment());
		System.out.print("\n------- count -------\n");
		department1.count();
		System.out.print("\n------- after add printAllEmployees -------\n");
		department1.addEmployee(employee3);
		department1.printAllEmployees();
		System.out.print("\n------- after remove printAllEmployees -------\n");
		department1.removeEmployee(0);
		department1.printAllEmployees();

		System.out.print("------------------------------designing dep-------------------------\n");
		
		Department department2 = new Department();
		department2.name = "designing"; 
		department2.employees = new ArrayList<>(); 
		Collections.addAll(department2.employees, employee3);
		System.out.print("\n------- totalSalaryInDepartment -------\n");
		System.out.println(" all department salaries = " + department2.totalSalaryInDepartment());
		System.out.print("\n------- count -------\n");
		department2.count();
		System.out.print("\n------- after add printAllEmployees -------\n");
		department2.addEmployee(employee2);
		department2.printAllEmployees();
		System.out.print("\n------- after remove printAllEmployees -------\n");
		department2.removeEmployee(0);
		department2.printAllEmployees();
		
		
		System.out.print("------------------------------ company -------------------------\n");

		Company company1 = new Company();
		company1.name = "UCAS";
		company1.departments = new ArrayList<>(); 
		Collections.addAll(company1.departments,department1,department2);
		company1.totalSalaryInCompany();
		
	}

}
