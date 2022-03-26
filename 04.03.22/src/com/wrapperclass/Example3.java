package com.wrapperclass;

public class Example3 {
	
	
		public static void main(String[] args) 
		{
			
			char Grade='S';
			//Character G=Grade;
             Character G = Character.valueOf(Grade);
             System.out.println(G);
             System.out.println("*********************************");
             
             Character c1= new Character('3');
             //char rank=c1;
              char rank =c1.charValue();
              System.out.println(rank);

	}

		

}
