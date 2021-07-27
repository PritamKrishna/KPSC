package com.KPSC.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class KPSCCandidateDashboard extends KPSCTestBase{

	/* Page factory for KPSCCandidateDashboard*/

	@FindBy(xpath="//button[contains(text(),'I Accept Term and Condition.')]")
	WebElement acceptTerms;

	@FindBy(xpath="//span[text()='Please select a exam city']")
	WebElement selectExamCity;
	
	@FindBy(xpath="//input[@id='08d94056-8ea5-4f4e-8876-6c65aa195803']")
	WebElement SalesforceNotCertified;
	
	@FindBy(xpath="//input[@id='08d94056-8ea4-46c9-8296-dcd1aab335ca']")
	WebElement SalesforceYesCertified;
	
	@FindBy(xpath="//input[@id='importFile-Common-id']")
	WebElement uploadSalesforceDoc;
	
	@FindBy(xpath="//input[@id='08d94058-c0b1-483d-85e3-f8edc478347b']")
	WebElement CognosYesCertified;
	
	@FindBy(xpath="//input[@id='08d94058-c0b1-48d0-800b-688d75b7a48f']")
	WebElement CognosNoCertified;
	
	@FindBy(xpath="//input[@id='declaration']")
	WebElement declaration;
	
	@FindBy(id="examinMediumId")
	WebElement selectExamlang;
	
	@FindBy(xpath="//button[text()='Submit Application']")
	WebElement Submit;
	
	
	

	public KPSCCandidateDashboard() {
		PageFactory.initElements(driver, this);
	}

	public void terms() {
		acceptTerms.click();
	}

	public KPSCPersonalDetailsPage myProfile() {
		Actions action = new Actions(driver);
		WebElement profile= driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//i[@class='ti-user']"));
		action.moveToElement(profile).build().perform();
		WebElement myProfile = driver.findElement(By.xpath("//div[@class='dropdown-menu']//a[text()='My Profile']"));
		myProfile.click();
		return new KPSCPersonalDetailsPage();
	}

	public void Dashboard() {
		Actions action = new Actions(driver);
		WebElement home= driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//i[@class='ti-home']"));
		action.moveToElement(home).build().perform();
		WebElement dashboard = driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[text()='Dashboard']"));
		dashboard.click();

	}

	public KPSCViewProfile viewProfile() {

		Actions actions = new Actions(driver);
		WebElement profile= driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//i[@class='ti-user']"));
		actions.moveToElement(profile).build().perform();
		WebElement viewPro = driver.findElement(By.xpath("//a[contains(text(),'View Profile')]"));
		viewPro.click();
		return new KPSCViewProfile();
	}
	
	public void myRequests() {
		Actions actions = new Actions(driver);
		WebElement profile= driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//i[@class='ti-user']"));
		actions.moveToElement(profile).build().perform();
		WebElement myreq = driver.findElement(By.xpath("//a[contains(text(),'My Request')]"));
		myreq.click();
	}
	
	public void applicationSection() {
		Actions actions = new Actions(driver);
		WebElement appSec= driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//i[@class='ti-receipt']"));
		actions.moveToElement(appSec).build().perform();
		WebElement application = driver.findElement(By.xpath("//a[contains(text(),'Apply Section')]"));
		application.click();
	}
	
	public void myApplication() {
		Actions actions = new Actions(driver);
		WebElement appSec= driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//i[@class='ti-receipt']"));
		actions.moveToElement(appSec).build().perform();
		WebElement application = driver.findElement(By.xpath("//a[contains(text(),'My Applications')]"));
		application.click();
	}
	
	public void applyToAdvertisment() {
		
		driver.findElement(By.xpath("//div[@class='row mt-2']//div[@class='col-md-6 text-right']//button[text()='Apply ']"
				+ "/ancestor::div[@class='card-body mini-stat-img']//"
				+ "div[@class='pb-2']//h4[@class='post-name link-disable']//a[text()='NEWnew']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'ONLYBBSR')]"));
		
		Actions action= new Actions(driver);
		WebElement manager = driver.findElement(By.xpath("//span[text()='4.Manager']"));
		WebElement cleaner = driver.findElement(By.xpath("//span[text()='1.cleaner']"));
		WebElement swipper = driver.findElement(By.xpath("//span[text()='3.swipper']"));
		WebElement supervisor = driver.findElement(By.xpath("//span[text()='4.supervisor']"));
		WebElement guard = driver.findElement(By.xpath("//span[text()='5.Guard']"));
		WebElement kitchenManager = driver.findElement(By.xpath("//span[text()='6.Kitchen Manager']"));
		WebElement accountant = driver.findElement(By.xpath("//span[text()='7.accountant']"));
		
		action.dragAndDrop(manager, cleaner).build().perform();
		action.dragAndDrop(supervisor, cleaner).build().perform();
		action.dragAndDrop(accountant, cleaner).build().perform();
		action.dragAndDrop(kitchenManager, cleaner).build().perform();
		action.dragAndDrop(guard, cleaner).build().perform();
		action.dragAndDrop(swipper, cleaner).build().perform();
		
		SalesforceYesCertified.click();
		uploadSalesforceDoc.sendKeys("D:\\Upload docs\\TestDoc.pdf");
		
		CognosNoCertified.click();
		
		Select a = new Select(selectExamlang);
		a.selectByVisibleText("English");
		
		Submit.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
