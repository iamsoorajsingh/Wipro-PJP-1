//Write a program to print prime numbers between 10 and 99.

class Example_15 
{
	public static void main(String[] args) 
	{
		int i, number, count; 		
		for(number = 10; number <= 99; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}