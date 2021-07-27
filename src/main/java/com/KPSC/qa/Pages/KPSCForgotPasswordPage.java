package com.KPSC.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class KPSCForgotPasswordPage extends KPSCTestBase {


	// Page factory for KPSC Forgot Password page


	@FindBy(id="forgotPasswordComponent_username_id")
	WebElement username;

	@FindBy(xpath="//input[@placeholder='Date Of Birth']")
	WebElement DOB;

	@FindBy(xpath="//Input[@placeholder='Captcha']")
	WebElement captchaText;


	public KPSCForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}


	public void forgot(String un) {
		username.sendKeys(un);
	}

	public void DOB(String dd, String mm, String yy) {

		DOB.click();

		String monthyearVal = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal);
		String month = monthyearVal.split(",")[0].trim();
		String year = monthyearVal.split(",")[1].trim();


		while(!(month.equals(mm) && year.equals(yy))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month = monthyearVal.split(",")[0].trim();
			year = monthyearVal.split(",")[1].trim();

		}


		int j;

		for(int i=1; i<=7;i++) {
			for(j=1;j<=31;j++) {
				String date= driver.findElement(By.xpath("//body/div[8]/div[1]/dp-day-calendar[1]/div[1]/div[1]/div["+i+"]/button["+j+"]")).getText();
				if(date==dd) {
					driver.findElement(By.xpath("//body/div[8]/div[1]/dp-day-calendar[1]/div[1]/div[1]/div["+i+"]/button["+dd+"]")).click();
				}
			}
		}

		//driver.findElement(By.xpath("//button[text()='"+dd+"']")).click();

	}



}
