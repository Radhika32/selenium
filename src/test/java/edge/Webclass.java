

package edge;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Webclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.ChromeDriver", "C:\\Users\\Ramanjaneyulu\\Downloads\\chromedriver_win32value");
		
	
	
	WebDriver driver = new  ChromeDriver();
	
		driver.get("http://whiteboxqa.com/schedule.php");
	driver.manage().window().maximize();
	driver.gettitle("http://whiteboxqa.com");
	driver.getElement.BYId
	System.out.println("Ican open a browser");
	}
	

}
