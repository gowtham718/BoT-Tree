package corejava;

import java.util.Scanner;

public class array_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int even[] = new int[5];
		int []odd = new int[5];
		int[] prime = {2,3,5,7,11};
		int u;
		System.out.println("enter the 5 even values");
		for (u=0;u<5;u++) {
			even[u]=sc.nextInt();
		}
		//even[1]=24;
		int var=1;
		for (int i=0;i<=4;i++)
		{
			odd[i]=var;
			var=var+2;
		}
	//	System.out.println(even[3]);
	//	System.out.println(odd[4]);
	//	System.out.println(prime[0]);
	//	System.out.println(odd[2]);
		System.out.println("even numbers ------>");
		int j;
		for( j=0;j<5;j++)
			System.out.println(even[j]);
		System.out.println("odd numbers ------>");
		int k;
		for( k=0;k<5;k++)
			System.out.println(odd[k]);
		System.out.println("prime numbers ------>");
		int l;
		for( l=0;l<5;l++)
			System.out.println(prime[l]);
		

	}

}
