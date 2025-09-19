package collectionPack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("blue");
		a.add("white");
		a.add("black");
		System.out.println(a);
		ArrayList<String> b=new ArrayList<String>();
		b.add("apple");
		b.add("orange");
		b.add("grapes");
		System.out.println(b);
		
		// TODO Auto-generated method stub
		//addAll----Adding one collection to another collection
		System.out.println(a.addAll(b));
		System.out.println(a);
		System.out.println(b);
		//ContainsAll----to check whether the collections is present in another
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		
		//iterator--
			Iterator<String> it=a.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			
			}
			it.remove();
			System.out.println(a);
			
		
			
		

	}


}
