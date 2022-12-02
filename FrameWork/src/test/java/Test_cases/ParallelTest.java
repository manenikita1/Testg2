package Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	 public static WebDriver driver ;
	@Test
	public void openFB()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\software\\chromedriver_win32\\chromedriver.exe");			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	@Test
	public void openGoogle()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\software\\chromedriver_win32\\chromedriver.exe");			

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();

	}
	@Test
	public void openRediff()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\software\\chromedriver_win32\\chromedriver.exe");			

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		driver.close();

	}
	@Test
	public void openKite()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\software\\chromedriver_win32\\chromedriver.exe");			

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.close();

	}
}
