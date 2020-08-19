/* Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null */

public class Assignment_4
{
	public static void main(String[] args)
	{
		String str = "CatDogs";
		String output;
		if (str.length() % 2 == 0)
		{
			output = str.substring(0, str.length() / 2);
		} 
		else
		{
			output = null;
		}
		
		System.out.println(output);
	}
}