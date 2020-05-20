package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	public @interface java {

	}
	public static WebElement lnk_MyAccount(WebDriver driver) {
		WebElement element = driver.findElement(By.id("account"));
			return element;
			
		}
		public static WebElement lnk_Logout(WebDriver driver) {
			WebElement element =driver.findElement(By.id("account_logout"));
			WebElement element1= driver.findElement(ByXPath("//*[@id=noo-site"));
					
			return element1;
			
			
		}
		private static By ByXPath(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		public static WebElement lnk_SignIn(WebDriver driver) {
			// TODO Auto-generated method stub
			return null;
		}
		public static WebElement lnk_SignIn() {
			// TODO Auto-generated method stub
			return null;
		}
		}


