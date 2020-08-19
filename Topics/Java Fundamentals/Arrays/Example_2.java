//Write a program to initialize an integer array and find the maximum and minimum value of the array.

import java.util.Arrays; 
import java.util.Collections; 
  
class Example_2 
{ 
	public static void main(String[] args) 
    { 
        Integer[] num = { 2, 4, 7, 5, 9 }; 
        int min = Collections.min(Arrays.asList(num)); 
        int max = Collections.max(Arrays.asList(num)); 
        System.out.println("Minimum number of array is : " + min); 
        System.out.println("Maximum number of array is : " + max); 
    } 
} 