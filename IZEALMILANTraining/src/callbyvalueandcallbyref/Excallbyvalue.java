package callbyvalueandcallbyref;

public class Excallbyvalue {
	
	static int sum(int i,int j) 
	{
		int addition=i+j;
		return addition;
	}

	public static void main(String[] args) {
		
		int a=10,b=20;
		int c= sum(a,b);
		System.out.println("Sum is "+c);
	}

}
