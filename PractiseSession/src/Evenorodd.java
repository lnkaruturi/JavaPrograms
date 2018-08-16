import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		System.out.println("Enter n value:");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%2)!=0)
		{
			System.out.println("odd number");
		}
		else
		{
			System.out.println("Even number");
		}
		sc.close();

	}

}
