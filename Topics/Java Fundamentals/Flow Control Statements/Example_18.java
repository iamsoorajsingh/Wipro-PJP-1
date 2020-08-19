/* Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   * 
*/

import java.io.*;
import java.util.Scanner;
 
class Example_18
{
  public static void main(String args[])
  {
	int rows;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter an integer number");
    rows = sc.nextInt();
        for(int i = 1; i <= rows; ++i)
		{
            for(int j = 1; j <= i; ++j)
			{
                System.out.print("* ");
            }
            System.out.println();
        }
  }
}