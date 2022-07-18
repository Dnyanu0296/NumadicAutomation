package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Utility {
	
	@DataProvider(name="logindata",parallel = false)
	
	public String[][] getdata() throws Exception {
		
		String path = "C:\\Users\\hp\\Downloads\\Dnyaneshwar\\Test.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		int noOfRows = book.getSheet("Sheet1").getLastRowNum();
		int noOfCells = book.getSheet("Sheet1").getRow(0).getLastCellNum();
		
		String[][] data = new String[noOfRows-1][noOfCells];
		for(int i = 0; i<noOfRows-1; i++)
		{
			for(int j = 0; j<noOfCells; j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j]= df.formatCellValue(book.getSheet("Sheet1").getRow(i+1).getCell(j));
			}
			System.out.println(" ");
		}
		book.close();
		return data;
	}
}
