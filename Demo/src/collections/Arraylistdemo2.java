package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylistdemo2 {

	public static void main(String[] args) {
		
		
		
	 ArrayList<String> List =new ArrayList<String>();
	 List.add("Rambo");
	 List.add("Actor");
	 List.add("Hollywood");
	 List.add("English");
	 
		/* ListIterator<String> List1 = List.listIterator(List.size());
        System.out.println("Traversing list through List Iterator");
	 
	  while (List1.hasPrevious())
		 
			 {
		 String Str = List1.previous();
		 System.out.println(Str);
	 }
	 System.out.println("Traversing list through Loop");
	 for (int i=0;i<List.size();i++)
	 {
		 System.out.println (List.get(i));  
		 
		 
	 }
	 
	}*/
	 System.out.println("Traversing list through forEach() method:");  
	 
	 List.forEach(a->
	 {
	 
	 System.out.println(a);
	 });
}
}
