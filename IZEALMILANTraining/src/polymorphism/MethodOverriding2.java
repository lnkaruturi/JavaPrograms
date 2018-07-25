package polymorphism;

public class MethodOverriding2 {

	public static void main(String[] args) {
		Ex1 obj=new Ex1();
		obj.show();

	}

}
class Ex
{
	public void show()
	{
		System.out.println("Parent class");
	}
}
class Ex1 extends Ex
{
	public void show()
	{
		System.out.println("Child class");
	}
}
