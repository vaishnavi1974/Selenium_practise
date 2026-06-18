package Day1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Bootstrapdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/Vaishnavi/Downloads/dropdown.html");
		List<WebElement> optionss=driver.findElements(By.xpath("//select[contains(@id,'option-droup')]//option"));
		System.out.println(optionss.size());
		/*for(WebElement op:optionss)
		{
			System.out.println(op.getText());
		}*/
		for(WebElement op:optionss)
		{
			if(op.getText()=="jQuery"||op.getText()=="HTML")
			{
			op.click();
			System.out.println(op.getText());
			}
		}
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(""))).perform();//hover over the element
		act.contextClick(driver.findElement(By.xpath(""))).perform();//right 0click
		act.dragAndDrop(driver.findElement(By.xpath("source")), driver.findElement(By.xpath("target")));
		
		Select sel=new Select(driver.findElement(By.xpath("")));
		sel.selectByIndex(0);
		sel.selectByValue(null);
		sel.selectByVisibleText(null);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','john')",driver.findElement(By.xpath("")));
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("")));
		
		js.executeScript("window.scrollBy(0,3000)", "");//should scroll till 3000 pixels
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("")));//scrolls till the element is visible
		js.executeScript("window.scrollBy(0,document.body.scrollHeight", "");//scrolls to the end of the page.
		
		//File Upload
		String file1location=" ";
		String file2location=" ";
		driver.findElement(By.xpath("")).sendKeys("path/location of the file");//single file upload.
		driver.findElement(By.xpath("")).sendKeys(file1location+"/n"+file2location);//multiple file upload
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);//full page screenshot
		File targetlocation=new File(System.getProperty("user.dir")+"filename");
		sourcefile.renameTo(targetlocation);
		
		WebElement ele2=driver.findElement(By.xpath(""));
		File sf2=ele2.getScreenshotAs(OutputType.FILE);
		File tf2=new File(System.getProperty("user.dir")+"filename");
		sf2.renameTo(tf2);
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless=new");//setting for headless mode
		
		
		
		driver.close();

	}

}
