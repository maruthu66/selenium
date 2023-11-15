package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReWritee {
	public static void main(String [] args) throws Throwable {
	File f=new File("C:\\Users\\Hp\\Desktop\\ExcelWrite.xlsx");
	FileInputStream f1=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(f1);
	Sheet s=w.getSheet("ExcelMs");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r=s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c=r.getCell(j);
			int CellType=c.getCellType();
			//0-->Date &Number
			//1-->String
			if(CellType==1) {
				String s1=c.getStringCellValue();
				if(s1.equals("Maruthu pandi")) {
				c.setCellValue("M*S");
				}		}
}
		
	}
	FileOutputStream f2=new FileOutputStream(f);
	w.write(f2);
	f2.close();
	
	}

	
}