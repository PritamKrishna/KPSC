package com.KPSC.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.KPSC.qa.TestBase.KPSCTestBase;
import com.KPSC.qa.Testdata.TestData;
import com.KPSC.qa.util.TestUtil;

public class KPSCCreateAdvertisement extends KPSCTestBase{

	TestUtil test = new TestUtil();

	@FindBy(id="advertisementNo")
	WebElement advertnumber;

	@FindBy(xpath="//dp-date-picker[@id='startdate']")
	WebElement startdate;

	@FindBy(xpath="//dp-date-picker[@id='enddate']")
	WebElement enddate;

	@FindBy(id = "ExaminationSelectTag")
	WebElement examtype;

	@FindBy(xpath = "//dp-date-picker[@id='publishDate']")
	WebElement publishdate;

	@FindBy(id = "letterNumber")
	WebElement letternumber;

	@FindBy(id="notificationDetails")
	WebElement noticedetails;

	@FindBy(id="advertisementYearSelectTag")
	WebElement adyear;	


	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement adsavebtn;

	public KPSCCreateAdvertisement() {

		PageFactory.initElements(driver, this);

	}

	public void CreateAdvertisement() throws Exception {


		advertnumber.sendKeys("AD101");

		Select st = new Select(examtype);
		st.selectByVisibleText("Combined Competitive Exam");

		noticedetails.sendKeys("Entrance Exam Notification");

		Select st1 = new Select(adyear);
		st1.selectByVisibleText("2021");	

	}

	public void calenders(String sdd, String smm, String syy,
			String edd, String emm, String eyy,
			String pdd, String pmm, String pyy) {

		startdate.click();
		String monthyearVal = driver.findElement(By.xpath("(//button[@class='dp-nav-header-btn'])[1]")).getText();
		System.out.println(monthyearVal);
		String month = monthyearVal.split(",")[0].trim();
		String year = monthyearVal.split(",")[1].trim();


		while(!(month.equals(smm) && year.equals(syy))) {
			driver.findElement(By.xpath("(//div[@class='dp-calendar-nav-container-right'])[1]")).click();
			monthyearVal = driver.findElement(By.xpath("(//button[@class='dp-nav-header-btn'])[1]")).getText();
			month = monthyearVal.split(",")[0].trim();
			year = monthyearVal.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1628879400000' and text()='"+ sdd +"' and@class='dp-calendar-day dp-current-month']")).click();


		enddate.click();
		String monthyearVal1 = driver.findElement(By.xpath("(//button[@class='dp-nav-header-btn'])[2]")).getText();
		System.out.println(monthyearVal1);
		String month1 = monthyearVal1.split(",")[0].trim();
		String year1 = monthyearVal1.split(",")[1].trim();


		while(!(month1.equals(emm) && year1.equals(eyy))) {
			driver.findElement(By.xpath("(//div[@class='dp-calendar-nav-container-right'])[2]")).click();
			monthyearVal1 = driver.findElement(By.xpath("(//button[@class='dp-nav-header-btn'])[2]")).getText();
			month1 = monthyearVal1.split(",")[0].trim();
			year1 = monthyearVal1.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1633631400000' and text()='"+ edd +"' and@class='dp-calendar-day dp-current-month']")).click();

		publishdate.click();
		String monthyearVal2 = driver.findElement(By.xpath("(//button[@class='dp-nav-header-btn'])[3]")).getText();
		System.out.println(monthyearVal2);
		String month2 = monthyearVal2.split(",")[0].trim();
		String year2 = monthyearVal2.split(",")[1].trim();


		while(!(month2.equals(pmm) && year2.equals(pyy))) {
			driver.findElement(By.xpath("(//div[@class='dp-calendar-nav-container-right'])[3]")).click();
			monthyearVal2 = driver.findElement(By.xpath("(//button[@class='dp-nav-header-btn'])[3]")).getText();
			month2 = monthyearVal2.split(",")[0].trim();
			year2 = monthyearVal2.split(",")[1].trim();

		}
		
		driver.findElement(By.xpath("//button[@id='1628879400000' and text()='"+ pdd +"' and@class='dp-calendar-day dp-current-month']")).click();	
	}

	public void savebtn() {
		adsavebtn.click();
	}
	
	TestData td= new TestData();
	public void storeAdvertName() throws Exception {
		String createdAdvert = driver.findElement(By.xpath("//*[@id='tblBiGrid']/tbody/tr[1]/td[1]")).getText();
		td.writeToExcel(createdAdvert);
		
	}
	
	public void storeAllNames() {
		driver.findElements(By.xpath("//*[@id='tblBiGrid']/tbody//td[1]"));
	}


}
