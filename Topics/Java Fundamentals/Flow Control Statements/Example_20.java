/* Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001 */

import java.io.*;
import java.util.*;
class Example_20
{
    public static void main(String[] args)
	{
		int num, reversedInteger = 0, remainder, originalInteger;
		num = Integer.parseInt(args[0]);
        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
	}
}