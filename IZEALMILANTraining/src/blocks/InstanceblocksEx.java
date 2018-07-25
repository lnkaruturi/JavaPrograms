package blocks;

public class InstanceblocksEx {

	public static void main(String[] args) 
	{
		A a=new A();
		A a1=new A(10);
	}
}
class A
{
	A()
	{
		System.out.println("a()");
	}
	A(int a)
	{
		System.out.println("a(int)" +a);
	}
}

