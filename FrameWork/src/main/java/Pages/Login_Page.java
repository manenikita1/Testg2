package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadExcel;

public class Login_Page extends TestBase {

	@FindBy(xpath="//input[@id ='userid']")private WebElement userId;
	@FindBy(xpath="//input[@id ='password']")private WebElement pass;
	@FindBy(xpath="//button[@class ='button-orange wide']")private WebElement loginButton;
	@FindBy(xpath="//img[@alt ='Kite']")private WebElement KiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement ZerodhaLogo;
	@FindBy(xpath="//input[@id='pin']")private WebElement pinBox;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement continueButton;
	@FindBy(xpath="//h2[text()='Login to Kite']")private WebElement labelLogo;
	
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyloginApp() throws Exception
	{
		//userId.sendKeys("XLD006");
		//userId.sendKeys(readPropertyFile("userid"));
		  userId.sendKeys(ReadExcel.readExcelFile(0, 1));
		  
		//pass.sendKeys("Nikita@23");
		//pass.sendKeys("Nikita@23\r\n");
		  pass.sendKeys(ReadExcel.readExcelFile(0,2));
		  loginButton.click();
		  Thread.sleep(2000);
		//pinBox.sendKeys("556612");
		//pinBox.sendKeys(readPropertyFile("pin"));
		  pinBox.sendKeys(ReadExcel.readExcelFile(0,3));
		  continueButton.click();
	}

	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public String verifyLabel()
	{
		return labelLogo.getText();
	}
	public boolean verifyKiteLogo()
	{
		return KiteLogo.isDisplayed();
	}
	public boolean verifyZerodhaLogo()
	{
		 return KiteLogo.isDisplayed();
	}

}
