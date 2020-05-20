package com.crm.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest<lp> extends TestBase {
	LoginPage lp;
	HomePage hp;

	public LoginPageTest() {
		super();
	}

//	@BeforeMethod
//	public void setup() {
	//	//initialization();
	//	lp = new LoginPage();
//	}

	@Test(priority = 1)
	public void loginPageTitle() {
		String title = lp.validateLoginPage();
		AssertJUnit.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}

	@Test(priority = 2)
	public void loginTest() {
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
