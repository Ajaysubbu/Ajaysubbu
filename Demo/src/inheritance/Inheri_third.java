package inheritance;

public class Inheri_third extends InheriSecond
{

	public int pb3;
	private boolean pv3 = true;
	protected double pr3=3000.003;;

	public void thrMethod()
	{
		pr2=2000;
		System.out.println("\nThrid Method\n");

		System.out.println("First Class-Public Value: "+pb1);
		//System.out.println("First Class-Private Value: "+pv1);
		System.out.println("First Class-Protected Value: "+pr1);

		System.out.println("Second Class-Public Value: "+pb2);
		//System.out.println("Second Class-Private Value: "+pv2);
		System.out.println("Second Class-Protected Value: "+pr2);

		System.out.println("Third Class-Public Value: "+pb3);
		System.out.println("Third Class-Private Value: "+pv3);
		System.out.println("Third Class-Protected Value: "+pr3);

	}
}


