package Day_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement tab = driver.findElement(By.tagName("table"));
		List<WebElement> rows = tab.findElements(By.tagName("tr"));
		int lsttr= rows.size()-1;
		WebElement  ltr= rows.get(lsttr);
		List<WebElement> lastrowdatas = ltr.findElements(By.tagName("td"));
		for(int i=0;i<lastrowdatas.size();i++) {
			WebElement ele = lastrowdatas.get(i);
			System.out.println(ele.getText());
		}
		

	}

}
