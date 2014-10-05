package com.epam.steps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.epam.pages.LoginPage;

public class Steps {
	private WebDriver driver;
	private final Logger logger = Logger.getLogger(Steps.class);

	public void initBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		logger.info("Browser started");
	}

	public void closeDriver() {
		driver.quit();
	}

	public void loginGmail(String userName, String userPassword) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login(userName, userPassword);
	}

	/*public boolean isLoggedIn(String userName) {
		LoginPage loginPage = new LoginPage(driver);
		
//		return (loginPage.getLoggedInUserName().trim().equals(userName));
	}*/
	
}
