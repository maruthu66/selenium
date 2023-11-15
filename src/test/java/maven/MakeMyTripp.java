package maven;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripp {
	public static void main(String [] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https:\\www.MakeMyTrip.com");
		driver.manage().window().maximize();
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println(frame);
		Thread.sleep(5000);
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();
	    driver.switchTo().parentFrame();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div//span[@class='commonModal__close']")).click();
	   WebElement ele= driver.findElement(By.xpath("//li[@class='selected']"));
	   boolean b=ele.isEnabled();
	   System.out.println(b);
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[3]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
	    driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MAA");
	    WebElement from=driver.findElement(By.xpath("//p[text()='Chennai, India']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(from).perform();
	    a.click().perform();
	   
//	   driver.findElement(By.xpath("//label[@for='toCity']")).click();
//	   driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Tutucorin");
//	   driver.findElement(By.xpath("(//div[@class='makeFlex hrtlCenter'])[4]")).click();
//	
//		
	}

}
