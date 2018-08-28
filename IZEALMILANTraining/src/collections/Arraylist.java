package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Lucky");
		al.add("vinod");
		al.add("Kalyan");
		al.add("Karthik");
		al.add("Goutham");
//		for(String obj:al)
//		{
//			System.out.println(obj);
//		}
		
		
		
//		Iterator<String> itr=al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		System.out.println("List:"+al);		

	}

}
