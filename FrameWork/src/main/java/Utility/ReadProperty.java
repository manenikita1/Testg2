package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {

	public static String readPropertyFile( String variable) throws Exception
	{
		Properties prop = new Properties();
		//where is the file? gave its path
		FileInputStream file = new FileInputStream("D:\\FrameWork\\TestData\\config.properties");
		prop.load(file);
		return prop.getProperty(variable);	
	}

}
