package collections;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		set1.add("ABC");
		set1.add("BCB");
		set1.add("ASD");
		set1.add("MNB");
		HashSet<String> set2=new HashSet<String>();
		set2.add("ABN");
		set2.add("BCB");
		set2.add("ASC");
		set2.add("JKL");
		System.out.println("Names on Set1");
		for(String p:set1)
		{
			System.out.println(p);
		}
		System.out.println("Size of set"+set1.size());
		System.out.println("Names on Set2");
		for(String q:set2)
		{
			System.out.println(q);
		}
		
		set1.addAll(set2);
		System.out.println("A union B(ALL ELEMENTS in SET 1 and 2)");
		for(String s:set1)
		{
			System.out.println(s);
		}
		set1.retainAll(set2);
		System.out.println("A intersection B:");
		for(String p:set1)
		{
			System.out.println(set2);
		}
		

	}

}
