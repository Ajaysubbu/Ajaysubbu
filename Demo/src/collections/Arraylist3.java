package collections;

import java.util.ArrayList;

public class Arraylist3 {

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
 
 

	}

}
