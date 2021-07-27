package com.KPSC.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class KPSCLandingPage extends KPSCTestBase{
	
	/* Page factory for Landing page*/
	
	@FindBy(xpath="//img[@src='assets/loginImages/logo.png']")
	WebElement KPSClogo;
	
	@FindBy(xpath="//img[@src='assets/loginImages/Digital_India_logo_black.png']")
	WebElement DigitalIndiaLogo;
	
	@FindBy(xpath="//img[@src='assets/loginImages/indian-government-logo.png']")
	WebElement IndianGovLogo;
	
	@FindBy(xpath="//a[text()='Download Admit Card']")
	WebElement DwdAdmitCard;
	
	@FindBy(xpath="//a[text()='Download Admit Card Using Name,Mobile No., DOB']")
	WebElement DwdACusingMN;
	
	@FindBy(xpath="//a[text()='View Application Form']")
	WebElement ViewAppForm;
	
	@FindBy(xpath="//a[text()='Composition']")
	WebElement Composition;
	
	@FindBy(xpath="(//span[text()='×'])[1]")
	WebElement CompositionClosebtn;
	
	@FindBy(xpath="//a[text()='Contact Us']")	
	WebElement ContactUs;
	
	@FindBy(xpath="(//span[text()='×'])[2]")
	WebElement ContactUsClose;
	
	@FindBy(xpath="//a[text()='Guidelines for Candidates']")
	WebElement GuidelinesForCandidates;
	
	@FindBy(xpath="(//span[text()='×'])[2]")
	WebElement GuidelinesForCandidatesClose;
	
	@FindBy(xpath="//span[contains(text(),'LOG IN')]")
	WebElement login;
	
	@FindBy(xpath="//span[text()='Register']")
	WebElement register;
	
	
	public KPSCLandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateKPSCLogo() {
		return KPSClogo.isDisplayed();
	}
	
	public void LoginBtn() {
		new WebDriverWait(driver, 60)
		  .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='LOG IN']")));
		login.click();
	}
	
	public void Registerbtn() {
		register.click();
	}
	
}
