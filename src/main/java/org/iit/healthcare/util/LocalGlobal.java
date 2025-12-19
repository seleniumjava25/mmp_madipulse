package org.iit.healthcare.util;

public class LocalGlobal {
	
	int i=10;
	
	public void displayValues() {
	 
		int i=20;
		this.i=i;
		System.out.println(i);
		System.out.println(this.i);
	}

}
