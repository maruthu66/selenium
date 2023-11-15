package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static void main (String [] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://demo.guru99.com/test/drag_drop.html");
		Driver.manage().window().maximize();
		
		WebElement drag=Driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement drop=Driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement drag1=Driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop1=Driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement drag2=Driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement drop2=Driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement drag3=Driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop3=Driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
      Actions ac=new Actions(Driver);
      ac.dragAndDrop(drag, drop).build().perform();
      ac.dragAndDrop(drag1, drop1).build().perform();
      ac.dragAndDrop(drag2, drop2).build().perform();
      ac.dragAndDrop(drag3, drop3).build().perform();

}
}