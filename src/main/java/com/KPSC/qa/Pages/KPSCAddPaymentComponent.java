package com.KPSC.qa.Pages;

import org.openqa.selenium.support.PageFactory;

import com.KPSC.qa.TestBase.KPSCTestBase;

public class KPSCAddPaymentComponent extends KPSCTestBase{
	
	
	
	
	public KPSCAddPaymentComponent(){
		PageFactory.initElements(driver, this);
	}

}
