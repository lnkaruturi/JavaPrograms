import java.util.Scanner;
public class example1 {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		reader.close();
		for(int i=1; i <= n; i++)
			{
				if( i % 2 != 0)
				{
					System.out.print(i);
					System.out.print("\n");	
					for(int k=i;k<(i*2);k++)
					{
						System.out.print("*");
					}
					System.out.print("\n");				
				}
			}
	}
}


		

