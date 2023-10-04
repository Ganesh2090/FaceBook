package com.facebook.TestUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility 
{
	File file;

	FileInputStream fileinputstream;

	XSSFWorkbook workbook;

	XSSFSheet sheet;

	DataFormatter format;

	String[][] stringarray;

	String value;

	XSSFCell cell;

	int i, j;

	int row, column;
	
	
	public XLUtility(String excelpath, String sheetname)
	{
		try {
		file = new File(excelpath);

		fileinputstream = new FileInputStream(file);

		workbook = new XSSFWorkbook(fileinputstream);
		
		sheet = workbook.getSheet(sheetname);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public String getExcelData(int row, int column) {

			cell = sheet.getRow(row).getCell(column);

			format = new DataFormatter();

			value = format.formatCellValue(cell);

		return value;
	}

	public String[][] getExcelAllData() {

			row = sheet.getLastRowNum() + 1;

			column = sheet.getRow(i).getLastCellNum();

			stringarray = new String[row][column];

			format = new DataFormatter();

			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					cell = sheet.getRow(i).getCell(j);

					value = format.formatCellValue(cell);

					stringarray[i][j] = value;
				}
			}
		return stringarray;
	}
}
