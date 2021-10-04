

class Fib
  {
   void fs()
	{
	   int First=1;
	   int Second=2;
	   int Temp;

	      System.out.print(First );
	      System.out.print("," +Second );

          for(int i=1;i<=10;i++)
			  {
		        Temp=First+Second;
		        System.out.print("," +Temp);
		        First=Second;
		        Second=Temp;
				}
	}
  }
       

class Fibonacci 
 {
   public static void main(String[] args) 
	 {
	   Fib fi=new Fib();
		fi.fs();
	}
}
	