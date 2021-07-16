package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist5 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Kamal");
		al1.add("Rajini");
		al1.add("Ajith");
		System.out.println("After invoking add(E e) method: "+al1);

		al1.add(1,"Gowtham");
		System.out.println("After invoking add(int index, E element) method: "+al1);  

		ArrayList<String> al2 = new ArrayList<String> ();

		al2.add("Singaram");
		al2.add("Vikram");
		al1.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al1);  

		ArrayList<String> al3=new ArrayList<String>();

		al3.add("Roy");
		al3.add("john");
		al1.addAll(1,al3);

		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al1);  

		al1.remove("Roy");
		System.out.println("After invoking remove(object) method: "+al1); 
		al1.remove(0);
		System.out.println("After invoking remove(index) method: "+al1); 
		al1.removeAll(al2);
		System.out.println("Updated list : "+al1);   
		al1.removeIf(str-> str.contains("Gowtham"));
		System.out.println("After invoking removeIf() method: "+al1);  
		ArrayList<String> al4 = new ArrayList<String> ();
		al4.add("john");
		al4.add("Priya");
		al1.retainAll(al4)
		System.out.println("iterating the elements after retaining the elements of al4");  
		Iterator itr =al1.iterator();
		while(itr.hasNext())

		{
			System.out.println(itr.next());
		}


	}

}
