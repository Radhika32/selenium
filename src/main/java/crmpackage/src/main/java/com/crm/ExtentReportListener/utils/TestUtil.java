package com.crm.ExtentReportListener.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

public static long PAGE_LOAD_TIMEOUT=30;
public static long IMPLICIT_WAIT=50;
public static String TESTDATA_SHEET_PATH=System.getProperty("user.dir")+"/src/main/java/com/crm/qa/testdata/Book1.xlsx";
static Workbook book;
static Sheet sheet;
private static FileInputStream file;


public void switchToFrame() {
	driver.switchTo().frame("mainframe");
	
}
public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
}

public static Object[][] getTestData(String sheetName) {
	//FileInputStream file ="TESTDATA_SHEET_PATH" ;
	try {
	file = new FileInputStream(TESTDATA_SHEET_PATH);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	sheet = book.getSheet(sheetName);
	
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	System.out.println(sheet.getLastRowNum() + "--------" +
	sheet.getRow(0).getLastCellNum());
	for (int i = 0; i < sheet.getLastRowNum(); i++) {
		for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
			data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			 System.out.println(data[i][k]);
		}
	}
	return data;
}

}
