package corejava;

public class ExceptionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicClass obj=new LogicClass();
		
		try {
			obj.product_id();
			System.out.println("try blockinvoked");
		}
		
		catch(MyOwnException msg) {
			System.out.println(msg);
			System.out.println(msg.getMessage());
		}

	}

}
