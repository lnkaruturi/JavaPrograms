import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		
		System.out.println("The Multiplication of" + n + "is :");
		for(int i=0;i<=10;i++)
		{
			System.out.println(n +"*"+ i + "=" + (n*i));
		}
		sc.close();
	}

}
