//Write a program to print the sum of the elements of an array following the given below condition.
//If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

import java.io.*;
import java.util.*;

public class Example_8
{
	public static void main(String[] args)
	{
		int[] array = {10, 3, 6, 1, 2, 7, 9};
		int sum = 0;
		int sixPos = -1;
		int sevenPos = -1;	
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 6) sixPos = i;
			if (array[i] == 7) sevenPos = i;
		}
		if (sevenPos == -1) sixPos = -1;
		for (int i = 0; i < array.length; i++)
		{
			if (sixPos != -1 && i >= sixPos && i <= sevenPos) continue;
			sum += array[i];
		}
		System.out.println(sum);
	}
}