package com.KPSC.qa.TestClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.KPSC.qa.Pages.KPSCCandidateDashboard;
import com.KPSC.qa.Pages.KPSCLandingPage;
import com.KPSC.qa.Pages.KPSCLoginPage;
import com.KPSC.qa.TestBase.KPSCTestBase;
import com.KPSC.qa.util.TestUtil;

public class ApplyForExam extends KPSCTestBase{
	
	KPSCLandingPage KL;
	KPSCLoginPage log;
	KPSCCandidateDashboard CD;
	TestUtil util;
	
	public ApplyForExam(){
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		KL= new KPSCLandingPage();
		log=new KPSCLoginPage();
		CD= new KPSCCandidateDashboard();
		util= new TestUtil();
	}
	
	@Test
	public void apply() throws Exception {
		KL.LoginBtn();
		log.login(prop.getProperty("user"), prop.getProperty("password"), prop.getProperty("captcha"));
		CD.terms();
		CD.myProfile();
		CD.applicationSection();
		CD.applyToAdvertisment();
	}
	
	

}
