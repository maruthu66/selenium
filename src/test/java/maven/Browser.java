package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static void main (String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver Driver = new EdgeDriver();
		Driver.get("https://www.google.com/");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		Driver.navigate().back();
		Thread.sleep(3000);
		Driver.navigate().forward();
		Thread.sleep(3000);
		Driver.navigate().refresh();
		Driver.switchTo().newWindow(WindowType.TAB);
		String Url="https://www.facebook.com/";
		Driver.get(Url);
		String urll=Driver.getCurrentUrl();
		System.out.println(urll);
		if(Url.equals(urll)) {
			System.out.println("Entered url is valied :"+urll);
		}
		else {
			System.err.println("Entered url is not valid :"+urll);
		}
		Driver.close();
		Driver.quit();
	}

}
