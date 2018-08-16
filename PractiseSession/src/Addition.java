import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter values:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("Addition of two numbers is:"+z);
		sc.close();
	}

}
