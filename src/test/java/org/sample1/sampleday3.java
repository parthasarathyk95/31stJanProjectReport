package org.sample1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleday3 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\intel\\eclipse-workspace\\Example\\excel\\testdata.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet("login2");
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row r = sh.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j); 
			//System.out.println(c);	
			int type = c.getCellType();
			if (type == 1) {
				String name = c.getStringCellValue();
				System.out.println(name);
			}
			else if(DateUtil.isCellDateFormatted(c)){
//				Date da = c.getDateCellValue();
//				System.out.println(da);
//				SimpleDateFormat form = new SimpleDateFormat("dd-mm-yyyy");
//				String name = form.format(da);
//				System.out.println(name);
			}
			else {
				double d = c.getNumericCellValue();
				System.out.println(d);
				long l = (long)d;
				System.out.println(l);
				String name = String.valueOf(l);
				System.out.println(name);
			}
		}
	}
}
}

