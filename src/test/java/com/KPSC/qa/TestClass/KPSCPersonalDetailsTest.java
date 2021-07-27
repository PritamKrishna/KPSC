package com.KPSC.qa.TestClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.KPSC.qa.Pages.KPSCCandidateDashboard;
import com.KPSC.qa.Pages.KPSCLandingPage;
import com.KPSC.qa.Pages.KPSCLoginPage;
import com.KPSC.qa.Pages.KPSCPersonalDetailsPage;
import com.KPSC.qa.TestBase.KPSCTestBase;
import com.KPSC.qa.util.TestUtil;

public class KPSCPersonalDetailsTest extends KPSCTestBase{
	
	KPSCLandingPage KL;
	KPSCLoginPage log;
	KPSCCandidateDashboard CD;
	KPSCPersonalDetailsPage PD;
	TestUtil util;
	
	public KPSCPersonalDetailsTest(){
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		KL= new KPSCLandingPage();
		log=new KPSCLoginPage();
		CD= new KPSCCandidateDashboard();
		PD= new KPSCPersonalDetailsPage();
		util= new TestUtil();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void createProfile() throws Exception {
		KL.LoginBtn();
		log.login(prop.getProperty("user"), prop.getProperty("password"), prop.getProperty("captcha"));
		CD.terms();
		//CD.myProfile();
		PD.IdentityProofDetails();
		PD.personalDetails(prop.getProperty("FullName"), prop.getProperty("FatherName"), prop.getProperty("MothersName"));
		PD.reservationClaimed();
		PD.KarnatakaAddress(prop.getProperty("address"), prop.getProperty("village"), prop.getProperty("PIN"));
		PD.saveandnext();
		PD.alertAccept();
		PD.otherDetails();
		PD.educationalQualification(prop.getProperty("10thPassedDay"), prop.getProperty("10thPassedMonth"), prop.getProperty("10thPassedYear"), 
									prop.getProperty("12thPassedDay"), prop.getProperty("12thPassedMonth"), prop.getProperty("12thPassedYear"), 
									prop.getProperty("GradPassedDay"), prop.getProperty("GradPassedMonth"), prop.getProperty("GradPassedYear"), 
									prop.getProperty("CouncilRegDay"), prop.getProperty("CouncilRegMonth"), prop.getProperty("CouncilRegYear"), 
									prop.getProperty("DateOfRenewalDay"), prop.getProperty("DateOfRenewalMonth"), prop.getProperty("DateOfRenewalYear"));
		
		PD.PresentWorkExpDetails(prop.getProperty("WorkJoinedDay"), prop.getProperty("WorkJoinedMonth"), prop.getProperty("WorkJoinedYear"));
		PD.uploadDocs();
		CD.viewProfile();
		Thread.sleep(3000);
		util.takeScreenShot("ProfileCreated");
	}
	
	

}
