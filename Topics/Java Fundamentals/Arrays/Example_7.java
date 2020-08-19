/* Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89} */

public class Example_7
{
	public static int[] removeDuplicates(int[] input)
	{
		int j = 0;
		int i = 1;
		if(input.length < 2){
        return input;
    }
    while(i < input.length)
	{
		if(input[i] == input[j])
		{
			i++;
        }
		else
		{
            input[++j] = input[i++];
        }   
    }
    int[] output = new int[j+1];
    for(int k=0; k<output.length; k++)
	{
        output[k] = input[k];
    }
    return output;
}

public static void main(String a[])
{
    int[] input1 = {12, 34, 12, 45, 67, 89};
    int[] output = removeDuplicates(input1);
    for(int i:output)
	{
        System.out.print(i+" ");
    }
 }
}