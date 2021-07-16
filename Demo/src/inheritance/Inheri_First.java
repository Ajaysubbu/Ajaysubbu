package inheritance;

public class Inheri_First 
{
	public int pb1;
	private double pv1=1000.001;
	protected int pr1;

	void fstMethod1 ()
	{
		System.out.println("\nFirst Method\n");
		System.out.println("First Class Public Value: "+pb1);
		System.out.println("First Class Private: "+pv1);
		System.out.println("First Class Protected Value: "+pr1);


	}

	public void A()
	{
		System.out.println(pv1);
	}


}
