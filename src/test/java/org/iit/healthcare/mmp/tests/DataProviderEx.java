package org.iit.healthcare.mmp.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviderEx {
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", 36 },
	   { "Anne", 37},
	   { "Anne", 37},
	 };
	}
	public void verifyData1(String n1, Integer n2) {
	 System.out.println(n1 + " " + n2);
	}
	
	@DataProvider(name = "test2")
	public String[][] readDataFromXLSX() throws IOException{
		
		
		File f = new File("mmpdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		int rows = sheet.getPhysicalNumberOfRows();
		String data[][] = new String[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i][j]);
			}
		}
		return data;

	}
}
