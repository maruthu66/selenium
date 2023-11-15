package maven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {
	public static void main(String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\FirstMaven\\target\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demoqa.com/alerts");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		
		Alert a=Driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		Thread.sleep(3000);
		 JavascriptExecutor js=( JavascriptExecutor)Driver;
		 WebElement down= Driver.findElement(By.id("promtButton"));
		  js.executeScript("arguments[0].scrollIntoView(true)",down);
		Driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		String s1=a.getText();
		System.out.println(s1);
		a.dismiss();
		Driver.findElement(By.id("promtButton")).click();
		String s2=a.getText();
		System.out.println(s2);
		a.sendKeys("maruthu pandi");
		a.accept();
	}

}
