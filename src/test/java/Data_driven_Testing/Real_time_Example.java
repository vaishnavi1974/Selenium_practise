package Data_driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Real_time_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir"+"//testdata/TestData");
		int rows = Excel_Utils.getRowCount(	filepath, "sheet1");
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		for(int i=1;i<=rows;i++)
		{
			String price=Excel_Utils.getCellData(filepath, "sheet1", i, 0);
			String ROI=Excel_Utils.getCellData(filepath, "sheet1", i, 1);
			String Period1=Excel_Utils.getCellData(filepath, "sheet1", i, 2);
			String Period2=Excel_Utils.getCellData(filepath, "sheet1", i, 3);
			String fre=Excel_Utils.getCellData(filepath, "sheet1", i, 4);
			String exp_mvalue=Excel_Utils.getCellData(filepath, "sheet1", i, 5);
			
			driver.findElement(By.xpath("//*[@id=\'principal\']")).sendKeys(price);
			driver.findElement(By.xpath("//*[@id='interest']")).sendKeys(price);
			driver.findElement(By.xpath("//*[@id=\'principal\']")).sendKeys(price);		
					
					
			
		}

	}

}
