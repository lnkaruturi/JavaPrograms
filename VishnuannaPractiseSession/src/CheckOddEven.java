import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number:");
		int n= sc.nextInt();
		sc.close();
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		System.out.println("BYE");

	}

}
