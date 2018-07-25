package polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {
		DifferentParameters dp=new DifferentParameters();
		System.out.println(dp.add(2, 3));
		System.out.println(dp.add(3, 4, 5));
		
	}

}
class DifferentParameters
{
	int d;
	public int add(int a,int b)
	{
		return d=a+b;
	}
	public int add(int a, int b, int c)
	{
		return d=a+b+c;
	}
}
