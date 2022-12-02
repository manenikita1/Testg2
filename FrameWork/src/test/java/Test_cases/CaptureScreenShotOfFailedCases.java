package Test_cases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Login_Page;

public class CaptureScreenShotOfFailedCases extends Login_Page{

	Login_Page login;
	
	@BeforeMethod
	public void setup()throws Exception
	{
		initialization();
		login = new Login_Page();
	}
	@Test
	public void verifyTitleTest()
	{
		String expTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
	    String actTitle = login.verifyTitle();
	    Assert.assertEquals(actTitle, expTitle);
	}
	@Test
	public void verifyLabelTest()
	{
		String actTitle = login.verifyLabel();
	    Assert.assertEquals(actTitle, "Login to Kite");
	}
	@AfterMethod
	public void exit(ITestResult z) throws Exception
	{
		if(ITestResult.FAILURE==z.getStatus())
		{
			login.captureScreenshotFailedTC(z.getName());
		}
		driver.quit();
	}
	
	
	
	
	
}
