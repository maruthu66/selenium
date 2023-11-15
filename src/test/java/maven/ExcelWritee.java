package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritee {
	public static void main(String[]args) throws Throwable {
		File f=new File("C:\\Users\\Hp\\Desktop\\ExcelWrite.xlsx");

		XSSFWorkbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("ExcelMs");
		Row r=s.createRow(0);
		for(int i=0;i<10;i++) {
			Cell c=r.createCell(i);
			c.setCellValue("Maruthu pandi");
		}
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
		f1.close();
	}

}
