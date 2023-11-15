package maven;
import java.io.File;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99 {
	
	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.guru99.com/become-an-instructor");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(0));
		WebElement ele=driver.findElement(By.xpath("//h2[text()='💡 Simply fill-up the form below to begin:']"));
	    d.until(ExpectedConditions.visibilityOfAllElements(ele));
         //Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.xpath("(//button[text()='Next'])[1]")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("maruthu");
	    driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("pandimaruthu06@gmail.com");
	    driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("66995503");
	    driver.findElement(By.xpath("(//button[text()='Next'])[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[text()='YES'])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[text()='YES'])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='jfCheckbox-customInputIcon'])[1]")).click();
	    
	    driver.findElement(By.xpath("(//button[text()='Next'])[8]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//label[@aria-hidden='true'])[4]")).click();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec("C:\\Users\\Hp\\Downloads\\file upload.exe");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[text()='Next'])[9]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='jfCheckbox-customInputIcon'])[8]")).click();
	    Thread.sleep(1000);
	   WebElement first= driver.findElement(By.xpath("(//button[text()='Submit'])[11]"));
	   
	   WebElement second=driver.findElement(By.xpath("(//*[@class='jfInput-button forNext u-right'])[11]"));
	   if(first.isDisplayed()) {
		   first.click(); 
	   }else if(second.isDisplayed()) {
		   second.click();
		   driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("maruthu");
		   driver.findElement(By.xpath("(//button[text()='Submit'])[12]")).click();
		   
	   }
	   
	   WebElement thankyou = driver.findElement(By.xpath("(//*[contains(text(),'Thank You!')])[2]"));

	   if(thankyou.isDisplayed()) {
		   d.wait(10);
		   TakesScreenshot tk=(TakesScreenshot)driver;
		    Thread.sleep(2000);
		    js.executeScript("arguments[0].scrollIntoView(true)", ele);
		    Thread.sleep(3000);
			  File src=tk.getScreenshotAs(OutputType.FILE);
			  File desc=new File("C:\\Users\\Hp\\eclipse-workspace\\FirstMaven\\target\\result1.png");
		      FileUtils.copyFile(src, desc);

	   }
	   
	   
	    	}

}
