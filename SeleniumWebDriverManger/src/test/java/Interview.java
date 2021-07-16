
public class Interview {

	public static void main(String[] args) {
		String s= "Ajay Subbaian";
		
		int str = s.length();
		
		for (int i=str-1;i>=0;i--)
		{ 
			for (int j=0; j<=i;j++)
			{
				System.out.print(s.charAt(j));
				//System.out.print("*");
			} 
			System.out.println();   
 
		}
		

	}

}
