//Write a program to print first 5 values which are divisible by 2, 3, and 5.

import java.io.*;
import java.util.*;
class Example_21
{
    public static void main(String[] args)
	{
		int num;
		for (num = 1; num <= 160; num++) 
        {      
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) 
                System.out.print(num + " "); 
        }
	}
}

