package org.iit.healthcare.util;

public class RandomStrings {

	public static void main(String[] args) {
		
		
		
		String s ="Hello";
		
		String s1= s.concat("World");
		
		System.out.println("Value of s: " + s);
		System.out.println("Value of s1: " + s1);
		
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		int length = 10; // Length of the random string
		
		StringBuilder randomString = new StringBuilder();
		
		for(int i = 0; i < length; i++) {
			int index = (int)(alphabet.length() * Math.random());
			randomString.append(alphabet.charAt(index));
		}
		System.out.println("Random String: " + randomString.toString()+"@gmail.com");
		
	 
		
	}
}
