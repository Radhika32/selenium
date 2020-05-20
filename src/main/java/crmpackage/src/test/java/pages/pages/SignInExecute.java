package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.Home_Page;
import Pages.Loginpage;

public class SignInExecute extends SignIn_Action {

public static void Execute(WebDriver driver,String UserName,String Password) {
	Home_Page.lnk_MyAccount(driver).click();
	Loginpage.WebElementtxtbx_UserName(driver).sendKeys(UserName);
	Loginpage.WebElementtxtbx_Password(driver).sendKeys(Password);
	SignIn_Action.Execute(driver, UserName, Password);
	
}
}
