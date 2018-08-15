package exceptionhandling;

public class Arrayexception {

	public static void main(String[] args) {
		try
		{
			int a[]= new int[4];
			a[10]=10;
		}
		catch(Exception e)
		{
			System.out.println("Array out of bound Exception" +e);
		}
		System.out.println("End");
	

	}

}
