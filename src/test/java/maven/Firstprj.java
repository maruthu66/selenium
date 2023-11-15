package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Firstprj {
	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Users\\Hp\\Desktop\\ExcelRead.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c=r.getCell(j);
				int CellType=c.getCellType();
				//0-->Date &Number
				//1-->String
				if(CellType==1) {
					String s1=c.getStringCellValue();
					System.out.println(s1);
				}
				else if(CellType==0) {
					if(DateUtil.isCellDateFormatted(c)) {
						Date d=c.getDateCellValue();
						SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy");
						String value=sd.format(d);
						System.out.println(value);
					}else {
						double ds=c.getNumericCellValue();
					long l=(long)ds;
					String value=String.valueOf(l);
					System.out.println(value);
				}
			}
		}
	}

}}
