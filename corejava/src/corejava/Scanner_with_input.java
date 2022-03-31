package corejava;

import java.util.Scanner;

class employers_data{
	public void empid(int var,String s1,String s2,String s3,float s4) {
		System.out.println("\n");
		//System.out.println();
	}
	
}

public class Scanner_with_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the employee id: ");
		Scanner s=new Scanner(System.in);
		int var=s.nextInt();
		System.out.println("employee id : " + var);
		System.out.println("enter the emplopee name: ");
		String s1=s.next();
		System.out.println("name : " + s1);
		System.out.println("enter the employee email id:");
		String s2=s.next();
		System.out.println("email id : " + s2);
		System.out.println("enter the employee branch: ");
		String s3=s.next();
		System.out.println("branch : " + s3);
		//employers_data obj=new employers_data();
		System.out.println("enter the employee salary: ");
		float s4=s.nextFloat();
		System.out.println("employee salary : " + s4);
		s.close();

	}

}
