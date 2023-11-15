package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionns {
	public static void main (String [] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://www.flipkart.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//span[text()='✕']")).click();
       WebElement element = Driver.findElement(By.xpath("//span[text()='Sign in']"));
       
       Actions ac=new Actions(Driver);
       ac.moveToElement(element).perform();
}
}