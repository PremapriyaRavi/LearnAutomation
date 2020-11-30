package Day_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Selenium_11AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement tab = driver.findElement(By.tagName("table"));
		List<WebElement> trows = tab.findElements(By.tagName("tr"));
		for(int i=0;i<trows.size();i++) {
			WebElement trs = trows.get(i);
			List<WebElement> tds = trs.findElements(By.tagName("td"));
			for(int j=0;j<tds.size();j++) {
				WebElement fstd = tds.get(j);
				String text = fstd.getText();
				if(text.equals("fourth cell"))
				{
					System.out.println("row cell :"+ i);
					System.out.println("column cell:"+ j);
				}
			}
		}
	}

}
