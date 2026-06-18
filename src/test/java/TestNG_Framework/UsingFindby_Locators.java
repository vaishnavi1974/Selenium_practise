package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsingFindby_Locators {
		WebDriver driver;
		
		//initiate webdriver using constructor
		public UsingFindby_Locators(WebDriver driver)
		{
			this.driver=driver;
		}
		
		//identify locators
		@FindBy (xpath="//div[@class='orangehrm-login-slot-wrapper']") WebElement username_loc;
		@FindBy (xpath="//input[@type='password']") WebElement password_loc;
		@FindBy (xpath="//button[@type='submit']") WebElement click_login;
		
		//perform actions on locators
		public void set_Username(String username)
		{
			username_loc.sendKeys(username);
		}
		
		public void set_Password(String password)
		{
			password_loc.sendKeys(password);
		}
		
		public void click_login()
		{
			click_login.click();
		}
}
