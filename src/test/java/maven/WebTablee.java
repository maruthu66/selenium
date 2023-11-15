package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablee extends WebTablee1 {
	public static void main(String []args) throws Throwable {
		
	  launch("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	  max();
	  webtable("Canada");
	  
	
	}

}
