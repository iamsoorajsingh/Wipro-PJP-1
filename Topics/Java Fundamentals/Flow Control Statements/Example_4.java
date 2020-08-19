//Initialize two character variables in a program and display the characters in alphabetical order.
//Example1 - if the first character is 's' and second character is 'e' then the output should be  e,s

import java.io.*;
class Example_4
{
	public static void main(String args[])
	{
		char a='s';
        char b='e';
        if (a>b)
            System.out.println(b+","+a);
       
        else
            System.out.println(a+","+b);
    }
}