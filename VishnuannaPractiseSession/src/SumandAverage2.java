
public class SumandAverage2 {

	public static void main(String[] args) {
		int n=100;
		float sum=0;
		float avg=0;
		for(int i=1;i<=n;i++)
			{
			if(i%2!=0)
			{
				
			
				sum= sum + i;
			
			}
			}
		System.out.println("The sum is:" + sum);
		avg=sum/n;
		System.out.println("The avg is:" + avg);
		
	}

}
