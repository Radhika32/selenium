package com.crm.qa.testcases;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;
import com.crm.qa.utils.TestUtil;

@Test
public class HomePageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	ContactPage cp;
	DealsPage dp;
	TaskPage tp;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		
		initialization(null);
		
		lp = new LoginPage();
		cp = new ContactPage();
		dp=new DealsPage();
		tp=new TaskPage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	public void verifyHomePageTitleTest() {
		String hpTitle = hp.validateHomePageTitle();
		AssertJUnit.assertEquals(hpTitle,"Cogmento CRM", "HP Title not matched");	
	
	}
	}
