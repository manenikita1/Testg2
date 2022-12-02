package Test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Dashboard_Page;
import Pages.Login_Page;

public class DashboardPage_Test extends Dashboard_Page{

	Dashboard_Page dash ;	
	Login_Page login;
	@BeforeMethod(groups= {"Sanity","Regression"})
	public void BeforeMethod() throws Exception
	{
		initialization();
		dash = new Dashboard_Page();
	    login = new Login_Page();
		login.verifyloginApp();
	}
	@Test(groups="Sanity")
	public void verifyNameTest() throws Exception
	{
		Thread.sleep(3000);
		String name = dash.verifyName();
		System.out.println("Name given there is :"+name);
	}
	@Test(groups="Regression")
	public void verifyLogOutAppTest() throws Exception
	{
		dash.verifyUserIDClick();
		dash.verifyLogOutApp();
		System.out.println("you logged out sucessfully!");
	}
	@Test(groups="Sanity")
	public void verifyUsernameButtonTest() throws Exception
	{
		dash.verifyUserIDClick();
		Thread.sleep(3000);
		String username = dash.verifyUsernameButton();
		System.out.println("Username is : " +username);
	}
	@Test(groups="Functional")
	public void verifyEmailIdTest() throws Exception
	{
		 dash.verifyUserIDClick();
		 String mail = dash.verifyEmailId();
		 System.out.println(mail);
	}
	@Test(groups="Regression")
	public void userIdViewTest() throws Exception
	{
		dash.verifyUserIDClick();
		String userid = dash.userIdView();
		System.out.println(userid);
	}
	@AfterMethod(groups= {"Sanity","Regression"})
	public void exit()
	{
		driver.close();
	}
	
	 
	
}


