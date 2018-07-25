package polymorphism;

public class MethodOverloading2 {

	public static void main(String[] args) {
		DifferentDatatypes  dd=new DifferentDatatypes();
		System.out.println(dd.sub(34, 20));
		System.out.println(dd.sub(23.9, 19.8));
	}

}
class DifferentDatatypes
{
	int c;
	double f; 
	public double sub(double d , double e)
	{
		return f=d-e;
	}
	public int sub(int a, int b)
	{
		return c=a-b;
	}
}
