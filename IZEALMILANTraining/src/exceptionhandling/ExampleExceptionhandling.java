package exceptionhandling;

public class ExampleExceptionhandling {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		try 
		{
			int result=a/b;
			System.out.println("Result is:"+result);
			
		}
		catch(Exception ex)
		{
			System.out.println("Arthiemetic Exception");
		}
		
		System.out.println("done");

	}

}
