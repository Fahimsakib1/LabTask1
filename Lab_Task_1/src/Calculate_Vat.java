import java.util.Scanner;
public class Calculate_Vat 

{

	public static void main(String[] args) 
	{
		Scanner Item =new Scanner (System.in);
		System.out.print (" Take an amount : ");
		double Salary = Item.nextDouble();
		
		double VAT = Salary * 0.15;
		
		System.out.println(" VAT is : " +VAT + " Taka ");
		

	}

}
