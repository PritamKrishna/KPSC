package com.KPSC.qa.TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.KPSC.qa.Pages.KPSCForgotPasswordPage;
import com.KPSC.qa.Pages.KPSCLandingPage;
import com.KPSC.qa.Pages.KPSCLoginPage;
import com.KPSC.qa.TestBase.KPSCTestBase;
import com.KPSC.qa.util.TestUtil;

public class KPSCLoginPageTest extends KPSCTestBase {
	
	KPSCLandingPage KL;
	KPSCLoginPage log;
	KPSCForgotPasswordPage FP;
	TestUtil util;
	
	public KPSCLoginPageTest(){
		super();
	}
	
	@BeforeTest
	public void setup() throws Exception {
		initialization();
		KL= new KPSCLandingPage();
		log = new KPSCLoginPage();
		FP= new KPSCForgotPasswordPage();
		util=new TestUtil();
	}
	
	@SuppressWarnings("static-access")
	@Test()
	public void login() throws Exception {
		KL.LoginBtn();
		log.login(prop.getProperty("user"), prop.getProperty("password"), prop.getProperty("captcha"));
		Thread.sleep(5000);
		util.takeScreenShot("KPSCLoginLandingPage");
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void forgotPassword() throws Exception {
		KL.LoginBtn();
		new WebDriverWait(driver, 20)
		  .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[text()='Forgot Password ?'])[1]")));
		log.forgotPass();
		FP.forgot(prop.getProperty("user"));
		FP.DOB(prop.getProperty("DateOfBirthDay"),prop.getProperty("DateOfBirthMonth"),prop.getProperty("DateOfBirthYear"));
		util.takeScreenShot("doubt");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
