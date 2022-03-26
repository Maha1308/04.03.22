package com.wrapperclass;

public class Example4 {
	
	
		public static void main(String[] args) 
		{
			
			boolean status = true;
			//Boolean s1= status;
			Boolean s1=Boolean.valueOf(status);
			System.out.println(s1);
			System.out.println("****************");
			Boolean status1=new Boolean(false);
			//boolean S= status1;
			boolean S= status1.booleanValue();
			System.out.println(S);

	}

		

}
