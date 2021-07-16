package Assigment1;

import java.util.Scanner;

public class FlightDisc {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String username = scan .nextLine();
		
		System.out.println("Enter your Gender: ");
		String Gen = scan.nextLine();

		System.out.println("Enter your Age: ");
		int Age = scan.nextInt();

		
		System.out.println("your username: " +username);		 
		System.out.println("your Age: " +Age);	
		System.out.println("your Gender: " + Gen);



		if (Age> 60)
		{
			System.out.println("Your eligible to discount for above  60 Age");
		}
		else if ((Age> 50) && (Gen.equalsIgnoreCase("Female")))
		{

			System.out.println("Your eligible to discount for Female and above  50 Age");
		}

		else if (Age<5)
		{
			System.out.println("Your eligible to discount for Child <6");

		}
		else 
		{
			System.out.println("You are not eligible for  Discount");
		}

	
	}
}

