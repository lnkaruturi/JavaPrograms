
public class Methodoverloadingmainmethod {
	
	public static void main(String arg1) {
		System.out.println("Argument1");
		
		
	}

	public static void main(String arg[]) {
		System.out.println("Hello world");

	}
	public static void main(String arg1, String arg2) {
		System.out.println("Argument 2");
		
	}
	
}
class MM //extends Methodoverloadingmainmethod
{
	public static void main(String arg1, String arg2, String arg3) {
		System.out.println("Argument 3");
		
	}
}
