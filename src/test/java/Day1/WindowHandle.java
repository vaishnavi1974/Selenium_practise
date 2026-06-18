package Day1;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		//WebElement ele = driver.findElement(By.xpath(null));
		driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]")));
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Vaishnavu");
		driver.getWindowHandle();
		Set<String> winid=driver.getWindowHandles();
		ArrayList<String> winlist=new ArrayList<String>(winid);
		System.out.println(winlist.get(0));
		for(String win:winid) 
		{
			String title=driver.switchTo().window(win).getTitle();
			System.out.println(title);
		}
		WebElement ele = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("venkatesh");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		Thread.sleep(5000);
		driver.close();
	}
		
 
}
