package constructors;

public class Student1 {
	int id;
	String name;
	Student1(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+"   "+name);
	}

	public static void main(String[] args) {
		Student1 s1=new Student1(123,"Vinod");
		Student1 s2=new Student1(234,"Lucky");
		s1.display();
		s2.display();
		
		

	}

}
