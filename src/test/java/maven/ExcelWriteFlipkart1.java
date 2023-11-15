package maven;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelWriteFlipkart1 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\FirstMaven\\target\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https:\\www.flipkart.com");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//span[text()='✕']")).click();
		Driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmii Mobile",Keys.ENTER);
		List<WebElement> key= Driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> value= Driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 File f=new File("C:\\Users\\Hp\\Desktop\\ExcelWrite13.xlsx");
	       XSSFWorkbook w=new XSSFWorkbook();
			Sheet s1=w.createSheet("ExcelMs");
		for (int i = 0; i < key.size(); i++) {
			Row r=s1.createRow(i);
			Cell c=r.createCell(0);
			WebElement w1=key.get(i);
			String s=w1.getText();
			
			c.setCellValue("Mobile :"+s);
		
			Cell c1=r.createCell(6);
			WebElement w2=value.get(i);
			String ms1=w2.getText();
			c1.setCellValue("Price :"+ms1);
			
		}
	 
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
		f1.close();
	}

}
