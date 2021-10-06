import java.util.*;
class Linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> Linkedobj=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements to store in Linked list");
		for(int i=1;i<5;i++)
		{

		
		 Linkedobj.add(sc.nextInt());
		}
		System.out.println( "linked list is "  +Linkedobj);
	}
}
