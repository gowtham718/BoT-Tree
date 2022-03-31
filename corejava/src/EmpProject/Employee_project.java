package EmpProject;

import java.util.Scanner;

public class Employee_project {

	public static void main(String[] args) {
		
		Employee_data data=new Employee_data();
		Employee_imp imp=new Employee_imp();
		
		Scanner scanner=new Scanner(System.in);
		Employee_data emp1=new Employee_data();
		emp1.empid=001;
		emp1.empname="rajesh";
		emp1.empemail_id="rajesh@gmail.com";
		emp1.empbranch="it";
		emp1.salary=25000f;
		
		new Employee_data(002,"ram","ram@gmail.com","N/W",20000f);
		new Employee_data(003,"kumar","kumar@yahoo.com",30000f);
		new Employee_data(004,"sam","sam@hotmail");
		
		
		System.out.println("Enter employee eid:");
		int empid=scanner.nextInt();
		System.out.println("Enter employee ename:");
		String empname =scanner.next();
		System.out.println("Enter  employee email id:");
		String empemail_id =scanner.next();
		System.out.println("Enter Salary");
		float salary=scanner.nextFloat();
			
		Employee_data emp4=new Employee_data(empid,empname,empemail_id,salary);
		
	}	

}
