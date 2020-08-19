//Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.

import java.io.*;

class Example_13
{
	public static void main(String args[])
	{
		int i;
		for(i=23;i<=57;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}