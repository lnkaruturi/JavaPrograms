import java.util.Scanner;

public class ScannerEX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Id:");
		int id=sc.nextInt();
		System.out.println("Enter ur Name");
		String name=sc.next();
		System.out.println("Id:"+id+ " " + "Name:"+name);
		sc.close();
		

	}

}
