import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter integer no:");
		System.out.println("Enter double no:");
		System.out.println("Enter String:");
		int a= keyboard.nextInt();
		double b=keyboard.nextDouble();
		String c=keyboard.next();
		keyboard.close();
		System.out.println("Integer is:" + a +   "double no:"  + b +  "String is: "+ c);
		
	}

}
