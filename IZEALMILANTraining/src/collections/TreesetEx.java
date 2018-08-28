package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
			TreeSet<String> treeset=new TreeSet<String>();
			treeset.add("KLN");
			treeset.add("HJK");
			treeset.add("KLN");
			treeset.add("ASD");
			Iterator<String> itr=treeset.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			

		}

	}


