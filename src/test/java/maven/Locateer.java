package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locateer {
	public static void main (String [] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\FirstMaven\\target\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		WebElement user=Driver.findElement(By.id("email"));
		if(user.isDisplayed()) {
			user.sendKeys("Maruthu");
			Thread.sleep(3000);
			user.clear();
			user.sendKeys("Pandi");
			
			String text=user.getAttribute("value");
			System.out.println(text);
			if(text.isEmpty()) {
				
			}
			else if(!text.equals("Pandi")) {
				System.err.println("Entered text must be in this text insted you provided :"+text);
			}
			else {
				System.out.println("Successfully verified");
			}
		}else {
			System.err.println("No Such element is found");
		}
		WebElement pass=Driver.findElement(By.name("pass"));
		pass.sendKeys("9347547");
		
		WebElement link=Driver.findElement(By.linkText("Log in"));
		if (link.isEnabled()) {
			String text=link.getText();
			link.click();
			System.out.println(text+"login button is successfully present");
		}else {
			System.err.println("login button is diabled");
		}
		List<WebElement> link1=Driver.findElements(By.tagName("a"));
		System.out.println(link1.size());
		for (int i = 0; i <link1.size(); i++) {
			WebElement value=link1.get(i);
			String text=value.getText();
			System.out.println(text);
			
			
			
		}
	}

}
