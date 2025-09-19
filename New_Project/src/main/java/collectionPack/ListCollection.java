package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
		System.out.println(a);
		//Add elements in the collection
		//collection need duplication
		a.add("blue");
		a.add("yellow");
		a.add("blue");
		System.out.println(a);
		//set new  elements in the collection----it replace the current element into new element
		a.set(1, "green");
		System.out.println(a);
		//indexOf---to return the index of element
	  //duplication occurs=first occurence
		//no value=-1
		
			  
		System.out.println(a.indexOf("yellow"));
		System.out.println(a.indexOf("green"));
		//last inddexOf
		
		//last index value shows
		System.out.println(a.lastIndexOf("blue"));
		System.out.println(a.lastIndexOf("green"));
		//contains
		System.out.println(a.contains("blue"));
		System.out.println(a.contains("yellow"));
		
		//isempty---to check whether the collection is empty or not
		System.out.println(a.isEmpty());
		//remove---to remove the particular index element
		System.out.println(a.remove(2));
		System.out.println(a);
		//get---to get the element from particular index
		System.out.println(a.get(1));
		//size--to get the size of the array
		System.out.println(a.size());
		//iteration
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		for(String b:a)
		{
			System.out.println(b);
		}
		
		
	}

}

