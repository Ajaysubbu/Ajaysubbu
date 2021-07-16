package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	XSSFWorkbook wb;
	XSSFSheet ws1;

	public ReadExcelData() {

		File src =new File("./Test Data/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook (fis);
			ws1 =  wb.getSheetAt(0);
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
			e.printStackTrace();
		}

		catch (IOException e) {
			System.out.println("Excepction While loading the excelsheet");
			e.printStackTrace();

		}

	}

	public String getstringdata(int row ,int column)
	{
		String data = ws1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}
	public double getnumericdata(int row ,int column)
	{
		double data = ws1.getRow(row).getCell(column).getNumericCellValue();

		return data;

	}


}
