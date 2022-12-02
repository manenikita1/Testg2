package Test_cases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Login_Page;

public class Loginpage_Test extends Login_Page {

	Login_Page login;	
	@BeforeMethod(groups="Sanity")
	public void setUp() throws Exception
	{
     
		initialization();
		login = new Login_Page();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Test(priority=1, groups="Sanity")
	public void verifyloginAppTest() throws Exception
	{
		login.verifyloginApp();
	}
	@Test(priority=-1,enabled=false)
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "1Kite - Zerodha's fast and elegant flagship trading platform";
		String actTitle = login.verifyTitle();
		//System.out.println(actTitle);
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Is it printing");
		
	}
	@Test(priority=2,enabled=false)
	public void verifyLabelTest()
	{
		String actLabel = login.verifyLabel();
		//System.out.println(actLabel);
		Assert.assertEquals(actLabel, "login to Kite");
		System.out.println("Checking");
	}
	@Test(timeOut=1000)
	public void verifyKiteLogoTest()
	{
		boolean result = login.verifyKiteLogo();
		//System.out.println("result : "+result);
		Assert.assertEquals(result, true);
		//?Assert.assertTrue(false);
		//?Assert.assertFalse(false);
	}
	@Test(dependsOnMethods="verifyKiteLogoTest", enabled=false)
	public void verifyZerodhaLogoTest()
	{
		 boolean result2 = login.verifyZerodhaLogo();
		 System.out.println("result2 : "+result2);
	}
	@AfterMethod (groups="Sanity")

	public void exit()
	{
		driver.close();
	}
}
