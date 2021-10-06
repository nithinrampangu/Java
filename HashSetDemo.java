import java.util.*;
class HashSetDemo
{
	public static void main(String[] args) 
	{
		HashSet<String> HashStrobj1=new HashSet<String>();
		HashSet<String> HashStrobj2=new HashSet<String>();

		 HashStrobj1.add("Red");
		 HashStrobj1.add("Green");
		 HashStrobj1.add("Yellow");
		 HashStrobj1.add("Black");
		 HashStrobj2.add("Orange");
		 HashStrobj2.add("Pink");
		 HashStrobj2.add("Brown");
	     HashStrobj2.add("Black");

         System.out.println(HashStrobj1);
         System.out.println(HashStrobj2);
		 HashStrobj1.addAll( HashStrobj2);
		 System.out.print("The two sets are merged " );
		 System.out.println(HashStrobj1);


		
	}
}
