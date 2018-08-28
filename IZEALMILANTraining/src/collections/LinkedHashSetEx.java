package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> hashset=new LinkedHashSet<String>();
		hashset.add("Abc");
		hashset.add("ASD");
		hashset.add("wer");
		hashset.add("ASD");
		Iterator<String> itr=hashset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
