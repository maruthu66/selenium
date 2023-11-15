package maven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JaveScriptt {
	public static void main (String [] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		WebElement user=Driver.findElement(By.id("email"));
		WebElement login=Driver.findElement(By.xpath("//button[@value='1']"));
		
	   JavascriptExecutor js=( JavascriptExecutor)Driver;
	   js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red')", user);
	   js.executeScript("arguments[0].setAttribute('value','maruthu')", user);
	   
	  Object execute= js.executeScript("return arguments[0].getAttribute('value')", user);
	  System.out.println(execute);
	  
	 // js.executeScript("arguments[0].click()", login);
	  WebElement down= Driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
	  js.executeScript("arguments[0].scrollIntoView(true)",down);
	  Thread.sleep(3000);
	  js.executeScript("arguments[0].scrollIntoView(false)",user);
	  
	  Object script=js.executeScript("return document.readyState");
	  String s=script.toString();
	  if(s.equals("complete")) {
		  System.out.println("Page loaded Successfully");
		  
	  }
	  TakesScreenshot tk=(TakesScreenshot)Driver;
	  File src=tk.getScreenshotAs(OutputType.FILE);
	  File desc=new File("C:\\Users\\Hp\\eclipse-workspace\\FirstMaven\\target\\result.png");
      FileUtils.copyFile(src, desc);
}}
