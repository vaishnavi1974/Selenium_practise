package Day1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
//import java.awt.List;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> elements=driver.findElements(By.tagName("a"));//get the list of elements with tag A.
		System.out.println(elements.size());
		int noofbrokenlinks=0;
		
		for(WebElement ele:elements)
		{
			String hrefAttribute=ele.getAttribute("href");//get the value of href attribute.
			if(hrefAttribute==null || hrefAttribute.isEmpty())
			{
				System.out.println("HREF attribute is null so cannot process");
				continue;
			}
			URL linkURL=new URL(hrefAttribute);//convert the href from string to URL type.
			HttpURLConnection connection=(HttpURLConnection) linkURL.openConnection();//open the connection to the server.
			connection.connect();//connect to the server and send the request to server
			
			if(connection.getResponseCode()>=400)
			{
				System.out.println(hrefAttribute+" :Its a broken link");
				noofbrokenlinks++;
			}
			else {
				System.out.println(hrefAttribute+" :not a broken link");
			}
			
		}
		System.out.println("No of broken links is:"+noofbrokenlinks);
		driver.quit();
		
	}

}
