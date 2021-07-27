package com.KPSC.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KPSCTestBase {
	public static WebDriver driver;
	public static Properties prop;

	public KPSCTestBase(){

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Selenium Scripts\\"
					+ "KPSC\\src\\main\\java\\com\\KPSC\\qa\\config\\KPSCconfig.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		//String browserName = prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		

	}

}




