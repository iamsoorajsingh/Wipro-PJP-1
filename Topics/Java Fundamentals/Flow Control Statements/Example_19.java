/* Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001 */

import java.io.*;
import java.util.*;
class Example_19
{
    public static void main(String[] args)
	{
		int num, reversed = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
        while(num != 0)
		{
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}