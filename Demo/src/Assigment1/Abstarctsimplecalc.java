package Assigment1;

abstract class Abstarctsimplecalc

{

	float c  ;
	float a =(float)70.25;
	float b = (float) 30.30 ;
	
	public  void Add ()
	{
		c =a+ b;
		System.out.println("Result of Addition = " +c);

	}
	public  void Sub()
	{
		c = a- b;
		System.out.println("Result of Subration = " + c);
	}

	
	abstract void  multiply();
	
}
