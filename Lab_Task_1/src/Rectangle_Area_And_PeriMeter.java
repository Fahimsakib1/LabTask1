import java.util.Scanner;
public class Rectangle_Area_And_PeriMeter
{

	public static void main(String[] args)
	
	{
		Scanner Item = new Scanner(System.in);
		System.out.print(" Take the Length of Rectangle : ");
		float length = Item.nextFloat();
		
		System.out.print(" Take the Width of Rectangle : ");
		float width = Item.nextFloat();
		
		float Area = length * width;
		float Perimeter = 2 *(length + width);
		
		System.out.println(" Area of Rectangle is : " + Area);
		
		System.out.println(" Perimeter of Rectangle is  : " + Perimeter);
		
		
		
		

	}

}
