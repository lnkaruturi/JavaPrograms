
public class SecondSmallestNumber {

	public static void main(String[] args) {
		int a[]= {3,2,28,8,4,9};
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		int secsmall=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<secsmall&&a[i]!=small)
			{
				secsmall=a[i];
			}
		}
		System.out.println("Secsmall number is " + secsmall);
		

	}
	

}
