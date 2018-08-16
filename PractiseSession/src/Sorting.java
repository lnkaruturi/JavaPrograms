import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of elements in an Array:");
		int size=sc.nextInt();
		int [] a =new int[size];
		System.out.println("Pease enter "+size+"  of the Array");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]<a[j])   //if(a[i]>a[j])				
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Result of Array elements are:");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+ " ");
		}
		

	}

}
