//Write a program to check if a given number is prime or not.

//Write a program to check if a given number is prime or not.

import java.io.*;
import java.util.*;

class Example_14
{
	public static void main(String args[])
	{
		boolean prime = true;
		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				prime = false;
				break;
			}
		}
		if(prime == true)
		{
			System.out.println("PRIME");
		}
		else
		{
			System.out.println("NOT PRIME");
		}	
	}
}