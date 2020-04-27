package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class UserAccountPage extends TestBase {
	@FindBy(how = How.CLASS_NAME, using = "icon-building")
	// @FindBy(how = How.LINK_TEXT, using = "")
	private WebElement addressesButton;
	@FindBy(how = How.CLASS_NAME, using = "icon-user")
	private WebElement informationButton;
	@FindBy(how = How.CSS, using = "h1.page-heading")
	private WebElement resultsWebPart;
	@FindBy(how = How.CSS, using = "div.row.addresses-lists")
	private WebElement accountInfo;

	@FindBy(how = How.CSS, using = "a.home")
	private WebElement homePageButton;

	// @FindBy(how = How.CSS, using = "a.sf-with-ul")
	// private WebElement dressesButton;

	public UserAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToUserInformationPage() {
		informationButton.click();
	}

	public boolean verifyIfYouAreOnPage() {
		if (accountInfo.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void useHomePageButton() {
		homePageButton.click();
	}

}
