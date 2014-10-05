package com.epam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
	private final Logger logger = Logger.getLogger(LoginPage.class);
	private final String BASE_URL = "http://www.gmail.com";
	@FindBy(id = "Email")
	private WebElement inputLogin;
	@FindBy(id = "Passwd")
	private WebElement inputPassword;
	@FindBy(id = "signIn")
	private WebElement buttonSubmit;
	@FindBy(xpath = "//div[@class='gb_ja']")
	private WebElement linkLoggedInUser;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);

	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
		logger.info("Login page opened");

	}

	public void login(String userName, String userPassword) {
		inputLogin.sendKeys(userName);
		inputPassword.sendKeys(userPassword);
		buttonSubmit.click();
		logger.info("Login perfomed");
	}

	public WebElement getLoggedInUserName() {
		return linkLoggedInUser;

	}

}
