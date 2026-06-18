package Day_2_TestNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Test {
	
		WebDriver driver;
		
		@Test(priority=1)
		@Parameters({"browser","url"})
		void open_app(String br,String url) throws InterruptedException
		{
			switch(br.toLowerCase())
			{
				case "chrome" : driver = new ChromeDriver();
				break;
				case "edge" : driver = new EdgeDriver();
				break;
				case "firefox": driver = new FirefoxDriver();
				break;
				default : System.out.println("Invalid browser");
				return;
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			driver.manage().window().maximize();
			//Thread.sleep(5000);
		}
		@Test(priority=2)
		void testlogo()
		{
			//driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			boolean status=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))).isDisplayed();
			//boolean status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
			System.out.println(status);
			Assert.assertEquals(true, status);
		}
		@Test(priority=3)
		void login()
		{
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
		}
		@Test(priority=4)
		void closeapp()
		{
			driver.close();
		}

	}
