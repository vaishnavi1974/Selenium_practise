package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_flow {
	WebDriver driver;
	//setup webdriver
	@BeforeClass
	public void setup(WebDriver driver)
	{
		this.driver=driver;
		driver=new ChromeDriver();
	}
	
	//execute the TC
	@Test
	public void login_flow()
	{
		Login_Page_Locators lp = new Login_Page_Locators(driver);
		lp.set_Username("Admin");
		lp.set_Password("admin123");
		lp.click_login();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
	}
	//teardown the driver
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
