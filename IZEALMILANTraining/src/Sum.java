
public class Sum {
	
	int i=20,j=3;
	int addition()
	{
		return this.i+this.j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i,j;
		//i=5;
		//j=6;
		//int k=i+j;
		//System.out.println("Sum is:"+k);
		//System.out.printf("The Sum of %d and %d is %d",i,j,k);
		
		Sum obj=new Sum();
		int result=obj.addition();
		System.out.println("Reult is"+result);
	
	

	}

}
