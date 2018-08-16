
public class SumandAverage {

	public static void main(String[] args) {
		
		int i=1;
		int n=100;
		float sum=0;
		float avg=0;
		
		while(i<=n)
		{
			sum=sum+i;
			i++;
			avg=sum/n;
		}
		System.out.println("The Sum is :"+ sum);
		System.out.println("The Avg is:"+ avg);

	}

}
