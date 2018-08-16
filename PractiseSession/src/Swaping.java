import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		System.out.println("Enter values:");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Before Swapping \nm="+m+ "\nn=" +n);
		int temp;
		temp=m;
		m=n;
		n=temp;
		System.out.println("After Swaping \nm="+m+ "\nn=" +n);
		sc.close();
		

	}

}
