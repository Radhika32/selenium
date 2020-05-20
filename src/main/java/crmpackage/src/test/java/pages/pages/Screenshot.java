package pages;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constant;
public class Screenshot {
	public void setUp() throws Exception {
	WebDriver driver = new ChromeDriver();
		driver.get(Constant.URL);
		

			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(scrFile, new File("D:\\Ram\\Radhika\\repo\\selenium\\src\\main\\java\\crmpackage\\target\\screenshot"));
		}
}

