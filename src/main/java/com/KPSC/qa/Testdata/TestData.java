package com.KPSC.qa.Testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	
	public String readFromExcel() throws Exception {
		
		File src = new File("D:\\Selenium Scripts\\KPSC\\testdata\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("The data from excel is: "+ data0);
		wb.close();
		return data0;
		
	}
	
	public void writeToExcel(String cellVal) throws Exception {
		File src = new File("D:\\Selenium Scripts\\KPSC\\testdata\\Data.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(0).setCellValue(cellVal);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		
	}


}
