package EmpProject;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp_data [] empobjarr=new Emp_data[4];
		Empimpl obj=new Empimpl();
		
		empobjarr[0]=new Emp_data("Abraham","ca",10000f,1);
		empobjarr[1]=new Emp_data("Aram","dev",20000f,2);
		empobjarr[2]=new Emp_data("raam","analyst",15000f,3);
		empobjarr[3]=new Emp_data("Abdul","qa",30000f,4);
		for (int i=0;i<4;i++)
		{
			obj.display(empobjarr[i]);
		}
		scanner.close();

	}

}
