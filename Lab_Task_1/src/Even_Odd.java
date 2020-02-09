
import java.util.Scanner;
public class Even_Odd 
{

	public static void main(String[] args)
	{
		Scanner Item = new Scanner (System.in);
		System.out.print(" Take an input : ");
		int Number = Item.nextInt();
		
		if (Number % 2 ==0)
		{
			System.out.println(" Given Number is Even ");
			
		}
		else
			System.out.println (" Given Number is Odd");

	}

}
