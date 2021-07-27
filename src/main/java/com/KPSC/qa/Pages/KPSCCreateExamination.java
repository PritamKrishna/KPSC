package com.KPSC.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.KPSC.qa.TestBase.KPSCTestBase;
import com.KPSC.qa.Testdata.TestData;
import com.KPSC.qa.util.TestUtil;

public class KPSCCreateExamination extends KPSCTestBase{
	
	 /* Page Factory for Create Examination */
	
	TestUtil test = new TestUtil();
	
	
	@FindBy(xpath="//select[@id='AdvertisementNo']")
	WebElement adnumber;
	
	@FindBy(xpath="//input[@name='examinationName']")
	WebElement examname;
	
	@FindBy(xpath="//input[@name='PostName']")
	WebElement shortname;
	
	@FindBy(xpath="//input[@name='totalNumberOfVacancies']")
	WebElement noofvacancies;
	
	@FindBy(xpath="//dp-date-picker[@id='startdate']")
	WebElement startdate;
	
	@FindBy(xpath="//dp-date-picker[@id='enddate']")
	WebElement enddate;
	
	@FindBy(xpath="//input[@name='MinmumAge']")
	WebElement minage;
	
	@FindBy(xpath="//input[@name='MaximumAge']")
	WebElement maxage;
	
	@FindBy(xpath="//input[@name='examinationFee']")
	WebElement examfee;
	
	@FindBy(xpath="//input[@name='processingFee']")
	WebElement processfee;
	
	@FindBy(xpath = "//dp-date-picker[@id='applyAsOnDate']")
	WebElement applyasondate;
	
	@FindBy(xpath = "//dp-date-picker[@id='applyStartDate']")
	WebElement applystartdate;
	
	@FindBy(xpath="//select[@id='applyStartHour']")
	WebElement starthour;
	
	@FindBy(xpath="//select[@id='applyStartMin']")
	WebElement startmin;
	
	
	@FindBy(xpath = "//dp-date-picker[@id='applyEndDate']")
	WebElement applyenddate;
	
	@FindBy(xpath="//select[@id='applyEndHour']")
	WebElement endhour;
	
	@FindBy(xpath="//select[@id='applyEndMin']")
	WebElement endmin;
	
	@FindBy(xpath = "//dp-date-picker[@id='paymentEndDate']")
	WebElement paymentenddate;
	
	@FindBy(xpath="//select[@id='PaymentEndHour']")
	WebElement payendhour;
	
	@FindBy(xpath="//select[@id='PaymentEndMin']")
	WebElement payendmin;
   
	@FindBy(xpath = "//div[@class = 'ql-editor ql-blank']")
	WebElement infotextbox;
	
	@FindBy(id ="isPHCanApply")
	WebElement phcheckbox;
	
	@FindBy(id ="isDomicileOnlyCanApply")
	WebElement domicilecheckbox;
	
	@FindBy(id ="isPostPreferenceRequired")
	WebElement postpreferencecheckbox;
	
	@FindBy(id ="isRestrictExpiredCastCertificate")
	WebElement restrictcertificatecheckbox;
	
	@FindBy(id ="isExamCityPreference")
	WebElement examcitypreferencecheckbox;
	
	
	@FindBy(xpath="(//button[text()='Save'])[1]")
	WebElement examsavebtn;
	
	public KPSCCreateExamination() {

		PageFactory.initElements(driver, this);

	}
	
	TestData td = new TestData();
	public void CreateExam(String sdd, String smm, String syy,
			String edd, String emm, String eyy,
			String add, String amm, String ayy,
			String asdd, String asmm, String asyy,
			String aedd, String aemm, String aeyy,
			String pdd, String pmm, String pyy) throws Exception {
		
		
		Select st = new Select(adnumber);
		st.selectByVisibleText(td.readFromExcel());
		
		examname.sendKeys("Entrance Exam");
		
		shortname.sendKeys("EE");
		
		noofvacancies.sendKeys("120");
		
		startdate.click();
		test.calenderFutureDate(sdd, smm, syy);
		
		enddate.click();
		test.calenderFutureDate(edd, emm, eyy);
		
		minage.sendKeys("22");
		
		maxage.sendKeys("31");
		
		examfee.sendKeys("1500");
		
		processfee.sendKeys("300");
		
		applyasondate.click();
		test.calenderFutureDate(add, amm, ayy);
		
		applystartdate.click();
		test.calenderFutureDate(asdd, asmm, asyy);
		 
		Select st1 = new Select(starthour);
		st1.selectByVisibleText("01");
		
		Select st2 = new Select(startmin);
		st2.selectByVisibleText("00");
		
		applyenddate.click();
		test.calenderFutureDate(aedd, aemm, aeyy);
		
		Select st3 = new Select(endhour);
		st3.selectByVisibleText("23");
		
		Select st4 = new Select(endmin);
		st4.selectByVisibleText("59");
		
		paymentenddate.click();
		test.calenderFutureDate(pdd, pmm, pyy);
		
		Select st5 = new Select(payendhour);
		st5.selectByVisibleText("23");
		
		Select st6 = new Select(payendmin);
		st6.selectByVisibleText("59");
		
		postpreferencecheckbox.click();
		
		examcitypreferencecheckbox.click();
		
		infotextbox.sendKeys("Exam is of 3 hours");
		
		examsavebtn.click();
	}
	
}

