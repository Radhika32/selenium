package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
private static WebElement element = null;

public	static WebElement WebElementtxtbx_UserName(WebDriver driver ) {
	element = driver.findElement(By.id("log"));
	return element;
	
}
public static WebElement WebElementtxtbx_Password(WebDriver driver) {

element = driver.findElement(By.id(("pwd")));
return element;    
}
public static WebElement btn_Login(WebDriver driver) {

element = driver.findElement(By.id(("login")));
return element;    
}
}
