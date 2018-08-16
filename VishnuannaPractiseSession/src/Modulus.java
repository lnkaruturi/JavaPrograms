import java.util.Scanner;
public class Modulus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		sc.close();
		int i = n;
		int j = 10;
		int k = i % j;
		System.out.println("Modulus is i%j is " + k);
		
	}

}
