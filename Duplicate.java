class Duplicate 
{
	public static void main(String[] args) 
	{   int temp;
		int Array[]=new int []{1,2,3,4,5,4,3,2,1};
		
		
			System.out.print("Orginal array is ");
			for(int i=0;i<Array.length;i++)
		{
			System.out.print(Array[i] +" ");
		}
		System.out.println();

		System.out.println("Duplicate elements are:");

		  for(int i=0;i<Array.length;i++)
		{
			  for(int j=i+1;j<Array.length;j++)
			
				  
				  if(Array[i]==Array[j])
				{
					   temp=Array[j];
					  System.out.println(temp);
				}

	
	       }
	   }
		
   }

