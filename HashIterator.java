import java.io.*;
import java.util.*;
import java.util.Map.Entry;
class HashIterator 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hashobj=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(int i=0;i<=2;i++)
		{
			Integer obj1=sc.nextInt();
			String obj2=sc.next();

			hashobj.put(obj1,obj2);
		}

		Iterator<Entry<Integer,String>> itrvalue =hashobj.entrySet().iterator();
		System.out.println("The values are");
		while(itrvalue.hasNext())
			{

			System.out.println(itrvalue.next() +" ");
			}
	}
}
