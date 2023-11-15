package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartComparision {
public static void main(String[] args) throws Throwable {
	   String m="";
	   String s1="";
		
	   WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https:\\www.flipkart.com");
		Driver.manage().window().maximize();
		File f=new File("C:\\Users\\Hp\\Desktop\\ExcelWrite13.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("ExcelMs");
		Driver.findElement(By.xpath("//span[text()='✕']")).click();
		Driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmii Mobile",Keys.ENTER);
		String parent=Driver.getWindowHandle();
		 Driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		  Set<String> child=Driver.getWindowHandles();
		    for (String x : child) {
		    	if(!parent.equals(x)) {
				Driver.switchTo().window(x);}}
		WebElement e=Driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		m=e.getText();
		System.out.println(m);
	
		    Row r=s.getRow(3);
		Cell c= r.getCell(0);
	int CellType=c.getCellType();
	if(CellType==1) {
		 s1=c.getStringCellValue();
		System.out.println(s1);
	}
	
	if(!m.equals(s1)) {
		System.err.println("We didn't get required out put : ");
	}
}}
