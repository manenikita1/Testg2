package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Dashboard_Page extends TestBase{

		@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
		@FindBy(xpath="//h4[@class='username']")private WebElement userName;
		@FindBy(xpath="//span[@class='nickname']")private WebElement nickName;
		@FindBy(xpath="//span[@class='icon icon-exit']")private WebElement logOutButton;
		@FindBy(xpath="//div[@class='email']")private WebElement emailid;
	
    public Dashboard_Page()
    {
    	PageFactory.initElements(driver,this);
    }
    public String verifyName() throws Exception
    {
    	 Thread.sleep(3000);
    	 return nickName.getText();
    }
    public void verifyUserIDClick() throws Exception
    {
    	Thread.sleep(2000);
    	userID.click();
    }
    public String verifyUsernameButton() throws Exception
    {
    	Thread.sleep(2000);
    	return userName.getText();
    }

    public void verifyLogOutApp() throws Exception
    {
    	Thread.sleep(3000);
    	logOutButton.click();
    }
    public String verifyEmailId()
    {
    	return emailid.getText();
    }
    public String userIdView()
    {
    	return userID.getText();
    }
    
}


