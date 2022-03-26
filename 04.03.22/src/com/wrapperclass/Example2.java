package com.wrapperclass;

public class Example2 {
	
	
		public static void main(String[] args) 
		{
			
			float salary  = 3223.90f;
			
		
			//Float s=salary;
			Float s = Float.valueOf(salary);
			
			System.out.println(s);	
			
			System.out.println("===========================");
			
			
			float s1 =  23421.34f;
			Float Salary = new Float(s1);
			
			
			//float salary= Salary;
	
			float salary1 = Salary.floatValue();	
			System.out.println(salary1);

		

	}

		

}
