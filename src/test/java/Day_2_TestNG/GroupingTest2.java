package Day_2_TestNG;

import org.testng.annotations.Test;

public class GroupingTest2{
	@Test(priority=1, groups= {"sanity"})
	void signupbyemail()
	{
		System.out.println("This a signuptest");
	}
	@Test(priority=2,groups= {"sanity"})
void signupbyfb()
{
	System.out.println("This a signupbygb");
}
	@Test(priority=3,groups= {"regression","sanity"})
void signupbyinsta()
{
	System.out.println("This a signupbyinsta");
}

}
