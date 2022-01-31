//example4:
// Fileoutputstream  to write the data in excel 
//creating a excel filename.extension in excel folder by user manually type the filename.xlsx in file path and creating the workbook by ->sheet     
//by datadriven method the data in excel sheet is written by Fileoutputstream
package org.sample1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleday5 {
public static void main(String[] args) throws IOException   {
	///// 1st time creating
//	File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\New.xlsx");
//	Workbook book = new XSSFWorkbook();
//	Sheet sh =  book.createSheet("SampleDatas");
//	Row r =  sh.createRow(0);
//	Cell c = r.createCell(0);
//	c.setCellValue("Sam");
//	FileOutputStream fo = new FileOutputStream(f);
//	book.write(fo);
//	System.out.println("Done");
	
//	/// 2nd time creating
//	File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\New.xlsx");
//	Workbook book = new XSSFWorkbook();
//	Sheet sh =  book.createSheet("SampleDatas");
//	Row r =  sh.createRow(0);
//	Cell c = r.createCell(1);
//	c.setCellValue("Abi");
//	FileOutputStream fo = new FileOutputStream(f);
//	book.write(fo);
//	System.out.println("Done");

///// 3rd time creating
	File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\New.xlsx");
	Workbook book = new XSSFWorkbook();
	Sheet sh =  book.createSheet("SampleDatas");
	Row r =  sh.createRow(0);
	Cell c = r.createCell(1);
	String name = c.getStringCellValue();
	
	if(name.startsWith("Ab")) {
		c.setCellValue("Selenium");
	}
	else {
		c.setCellValue("Python");
	}
	
	FileOutputStream fo = new FileOutputStream(f);
	book.write(fo);
	System.out.println("Done");

	
} 
}
