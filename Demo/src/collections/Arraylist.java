package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args)
	{
		
		System.out.println("****** This is List1 for invoiking Array list  *******");		
	ArrayList<String> List1 = new ArrayList<String>();
	
	List1.add("Ajay");
	List1.add("Vijay");
	List1.add("Suresh");
	List1.add("Chandra");
	List1.add("Ajay");
	List1.add( "39.25");
	
	System.out.println(List1); 
	
	//Iterating Collection through Iterator interface
	System.out.println("****** This is List2 by Iterator *******");
	ArrayList<String> List2 =new ArrayList<String>();
	List2.add("Indhiran");
	List2.add("Chandhiran");
	List2.add("Robo");
	List2.add("Indhiran");
	List2.add("Raghavan");
	
	Iterator itr =List2.iterator();
	
	while (itr.hasNext())
	{
	
	System.out.println(itr.next());
	}
	
	//Iterating Collection through For each loop
	
	System.out.println("****** This is List3 by For each Loop *******");
	ArrayList<String> List3 =new ArrayList<String>();
	List3.add("Indhira ");
	List3.add("Chithra");
	List3.add("Nidarsana");
	List3.add("Adhira");
	List3.add("Nidarsana");

	for (String obj:List3)
	{
		
		System.out.println(obj);
		
	}
	
}
}
