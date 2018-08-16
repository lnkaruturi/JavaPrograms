import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String ori, rev="";
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter String:");
		ori=obj.nextLine();
		int length=ori.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+ori.charAt(i);
		}
		if(ori.equals(rev))
		{
			System.out.println("Given String is Palindrome");
			
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}
		

	}

}
