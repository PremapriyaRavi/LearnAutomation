package Day_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement tab = driver.findElement(By.tagName("table"));
		List<WebElement> row = tab.findElements(By.tagName("tr"));
	     for(int i=0;i<row.size();i++) {
			WebElement fstrow = row.get(i);
			List<WebElement> tds = fstrow.findElements(By.tagName("td"));
			for(int j=0;j<tds.size();j++) {
				WebElement tdatas = tds.get(j);
				String text = tdatas.getText();
				System.out.println(text);
			}
				
		}
	}

}
