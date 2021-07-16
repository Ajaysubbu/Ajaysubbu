package Assigment1;

public class Scientificcalculator extends Simplecalculator {
	public  void Multiply()
	{
		c = a * 2* b;
		System.out.println("Result of Multipliation = " + c);
		System.out.println("This is from Scientific Calc");
	}
	

	public static void main(String[] args) {

		Scientificcalculator obj1 = new Scientificcalculator();
		obj1.Add();
		obj1.Sub();
		obj1.Multiply();
		
	}

}
