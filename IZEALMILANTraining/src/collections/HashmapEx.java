package collections;

import java.util.ArrayList;
import java.util.HashMap;


class Person
{
	String name;
	String skill;
	Person(String name,String skill)
	{
		this.name=name;
		this.skill=skill;
	}
	public void show()
	{
		System.out.println("Name:"+this.name+",skill:"+this.skill);
		
	}
}

public class HashmapEx  {

	public static void main(String[] args)  {

		Person dev1=new Person("A","Java");
		Person dev2=new Person("B","Java");
		Person dev3=new Person("C", "Java");
		
		Person qa1=new Person("D","Tesing");
		Person qa2=new Person("E","Testing");
		
		Person devps1=new Person("F","Deveops");
		Person devps2=new Person("G","Deveops");
		Person devps3=new Person("H","Deveops");
		ArrayList <Person> devlist=new ArrayList<Person>();
		ArrayList <Person> qalist=new ArrayList<Person>();
		ArrayList <Person> devopslist=new ArrayList<Person>();
		
		devlist.add(dev1);
		devlist.add(dev2);
		devlist.add(dev3);
		qalist.add(qa1);
		qalist.add(qa2);
		devopslist.add(devps1);
		devopslist.add(devps2);
		devopslist.add(devps3);
		
		HashMap <String,ArrayList<Person>> Javateam=new HashMap<String,ArrayList<Person>>();
		Javateam.put("Sudhakar", devlist);
		
		HashMap <String,ArrayList<Person>> TestingTeam=new HashMap<String,ArrayList<Person>>();
		TestingTeam.put("Nadeem",qalist);
		
		HashMap <String,ArrayList<Person>> DevopsTeam=new HashMap<String,ArrayList<Person>>();
		DevopsTeam.put("Vinod", devopslist);
		ArrayList<Person> personList=Javateam.get("Sudhakar");
		ArrayList<Person> qaList=TestingTeam.get("Nadeem");
		ArrayList<Person> devopsList=DevopsTeam.get("Vinod");
		
		for(Person p: personList)
		{
			p.show();
		}
		for(Person p: qaList)
		{
			p.show();
		}
		for(Person p: devopsList)
		{
			p.show();
		}
		
		
		
		

	}

}
