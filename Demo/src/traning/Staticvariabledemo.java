package traning;


public class Staticvariabledemo {
	static int count =0;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Staticvariabledemo obj1=new Staticvariabledemo();
		Staticvariabledemo obj2= new Staticvariabledemo();
		obj1.increment();
	
		System.out.println("obj1: count is = " +obj1.count);
		obj2.increment();
		
		System.out.println("obj2: count is = " +obj2.count);
	}
	
	public void increment()
	{
		
		count ++;
		
	}
	
}
