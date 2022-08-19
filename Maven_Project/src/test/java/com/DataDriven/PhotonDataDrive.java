package com.DataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PhotonDataDrive {

	public static String getCellvalue(String excel, String sheet, int a1, int b1) {

		
	try {
		
		FileInputStream fis = new FileInputStream(excel);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheet).getRow(a1).getCell(b1);
	return cell.getStringCellValue();	
	}
	catch (Exception e){	
	}
	return"";
	}
	public static int getRowcount(String excel, String sheet)  {

	try {
		FileInputStream fis = new FileInputStream(excel);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getLastRowNum();
	}
	catch (Exception e){	
	}
	return 0;
	}

	public static int getcolcount(String excel, String sheet)  {

		try {
			FileInputStream fis = new FileInputStream(excel);
			Workbook wb = WorkbookFactory.create(fis);
			return wb.getSheet(sheet).getRow(0).getLastCellNum();
		}
		catch (Exception e){	
		}
		return 0;
	}

}
