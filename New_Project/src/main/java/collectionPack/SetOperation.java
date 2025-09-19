package collectionPack;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("white");
		s.add("blue");
		s.add("blue");//duplication not allowed and its unordered
		s.add("green");
		System.out.println(s);
		Set<String> a=new HashSet<String>();
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		a.add("orange");
		System.out.println(a);
		//addAll,contains,containsAll,IsEmpty,remove,clear
		s.addAll(a);
		System.out.println(s);
		System.out.println(s.contains("white"));
		System.out.println(s.containsAll(a));
		System.out.println(s.isEmpty());
		System.out.println(s.remove("green"));
		System.out.println(s);
	    s.clear();
	    System.out.println(s);
	    System.out.println(s.isEmpty());
		
		
		// TODO Auto-generated method stub

	}

}
