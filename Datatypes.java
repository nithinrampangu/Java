class Demo
{
    void method1()
   {
	char ch='H';
		int value=ch;
		System.out.println("The ASCII value of" +ch+ "is :" +value );
   }
   void method2()
	{
	    float a=8.2f;
		float b=6.0f;
		System.out.println("The product of two numbers is " +(a*b) );
	}
	void method3()
	{
		int length=2;
		int breadth=3;
		int Area1;

       Area1=length*breadth;
	   System.out.println("The Area of rectangle is: " +Area1);
	}
	void method4()
    {
		double d = 99.99;
	    int i=(int)d;  
        System.out.println("The double value is "+d);
	    System.out.println("The int value is "+i);  
	}
	void method5()
	{
	    char c='D';
		int val=c;
      System.out.println("The ASCII value of"   +c+   "is: " +val);
      int e=c+3;
	  System.out.println("The  value by adding 3 is: " +e);
	  int a=e;  
     char f=(char)a;  
	  System.out.println("The ASCII value of"   +a+   "is: " +f);
      }
	void method6()
	{
	     int in=5;
		 Double d1=6.2;
		 Double d2=in+d1;
		 Double objdob1=new Double(d2);

		  System.out.print("The addition of two numbers is ");
		  System.out.printf("%.3f", objdob1);
		  System.out.println();
	}
	
	void method7()
	{
      int x=3;
	  int y=x*x;
	  System.out.println("The square of a number is "+y);
	}
    void method8()
	{
      int xi=3;
	  int yi=xi*xi*xi;
	  System.out.println("The cubeof a number is "+yi);
	}



}
class Datatypes 
{
	public static void main(String[] args) 
	{
		 Demo d=new Demo();
		  d.method1();

	 System.out.println();
	     d.method2();
		 
     System.out.println();
         d.method3();

	 System.out.println();
	    d.method4();
		
	 System.out.println();
	    d.method5();

	System.out.println();
	    d.method6();

	System.out.println();
	    d.method7();

	System.out.println();
	    d.method8();


 

}
}
