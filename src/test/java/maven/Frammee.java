package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frammee {
	public static void main (String [] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Driver.manage().window().maximize();
		
		List<WebElement> ele=Driver.findElements(By.tagName("iframe"));
		System.out.println(ele);
		Driver.switchTo().frame("frame1");
		WebElement element=Driver.findElement(By.xpath("//b[@id='topic']"));
		String text=element.getText();
		System.out.println(text);
		
		Driver.switchTo().frame("frame3");
		Driver.findElement(By.xpath("//input[@id='a']")).click();
		
		Driver.switchTo().parentFrame();
		WebElement element1=Driver.findElement(By.xpath("//input[@type='text']"));
		element1.sendKeys("maruthu");
		
		Driver.switchTo().defaultContent();
		WebElement element2=Driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		String text1=element2.getText();
		System.out.println(text1);
		
		
	}
}
