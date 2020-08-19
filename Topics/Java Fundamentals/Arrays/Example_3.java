/* Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array. */

import java.io.*;
public class Example_3
{
	public static void main(String[] args)
	{
		int[] haystack = {1, 4, 34, 56, 7};
		int needle = 9;
		int index = -1;
		for (int i = 0; i < haystack.length; i++)
		{
			if (haystack[i] == needle
			{
				index = i + 1;
				break;
			}
		}
		System.out.println(index);
	}
}