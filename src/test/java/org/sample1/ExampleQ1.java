package org.sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExampleQ1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\testdata.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("example1");
		// students name
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			System.out.println(i);
//			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
//				Cell c = r.getCell(j); 
//				System.out.println(c);	
//			}
		}

	}

}
