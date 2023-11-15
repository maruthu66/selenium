package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownn {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Driver.manage().window().maximize();
		WebElement ele=Driver.findElement(By.xpath("//select[@id='first']"));
		
        Select s=new Select(ele);
        boolean b=s.isMultiple();
        System.out.println(b);
        s.selectByIndex(1);
        s.selectByValue("Google");
        s.selectByVisibleText("Iphone");
        
        List<WebElement> option=  s.getOptions();   
        for (WebElement elem : option) {
        	System.out.println(elem.getText());
			}
        WebElement ele1=Driver.findElement(By.xpath("//select[@id='second']"));
        Select s1=new Select(ele1);
        boolean b1=s1.isMultiple();
        System.out.println(b1);
        s1.selectByIndex(1);
        s1.selectByIndex(2);
        s1.selectByIndex(3);
        s1.deselectByIndex(1);
       // s1.deselectAll();
        
        List<WebElement> option1=  s1.getAllSelectedOptions();   
        for (WebElement elem : option1) {
        	System.out.println("Selected optionns :"+elem.getText());
        }
        WebElement option2=  s1.getFirstSelectedOption();   
        	System.out.println("First Selected optionns :"+option2.getText());
       
}}
