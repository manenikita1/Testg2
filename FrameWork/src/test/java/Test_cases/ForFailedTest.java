package Test_cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Login_Page;

public class ForFailedTest extends Login_Page {


	Login_Page login;
	

	@BeforeMethod
	public void setup() throws Exception
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
		//String expLabel = "Login to Kite";
		String actLabel = login.verifyLabel();
		Assert.assertEquals(actLabel, "Login to Kite");
	}
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}


