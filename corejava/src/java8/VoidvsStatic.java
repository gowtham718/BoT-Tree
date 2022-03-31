package java8;

public class VoidvsStatic {
	
	public void voidMtd() {
		System.out.println("void");
		System.out.println("normal");
		}
	
	public static void staticvoidMtd() {
		System.out.println("static");
		System.out.println("method static without object");
	}
	
	public int intMtd() {
		return (2+4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidvsStatic o=new VoidvsStatic();
		staticvoidMtd();
		o.voidMtd(); // ctrl moves to line number 4 ; after line 8 ctrll be back to 18
		o.intMtd();
	}

}
