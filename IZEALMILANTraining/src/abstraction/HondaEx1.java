package abstraction;

public class HondaEx1 extends Bike {
	

	public static void main(String[] args) {
		Bike obj=new HondaEx1();
		obj.run();

	}
	void run() {
		System.out.println("Running Safely");
		
	}

}
abstract class Bike 
{
	abstract void run();
}
