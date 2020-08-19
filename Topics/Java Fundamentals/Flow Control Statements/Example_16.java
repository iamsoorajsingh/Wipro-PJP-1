/*Write a Java program to find if the given number is prime or not.

Example1)
C:\>java Sample 
O/P: Please enter an integer number 

Example2)
C:\>java Sample 1
O/P:1 is neither prime nor composite

Example3)
C:\>java Sample 0
O/P: 0 is neither prime nor composite
 
Example4)
C:\>java Sample 10
O/P: 10 is not a prime number

Example5)
C:\>java Sample 7
O/P : 7 is a prime number*/

import java.io.*;
class Example_16
{
	public static void main(String[] args) 
	{
		boolean prime = true;
		int num = Integer.parseInt(args[0]);
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
			System.out.println(args[0] + " is a prime number");
		}
		else if(num == 0 || num == 1)
		{
			System.out.println(args[0] + " is neither prime nor composite");
		}
		else
		{
			System.out.println(args[0] + " is not a prime number");
		}	
	}
}