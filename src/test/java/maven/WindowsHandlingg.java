package maven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingg {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://WWW.flipkart.com");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//span[text()='✕']")).click();
	    WebElement ele=Driver.findElement(By.xpath("//input[@type='text']"));
	    ele.sendKeys("Samsung Mobiles",Keys.ENTER);
	    Thread.sleep(2000);
	    String parent=Driver.getWindowHandle();
	    Driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	    Driver.switchTo().window(parent);
	    Driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();

	    Driver.switchTo().window(parent);
	    Driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();

	    Driver.switchTo().window(parent);
	    Set<String> child=Driver.getWindowHandles();
	    for (String x : child) {
	    	if(!parent.equals(x)) {
			Driver.switchTo().window(x);
	    	   WebElement e= Driver.findElement(By.xpath("//span[@class='B_NuCI']"));
	    		  String s= e.getText();
	    		  System.out.println(s);
	    	}	  
		}
	}

}
