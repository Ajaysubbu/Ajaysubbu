package inheritance;

public class Sooper_B extends Sooper_A 
{
	public void MethodSooper()
	{
System.out.println("This is Sooper B class ");

}
	
	public void test ()
	
	{
		MethodSooper ();
		super.MethodSooper ();
		
	}
	@Test
	public void testProcess()
	{
		test();
		
	}
}
