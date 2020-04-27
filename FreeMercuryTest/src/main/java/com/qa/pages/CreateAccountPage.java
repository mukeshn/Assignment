package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class CreateAccountPage extends TestBase 
{
	@FindBy(name = "Sign in")
	WebElement signInBtn;

	@FindBy(how = How.CSS, using = "input#email_create")
	 private WebElement registerEmailInput;

	 @FindBy(how = How.ID, using = "SubmitCreate")
	 private WebElement submitCreateButton;

	 @FindBy(how = How.ID, using = "email")
	 private WebElement signInEmailInput;

	 @FindBy(how = How.ID, using = "passwd")
	 private WebElement passwordInput;

	 @FindBy(how = How.ID, using = "SubmitLogin")
	 private WebElement submitLoginButton;

	 @FindBy(how = How.CSS, using = "a.logout")
	 private WebElement logoutButton;

	 @FindBy(how = How.CSS, using = "form#login_form.box")
	 private WebElement loginForm;

	 @FindBy(how = How.CSS, using = "div.alert")
	 private WebElement alert;
	 
	 @FindBy(how = How.CSS, using = "div.account_creation")
	 private static WebElement accountCreationForm;
	 
	 public static boolean verifyIfPageLoaded() {
	        WebDriverWait wait = new WebDriverWait(driver, 3);
	        wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(accountCreationForm)));

	        if(accountCreationForm.isDisplayed()){

	            return true;
	        } else {
	            return false;
	        }
	    }
	}


