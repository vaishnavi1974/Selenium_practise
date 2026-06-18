package Day_2_TestNG;

import org.testng.annotations.Test;

public class GroupingTest {
	@Test(priority=1,groups= {"regression"})
	void loginbyemail()
	{
		System.out.println("This a logintest");
	}
	@Test(priority=2,groups= {"regression"})
void loginbyfb()
{
	System.out.println("This a loginbyfb");
}
	@Test(priority=3,groups= {"sanity","regression"})
void loginbyinsta()
{
	System.out.println("This a loginbyinsta");
}

}
