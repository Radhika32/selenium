package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertTrue;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class DealsPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	com.crm.qa.pages.DealsPage dp;

	@BeforeMethod
	public void setup() {
		initialization(null);
		lp = new LoginPage();
		dp=new DealsPage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		hp.clickDealslink();
	}

		

	@Test
	public void verifyDealsPageLableTest() {
		AssertJUnit.assertEquals(dp.verifySearchBar("Radhika"), "RADHIKAC");
	}

	@Test
	public void verifySearchbarTest() {
		
		AssertJUnit.assertEquals(dp.verifySearchBar("Radhika"), "RADHIKAC");
	}


		
	public void tearDown() {
		driver.quit();
	}

}
