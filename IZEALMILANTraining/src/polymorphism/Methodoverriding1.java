package polymorphism;

public class Methodoverriding1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.display();
			
	}

}
class A
{
	public void display()
	{
		System.out.println("Parent class");
	}
}
class B extends A
{
	
}
