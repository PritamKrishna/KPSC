package com.KPSC.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class KPSCLoginPage extends KPSCTestBase{

	/* Page Factory for Login Page */

	

	@FindBy(xpath="//input[@id='login_userName_id']")
	WebElement UserName;

	@FindBy(xpath="//input[@id='login_password_id']")
	WebElement Password;

	@FindBy(xpath="//input[@placeholder='Captcha']")
	WebElement captchafeild;

	@FindBy(xpath="(//button[text()='LOG IN'])[1]")
	WebElement loginbtn;

	@FindBy(xpath="(//button[text()=' REGISTER HERE'])[1]")
	WebElement registerbtn;

	@FindBy(xpath="//button[@class='digitalSevaBtn btn-block']")
	WebElement CSCbtn;

	@FindBy(xpath="(//a[text()='Forgot Password ?'])[1]")
	WebElement forgotpassword;

	@FindBy(xpath="//div[@class='text-center web-view']//a[@href='#about']")
	WebElement WhatsNew;

	@FindBy(xpath="//div[@class='text-center web-view']//a[@href='#contact']")
	WebElement HelpDesk;

	@FindBy(xpath="//div[@class='text-center web-view']//a[@href='#']//i[@class='fa fa-download']")
	WebElement DownloadAdmitCard;

	@FindBy(xpath="//div[@class='text-center web-view']//a[@href='#']//i[@class='fa fa-gavel']")
	WebElement GuidelinesForCandidates;
	
	@FindBy(id="forgotPasswordComponent_username_id")
	WebElement UsernameforgotPassword;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement calenderforgotpass;

	public KPSCLoginPage() {
		PageFactory.initElements(driver, this);
	}


	public String validateLoginPageTitle() {
		return driver.getTitle();
	}


	public KPSCAdminDashboard adminlogin(String id, String pwd, String cap) throws Exception {
		
		Thread.sleep(2000);
		UserName.sendKeys(id);
		Password.sendKeys(pwd);
		captchafeild.sendKeys(cap);
		loginbtn.click();
		return new KPSCAdminDashboard();
	}

	


	public KPSCCandidateDashboard login(String id, String pwd, String cap) throws Exception  {

		Thread.sleep(2000);
		UserName.sendKeys(id);
		Password.sendKeys(pwd);
		captchafeild.sendKeys(cap);
		loginbtn.click();
		return new KPSCCandidateDashboard();

	}
	
	public KPSCForgotPasswordPage forgotPass() {
		forgotpassword.click();
		return new KPSCForgotPasswordPage();
	}
	
	
	


}





