package pages;

import org.openqa.selenium.WebDriver;
import org.w3c.dom.css.DocumentCSS;

import Pages.Home_Page;
import Pages.Loginpage;

public class SignIn_Action {
public static void Execute(WebDriver driver, String username, String password) {
	Home_Page.lnk_SignIn().click();
	Loginpage.WebElementtxtbx_UserName(driver).sendKeys("ch.radhika5@gmail.com");
	Loginpage.WebElementtxtbx_Password(driver).sendKeys("Rs1517");
Loginpage.btn_Login(driver).click();
//DocumentCSS.querySelector("body > div.noo-woo-pswp.pswp--supports-fs.pswp--open.pswp--touch.pswp--css_animation.pswp--svg.pswp--visible.pswp--animated-in.pswp--has_mouse.pswp--zoom-allowed"));
}

public static void Execute1(WebDriver driver, String username, String password) {
	// TODO Auto-generated method stub
	
}

public static void Execute2(WebDriver driver, String username, String password) {
	// TODO Auto-generated method stub
	System.setProperty("webDriver.driver.chromedriver","C:\\Users\\Ramanjaneyulu\\Desktop\\driver" );
}
}
