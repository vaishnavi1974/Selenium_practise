package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page_Locators {
	WebDriver driver;
	
	//initiate webdriver using constructor
	public Login_Page_Locators(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//identify locators
	By username_loc=By.xpath("//input[@placeholder='Username']");
	By passweord_loc=By.xpath("//input[@type='password']");
	By logib_btn_loc=By.xpath("//button[@type='submit']");
	
	//perform actions on locators
	public void set_Username(String username)
	{
		driver.findElement(username_loc).sendKeys(username);
	}
	
	public void set_Password(String password)
	{
		driver.findElement(passweord_loc).sendKeys(password);
	}
	
	public void click_login()
	{
		driver.findElement(logib_btn_loc).click();
	}
}
