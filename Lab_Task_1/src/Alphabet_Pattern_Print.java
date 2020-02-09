
public class Alphabet_Pattern_Print 

{
	public static void main(String[] args)
	{
	 int alphabet=65;             //ASCII value of A = 65
	 
	 for(int i=0;i<3;i++)
		 
	 {            
	 
	   for(int j=0;j<=i;j++)
	        {
	            System.out.print((char)alphabet);
	            alphabet++;
	        }
	   
	     System.out.println();
	 }
	 
	}
		
}
