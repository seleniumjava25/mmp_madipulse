package org.iit.healthcare.util;

public class RandomEx2 {


	public static void main(String[] args) {

		String s ="AUT_QA_";

		int LB=65,UB=90;

		int uppercaseChar1= LB+(int)(Math.random()*(UB-LB+1));

		int lowerCaseChar1= 97+(int)(Math.random()*(122-97+1));

		int numberChar1= 48+(int)(Math.random()*(57-48+1));

		String randomString = s+""+(char)uppercaseChar1+(char)lowerCaseChar1+(char)numberChar1;

		System.out.println(randomString);

		int i =50;

		for(int j=1;j<=10;j++)
		{
			System.out.println("Random Value:::::::::"+(int)(Math.random()*i));
		}
		int value =(int)( Math.pow(10,6)); 
		
		System.out.println(value);
	}
}
