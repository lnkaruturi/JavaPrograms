package constructors;

public class Student2 {
	int id;
	String name;
	String city;
	Student2(int i,String n)
	{
		id=i;
		name=n;
	}
	Student2(int i,String n, String c)
	{
		id=i;
		name=n;
		city=c;
		
	}
	void display()
	{
		
		System.out.println(id+"  "+ name +"  "+ city);
	}

	public static void main(String[] args) {
		Student2 s1=new Student2(123,"Vinod");
		Student2 s2=new Student2(234,"Lucky","Richmond");
		s1.display();
		s2.display();
		
		

	}

}