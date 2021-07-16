package String;

import java.util.Scanner;	

public class LearnString {

	public static void main(String[] args) {

		//Below code is used to convert Char Array into String Format

		/* char ch[] = {'a', 'j', 'a', 'y'};

		String s1= new String(ch);

		System.out.println("Your string Value is " + s1);

		char ch1[] = {'N', 'I', 'D', 'A','R','S','A','N','A','o',' ','@','1'};
		String s2 =new String (ch1);

		System.out.println("Your string Value is " + s2); 
		 */


		//  Enter the String values on giving with space intervals

		/*Scanner input= new Scanner(System.in);
		System.out.println("Enter the Value");
		String getString = input.nextLine();
		System.out.println("Your given Value is " + getString);
		 */

		// concat Function --> Append two strings 

		/*		String s1 = "HELLO";
		String s2 = "JAVA";

		System.out.println("InBuild Function:"+s1.concat(s2));
		System.out.println("Without Inbuild function:" + s1+ s2); */


		//Below function is used to cast the variables using String function

		/*	int age= 10;
		//Below code is used to cast without using Inbuilt function
		String name = "Age of AJ is: "+age;
		System.out.println(name+40);
		//Below code is used to cast  using Inbuilt function
		String name1 = String.valueOf(age);
		System.out.println(name1+40);  


			int  a =15 ,b =10;
			double db = 12.23;
			String s0 = String.valueOf(db);
			String s1 = a+"";
			System.out.println("Inbuild Func:"+s0.concat(12+""));
			System.out.println("Without Inbuild Func"+ s1+15);*/

		//  equal and equalIgnoreCase 
		/*	String  name1= "HARISh";
	String name2 ="Harish";
	System.out.println("Equal Func :" + name1.equals(name2));
	System.out.println("Equal Func :" + name1.equalsIgnoreCase(name2)); */


		//Below code is used to convert  String Format to Char Array

		String name3 = "VELMURUGAN";

		/*	char c[] = name3.toCharArray();

				for (char nm : c)
			{
				System.out.println(nm);

			}
			System.out.println("Your 3rd Index Value is: "+c[3]); */

		//Below code is used to print the string reverse order Way1

		/* int len = c.length;

	System.out.println("Preinting Reverse Order");
	for (int i=len-1;i>=0;i--)
	{
		System.out.println(c[i]);

	} */

		//Below code is used to print the string reverse order Way1
		/*
			int len2 = name3.length();
			for (int i=len2 -1;i>=0;i--)
			{
				System.out.println(name3.charAt(i));

			} */

		// compareTo --> Compare the string based on the ASCII

		/*		String val1 ="B";//66
			String val2 ="A";//65
			String val3 ="D";//68

			System.out.println(val1.compareTo(val2));
			System.out.println(val2.compareTo(val1));
			System.out.println(val3.compareTo(val1));*/

		//	   substring on Strings --> Getting substring as per the given index
		
		//String s= "Ajay.Subbaian@CEIAMERICA.COM";
		
	/*	String s="Gopi.Krishna@WIPRO.COM";
		int len = s.indexOf("@");
				
		int find = s.indexOf(".", len);
		System.out.println( len);
		System.out.println("Find After @: "+find);
		System.out.println("Total String Length: "+s.length());
		System.out.println("After Trim : "+len);
     	//System.out.println(s.substring(find, +1));
		System.out.println(s.substring(len));
		System.out.println(s.substring( find));
		System.out.println(s.substring(0,len)); */
		
		// toUpperCase and toLowerCase 
	/*	String lower = "harish";
		String Upper = "HARISH";
		System.out.println("Converted from lower to upper case:" +lower.substring(0, 1).toUpperCase().concat(lower.substring(1)));
		System.out.println("Converted from upper to lower  case:" +Upper.toLowerCase()); */
		
		// trim --> Deleting the empty space before and after the text
		
			/*String trim1 ="   AJAY";
			String trim2 ="AJ Subbu";
			trim1=trim1.trim();
			trim2=trim2.trim();
			System.out.println(trim1+"\n"+trim2);	*/
		// startswith --> Returns True or False 
		/* String start= "Ajay how are you";
		System.out.println(start.startsWith("Ajay how are ")); */
		
		// startswith --> Returns True or False 
		
	/*	String end = "AJAY";
		System.out.println(end.endsWith("AY"));*/
		// CharAt  --> Prints the exact characters as per the given index
		//String pickChar ="ChandraMohan";
		//System.out.println(pickChar.charAt(6));
		/*for(int i=pickChar.length()-1;i>=0;i--)
		{
			System.out.println(pickChar.charAt(i));
		}*/
		
	/*	char ch[]=pickChar.toCharArray();
		for(int i=pickChar.length()-1;i>=0;i--)
		{
			System.out.println( ch[i] );
		} */
		
//		 length  -->  Finding the string length including spaces 
	/*	String Fieldlength="Harish ";
		
	 System.out.println("Length of String " + Fieldlength.length());
	 	 System.out.println(Fieldlength.charAt(5));
	// System.out.println((int) Fieldlength.charAt(2));*/
		
//		 valueOf --> Convert int, float, double into String  
		
	/*	int i=10;
		double db= 100.234243;
		//String s= i+"";
	 String str1 = String.valueOf(i);
	 String str2 = String.valueOf(db);
	 System.out.println(str1+10);	
	 System.out.println(str2+20);	*/
		
	 
	// replace  --> Replace one string by another string
	/*	String custName = "S@I N@T@R@J@N";
		System.out.println(custName.replace("@","A")); //Replace special occurrence*/
		
//		 StringBuffer On Append  --> Appends all the given string with the original string 	
	/*	StringBuffer strbuf = new StringBuffer("Hi\n");
		
			strbuf.append("This is Java\n I Can Suuport");
			strbuf.append("\nChar--> "+'c');
			strbuf.append("\nBoolean--> "+true);
			strbuf.append("\nDouble--> "+22.34);
			strbuf.append("\nInt--> "+999);
			strbuf.append("\nHow are You");
			strbuf.append(" Fine");
			System.out.println(strbuf); */
	/*	StringBuffer students =new StringBuffer();
		students.append("Vignesh\n");
		students.append("Ajay\n");
		students.append("Chandra\n");	
		students.append("Indira\n");
		students.append("Karthi\n");
     System.out.println(students); */
		
	/*	String s1= "Rajesh\n";
		s1=s1+"Vigenesh\n";
		s1=s1+"Magesh\n";
		System.out.println(s1); */
//		 StringBuffer on Insert  --> Insert on the given index 
	/*	StringBuffer strIns = new StringBuffer("S Natarajan");
		System.out.println("1st Time ===>" + strIns);
		strIns.insert(1, "ai");
		int len = strIns.length();
		System.out.println(len);
		System.out.println("2nd Time ===>" + strIns);
	    strIns.insert(len,".V");
	    System.out.println("3rd Time ===>" + strIns);*/
		
//		StringBuffer on Delete  --> Delete on the given index 
	    
	 /*   StringBuffer strDel= new StringBuffer("Sai Natarajan");
	    System.out.println(strDel.length());
	    strDel.delete(3,4);
	    System.out.println(strDel);*/
		   
     
		//	 StringBuffer on reverse  --> Print Reverse on the given text 
	    
	  /*  StringBuffer strRev= new StringBuffer("Ajay Subbaian");
	    System.out.println(strRev.reverse());*/
		
//		 indexOf of the String 
	/*	String position = "Finding the Index of the String the World";
		//System.out.println(position.indexOf("i"));//Finding a single character of the Index
		System.out.println(position.indexOf("String"));//Finding the String of the Index 
		System.out.println(position.indexOf("the", 2)); */
		
		/*String position = "Finding,the,Index,of, The,String the World";
		String split[] = position.split(",");
		String expText = "the";
		int count = 0 ;
		 for (String word: split)
		{
			if (word.trim().equalsIgnoreCase (expText))
			{
				
				count= count +1;
			}
		}
		System.out.println("Counted : " +count); */
		
	 /*	String position = "Finding,the,Index,of, The,String the World";
		String split[] = position.split(",");
		String expText = "the";
		int count = 0 ;
		StringBuilder newstr = new StringBuilder();  
		
		 for (String word: split)
		{
			 newstr.append(word).append(" ") ;
			 
			if (word.trim().equalsIgnoreCase (expText))
			{
				
				count= count +1;
			}
		}
		System.out.println("Counted : " +count); 
		System.out.println(newstr);   */
		
//		 isEmpty --> Finding given string is Empty or Not 
		 
	/*	String empt1= "";
		
		String empt2= "World";
		System.out.println(empt1.isEmpty());
		System.out.println(empt2.isEmpty()); */
		
		String ori= "JAVA",act="";
		int len=ori.length();
		for (int i= len-1;i>=0;i--) 
		{
			//act=act+ori.charAt(i);
			act= "AVA" +i;
			System.out.println(act);
			
		}
			
		
		
		
		
	    
	    
     
	}  
	}  






