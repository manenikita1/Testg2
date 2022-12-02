package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_class {

	public void captureScreenshotFailedTC(WebDriver driver, String methodName) throws Exception
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("D:\\FrameWork\\Screenshots\\" +methodName+ ".png");
		 FileHandler.copy(source, dest);
	}
	

}
