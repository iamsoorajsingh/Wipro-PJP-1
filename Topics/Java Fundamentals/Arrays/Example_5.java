//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

import java.util.Arrays;
public class Example_5 
{
	public static void main(String[] args) {
		int[] array = {48, 55, 68, 88, 101, 122};
		Arrays.sort(array);
		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length-1] + " and " + array[array.length-2]);
	}
}