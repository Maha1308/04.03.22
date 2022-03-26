package com.wrapperclass;

public class Example1 {
	
	
		public static void main(String[] args) 
		{
			 
			byte rank = 23;
			
		
			//Byte Rank = rank;
			Byte Rank = Byte.valueOf(rank);
			
			System.out.println(Rank);	
			
			System.out.println("===========================");
			
			
			byte Age = 20;
			Byte age = new Byte(Age);
			
			
			//byte age1 = age;
			byte age1 = age.byteValue();
			
			System.out.println(age1);

		

	}

		

}
