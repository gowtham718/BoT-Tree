package java8;

class normal
{
	public normal(String s) {
		super();
		System.out.println("im inside constructor");
	}
	
/*class normal{
	public void show(String s){
		System.out.println("im in inside display method"+s);*/
	//}
//}
/*public class lambdaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyInterface ref=(int a, int b)->{System.out.println("im in inside display method"+(a+b));
		MyInterface ref=(String s1,String s2)->{System.out.println("im in inside display method"+s1+s2);
	};
	//ref.display(4,6);
	ref.display("always","be happy");

	}
}*/
//normal obj = new normal();
//MyInterface  ref=normal::show;
//ref.display("Method reference");
	
	MyInterface ref=normal::new;
	ref.display("gowtham"));
}
