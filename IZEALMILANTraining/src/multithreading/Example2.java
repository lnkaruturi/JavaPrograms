package multithreading;

public class Example2 implements Runnable {

	public static void main(String[] args) {
		Thread ex1=new Thread("Lucky");
		Thread ex2=new Thread("Vinod");
		ex1.start();
		ex2.start();
		System.out.println("Threads are:");
		System.out.println(ex1.getName());
		System.out.println(ex2.getName());

	}

	@Override
	public void run() {
		
		
	}

}
