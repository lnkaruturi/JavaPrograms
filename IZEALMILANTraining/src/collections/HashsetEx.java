package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("ABC");
		set.add("BSC");
		set.add("ABC");
		set.add("HJK");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
