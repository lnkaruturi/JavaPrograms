
public class Employee {

	public static void main(String[] args) 
	{
		
		CEO obj1=new CEO();
		obj1.project();
		obj1.team();
		obj1.project();
		obj1.groupmember();
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		System.out.println(obj1.salary);



	}

}
class Employees
{ 
	
	int id=123;
	String name;
	double salary=1000;

	
}
class Managers extends Employees
{ 
	void team()
	{
		System.out.println("team name");
	}
	void project()
	{
		System.out.println("project name");
	}
	
}
class CEO extends Managers
{
	void groupmember()
	{
		System.out.println("groupofmembers");
	}
}
