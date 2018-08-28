package collections;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedlistEx {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Lakshmi");
		list.add("ABC");
		list.add("def");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
