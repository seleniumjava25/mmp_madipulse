package org.iit.healthcare.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FutureDate {

	public static String getFutureDate(int daysInFuture,String dateFormat) {

		Calendar cal =Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		cal.add(Calendar.DATE, daysInFuture);
		String formattedDate = sdf.format(cal.getTime());
		System.out.println("Formatted Current Date: " + formattedDate);
		return formattedDate;

	}
//	public static void main(String[] args) {
//		
//		
//		String str = getFutureDate(10, "MMMMM/dd/yyyy");
//		String strArry[]=str.split("/");
//		System.out.println("month:"+strArry[0]);
//		System.out.println("day:"+strArry[1]);
//		System.out.println("year:"+strArry[2]);
//		
//		String month1 = getFutureDate(10, "MMMMM/dd/yyyy").split("/")[0];
//		 
//	
//	}
	
}
