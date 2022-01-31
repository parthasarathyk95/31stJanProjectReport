// example2: creating a excel filename.extension in excel filename folder user already given the data in row-0 and column-0 as Name
package org.sample1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleday2 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\testdata.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet("login1");
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row r = sh.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j); 
			System.out.println(c);	
		}
	}
}
}
