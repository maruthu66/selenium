package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpathh {
	public static void main (String [] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//tN[text()='tV']
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		 //tN[@aN='aV']
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone",Keys.ENTER);
		//tN[contains(text(),'part of tV')]
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 (Blue, 12')]"));
		//tN[contains(@aN,'part of aV')]
		driver.findElement(By.xpath("//button[contains(@class,'')]"));
		//tN[starts-with(@aN,'start of aV')]
		driver.findElement(By.xpath("//a[starts-with(@class,'_1_')]"));
		//tN[starts-with(text(),'start of tV')]
		driver.findElement(By.xpath("//div[starts-with(text(),'Pop')]"));
		//input[@name='q' and @class='_3704LK']
		driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1' and text()='₹57,999']"));
		 //input[@name='q' or @class='_3704LK']
		driver.findElement(By.xpath("//a[@class='_21ljIi' or text()='Explore']"));
		
		//tN[@aN='aV']//following::tN
		driver.findElement(By.xpath("//input[@name='q']//following::button"));
		
		//tN[@aN='aV']//preceding::tN
		driver.findElement(By.xpath("//input[@name='q']//preceding::div"));
		
		//tN[@aN='aV']//following-sibling::tN
		driver.findElement(By.xpath("//section[@class='_167Mu3 _2hbLCH']//preceding-sibiling::section"));
		
	}

}
