package org.iit.healthcare.util;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		
		Random ran1d1 = new Random(20);	//seed value
		
		for(int i=0;i<50;i++) 
		{
			
			
			int result1= ran1d1.nextInt();
			System.out.println(result1);
		}
		 
		
		System.out.println("***************");
		
		Random rand = new Random();
		
		for(int i=0;i<10;i++) 
		{
			
			
			int index = rand.nextInt(100);//0-99
			System.out.println(index);
		}
		 
		int LB=50,UB=100;	
		
		System.out.println("***************");
		 
		
		for(int i=0;i<10;i++) 
		{
			
			
			int result = LB+rand.nextInt(UB-LB);//50-99
			System.out.println(result);
		} 
		
		//list.get(index);
		
		
		
		
		
		
	}

}
