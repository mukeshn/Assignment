package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	// Page factory or OR

	@FindBy(name = "Sign in")
	WebElement signInBtn;

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(name = "Sign in")
	WebElement loginBtn;

	// Initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd) {
		signInBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
