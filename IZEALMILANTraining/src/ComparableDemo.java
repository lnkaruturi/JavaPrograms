
class Person implements Comparable
{
	private static String name;
	private int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void showdata()
	{
		System.out.println("Name:"+this.name+  "Age:" +this.age);
	}
	public int compareTo(Person person)
	{
		return this.name.compareTo(Person.name);
	}
	
		
	}
public class ComparableDemo {
	

	public static void main(String[] args) {
		String str1= new String("Java");
		String str2=new String("java");
		
		Person p1=new Person("Raju",13);
		Person p2=new Person("Raghu",18);
		System.out.println("result"+str1.compareTo(str2));
		System.out.println("result is:"+p1.compareTo(p2));
		
	}

}


