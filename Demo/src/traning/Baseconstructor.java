package traning;

public class Baseconstructor {
	String Name;
	int Age;
	String FirstName;
	
	Baseconstructor()
	{
		System.out.println("This is Main Cons");		
	}
	
	Baseconstructor(String Name)
	{
		System.out.println("This is My Name Inside Const of Name: "+Name);
	}
	
	Baseconstructor(int Age)
	{
		System.out.println("This is My Age Inside Const of Age: "+Age);
	}
	
	void DummyMethod()
	{
		System.out.println("Your Name is: "+this.Name);
		System.out.println("Your Age is: "+this.Age);
		System.out.println("Your FST Name:"+FirstName);
	}
	
	void DummyMethod(String Name, String fst)
	{
		FirstName =fst;
		this.Name=Name;
		System.out.println("This is My Name: "+Name);
		System.out.println("Your FST NAme is:"+FirstName);
	}
	
	void DummyMethod(int Age)
	{
		this.Age = Age;
		System.out.println("This is My Age: "+Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baseconstructor obj = new Baseconstructor();
		 
	     obj.DummyMethod(25);
	     
	     Testconstructor obj2 = new Testconstructor(90);
	     obj2.DemoMethod();
		
		
	}

}
