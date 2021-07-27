package com.KPSC.qa.Pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class KPSCPersonalDetailsPage extends KPSCTestBase{

	/* Page factory for personal details */

	@FindBy(id="identityType")
	WebElement IdentityType;

	@FindBy(id="enterIdentityNo")
	WebElement IDnum;

	@FindBy(id="confirmIdentityNo")
	WebElement ConfIDnum;

	@FindBy(id="nationality")
	WebElement nation;

	@FindBy(id="gender")
	WebElement gender;

	@FindBy(id="fullName")
	WebElement fullNameSSC;

	@FindBy(id="faterFullName")
	WebElement fathername;

	@FindBy(id="motherFullname")
	WebElement motherName;

	@FindBy(id="areYouMarried")
	WebElement married;

	@FindBy(id="isDomicileOfKarnatak")
	WebElement DomOfKar;

	@FindBy(id="isPh")
	WebElement diffAbeled;

	@FindBy(id="PersonalDetails_collaps")
	WebElement PDtab;

	@FindBy(id="ReservationClaimed_collaps")
	WebElement ReserveTabOpen;

	@FindBy(id="Category")
	WebElement Category;

	@FindBy(id="personaladdress")
	WebElement personalAddress;

	@FindBy(id="presentStateCode")
	WebElement State;

	@FindBy(id="presentDistrictCode")
	WebElement district;

	@FindBy(id="presentTalukCode")
	WebElement taluk;

	@FindBy(id="presentVillage")
	WebElement village;

	@FindBy(id="presentPinCode")
	WebElement Pincode;

	@FindBy(id="isSameAsPresentAddress")
	WebElement sameaspresentadd;

	@FindBy(xpath="//button[text()='Save']")
	WebElement savebtn;

	@FindBy(xpath="//button[text()='Save & Next']")
	WebElement saveandnext;


	@FindBy(id="exServiceMan")
	WebElement exServiceman;

	@FindBy(id="battleCasualtyMilitaryName")
	WebElement battleCasualityMilitary;

	@FindBy(id="governmentEmployeeId")
	WebElement govtEmp;

	@FindBy(id="claimingRuralReservationId")
	WebElement ruralRes;

	@FindBy(id="claimingKannadaMediumStudentId")
	WebElement claimKannadaMedStuRes;

	@FindBy(id="claimingProjectDisplacedPersonId")
	WebElement claimingProjectDispPerson;

	@FindBy(id="claimingHyderabadKarnatakaRegionId")
	WebElement claimHydKarRegionRes;

	@FindBy(id="releasedFromNCCId")
	WebElement NCC;

	@FindBy(id="groupInspectorId")
	WebElement grpInsp;

	@FindBy(id="postUnderCensusOrganisationId")
	WebElement censusOrg;

	@FindBy(id="widowremarried")
	WebElement widow;

	@FindBy(id="candidateWhoBondedLabourerId")
	WebElement bondedLabourer;

	@FindBy(id="claimWeightageId")
	WebElement weightage;

	@FindBy(id="karnatakaBackwardClassesWelfareDepartmentId")
	WebElement backwardClasses;

	@FindBy(id="blacklist_id")
	WebElement blacklistbtn;

	@FindBy(id="criminalCaseAgainstYouId")
	WebElement criminal;

	@FindBy(id="debarredSelectionHeldByKPSCId")
	WebElement debarred;

	@FindBy(xpath="//button[contains(text(),'Back')]")
	WebElement backbtn;

	@FindBy(xpath="//button[contains(text(),'Add New Qualification')]")
	WebElement AddNewQual;

	@FindBy(xpath="(//select[@id='qualificationTypeCode'])[1]")
	WebElement QualType;

	@FindBy(id="degreeCode")
	WebElement degree;

	@FindBy(id="subject1Code")
	WebElement subject;

	@FindBy(xpath="(//select[@id='qualificationTypeCode'])[2]")
	WebElement state;

	@FindBy(id="boardOrUnivercityCode")
	WebElement board;

	@FindBy(id="resultStatusCode")
	WebElement resultStatus;

	@FindBy(id="resultTypeCode")
	WebElement resultType;

	@FindBy(id="marksObtained")
	WebElement marksObtained;

	@FindBy(id="totalMark")
	WebElement totalMarks;

	@FindBy(id="courseDurationCode")
	WebElement courseDuration;

	@FindBy(xpath="(//input[@class='input datepicker ng-pristine ng-valid ng-touched'])[1]")
	WebElement DODeclareResult;

	@FindBy(id="registrationOrRollNo")
	WebElement regrollnum;

	@FindBy(id="councilCode")
	WebElement nameOfCouncil;

	@FindBy(xpath="(//input[@class='input datepicker ng-pristine ng-valid ng-touched'])[2]")
	WebElement councilRegDate;

	@FindBy(xpath="(//input[@class='input datepicker ng-pristine ng-valid ng-touched'])[3]")
	WebElement DateofRenewal;

	@FindBy(id="councilRegistrationNumber")
	WebElement councilRegNum;

	@FindBy(id="(//input[@id='wexp'])[1]")
	WebElement workExpYes;

	@FindBy(xpath="//button[contains(text(),'Add Work Experience')]")
	WebElement addWorkexpbtn;

	@FindBy(id="employemntTypeId")
	WebElement EmploymentHist;

	@FindBy(id="instituteId")
	WebElement Organization;

	@FindBy(id="postId")
	WebElement Position;

	@FindBy(id="experienceTypeId")
	WebElement expType;

	@FindBy(xpath="//dp-date-picker[@id='fromDateId']")
	WebElement fromDate;

	@FindBy(xpath="//dp-date-picker[@id='toDateId']")
	WebElement toDate;

	@FindBy(id="organizationTypeId")
	WebElement OrgType;



	public KPSCPersonalDetailsPage(){
		PageFactory.initElements(driver, this);
	}

	public void IdentityProofDetails() {
		Select st = new Select(IdentityType);
		st.selectByVisibleText("Passport Number");
		IDnum.sendKeys("66789022");
		ConfIDnum.sendKeys("66789022");
		PDtab.click();
	}


	public void personalDetails(String name, String fname, String mname) {
		Select st1 = new Select(nation);
		st1.selectByVisibleText("Indian");

		Select st2 = new Select(gender);
		st2.selectByVisibleText("Male");

		fullNameSSC.sendKeys(name);
		fathername.sendKeys(fname);
		motherName.sendKeys(mname);

		Select st3 = new Select(married);
		st3.selectByVisibleText("No");

		Select st4 = new Select(DomOfKar);
		st4.selectByVisibleText("Yes");

		Select st5 = new Select(diffAbeled);
		st5.selectByVisibleText("No");

	}

	public void reservationClaimed() {
		ReserveTabOpen.click();

		Select st6 = new Select(Category);
		st6.selectByVisibleText("General/Merit");

	}

	public void KarnatakaAddress(String add, String vil, String PIN) {

		personalAddress.sendKeys(add);

		Select st7 = new Select(State);
		st7.selectByVisibleText("KARNATAKA");

		Select st8 = new Select(district);
		st8.selectByVisibleText(" Bangalore");

		Select st9 = new Select(taluk);
		st9.selectByVisibleText("Bangalore North");

		village.sendKeys(vil);
		Pincode.sendKeys(PIN);

		sameaspresentadd.sendKeys(Keys.ENTER);

	}

	public void save() {
		savebtn.click();
	}

	public void saveandnext() {
		saveandnext.click();
	}

	public void back() {
		backbtn.click();
	}

	public void alertAccept() {

		Alert alert = driver.switchTo().alert();
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		alert.accept();
	}

	public void alertReject() {
		Alert alert = driver.switchTo().alert();
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		alert.dismiss();
	}

	public void otherDetails() {

		Select st10 = new Select(exServiceman);
		st10.selectByVisibleText("No");

		Select st11 = new Select(battleCasualityMilitary);
		st11.selectByVisibleText("No");

		Select st12 = new Select(govtEmp);
		st12.selectByVisibleText("No");

		Select st13 = new Select(ruralRes);
		st13.selectByVisibleText("No");

		Select st14 = new Select(claimKannadaMedStuRes);
		st14.selectByVisibleText("No");

		Select st15 = new Select(claimingProjectDispPerson);
		st15.selectByVisibleText("No");

		Select st16 = new Select(claimHydKarRegionRes);
		st16.selectByVisibleText("No");

		Select st17 = new Select(NCC);
		st17.selectByVisibleText("No");

		Select st18 = new Select(grpInsp);
		st18.selectByVisibleText("No");

		Select st19 = new Select(censusOrg);
		st19.selectByVisibleText("No");

		Select st20 = new Select(widow);
		st20.selectByVisibleText("No");

		Select st21 = new Select(bondedLabourer);
		st21.selectByVisibleText("No");

		Select st22 = new Select(weightage);
		st22.selectByVisibleText("No");

		Select st23 = new Select(backwardClasses);
		st23.selectByVisibleText("No");

		blacklistbtn.click();

		Select st24 = new Select(criminal);
		st24.selectByVisibleText("No");

		Select st25 = new Select(debarred);
		st25.selectByVisibleText("No");

	}

	public void educationalQualification(String Xd, String Xm, String Xy,
			String XIId, String XIIm, String XIIy,
			String GradD, String GradM, String GradY,
			String CRd, String CRm, String CRy,
			String DORd, String DORm, String DORy) throws Exception {


		/* 10th details */

		new WebDriverWait(driver, 30)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add New Qualification')]")))
		.click();

		Thread.sleep(3000);

		Select st26 = new Select(QualType);
		st26.selectByVisibleText("SSLC/10th");

		Select st27 = new Select(degree);
		st27.selectByVisibleText("SSLC/10th");

		Select st28 = new Select(subject);
		st28.selectByVisibleText("SSLC/10th Subjects");

		Select st29 = new Select(state);
		st29.selectByVisibleText("KARNATAKA");

		Select st30 = new Select(board);
		st30.selectByVisibleText("CBSE");

		Select st31 = new Select(resultStatus);
		st31.selectByVisibleText("Passed");

		Select st32 = new Select(resultType);
		st32.selectByVisibleText("Marks");

		marksObtained.sendKeys("450");

		totalMarks.sendKeys("500");

		Select st33 = new Select(courseDuration);
		st33.selectByVisibleText("1 Year");

		DODeclareResult.click();

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

		driver.findElement(By.xpath("//button[@id='1213036200000' and text()='"+ Xd +"' and @class='dp-calendar-day dp-current-month']")).click();

		regrollnum.sendKeys("7789056");

		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		/* 12th details */

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add New Qualification')]"))).click();

		Thread.sleep(3000);

		Select st34 = new Select(QualType);
		st34.selectByVisibleText("PUC/12th/10+2");

		Select st35 = new Select(degree);
		st35.selectByVisibleText("PUC/12th/10+2");

		Select st36 = new Select(subject);
		st36.selectByVisibleText("Arts");

		Select st37 = new Select(state);
		st37.selectByVisibleText("KARNATAKA");

		Select st38 = new Select(board);
		st38.selectByVisibleText("CBSE");

		Select st39 = new Select(resultStatus);
		st39.selectByVisibleText("Passed");

		Select st40 = new Select(resultType);
		st40.selectByVisibleText("Marks");

		marksObtained.sendKeys("450");

		totalMarks.sendKeys("500");

		Select st41 = new Select(courseDuration);
		st41.selectByVisibleText("2 Years");

		DODeclareResult.click();

		String monthyearVal1 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal1);
		String month1 = monthyearVal1.split(",")[0].trim();
		String year1 = monthyearVal1.split(",")[1].trim();


		while(!(month1.equals(XIIm) && year1.equals(XIIy))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal1 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month1 = monthyearVal1.split(",")[0].trim();
			year1 = monthyearVal1.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1278527400000' and text()='"+ XIId +"' and @class='dp-calendar-day dp-current-month']")).click();

		regrollnum.sendKeys("5578903");

		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

		alert = driver.switchTo().alert();
		alert.accept();

		/* Graduation details */

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add New Qualification')]"))).click();

		Select st42 = new Select(QualType);
		st42.selectByVisibleText("Graduate");

		Select st43 = new Select(degree);
		st43.selectByVisibleText("Bachelor of Engineering (B.E.)");

		Select st44 = new Select(subject);
		st44.selectByVisibleText("Automobile Engineering");

		Select st45 = new Select(state);
		st45.selectByVisibleText("KARNATAKA");

		Select st46 = new Select(board);
		st46.selectByVisibleText("Indian Institute of Science, Bangalore");

		Select st47 = new Select(resultStatus);
		st47.selectByVisibleText("Passed");

		Select st48 = new Select(resultType);
		st48.selectByVisibleText("Marks");

		marksObtained.sendKeys("450");

		totalMarks.sendKeys("500");

		Select st49 = new Select(courseDuration);
		st49.selectByVisibleText("4 Years");

		DODeclareResult.click();

		String monthyearVal2 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal2);
		String month2 = monthyearVal2.split(",")[0].trim();
		String year2 = monthyearVal2.split(",")[1].trim();


		while(!(month2.equals(GradM) && year2.equals(GradY))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal2 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month2 = monthyearVal2.split(",")[0].trim();
			year2 = monthyearVal2.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1407349800000' and text()='"+ GradD +"' and @class='dp-calendar-day dp-current-month']")).click();

		regrollnum.sendKeys("1126547");

		Select st50 = new Select(nameOfCouncil);
		st50.selectByVisibleText("Education Department");

		councilRegDate.click();

		String monthyearVal3 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal3);
		String month3 = monthyearVal3.split(",")[0].trim();
		String year3 = monthyearVal3.split(",")[1].trim();


		while(!(month3.equals(CRm) && year3.equals(CRy))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal3 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month3 = monthyearVal3.split(",")[0].trim();
			year3 = monthyearVal3.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1407349800000' and text()='"+ CRd +"' and @class='dp-calendar-day dp-current-month']")).click();

		DateofRenewal.click();

		String monthyearVal4 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal4);
		String month4 = monthyearVal4.split(",")[0].trim();
		String year4 = monthyearVal4.split(",")[1].trim();


		while(!(month4.equals(DORm) && year4.equals(DORy))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal4 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month4 = monthyearVal4.split(",")[0].trim();
			year4 = monthyearVal4.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1784140200000' and text()='"+ DORd +"' and @class='dp-calendar-day dp-current-month']")).click();

		councilRegNum.sendKeys("66756456");


		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

		alert = driver.switchTo().alert();
		alert.accept();

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add New Qualification')]")));

		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//input[@id='wexp'])[1]")));

	}

	public void PresentWorkExpDetails(String Xd1, String Xm1, String Xy1) {

		workExpYes.click();
		addWorkexpbtn.click();

		Select st51 = new Select(EmploymentHist);
		st51.selectByVisibleText("Present");

		Organization.sendKeys("BIPROS");
		Position.sendKeys("Tester");

		Select st52 = new Select(expType);
		st52.selectByVisibleText("IT");

		fromDate.click();
		String monthyearVal5 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal5);
		String month5 = monthyearVal5.split(",")[0].trim();
		String year5 = monthyearVal5.split(",")[1].trim();


		while(!(month5.equals(Xm1) && year5.equals(Xy1))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal5 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month5 = monthyearVal5.split(",")[0].trim();
			year5 = monthyearVal5.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1408300200000' and text()='"+ Xd1 +"' and @class='dp-calendar-day dp-current-month']")).click();

		Select st53 = new Select(OrgType);
		st53.selectByVisibleText("Private");

		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Work Experience')]")));

		driver.findElement(By.xpath("//button[contains(text(),'Next')]"));

	}

	public void PastWorkExpDetails(String Jd1, String Jm1, String Jy1) {

		workExpYes.click();
		addWorkexpbtn.click();

		Select st51 = new Select(EmploymentHist);
		st51.selectByVisibleText("Present");

		Organization.sendKeys("BIPROS");
		Position.sendKeys("Tester");

		Select st52 = new Select(expType);
		st52.selectByVisibleText("IT");

		fromDate.click();
		String monthyearVal5 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal5);
		String month5 = monthyearVal5.split(",")[0].trim();
		String year5 = monthyearVal5.split(",")[1].trim();


		while(!(month5.equals(Jm1) && year5.equals(Jy1))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal5 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month5 = monthyearVal5.split(",")[0].trim();
			year5 = monthyearVal5.split(",")[1].trim();

		}

		driver.findElement(By.xpath("//button[@id='1408300200000' and text()='"+ Jd1 +"' and @class='dp-calendar-day dp-current-month']")).click();

		toDate.click();
		String monthyearVal6 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
		System.out.println(monthyearVal6);
		String month6 = monthyearVal6.split(",")[0].trim();
		String year6 = monthyearVal6.split(",")[1].trim();


		while(!(month6.equals(Jm1) && year6.equals(Jy1))) {
			driver.findElement(By.xpath("//div[@class='dp-calendar-nav-container-left']")).click();
			monthyearVal6 = driver.findElement(By.xpath("//button[@class='dp-nav-header-btn']")).getText();
			month6 = monthyearVal6.split(",")[0].trim();
			year6 = monthyearVal6.split(",")[1].trim();

		}
		
		//String a = java.sql.Timestamp.valueOf("").toString();

		driver.findElement(By.xpath("//button[@id='1609439400000' and text()='"+ Jd1 +"' and @class='dp-calendar-day dp-current-month']")).click();

		Select st53 = new Select(OrgType);
		st53.selectByVisibleText("Private");

		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Work Experience')]")));

		driver.findElement(By.xpath("//button[contains(text(),'Next')]"));

	}

	public void uploadDocs() {

		driver.findElement(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'No file chosen')]")).sendKeys("D:\\Upload docs\\TestDoc.pdf");
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[2]")));

		driver.findElement(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[2]")).click();
		driver.findElement(By.id("certificateId")).sendKeys("6678904");
		driver.findElement(By.xpath("//label[contains(text(),'No file chosen')]")).sendKeys("D:\\Upload docs\\TestDoc.pdf");
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[3]")));

		driver.findElement(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[3]")).click();
		driver.findElement(By.id("certificateId")).sendKeys("5743251");
		driver.findElement(By.xpath("//label[contains(text(),'No file chosen')]")).sendKeys("D:\\Upload docs\\TestDoc.pdf");
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[4]")));

		driver.findElement(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[4]")).click();
		driver.findElement(By.id("certificateId")).sendKeys("3346781");
		driver.findElement(By.xpath("//label[contains(text(),'No file chosen')]")).sendKeys("D:\\Upload docs\\TestDoc.pdf");
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[5]")));

		driver.findElement(By.xpath("(//i[@class='fa fa-upload edit-icon mr-2'])[5]")).click();
		driver.findElement(By.id("certificateId")).sendKeys("6678904");
		driver.findElement(By.xpath("//label[contains(text(),'No file chosen')]")).sendKeys("D:\\Upload docs\\TestDoc.pdf");
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='identityProof_id']")));

		/* Identity Proof details */
		driver.findElement(By.xpath("//a[@id='identityProof_id']")).click();
		driver.findElement(By.xpath("(//label[@class='custom-file-label'])[1]")).sendKeys("D:\\Upload docs\\photo.jpg");

		driver.findElement(By.xpath("(//label[@class='custom-file-label'])[2]")).sendKeys("D:\\Upload docs\\signature.jpg");

		driver.findElement(By.xpath("//div[@class='col-sm-12 text-right']//button[text()='Save']")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}









}
