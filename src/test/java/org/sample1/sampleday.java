// example1: creating a excel filename.extension in excel filename folder user already given the data in row-0 and column-0 as Name  


package org.sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleday {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\testdata.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook();
	//Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet("login");
	//for (int i = 0; i < args.length; i++) {
		
	//}
	Row r = sh.getRow(0);
	Cell c = r.getCell(0); 
	System.out.println(c);
}
}

