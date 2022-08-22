package week7.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DyamicExcel {

	public static String[][] dyamicExcel() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./DataProviderExcel/excelEdit.xlsx");

		XSSFSheet sheet = wb.getSheet("Sheet1");

		// row number
		int rowNum = sheet.getLastRowNum();

		// coloum number
		short colNum = sheet.getRow(0).getLastCellNum();

		System.out.println("No of rows " + rowNum);
		System.out.println("No of Coloum " + colNum);

		// specified row
		XSSFRow firstrow = sheet.getRow(1);

		// specified col
		XSSFCell cell = firstrow.getCell(1);

		String[][] data = new String[rowNum][colNum];

		for (int i = 1; i <= rowNum; i++) {// row

			for (int j = 0; j < colNum; j++) {// cell 0 1 2
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = stringCellValue;// 0,0
				System.out.println(stringCellValue);
			}
		}
		// to close the workbook
		wb.close();
		return data;
	}

}
