/*Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10 */

import java.io.*;
import java.util.Scanner;

class Example_17
{
    public static void main(String args[])
    {
        int num, rem=0, sum=0, temp;
        Scanner scan = new Scanner(System.in);	
        System.out.print("Enter the Number : ");
        num = scan.nextInt();
        temp = num;
        while(num>0)
        {
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.print("Sum of Digits of " +temp+ " is : " +sum);        
    }
}