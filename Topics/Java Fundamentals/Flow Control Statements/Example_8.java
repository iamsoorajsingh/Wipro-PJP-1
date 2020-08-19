//Initialize a character variable with an alphabhet in a program.
//If the character value is in lowercase, the output should be displayed in uppercase in the following format.
//Example1)
//i/p:a
//o/p:a->A

import java.io.*;

class Example_8
{
	public static void main(String args[])
	{
		String str = new String("a");
		System.out.println("a-> " + str.toUpperCase());
	}
}