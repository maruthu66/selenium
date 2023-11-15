package maven;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction1 {
	public static void main (String [] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();  
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		WebElement user=Driver.findElement(By.id("email"));
      
       
       Actions ac=new Actions(Driver);
      ac.sendKeys(user, "maruthu").build().perform();
      ac.doubleClick(user).build().perform();
      ac.contextClick(user).build().perform();
      
      Robot r=new Robot();
      for(int i=0;i<3;i++) {
    	  r.keyPress(KeyEvent.VK_DOWN);
          r.keyRelease(KeyEvent.VK_DOWN);  
      }
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      r.keyPress(KeyEvent.VK_TAB);
      r.keyRelease(KeyEvent.VK_TAB);
      
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      
      r.keyRelease(KeyEvent.VK_CONTROL);
     
      r.keyRelease(KeyEvent.VK_V);
}

}
