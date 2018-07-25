package abstraction;

public class TestEx2 {

	public static void main(String[] args) {
		Child obj1=new Child();
		obj1.display();
		Child obj2=new Child();
		obj2.show();

	}

}
abstract class Parent
{
	abstract void display();
	void show()
	{
		System.out.println("Parent class");
	}
	
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class");
	}
}
