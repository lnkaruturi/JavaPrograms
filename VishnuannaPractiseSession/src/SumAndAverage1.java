
public class SumAndAverage1 {

	public static void main(String[] args) {
		int n=100;
		float sum=0;
		int i=1;
		double avg=0;
		/*for(int i=1;i<=n;i++)
		{
			sum= sum + i;
			
		}
		System.out.println("The sum is:" + sum);
		avg=sum/n;
		System.out.println("The avg is:" + avg);*/
		do
		{
			sum=sum+i;
			i++;
			avg=sum/n;
			
		}
		while(i<=n);
		System.out.println("The sum is:" + sum);
		System.out.println("The avg is:" + avg);
	}

}
