package Day_2_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Methods {
	@Test(priority=1)
	public void openapp() {
		  Assert.assertTrue(true);
	  }
	@Test(priority=2, dependsOnMethods= {"openapp","login"})
	public void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"openapp"})
	public void search()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=4,dependsOnMethods={"login"})
	public void advsearch()
	{
		Assert.assertTrue(true);
	}
	  @Test(priority=5, dependsOnMethods={"login","search"})
	  public void logout()
	  {
		  Assert.assertTrue(true);
	  }
}
