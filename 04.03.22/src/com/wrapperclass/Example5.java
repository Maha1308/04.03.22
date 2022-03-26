package com.wrapperclass;

public class Example5 {
	
	
		public static void main(String[] args) 
		{
			
			short value= 8;
			//Short v1=value
			Short v1= Short.valueOf(value);
			System.out.println(v1);
			System.out.println("**************************");
			short V=7;
			Short Value=new Short(V);
			short v2=Value.shortValue();
			System.out.println(v2);

	}

		

}
