//Write a program to initialize an integer array and print the sum and average of the array.

import java.io.*;
import java.util.*;

class Example_1
{
	public static void main(String args[])
	{
		int n, sum=0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array :");
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++ )
		{
			a[i]=sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
	}
}