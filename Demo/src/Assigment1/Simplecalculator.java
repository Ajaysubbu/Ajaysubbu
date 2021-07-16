package Assigment1;

public class Simplecalculator {

	float c  ;
	float a =(float)70.25;
	float b = (float) 30.30 ;
	public static void main(String[] args) 
	{
		Simplecalculator obj1 = new Simplecalculator();
		obj1.Add();
		obj1.Sub();
		obj1.Multiply();

	}
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
	public  void Multiply()
	{
		c = a* b;
		System.out.println("Result of Multipliation = " + c);
		System.out.println("This is from Simple Calc");

	}


}
