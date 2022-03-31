package EmpProject;

public class Employee_data {

	
		// TODO Auto-generated method stub
		int empid;
		String empname;
		String empemail_id;
		String empbranch;
		float salary;

		
		public Employee_data() {
			
	}
		public Employee_data(int empid,String empname,String empemail_id, String empbranch,float salary){
		this.empid=empid;
		this.empname=empname;
		this.empemail_id=empemail_id;
		this.empbranch=empbranch;
		this.salary=salary;
		System.out.println("\nEmployee id is:"+empid+"\nEmployee Nameid is:"+empname+"\nEmployee email id is:"+empemail_id+"\nEmployee branch is:"+empbranch+"\nEmployee Salary is:"+salary);
		}
		
		public Employee_data(int empid, String empname, String empemail_id, float salary) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.empemail_id = empemail_id;
			this.salary = salary;
			System.out.println("\nEmployee id is:"+empid+"\nEmployee Nameid is:"+empname+"\nEmployee email id is:"+empemail_id+"\nEmployee Salary is:"+salary);


		}
		
		public Employee_data(int empid, String empname, String empemail_id) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.empemail_id = empemail_id;
			System.out.println("\nEmployee id is:"+empid+"\nEmployee Nameid is:"+empname+"\nEmployee email id is:"+empemail_id);


		}
		
		
		
		
	}
	

