package maven;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIdee {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\FirstMaven\\target\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjw4P6oBhBsEiwAKYVkq080hBLj_HOrNRcDY1ko7OT9LT0bglYMbV8_6ch8bOmxlKHGiR31NxoCXawQAvD_BwE&gclsrc=aw.ds");
		Driver.manage().window().maximize();
	    
		WebElement ele=Driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		ele.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Hp\\Downloads\\Autoi3.exe");
	}

}
