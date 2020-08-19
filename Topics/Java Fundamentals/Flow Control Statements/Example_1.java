//Write a program to check if a given integer number is Positive, Negative, or Zero. 

import java.io.*;
import java.util.Scanner;
class Example_1
{
	public static void main(String args[])
	{
		int a;
		System.out.println("Enter an Integer");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a>0)
		System.out.println("Positive");
		else if(a<0)
		System.out.println("Negative");
		else
		System.out.println("Zero");
	}
}