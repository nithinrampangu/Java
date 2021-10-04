import java.util.*;
class ControlStatements
{   
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter amount: ");
		int x=sc.nextInt();
	  

		if(x>=1000)
		{
			int percent=(x/100)*10;
			int total=x-percent;
           System.out.println("your total purchase is"  +x);
		   System.out.println("your discount price is " +percent);
		   System.out.println("The total amount to pay  " +total);
		}
		else if((x>=0)&&(x<1000))
		{
           System.out.println("your total purchase is" +x+ "your discount price is  0");

		}

		else{
           System.out.println("enter valid amount");
		}

	}
}
