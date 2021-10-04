class  Vowels
{
	public static void main(String[] args) 
	{
	  int count=0;

StringBuilder sb=new StringBuilder("hello im learning java");
 System.out.println(sb);
for (int i=0 ; i<sb.length(); i++)
	{
         char ch = sb.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
			 {
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }

	}

