package binding;

class A
{
	void sum()
	{
		System.out.println("sum() at A");
	}
	
}
class B extends A
{
	void display()
	{
		System.out.println("Display() at B");
	}
}
class C extends B
{
	void show()
	{
		System.out.println("show() at C");
	}
	void display()
	{
		System.out.println("Display() at C");
	}
}
public class Dynamic {

	public static void main(String[] args) {
		B obj1=new C();
		//C obj=new C();
		//obj.sum();
		//obj.display();
		//obj.show();
		obj1.display();
	}

}
