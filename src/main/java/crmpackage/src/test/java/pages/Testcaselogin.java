package pages;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Home_Page;
import Pages.SignIn_Action;
import utility.Constant;

public class Testcaselogin {
private static final WebDriver ChromeDriver = null;
private static WebDriver driver = ChromeDriver;
@ Test
public  void String  () {

	driver= new ChromeDriver();
	Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	driver.get(Constant.URL);
SignIn_Action.Execute(driver,Constant.UserName,Constant.Password);

System.out.println(" succesively you login");
Home_Page.lnk_Logout(driver).click();

driver.findElement(By.xpath("div[@id='login']//ul//li "));
assert ("The title of the window is incorrect") != null;
}	
	@AfterTest	
	public void driver () {	
		driver.getTitle().equals("Title of the page");
		driver.quit();	
}
}
