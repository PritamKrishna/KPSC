package com.KPSC.qa.TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.KPSC.qa.Pages.KPSCAdminDashboard;
import com.KPSC.qa.Pages.KPSCCreateAdvertisement;
import com.KPSC.qa.Pages.KPSCLandingPage;
import com.KPSC.qa.Pages.KPSCLoginPage;
import com.KPSC.qa.TestBase.KPSCTestBase;
import com.KPSC.qa.util.TestUtil;

public class KPSCCreateAdvertisementTest extends KPSCTestBase {

	KPSCLandingPage KL;
	KPSCLoginPage log;
	KPSCAdminDashboard AD;
	KPSCCreateAdvertisement CA;
	TestUtil util;

	public KPSCCreateAdvertisementTest(){
		super();
	}

	@BeforeTest

	public void setup() throws Exception {

		initialization();
		KL= new KPSCLandingPage();
		log = new KPSCLoginPage();
		AD = new KPSCAdminDashboard();
		CA = new KPSCCreateAdvertisement();
		util=new TestUtil();

	}
	
	@SuppressWarnings("static-access")
	@Test
	public void CreateAdvert() throws Exception {
		
		KL.LoginBtn();
		log.login(prop.getProperty("adminuser"), prop.getProperty("adminpassword"), prop.getProperty("captcha"));
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//a[text()='Configuration']")));
		AD.ManageAdvert();
		CA.CreateAdvertisement();
		CA.calenders(prop.getProperty("AdvertismentStartDate"), prop.getProperty("AdvertismentStartMonth"), prop.getProperty("AdvertismentStartYear"),
				     prop.getProperty("AdvertismentEndDate"), prop.getProperty("AdvertismentEndMonth"), prop.getProperty("AdvertismentEndYear"), 
				     prop.getProperty("AdvertismentPublishDate"), prop.getProperty("AdvertismentPublishMonth"), prop.getProperty("AdvertismentPublishYear"));
		CA.savebtn();
		util.takeScreenShot("CreateAdvertisement");
	}
	
	@AfterTest
    public void teardown() {

        driver.close();

}

}
