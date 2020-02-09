import java.util.Scanner;
public class Largest_From_Three_Numbers 
{

	 public static void main (String[] args)
	   {
		Scanner input = new Scanner (System.in);
      
		int Largest;
		System.out.print (" Take 1st Input : " );
		int Number1 = input.nextInt();
		
      System.out.print (" Take 2nd Input : " );
		int Number2 = input.nextInt();
		
	    System.out.print (" Take 3rd Input : " );
		int Number3 = input.nextInt();
		
		
		
		if (Number1 > Number2)
		{
			if (Number1 > Number3)
			{
			Largest = Number1;
			}
			else
			{
				Largest =Number3;
			}
		}
	
		else {
			 
			if ( Number2 > Number3)
			{
				Largest =Number2;
			}
			else
			{
				Largest = Number3;
			}

		}
		System.out.println (" Largset number is : " + Largest );
		
	}
}
