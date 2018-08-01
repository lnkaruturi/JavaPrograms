package inheritance;
class Baseclass
{
	int a;
	void display() 
	{
		System.out.println("Base class");
	}
}
class Derivedclass extends Baseclass
{
	int b=20;
	void show()
	{
		System.out.println("Derived class");
	}
}


public class Example1 {

	public static void main(String[] args) {
		Baseclass obj1=new Baseclass();
		System.out.println(obj1.a);
		obj1.display();
		
		Derivedclass obj2=new Derivedclass();
		System.out.println(obj2.a);
		obj2.display();
		System.out.println(obj2.b);
		obj2.show();
		

	}

}
