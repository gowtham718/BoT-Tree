package corejava;

abstract class ThreadSample implements Runnable{
	
	public void run() {
		try {
		System.out.println("hello");
		}
		
	}
}

/*public class threaddemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Main thread");
		System.out.println(t.getName());

	}
}*/


