package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablee1 {
	static WebDriver driver;
	public static void launch(String url) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(url);
	}
	public static void max() throws Throwable {
		Thread.sleep(3000);
		 driver.manage().window().maximize();
	}
	public static void webtable(String value) {
		 List<WebElement> iTable=  driver.findElements(By.tagName("table"));
		 for (int i = 0; i < iTable.size(); i++) {
			 WebElement table= iTable.get(i);
			WebElement tbody= table.findElement(By.tagName("tbody"));
			List <WebElement> iRow=tbody.findElements(By.tagName("tr"));
			for (int j = 0; j < iRow.size(); j++) {
				 WebElement row=  iRow.get(j);
				List<WebElement> iData= row.findElements(By.tagName("td"));
				for (int k = 0; k < iData.size(); k++) {
					WebElement data=iData.get(k);
					String text=data.getText();
					if(text.equals(value)) {
						System.out.println("Required text is Displayed :"+value);
						
					}
				}
			}
			
		}
	}

}
