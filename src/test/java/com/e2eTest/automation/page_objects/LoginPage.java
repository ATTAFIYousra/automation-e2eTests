package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LoginPage extends BasePage {

	/* Retrieve Element */
	@CacheLookup
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@CacheLookup
	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]")
	private static WebElement titlePage;

	public LoginPage() {
		super(Setup.getDriver());
	}

	/* GETTER */
	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

	public static WebElement getTitlePage() {
		return titlePage;
	}

}
