package com.KPSC.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class KPSCAdminDashboard extends KPSCTestBase{
	
	
	
	
	
	public KPSCAdminDashboard() {

		PageFactory.initElements(driver, this);

	}
	
	public KPSCCreateExamination ManageExam() {
		
		Actions actions = new Actions(driver);
		WebElement configuration = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[4]//i[@class='ti-settings']"));
		actions.moveToElement(configuration).build().perform();
		WebElement manageExam = driver.findElement(By.xpath("//a[text()='Manage Examination']"));
		manageExam.click();
		return new KPSCCreateExamination();
		
		
	}
		
	public KPSCCreateAdvertisement ManageAdvert() {
		
		Actions actions = new Actions(driver);
		WebElement configuration = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[4]//i[@class='ti-settings']"));
		actions.moveToElement(configuration).build().perform();
		WebElement manageAdvert = driver.findElement(By.xpath("//a[text()='Manage Advertisement']"));
		manageAdvert.click();
		return new KPSCCreateAdvertisement();
	}

}
