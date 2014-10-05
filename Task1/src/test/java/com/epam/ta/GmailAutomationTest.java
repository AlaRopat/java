package com.epam.ta;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.pages.LoginPage;
import com.epam.steps.Steps;

public class GmailAutomationTest {
	private Steps steps;
	private final String USERNAME = "olgakumova335@gmail.com";
	private final String PASSWORD = "Bittersweet789";
	private WebDriver driver;
	private LoginPage loginPage=new LoginPage(driver);

	@BeforeMethod(description = "Init browser")
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test(description = "Login to Gmail")
	public void oneCanLoginGmail() {
		steps.loginGmail(USERNAME, PASSWORD);
//	LoginPage loginPage = new LoginPage(driver);
//	loginPage.getLoggedInUserName();
	Assert.assertNull(loginPage.getLoggedInUserName());
	}

	@AfterMethod(description = "Stop Browser")
	public void stopBrowser() {
		steps.closeDriver();
	}

}
