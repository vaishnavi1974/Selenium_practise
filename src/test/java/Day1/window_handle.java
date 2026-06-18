package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class window_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demoqa.com/browser-windows");
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension (1000,1000));
		driver.findElement(By.id("windowButton")).click();
		Set<String> winid=driver.getWindowHandles();
		for(String id:winid)
		{
			//System.out.println(title);
			System.out.println(driver.switchTo().window(id).getTitle());
			System.out.println(id);
		}
		driver.quit();
		

	}

}
