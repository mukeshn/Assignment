package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CreateAccountPage;
import com.qa.pages.LoginPage;

public class CreateAccountPageTest extends TestBase {
	CreateAccountPage createAccountPage;
	LoginPage loginPage;
		
	public CreateAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void createAccountPageTest() {
		boolean msg = CreateAccountPage.verifyIfPageLoaded();
		Assert.assertEquals(msg, "Welcome to your account. Here you can manage all of your personal information and orders");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
