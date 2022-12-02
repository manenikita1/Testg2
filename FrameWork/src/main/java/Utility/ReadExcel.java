package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel{

	public static String readExcelFile(int row,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("D:\\FrameWork\\TestData\\Book1.xlsx");
		Sheet excelData = WorkbookFactory.create(file).getSheet("Sheet1");
		String values = excelData.getRow(row).getCell(col).getStringCellValue();
		return values;
	}

}
