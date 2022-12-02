package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.ReadExcel;
import Utility.ReadProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	public void initialization() throws Exception
	{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    //driver.get("https://kite.zerodha.com/");
			//driver.get(ReadProperty.readPropertyFile("url"));
			driver.get(ReadExcel.readExcelFile(0,0));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void captureScreenshotFailedTC(String methodName) throws Exception
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("D:\\FrameWork\\Screenshots\\" +methodName+ ".png");
		 FileHandler.copy(source, dest);
	}
	
	
	
	
}
