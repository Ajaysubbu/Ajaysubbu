package inheritance;

public class InheriSecond extends Inheri_First
{
	public int pb2;
	private double pv2=2000.002;
	protected int pr2;

	protected void secMethod()
	{
		System.out.println("\nSecond Method\n");

		System.out.println("First Class-Public Value: "+pb1);
		//System.out.println("First Class-Private Value: "+pv1);
		System.out.println("First Class-Protected Value: "+pr1);

		System.out.println("Second Class-Public Value: "+pb2);
		System.out.println("Second Class-Private Value: "+pv2);
		System.out.println("Second Class-Protected Value: "+pr2);
	}



}
