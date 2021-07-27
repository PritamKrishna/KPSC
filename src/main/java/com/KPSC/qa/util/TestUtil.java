package com.KPSC.qa.util;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class TestUtil extends KPSCTestBase{
	
	public static void takeScreenShot(String filename) throws IOException {

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\Selenium Scripts\\KPSC\\screenshots\\"+filename+".png"));
		
	}
	
	public static String captcha() throws UnsupportedFlavorException, IOException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		String captcha = c.getData(DataFlavor.stringFlavor).toString().replaceAll("\\s+", "");
		return captcha;
	}
	
	public void calenderPastDate(String Xm, String Xy, String Xd) {
		String monthyearVal = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal);
		String month = monthyearVal.split(",")[0].trim();
		String year = monthyearVal.split(",")[1].trim();
		
		
		while(!(month.equals(Xm) && year.equals(Xy))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month = monthyearVal.split(",")[0].trim();
			year = monthyearVal.split(",")[1].trim();
				
			}
		
		driver.findElement(By.xpath("//button[text()='"+Xd+"']")).click();
	}
	
	public void calenderFutureDate(String sm, String sy, String sd) {
		String monthyearVal = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal);
		String month = monthyearVal.split(",")[0].trim();
		String year = monthyearVal.split(",")[1].trim();
		
		
		while(!(month.equals(sm) && year.equals(sy))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-right']")).click();
			monthyearVal = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month = monthyearVal.split(",")[0].trim();
			year = monthyearVal.split(",")[1].trim();
				
			}
		
		driver.findElement(By.xpath("//button[text()='"+sd+"']")).click();
	}
	
	



}
