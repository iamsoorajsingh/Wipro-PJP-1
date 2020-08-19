//Initialize a character variable in a program and 
//print 'Alphabhet' if the initialized value is an alphabhet, 
//print 'Digit' if the initialized value is a number, and 
//print 'Special Character', if the initialized value is anything else.

import java.io.*;
import java.util.*;
class Example_6
{
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter a Character\n");
		Scanner sc = new Scanner(System.in);
		ch =sc.next().charAt(0);
		if(ch>=48 && ch<=57)
		{
			System.out.print("Digit\n");

		}
		else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.print("Alphabet\n");
		}
		else
		{
			System.out.print("Special Character\n");

		}
	}
}