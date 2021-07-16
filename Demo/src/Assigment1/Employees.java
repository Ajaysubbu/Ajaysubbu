package Assigment1;

public class Employees {
	String  Name ;
	int Age;
	double Phone;
	double Salary;
	String Address;

	Employees ()

	{
		System.out.println("Name is " + Name);
		System.out.println("Name is " + Age);
		System.out.println("Name is " + Phone);
		System.out.println("Name is " + Salary);
		System.out.println("Name is " + Address);
	}

	Employees (String Name, int Age)

	{
		System.out.println("Name is " + Name);
		System.out.println("Age is " + Age);
	 

	}

	Employees (double Phone ,double Salary )

	{
 
		System.out.println("Phone is " + Phone);
		System.out.println("Salary is " + Salary);
 

	}
	Employees (String Address )

	{

		System.out.println("Address is " + Address);

	}


	public static void main(String[] args) 
	{
		
		System.out.println("This is Without argument method");
		
		Employees obj1 = new Employees( );
				
	    System.out.println("**************************");
		
		System.out.println("This is second method");
	           new Employees("Ajay",40 );
	           
	   		
	   System.out.println("**************************");      
	           System.out.println("This is third  method"); 
               new Employees(950041951,1000.25);
               
       		
       System.out.println("**************************");
               
               System.out.println("This is Fourth  method"); 
               new Employees(" CEI India,T nager");		
          
       		
       System.out.println("**************************");
               
            		   
            		   
            		   
            		   
            		   
            		   
            		   
            		   
            
	}

}
