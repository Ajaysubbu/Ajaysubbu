package traning;

public class Staticmethod {
	static int age;
	static String name;
	static void disp ()
	{
		System.out.println("Age is :" +age);
		System.out.println("Name is :" +name);
		
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		age =35;
		name = "Ajay" ;
		disp ();
				

	}

}
