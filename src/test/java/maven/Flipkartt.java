package maven;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartt {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https:\\www.flipkart.com");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//span[text()='✕']")).click();
		Driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmii Mobile",Keys.ENTER);
		
		List<WebElement> key= Driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> value= Driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 Map<String ,String> mp=new LinkedHashMap<>();
        for (int i = 0; i < key.size(); i++) {
			WebElement e=key.get(i);
			String s1=e.getText();
			for (int j = 0; j < value.size(); j++) {
				WebElement e2=value.get(j);
				String s2=e2.getText();
				if(i==j)
				mp.put(s1, s2);
			}
			}
       Set<Entry<String,String>> ent=mp.entrySet();
       for (Entry<String, String> x1 : ent) {
    	   System.out.println(x1);
		
	}
      }
	}
	

	
