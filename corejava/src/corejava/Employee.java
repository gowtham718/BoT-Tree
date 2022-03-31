package corejava;

 class employee_data{
	int employee_Id;
	private String employlee_mailId;
	String employee_name;
	String employee_branch;
	int employee_salary;
	
	    employee_data(int employee_Id,String employlee_mailId,String employee_name,String employee_branch,int employee_salary){
		System.out.println(employee_Id+" "+employlee_mailId+" "+employee_name+" "+employee_branch+" "+employee_salary);
	}

}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee_data Gowtham=new employee_data(1023,"gowtham@gmail.com","Gowtham","Developer",25000);
		employee_data Ganesh=new employee_data(1029,"ganesh@gmail.com","Ganesh","IT Support",22000);
		employee_data Kumar=new employee_data(1033,"kumar@yahoo.com","Kumar","Developer",25000);

	}

}
