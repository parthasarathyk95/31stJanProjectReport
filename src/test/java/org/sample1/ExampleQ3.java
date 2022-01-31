package org.sample1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExampleQ3 {
	public static void main(String[] args) throws IOException   {
		/// 1st time creating
		File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\New.xlsx");
		Workbook book = new XSSFWorkbook();
		//Workbook book = new XSSFWorkbook();
		Sheet sh =  book.createSheet("SampleDatas");
		Row r =  sh.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("NewRow");
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		System.out.println("Done");
}
}